package com.github.damienvdb06.marsrover;

public class Planet {

	int size;
	int obstacleX = -1;
	int obstacleY = -1;

	public Planet(int size) {
		this.size = size;
	}

	public void setObstacle(int x, int y) {
		this.obstacleX = x;
		this.obstacleY = y;
	}

	public static Planet big() {
		return new Planet(Integer.MAX_VALUE);
	}

	public boolean isPositionAvailable(int x, int y) {
		return obstacleX != x || obstacleY != y;
	}

	int computePositionKnowingPlanetIsRound(int i) {
		return Math.floorMod(i, size);
	}

}
