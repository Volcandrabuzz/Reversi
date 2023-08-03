package com.example.reversi.bean;


/**
 * Record the data during the minimax algorithm
 */
public class MinimaxResult {

	public int mark;
	
	public Move move;
	
	public MinimaxResult(int mark, Move move) {
		this.mark = mark;
		this.move = move;
	}
	
}
