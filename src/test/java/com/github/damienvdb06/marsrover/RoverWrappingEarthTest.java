package com.github.damienvdb06.marsrover;

import static org.junit.Assert.assertEquals;

import com.github.damienvdb06.marsrover.geography.Planet;
import org.junit.Before;
import org.junit.Test;

public class RoverWrappingEarthTest {

    private Planet planet;

    @Before
    public void setUp() {
        planet = new Planet(10);
    }

	@Test
	public void going_over_west_maximum_edge_should_be_east_edge() {
		Rover sut = new Rover(planet, planet.at(9, 5), Direction.EAST);
		sut.forward();
		assertEquals(0, sut.position.x);
	}

	@Test
	public void going_over_east_maximum_edge_should_be_west_edge() {
		Rover sut = new Rover(planet, planet.at(0, 5), Direction.EAST);
		sut.backward();
		assertEquals(9, sut.position.x);
	}
	
}
