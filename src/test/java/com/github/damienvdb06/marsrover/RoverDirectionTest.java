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

	@Test
	public void turn_right_should_change_rover_direction() {
		assertRight(Direction.NORTH, Direction.EAST);
		assertRight(Direction.WEST, Direction.NORTH);
		assertRight(Direction.SOUTH, Direction.WEST);
		assertRight(Direction.EAST, Direction.SOUTH);
	}
	
	private void assertRight(Direction initial, Direction expected) {
		Rover sut = new Rover(5, 5, initial);
		sut.turnRight();
		assertEquals(expected, sut.direction);
	}

	private void assertLeft(Direction initial, Direction expected) {
		Rover sut = new Rover(5, 5, initial);
		sut.turnLeft();
		assertEquals(expected, sut.direction);
	}
	
}
