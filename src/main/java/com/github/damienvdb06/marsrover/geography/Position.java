
package com.github.damienvdb06.marsrover.geography;

public class Position {

	public int y;

	public int x;

	Position(int x, int y) {
		super();

		this.y = y;
		this.x = x;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		Position position = (Position) o;

		if (y != position.y) {
			return false;
		}
		return x == position.x;

	}

	@Override
	public int hashCode() {
		int result = y;
		result = 31 * result + x;
		return result;
	}

    boolean conflictsWith(Obstacle obstacle) {
        if (obstacle == null)
			return false;
        return equals(obstacle);
    }
}