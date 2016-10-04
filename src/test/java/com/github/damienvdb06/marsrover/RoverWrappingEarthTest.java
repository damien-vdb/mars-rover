package com.github.damienvdb06.marsrover;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoverWrappingEarthTest {
	
	@Test
	public void going_over_west_maximum_edge_should_be_east_edge() {
		Position.planetSize = 10;
		Rover sut = new Rover(9, 5, Direction.EAST);
		sut.forward();
		assertEquals(0, sut.position.x);
	}

	@Test
	public void going_over_east_maximum_edge_should_be_west_edge() {
		Position.planetSize = 10;
		Rover sut = new Rover(0, 5, Direction.EAST);
		sut.backward();
		assertEquals(9, sut.position.x);
	}
	
}
