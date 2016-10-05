package com.github.damienvdb06.marsrover;

public class Position {

	public int y;
	public int x;
	private Planet planet;


	public Position(Planet planet, int x, int y) {
		this.planet = planet;
		setX(x);
		setY(y);
	}

	public void setX(int x) {
		int nextX = planet.computePositionKnowingPlanetIsRound(x);
		boolean ok = this.planet.isPositionAvailable(nextX, this.y);
		if(!ok) {
			throw new ImpossibleMoveException();
		}
		this.x = nextX;
	}

	public void setY(int y) {
		int nextY = planet.computePositionKnowingPlanetIsRound(y);
		boolean ok = this.planet.isPositionAvailable(this.x, nextY);
		if(!ok) {
			throw new ImpossibleMoveException();
		}
		this.y = nextY;
	}
}