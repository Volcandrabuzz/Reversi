package com.example.reversi.util;

public class Util {

	//Copy the two-dimensional array of the chessboard
	public static void copyBinaryArray(byte[][] src, byte[][] dest) {
		for (int i = 0; i < 8; i++) {
			System.arraycopy(src[i], 0, dest[i], 0, 8);
		}
	}
	
}
