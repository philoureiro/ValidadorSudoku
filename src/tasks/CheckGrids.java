package tasks;

import java.util.ArrayList;
import java.util.List;

public class CheckGrids implements Runnable{
	private int[][] grid; 
	private List<int[][]> list;
	private int[][] grid3x3_1;
	private int[][] grid3x3_2;
	private int[][] grid3x3_3;
	private int[][] grid3x3_4;
	private int[][] grid3x3_5;
	private int[][] grid3x3_6;
	private int[][] grid3x3_7;
	private int[][] grid3x3_8;
	private int[][] grid3x3_9;
	
	public CheckGrids(int[][] grid) {
		this.grid = grid;
		this.list = new ArrayList<>();
		grid3x3_1 = new int[3][3];
		grid3x3_2 = new int[3][3];
		grid3x3_3 = new int[3][3];
		grid3x3_4 = new int[3][3];
		grid3x3_5 = new int[3][3];
		grid3x3_6 = new int[3][3];
		grid3x3_7 = new int[3][3];
		grid3x3_8 = new int[3][3];
		grid3x3_9 = new int[3][3];
		this.populate3x3Grids();
		
	}
	private void populate3x3Grids() {

		// 3 grids de cima
			int countSeparatedL = 0;
		for(int count = 0; count < 3; count++) {
			int countSeparatedC = 0;
			for(int i = 0; i < 3; i++) {
				
				this.grid3x3_1[countSeparatedL][countSeparatedC] = grid[count][i];
				countSeparatedC += 1;
			}
			countSeparatedC = 0;
			for(int i = 3; i < 6; i++) {
				this.grid3x3_2[countSeparatedL][countSeparatedC] = grid[count][i];
				countSeparatedC += 1;
			}
			countSeparatedC = 0;
			for(int i = 6; i < 9; i++) {
				this.grid3x3_3[countSeparatedL][countSeparatedC] = grid[count][i];
				countSeparatedC += 1;
			}
			countSeparatedL += 1;
		}
list.add(grid3x3_1);
list.add(grid3x3_2);
list.add(grid3x3_3);
		//3 grids do meio
		countSeparatedL = 0;
		for(int count = 3; count < 6; count++) {
			int countSeparatedC = 0;
			for(int i = 0; i < 3; i++) {
				this.grid3x3_4[countSeparatedL][countSeparatedC] = grid[count][i];
				countSeparatedC += 1;
			}
			countSeparatedC = 0;
			for(int i = 3; i < 6; i++) {
				this.grid3x3_5[countSeparatedL][countSeparatedC] = grid[count][i];
				countSeparatedC += 1;
			}
			countSeparatedC = 0;
			for(int i = 6; i < 9; i++) {
				this.grid3x3_6[countSeparatedL][countSeparatedC] = grid[count][i];
				countSeparatedC += 1;
			}
			countSeparatedL += 1;
		}
		list.add(grid3x3_4);
		list.add(grid3x3_5);
		list.add(grid3x3_6);
		
		//3 grids de baixo
		countSeparatedL = 0;
		for(int count = 6; count < 9; count++) {
			int countSeparatedC = 0;
			for(int i = 0; i < 3; i++) {
				this.grid3x3_7[countSeparatedL][countSeparatedC] = grid[count][i];
				countSeparatedC += 1;
			}
			countSeparatedC = 0;
			for(int i = 3; i < 6; i++) {
				this.grid3x3_8[countSeparatedL][countSeparatedC] = grid[count][i];
				countSeparatedC += 1;
			}
			countSeparatedC = 0;

			for(int i = 6; i < 9; i++) {
				this.grid3x3_9[countSeparatedL][countSeparatedC] = grid[count][i];
				countSeparatedC += 1;
			}
			countSeparatedL += 1;
		}
		list.add(grid3x3_7);
		list.add(grid3x3_8);
		list.add(grid3x3_9);
	
	}
	@Override
	public void run() {
		for(int i = 0; i < 9; i++) {
			
				ExecuteGridCheck executeGridCheck = new ExecuteGridCheck(list.get(i));
				Thread newThread = new Thread(executeGridCheck);
				newThread.start(); // wait
				
			
			
		}
		
		
		
//		// para cada execute grid check, passar um grid 3x3 retirando do grid;
//		Execute.getCheckGridsResult(); // começa como true
//		ExecuteGridCheck executeGridCheck1 = new ExecuteGridCheck(grid3x3_1);
//		Thread newThread = new Thread(executeGridCheck1);
//		newThread.start();
//		
//		ExecuteGridCheck executeGridCheck2 = new ExecuteGridCheck(grid3x3_2);
//		Thread newThread2 = new Thread(executeGridCheck2);
//		newThread2.start();
//		
//		ExecuteGridCheck executeGridCheck3 = new ExecuteGridCheck(grid3x3_3);
//		Thread newThread3 = new Thread(executeGridCheck3);
//		newThread3.start();
//		
//		ExecuteGridCheck executeGridCheck4 = new ExecuteGridCheck(grid3x3_4);
//		Thread newThread4 = new Thread(executeGridCheck4);
//		newThread4.start();
//		
//		ExecuteGridCheck executeGridCheck5 = new ExecuteGridCheck(grid3x3_5);
//		Thread newThread5 = new Thread(executeGridCheck5);
//		newThread5.start();
//		
//		ExecuteGridCheck executeGridCheck6 = new ExecuteGridCheck(grid3x3_6);
//		Thread newThread6 = new Thread(executeGridCheck6);
//		newThread6.start();
//		
//		ExecuteGridCheck executeGridCheck7 = new ExecuteGridCheck(grid3x3_7);
//		Thread newThread7 = new Thread(executeGridCheck7);
//		newThread7.start();
//		
//		ExecuteGridCheck executeGridCheck8 = new ExecuteGridCheck(grid3x3_8);
//		Thread newThread8 = new Thread(executeGridCheck8);
//		newThread8.start();
//		
//		ExecuteGridCheck executeGridCheck9 = new ExecuteGridCheck(grid3x3_9);
//		Thread newThread9 = new Thread(executeGridCheck9);
//		newThread9.start();
		
	}

}
