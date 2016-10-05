package com.github.damienvdb06.marsrover;

import com.github.damienvdb06.marsrover.geography.Obstacle;
import com.github.damienvdb06.marsrover.geography.Planet;
import org.junit.Assert;
import org.junit.Test;

public class RoverObstaclesTest {

	@Test(expected = ImpossibleMoveException.class)
	public void bump_into_obstacle_should_fail_on_north() {
		Planet planet = new Planet(10);
		planet.putObstacle(new Obstacle(5, 4));
		
		Rover sut = new Rover(planet, planet.at(5, 5), Direction.NORTH);
		sut.forward();
	}

	@Test(expected = ImpossibleMoveException.class)
	public void bump_into_obstacle_should_fail_on_east() {
		Planet planet = new Planet(10);
		planet.putObstacle(new Obstacle(6, 5));
		
		Rover sut = new Rover(planet, planet.at(5, 5), Direction.EAST);
		sut.forward();
	}

    @Test(expected = ImpossibleMoveException.class)
    public void should_avoid_bumping_into_multiple_obstacles() {
        Planet planet = new Planet(10);
        planet.putObstacle(new Obstacle(5, 4));
        planet.putObstacle(new Obstacle(5, 6));

        Rover sut = new Rover(planet, planet.at(5, 5), Direction.NORTH);
        try {
            sut.forward();
            Assert.fail();
        } catch (ImpossibleMoveException e) {
            sut.backward();
        }
    }

}
