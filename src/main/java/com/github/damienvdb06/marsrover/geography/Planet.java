
package com.github.damienvdb06.marsrover.geography;

import com.github.damienvdb06.marsrover.ImpossibleMoveException;

public class Planet {

	int size = Integer.MAX_VALUE;

	int obstacleX = -1;

	int obstacleY = -1;

	public Planet(int size) {
		this.size = size;
	}

	public static Planet big() {
		return new Planet(Integer.MAX_VALUE);
	}

	public void setObstacle(int x, int y) {
		obstacleX = x;
		obstacleY = y;
	}

	public boolean isPositionAvailable(int x, int y) {
		return obstacleX != x || obstacleY != y;
	}

	int wrapSincePlanetIsRound(int i) {
		return Math.floorMod(i, size);
	}

	public Position at(int x, int y) {
		int nextX = wrapSincePlanetIsRound(x);
		int nextY = wrapSincePlanetIsRound(y);
		boolean ok = isPositionAvailable(nextX, nextY);
		if (!ok) {
			throw new ImpossibleMoveException();
		}
		return new Position(nextX, nextY);
	}

}
