
package com.github.damienvdb06.marsrover.geography;

import java.util.HashSet;
import java.util.Set;

public class Obstacles {

	private Set<Obstacle> obstacles;

	public Obstacles() {
		this.obstacles = new HashSet<Obstacle>();
	}

	public void put(Obstacle obstacle) {
		this.obstacles.add(obstacle);
	}

	public boolean block(Position target) {
		return this.obstacles.contains(target);
	}
}
