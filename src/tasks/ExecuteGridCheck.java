package tasks;

import java.util.ArrayList;
import java.util.List;

import gui.MainViewController;

public class ExecuteGridCheck implements Runnable{
	private int[][] grid;

	
	public ExecuteGridCheck(int[][] grid) {
		this.grid = grid;
	
	}
	@Override
	public void run() {
		boolean verificador = true;
		List<Integer> contador = new ArrayList<Integer>();
		for(int i = 0; i < 3; i++) {
			for(int z = 0; z < 3; z++) {
				int value = grid[i][z];
				boolean isValueAlreadyExists = contador.contains(value);
				if(!isValueAlreadyExists) {
					contador.add(value);
				}
			}
		}
		if(contador.size() < 9) {
			MainViewController.setResult(false);
		}
	
		
		
	}

}
