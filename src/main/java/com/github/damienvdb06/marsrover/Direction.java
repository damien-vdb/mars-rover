
package com.github.damienvdb06.marsrover;

import java.util.HashMap;
import java.util.Map;

import com.github.damienvdb06.marsrover.geography.Planet;
import com.github.damienvdb06.marsrover.geography.Position;

public enum Direction {

	NORTH {

		@Override
		public Position forward(Planet planet, Position position) {
			return planet.at(position.x, position.y - 1);
		}

		@Override
		public Direction left() {
			return WEST;
		}

	},
	SOUTH {

		@Override
		public Position forward(Planet planet, Position position) {
			return planet.at(position.x, position.y + 1);
		}

		@Override
		public Direction left() {
			return EAST;
		}

	},
	EAST {

		@Override
		public Position forward(Planet planet, Position position) {
			return planet.at(position.x + 1, position.y);
		}

		@Override
		public Direction left() {
			return NORTH;
		}

	},
	WEST {

		@Override
		public Position forward(Planet planet, Position position) {
			return planet.at(position.x - 1, position.y);
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

	public abstract Position forward(Planet planet, Position position);

	public Position backward(Planet planet, Position position) {
		return this.opposite().forward(planet, position);
	}

	public abstract Direction left();

	public Direction right() {
		return this.left().opposite();
	}
}
