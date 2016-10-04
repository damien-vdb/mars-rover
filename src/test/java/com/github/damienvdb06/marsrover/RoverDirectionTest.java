package com.github.damienvdb06.marsrover;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoverDirectionTest {
	
	@Test
	public void turn_left_should_change_rover_direction() {
		assertLeft(Direction.NORTH, Direction.WEST);
		assertLeft(Direction.WEST, Direction.SOUTH);
		assertLeft(Direction.SOUTH, Direction.EAST);
		assertLeft(Direction.EAST, Direction.NORTH);
	}

	private void assertLeft(Direction initial, Direction expected) {
		Rover sut = new Rover(5, 5, initial);
		sut.turnLeft();
		assertEquals(expected, sut.direction);
	}
	
}
