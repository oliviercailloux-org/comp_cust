package io.github.oliviercailloux.exercices.end;

import java.io.IOException;
import java.nio.file.Path;
import java.time.Instant;
import java.util.List;
import java.util.Set;

/**
 * A customer places simple orders and remembers which orders it has placed.
 * <p>
 * This class should have only private constructors.
 */
public class Customer {
	public static final Instant EARLIEST = Instant.parse("1960-01-01T00:00:00.00Z");

	/**
	 * Reads the list of orders found in the given path. The source must contain one
	 * word per (non-empty) line. Each line represents an order. Empty lines are
	 * allowed and should be skipped. The source is supposed to be encoded in UTF-8.
	 *
	 * @param source the source to read from
	 * @return a (possibly empty) list of simple orders
	 * @throws IllegalStateException iff the source contains other lines than single
	 *                               words (as determined by the space character) or
	 *                               empty lines (lines containing nothing else than
	 *                               a newline character, ‘\n‘).
	 * @throws IOException           iff reading from the given source fails
	 */
	public static List<String> readOrders(Path source) throws IOException {
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
	 * Returns a new customer initialized with the orders found in the given source
	 * and time {@link Instant#now()}.
	 *
	 * @return a customer
	 * @see #readOrders(Path)
	 */
	public static Customer usingOrders(Path source) {
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
