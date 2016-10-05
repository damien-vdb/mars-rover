
package com.github.damienvdb06.marsrover.geography;

import com.github.damienvdb06.marsrover.ImpossibleMoveException;

public class Planet {

	private int size = Integer.MAX_VALUE;

	private Obstacle obstacle;

	public Planet(int size) {
		this.size = size;
	}

	public static Planet big() {
		return new Planet(Integer.MAX_VALUE);
	}

	public void setObstacle(Obstacle obstacle) {
		this.obstacle = obstacle;
	}

    int wrapSincePlanetIsRound(int coordinate) {
		return Math.floorMod(coordinate, size);
	}

	public Position at(int x, int y) {
        Position target = generatePosition(x, y);
        boolean conflict = target.conflictsWith(obstacle);
		if (conflict) {
			throw new ImpossibleMoveException(obstacle);
		}
		return target;
	}

    private Position generatePosition(int x, int y) {
        int nextX = wrapSincePlanetIsRound(x);
        int nextY = wrapSincePlanetIsRound(y);
        return new Position(nextX, nextY);
    }

}
