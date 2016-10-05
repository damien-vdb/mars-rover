
package com.github.damienvdb06.marsrover;

import com.github.damienvdb06.marsrover.geography.Position;

public class ImpossibleMoveException extends RuntimeException {

    public ImpossibleMoveException(Position target) {
        super(String.format("Rover avoided crashing at %d,%d !", target.x, target.y));
    }
}
