import junit.framework.*;

public class StartupControllerTest extends TestCase {

	StartupController sc = new StartupController(null);

	public void testSecondsPerDay() {
		sc.setSecondsPerDay(5);
		assertTrue(sc.getSecondsPerDay() == 5);
	}

	public void testDeveloperCost() {
		sc.setDeveloperCost(5);
		assertTrue(sc.getDeveloperCost() == 5);
	}

	public void testDeveloperProductivity() {
		sc.setDeveloperProductivity(5);
		assertTrue(sc.getDeveloperProductivity() == 5);
	}

	public void testPlayerMoney() {
		sc.setPlayerMoney(5);
		assertTrue(sc.getPlayerMoney() == 5);
	}

	public void testPause() {
		sc.setPause(true);
		assertTrue(sc.getPause() == true);
	}

}
