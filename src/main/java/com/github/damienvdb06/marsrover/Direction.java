package com.github.damienvdb06.marsrover;

public enum Direction {

	NORTH {
		@Override
		public void forward(Rover rover) {
			rover.y -= 1;
		}
	},
	SOUTH {
		@Override
		public void forward(Rover rover) {
			rover.y += 1;
		}
	},
	EAST {
		@Override
		public void forward(Rover rover) {
			rover.x += 1;
		}
	},
	WEST {
		@Override
		public void forward(Rover rover) {
			rover.x -= 1;
		}
	};

	public abstract void forward(Rover rover);
}
