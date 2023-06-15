package io.github.oliviercailloux.exercices.end;

import java.nio.file.Path;
import java.time.Instant;
import java.util.List;
import java.util.MissingResourceException;
import java.util.Set;

/**
 * A customer places simple orders and remembers which orders it has placed.
 * <p>
 * This class should have only private constructors.
 */
public class Customer {
	public static final Instant EARLIEST = Instant.parse("1960-01-01T00:00:00.00Z");

	/**
	 * Retrives the path to the “saved.txt” resource.
	 *
	 * @return a valid path
	 * @throws MissingResourceException iff the saved.txt resource is missing
	 * @see #readSavedOrders()
	 */
	public static Path savedOrdersPath() {
		/* TODO */
		return null;
	}

	/**
	 * Reads the list of orders found in the resource whose name, <em>relative to
	 * this class</em>, is “saved.txt”. The resource must contain one word per
	 * (non-empty) line. Each line represents an order. Empty lines are allowed and
	 * should be skipped.
	 *
	 * @return a (possibly empty) list of simple orders
	 * @throws IllegalStateException    iff the resource contains other lines than
	 *                                  single words (as determined by the space
	 *                                  character) or empty lines (lines containing
	 *                                  nothing else than a newline character,
	 *                                  ‘\n‘).
	 * @throws MissingResourceException iff the saved.txt resource is missing
	 */
	public static List<String> readSavedOrders() {
		/* TODO */
		return null;
	}

	/**
	 * Returns a new customer.
	 *
	 * @return a customer with no orders.
	 */
	public static Customer empty() {
		/* TODO */
		return null;
	}

	/**
	 * Returns a new customer initialized with the “saved” orders.
	 *
	 * @return a customer
	 * @see #readSavedOrders()
	 */
	public static Customer usingSavedOrders() {
		/* TODO */
		return null;
	}

	/**
	 * Places a simple order at the given time
	 *
	 * @param time        the time
	 * @param simpleOrder the simple order
	 * @throws IllegalArgumentException iff the given time is strictly before
	 *                                  {@link #EARLIEST}.
	 */
	public void placeOrder(Instant time, String simpleOrder) {
		/* TODO */
	}

	/**
	 * Returns the simple orders that have been ordered by this customer at the
	 * given time.
	 *
	 * @param time the time of the order
	 * @return an order
	 */
	public Order ordered(Instant time) {
		/* TODO */
		return null;
	}

	/**
	 * Returns a snapshot of all orders placed by this customer, one order per time
	 * it was placed.
	 * <p>
	 * The returned set must throw when attempting to write to it.
	 * <p>
	 * The returned set must iterate by increasing time (oldest orders first)
	 *
	 * @return a (possibly empty) set containing no empty orders.
	 */
	public Set<Order> allOrders() {
		/* TODO */
		return null;
	}

}
