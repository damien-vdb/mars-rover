package com.github.damienvdb06.marsrover;

public class Rover {

	Direction direction;
	Position position;
	private Planet planet;

	public Rover(int x, int y, Direction direction) {
		this(Planet.big(), x, y, direction);
	}

	public Rover(Planet planet, int x, int y, Direction direction) {
		this.planet = planet;
		this.position = new Position(x, y);
		this.direction = direction;
	}

	public void forward() {
		this.position = direction.forward(this.planet, this.position);
	}

	public void backward() {
		this.position = direction.backward(this.planet, this.position);
	}

	public void turnLeft() {
		direction = direction.left();
	}

	public void turnRight() {
		direction = direction.right();
	}

}
