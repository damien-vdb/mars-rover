package com.github.damienvdb06.marsrover;

import org.junit.Test;

public class RoverObstaclesTest {

	@Test(expected = ImpossibleMoveException.class)
	public void bump_into_obstacle_should_fail_on_north() {
		Planet planet = new Planet(10);
		planet.setObstacle(5, 4);
		
		Rover sut = new Rover(planet, 5, 5, Direction.NORTH);
		sut.forward();
	}

	@Test(expected = ImpossibleMoveException.class)
	public void bump_into_obstacle_should_fail_on_east() {
		Planet planet = new Planet(10);
		planet.setObstacle(6, 5);
		
		Rover sut = new Rover(planet, 5, 5, Direction.EAST);
		sut.forward();
	}
}
