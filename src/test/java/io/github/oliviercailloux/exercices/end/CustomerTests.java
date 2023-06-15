package io.github.oliviercailloux.exercices.end;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Instant;
import java.util.Iterator;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class CustomerTests {
	@Test
	void testOrders() throws Exception {
		final Instant i80 = Instant.parse("1980-01-01T00:00:00.00Z");
		final Instant i90 = Instant.parse("1990-01-01T00:00:00.00Z");
		final Instant i00 = Instant.parse("2000-01-01T00:00:00.00Z");
		final Instant i10 = Instant.parse("2010-01-01T00:00:00.00Z");
		final Instant i30 = Instant.parse("2030-01-01T00:00:00.00Z");

		final Customer c = Customer.empty();
		c.placeOrder(i80, "chair");
		c.placeOrder(i90, "computer");
		c.placeOrder(i00, "computer");
		c.placeOrder(i00, "router");
		c.placeOrder(i10, "iPad");
		c.placeOrder(i30, "flyingCar");
		final Set<Order> allOrders = c.allOrders();

		assertEquals(5, allOrders.size());
		final Iterator<Order> it = allOrders.iterator();
		final Order o1 = it.next();
		final Order o2 = it.next();
		final Order o3 = it.next();
		final Order o4 = it.next();
		final Order o5 = it.next();
		assertFalse(it.hasNext());
		assertEquals(2, o3.nbSimpleOrders());
		assertEquals(2, o3.simpleOrders().size());
		assertEquals(i00, o3.time());
		assertTrue(o3.simpleOrders().contains("computer"));
		assertTrue(o3.simpleOrders().contains("router"));
	}
}
