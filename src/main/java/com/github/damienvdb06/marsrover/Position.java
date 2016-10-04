package com.github.damienvdb06.marsrover;

public class Position {
	
	public int y;
	public int x;

	public static int planetSize = Integer.MAX_VALUE;

	public void set(int x, int y) {
		setX(x);
		setY(y);
	}

	public void setX(int i) {
		this.x = computePositionKnowingEarthIsRound(i);
	}
	
	public void setY(int i) {
		this.y = computePositionKnowingEarthIsRound(i);
	}

	private int computePositionKnowingEarthIsRound(int i) {
		return Math.floorMod(i, planetSize);
	}
}