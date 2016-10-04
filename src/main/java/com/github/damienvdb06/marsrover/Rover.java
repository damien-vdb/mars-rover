package com.github.damienvdb06.marsrover;

public class Rover {

	Direction direction;
	int y;
	int x;

	public Rover(int x, int y, Direction direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public void forward() {
		direction.forward(this);
	}

	public void backward() {
		direction.backward(this);
	}

	public void turnLeft() {
		direction = Direction.WEST;
	}

}
