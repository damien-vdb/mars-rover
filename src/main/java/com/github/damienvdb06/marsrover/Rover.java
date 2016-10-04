package com.github.damienvdb06.marsrover;

public class Rover {

	Direction direction;
	Position position;

	public Rover(int x, int y, Direction direction) {
		this.position = new Position();
		this.position.set(x, y);
		this.direction = direction;
	}

	public void forward() {
		direction.forward(this.position);
	}

	public void backward() {
		direction.backward(this.position);
	}

	public void turnLeft() {
		direction = direction.left();
	}

	public void turnRight() {
		direction = direction.right();
	}

}
