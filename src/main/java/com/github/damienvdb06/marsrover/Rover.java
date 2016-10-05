package com.github.damienvdb06.marsrover;

public class Rover {

	Direction direction;
	Position position;

	public Rover(int x, int y, Direction direction) {
		this(Planet.big(), x, y, direction);
	}

	public Rover(Planet planet, int x, int y, Direction direction) {
		this.position = new Position(planet, x, y);
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
