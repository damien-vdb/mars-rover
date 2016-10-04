package com.github.damienvdb06.marsrover;

public enum Direction {

	NORTH {
		@Override
		public void forward(Rover rover) {
			rover.y -= 1;
		}

		@Override
		public void backward(Rover rover) {
			SOUTH.forward(rover);
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
		public void backward(Rover rover) {
			NORTH.forward(rover);
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
		public void backward(Rover rover) {
			WEST.forward(rover);
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
		public void backward(Rover rover) {
			EAST.forward(rover);
		}

		@Override
		public Direction left() {
			return SOUTH;
		}
	};

	public abstract void forward(Rover rover);

	public abstract void backward(Rover rover);

	public abstract Direction left();
}
