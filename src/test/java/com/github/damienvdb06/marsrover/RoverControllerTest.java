package com.github.damienvdb06.marsrover;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
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

    @Test
    public void l_should_turn_left() {
        controller.command('l');
        Mockito.verify(rover).turnLeft();
    }

    @Test
    public void r_should_turn_right() {
        controller.command('r');
        Mockito.verify(rover).turnRight();
    }

    @Test
    public void controller_should_handle_multiple_commands() {
        controller.command("fblr");

        InOrder order = Mockito.inOrder(rover);
        order.verify(rover).forward();
        order.verify(rover).backward();
        order.verify(rover).turnLeft();
        order.verify(rover).turnRight();
    }
}
