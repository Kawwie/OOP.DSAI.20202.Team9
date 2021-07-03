package board;

import java.util.ArrayList;

import board.stone.Stone;

public abstract class StoneHolder {
	protected double locationX;
	protected double locationY;
	protected ArrayList<Stone> num_stone = new ArrayList<Stone>();
	
	public int score() {
		int sum = 0;
		for(Stone i: this.num_stone) {
			sum = sum + i.value;
		}
		return sum;
	}
}
