package io.github.oliviercailloux.exercices.end;

import java.time.Instant;
import java.util.List;

/**
 * An order is a (possibly empty) collection of simple orders that have been
 * placed by a single customer at a single time.
 */
public interface Order {
	Customer customer();

	Instant time();

	int nbSimpleOrders();

	/**
	 * Returns a <em>writeable</em> list containing the simple orders in this
	 * instance. Writing to the list modifies the orders that the corresponding
	 * customer has placed.
	 *
	 * @return a (possibly empty) list of simple orders.
	 */
	List<String> simpleOrders();
}
