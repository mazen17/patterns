package ppp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSleepCommand {

	private boolean commandExecuted = false;

	@Test
	public void testSleep() throws Exception {
		Command wakeup = new Command() {
			public void execute() {
				commandExecuted = true;
			}
		};
		ActiveObjectEngine e = new ActiveObjectEngine();
		SleepCommand c = new SleepCommand(1000, e, wakeup);
		e.addCommand(c);
		long start = System.currentTimeMillis();
		e.run();
		long stop = System.currentTimeMillis();
		long sleepTime = (stop - start);
		assertTrue("SleepTime " + sleepTime + " expected > 1000", sleepTime >= 1000);
		assertTrue("SleepTime " + sleepTime + " expected < 1100", sleepTime < 1100);
		assertTrue("Command Executed", commandExecuted);
	}
}
