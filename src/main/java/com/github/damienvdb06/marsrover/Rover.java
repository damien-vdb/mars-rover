
package com.github.damienvdb06.marsrover;

import com.github.damienvdb06.marsrover.geography.Planet;
import com.github.damienvdb06.marsrover.geography.Position;

public class Rover {

    Direction direction;

    Position position;

    private Planet planet;

    public Rover(Planet planet, Position position, Direction direction) {
        this.planet = planet;
        this.position = position;
        this.direction = direction;
    }

    public static Rover create(int x, int y, Direction direction) {
        Planet planet = new Planet(Integer.MAX_VALUE);
        return new Rover(planet, planet.at(x, y), direction);
    }

    public void forward() {
        this.position = direction.forward(this.planet, this.position);
    }

    public void backward() {
        this.position = direction.backward(this.planet, this.position);
    }

    public void turnLeft() {
        direction = direction.left();
    }

    public void turnRight() {
        direction = direction.right();
    }

}
