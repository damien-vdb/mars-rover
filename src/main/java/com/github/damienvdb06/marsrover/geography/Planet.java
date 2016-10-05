
package com.github.damienvdb06.marsrover.geography;

import com.github.damienvdb06.marsrover.ImpossibleMoveException;

public class Planet {

	private int size = Integer.MAX_VALUE;

	private Obstacles obstacles;

	public Planet(int size) {
		this.size = size;
		this.obstacles = new Obstacles();
	}

	public static Planet big() {
		return new Planet(Integer.MAX_VALUE);
	}

	public void putObstacle(Obstacle obstacle) {
		this.obstacles.add(obstacle);
	}

	int wrapSincePlanetIsRound(int coordinate) {
		return Math.floorMod(coordinate, size);
	}

	public Position at(int x, int y) {
		Position target = generatePosition(x, y);
        if(obstacles.block(target))
            throw new ImpossibleMoveException(target);
		return target;
	}

	private Position generatePosition(int x, int y) {
		int nextX = wrapSincePlanetIsRound(x);
		int nextY = wrapSincePlanetIsRound(y);
		return new Position(nextX, nextY);
	}

}
