package com.github.damienvdb06.marsrover;

import java.util.HashMap;
import java.util.Map;

public enum Direction {

	NORTH {

		@Override
		public void forward(Position position) {
			position.setY(position.y - 1);
		}

		@Override
		public Direction left() {
			return WEST;
		}

	},
	SOUTH {
		
		@Override
		public void forward(Position position) {
			position.setY(position.y + 1);
		}

		@Override
		public Direction left() {
			return EAST;
		}

	},
	EAST {
		
		@Override
		public void forward(Position position) {
			position.setX(position.x + 1);
		}

		@Override
		public Direction left() {
			return NORTH;
		}

	},
	WEST {

		@Override
		public void forward(Position position) {
			position.setX(position.x - 1);
		}

		@Override
		public Direction left() {
			return SOUTH;
		}
	};

	Direction opposite() {
		Map<Direction, Direction> opposites = new HashMap<Direction, Direction>();
		opposites.put(Direction.NORTH, Direction.SOUTH);
		opposites.put(Direction.SOUTH, Direction.NORTH);
		opposites.put(Direction.EAST, Direction.WEST);
		opposites.put(Direction.WEST, Direction.EAST);
		return opposites.get(this);
	}

	public abstract void forward(Position position);

	public void backward(Position position) {
		this.opposite().forward(position);
	}

	public abstract Direction left();

	public Direction right() {
		return this.left().opposite();
	}
}
