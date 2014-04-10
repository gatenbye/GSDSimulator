import junit.framework.*;

public class ScenarioControllerTest extends TestCase {

	ScenarioController sc = new ScenarioController(null);

	public void testLoadScenarios() {
		sc.loadScenarios();
		assertTrue(sc.scenarios != null);
	}
}
