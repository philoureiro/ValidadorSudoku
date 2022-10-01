package tasks;

import java.util.ArrayList;
import java.util.List;

import gui.MainViewController;

public class CheckRows implements Runnable{
	int[][] grid;
	
	
	public CheckRows(int[][] grid) {
		this.grid = grid;
	}
	@Override
	public void run() {
		List<Integer> contador = new ArrayList<Integer>();
		for(int i = 0; i < 9; i++) {
			contador = new ArrayList<Integer>();
			for(int z = 0; z < 9; z++) {
				int value = grid[i][z];
				boolean isValueAlreadyExists = contador.contains(value);
				if(!isValueAlreadyExists) {
					contador.add(value);
				}
			}
			if(contador.size() < 9) {
				MainViewController.setResult(false);
			}
		
		}

	}
}
