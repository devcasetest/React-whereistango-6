package de.sulzer.review;

import java.util.HashSet;
import java.util.Set;

/**
 * only for demonstration.
 */
public class Environment {
	private Set<EnvironmentTable> environmentSet;

	public Environment(){
		this.environmentSet = new HashSet<>();
	}

	public void addBroker(EnvironmentTable broker) {
		this.environmentSet.add(broker);
	}

	Set<EnvironmentTable> getBrokers() {
		return environmentSet;
	}
}
