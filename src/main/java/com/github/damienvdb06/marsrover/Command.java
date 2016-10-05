
package com.github.damienvdb06.marsrover;

public enum Command {
    FORWARD('f') {

        @Override
        public void move(Rover rover) {
            rover.forward();
        }
    }, //
    BACKWARD('b') {

        @Override
        public void move(Rover rover) {
            rover.backward();
        }
    }, //
    LEFT('l') {

        @Override
        public void move(Rover rover) {
            rover.turnLeft();
        }
    }, //
    RIGHT('r') {

        @Override
        public void move(Rover rover) {
            rover.turnRight();
        }
    };

    private char character;

    Command(char character) {
        this.character = character;
    }

    public static Command find(char input) {
        for (Command command : Command.values()) {
            if (command.character == input) {
                return command;
            }
        }
        throw new IllegalArgumentException(String.format("Character %c not recognized", input));
    }

    public void apply(Rover rover) {
        System.out.println("Going "+ this.toString());
        try {
            this.move(rover);
            rover.printPosition();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public abstract void move(Rover rover);
}
