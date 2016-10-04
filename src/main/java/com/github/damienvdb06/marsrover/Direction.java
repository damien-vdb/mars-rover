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
	};
	

	public abstract void forward(Rover rover);

	public abstract void backward(Rover rover);
}
