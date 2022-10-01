package tasks;

import gui.MainViewController;

public class Execute {
	private int[][] grid;
	
	public Execute(int[][] grid) {
		this.grid = grid;	
	}

	public boolean start(){
			MainViewController.setResult(true);
			CheckGrids checkGrids = new CheckGrids(grid);
			Thread executeCheckGrids = new Thread(checkGrids);
			executeCheckGrids.start();
			CheckColumns checkColumns = new CheckColumns(grid);
			Thread executeCheckColumns = new Thread(checkColumns);
			executeCheckColumns.start();
			CheckRows checkRows = new CheckRows(grid);
			Thread executeCheckRows = new Thread(checkRows);
			executeCheckRows.start();
	
			while(executeCheckGrids.isAlive() || executeCheckGrids.isAlive() || executeCheckGrids.isAlive() ) {
				System.out.println("working");
			}
			return MainViewController.getResult();

		
	}
}

