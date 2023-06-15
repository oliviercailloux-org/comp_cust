package io.github.oliviercailloux.exercices.end;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ComputerTests {

	@Test
	void testOpThree() throws Exception {
		final Computer c = Computer.instance();
		c.addOperand(3d);
		c.addOperand(4d);
		assertThrows(Exception.class, () -> c.addOperand(5d));
	}

	@Test
	void testAddition() throws Exception {
		final Computer c = Computer.duplOp(6d);
		assertEquals(12d, c.apply("+"));
	}
}
