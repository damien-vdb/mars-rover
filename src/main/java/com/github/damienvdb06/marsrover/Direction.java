package com.github.damienvdb06.marsrover;

import java.util.HashMap;
import java.util.Map;

public enum Direction {

	NORTH {
		@Override
		public void forward(Rover rover) {
			rover.y -= 1;
		}

		@Override
		public Direction left() {
			return WEST;
		}

	},
	SOUTH {
		@Override
		public void forward(Rover rover) {
			rover.y += 1;
		}

		@Override
		public Direction left() {
			return EAST;
		}

	},
	EAST {
		@Override
		public void forward(Rover rover) {
			rover.x += 1;
		}

		@Override
		public Direction left() {
			return NORTH;
		}

	},
	WEST {
		@Override
		public void forward(Rover rover) {
			rover.x -= 1;
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

	public abstract void forward(Rover rover);

	public void backward(Rover rover) {
		this.opposite().forward(rover);
	}

	public abstract Direction left();

	public Direction right() {
		return this.left().opposite();
	}
}
