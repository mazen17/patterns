package ppp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestActiveObjectEngine {

	private boolean firstCommandExecuted = false;
	private boolean secondCommandExecuted = false;

	@Test
	public void testOneCommand() throws Exception {
		ActiveObjectEngine e = new ActiveObjectEngine();
		e.addCommand(new Command() {
			public void execute() {
				firstCommandExecuted = true;
			}
		});
		e.run();
		assertEquals("", "");
		assertTrue("Command not executed", firstCommandExecuted);
	}

	@Test
	public void testTwoCommands() throws Exception {
		ActiveObjectEngine e = new ActiveObjectEngine();
		e.addCommand(new Command() {
			public void execute() {
				firstCommandExecuted = true;
			}
		});
		e.addCommand(new Command() {
			public void execute() {
				secondCommandExecuted = true;
			}
		});
		e.run();
		assertTrue("Commands not executed", firstCommandExecuted && secondCommandExecuted);
	}
}
