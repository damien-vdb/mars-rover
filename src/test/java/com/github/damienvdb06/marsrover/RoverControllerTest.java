package com.github.damienvdb06.marsrover;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class RoverControllerTest {

    private RoverController controller;
    private Rover rover;

    @Before
    public void setUp() {
        rover = Mockito.mock(Rover.class);
        controller = new RoverController(rover);
    }

    @Test
    public void f_should_forward() {
        controller.command('f');
        Mockito.verify(rover).forward();
    }

    @Test
    public void b_should_backward() {
        controller.command('b');
        Mockito.verify(rover).backward();
    }

}
