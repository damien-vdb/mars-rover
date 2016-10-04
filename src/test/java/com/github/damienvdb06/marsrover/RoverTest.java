package com.github.damienvdb06.marsrover;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RoverTest {

	private static final int STARTING_Y = 5;
	private static final int STARTING_X = 5;

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { //
				{ Direction.NORTH, 0, -1 }, //
				{ Direction.EAST, 1, 0 }, //
				{ Direction.WEST, -1, 0 }, //
				{ Direction.SOUTH, 0, 1 } });
	}

	private int expectedX;
	private Direction direction;
	private int expectedY;

	public RoverTest(Direction direction, int expectedX, int expectedY) {
		this.direction = direction;
		this.expectedX = expectedX;
		this.expectedY = expectedY;
	}

	@Test
	public void forward_should_go_in_the_facing_direction() {
		Rover sut = new Rover(STARTING_X, STARTING_Y, direction);
		sut.forward();
		assertEquals(STARTING_X + this.expectedX, sut.position.x);
		assertEquals(STARTING_Y + this.expectedY, sut.position.y);
	}
	
	@Test
	public void backward_should_go_in_the_opposing_direction() {
		Rover sut = new Rover(STARTING_X, STARTING_Y, direction);
		sut.backward();
		assertEquals(STARTING_X - this.expectedX, sut.position.x);
		assertEquals(STARTING_Y - this.expectedY, sut.position.y);
	}

}