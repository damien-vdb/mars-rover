
package com.github.damienvdb06.marsrover;

public enum Command {
	FORWARD('f') {

		@Override
		public void apply(Rover rover) {
			rover.forward();
		}
	}, //
	BACKWARD('b') {

		@Override
		public void apply(Rover rover) {
			rover.backward();
		}
	};

	private char character;

	Command(char character) {
		this.character = character;
	}

	public static Command find(char input) {
		for(Command command : Command.values()) {
            if(command.character == input) {
                return command;
            }
        }
        throw new IllegalArgumentException(String.format("Character %c not recognized", input));
	}

	public abstract void apply(Rover rover);
}
