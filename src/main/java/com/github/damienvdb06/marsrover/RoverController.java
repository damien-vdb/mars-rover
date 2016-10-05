
package com.github.damienvdb06.marsrover;

public class RoverController {

	private final Rover rover;

	public RoverController(Rover rover) {
		this.rover = rover;
	}

    public void command(char input) {
        Command.find(input).apply(rover);
    }

    public void command(String commands) {
        for(Character input : commands.toCharArray()) {
            command(input);
        }
    }
}
