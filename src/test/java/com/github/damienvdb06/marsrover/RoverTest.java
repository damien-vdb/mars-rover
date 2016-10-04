package com.github.damienvdb06.marsrover;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RoverTest {

	@Test
	public void forward_should_go_north_if_facing_north() {
		Rover sut = new Rover(5,5, Direction.NORTH);
		sut.forward();
		assertEquals(5, sut.x);
		assertEquals(4, sut.y);
	}
	
	
}