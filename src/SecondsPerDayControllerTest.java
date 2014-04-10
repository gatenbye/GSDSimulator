import junit.framework.*;

public class SecondsPerDayControllerTest extends TestCase {

	SecondsPerDayController sc = new SecondsPerDayController(null);

	public void testLoadSecondsPerDay() {
		sc.loadSecondsPerDay();
		assertTrue(sc.spd != null);
	}
}
