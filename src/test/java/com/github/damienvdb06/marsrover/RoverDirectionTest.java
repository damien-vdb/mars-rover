package com.github.damienvdb06.marsrover;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoverDirectionTest {
	
	@Test
	public void turn_left_from_north_is_west() {
		Rover sut = new Rover(5, 5, Direction.NORTH);
		sut.turnLeft();
		assertEquals(Direction.WEST, sut.direction);
	
	}
}
