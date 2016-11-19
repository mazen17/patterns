package ppp.patterns.factory.DynamicShapeFactory;

import org.junit.Before;
import org.junit.Test;

public class TestDynamicShapeFactory {

	private ShapeFactory factory;

	@Before
	public void setUp() throws Exception {
		factory = new ShapeFactoryImplementation();
	}

	@Test
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateCircle() throws Exception {
		Shape s = factory.make("Circle");
		assert(s instanceof Circle);
	}

	@Test
	public void testCreateSquare() throws Exception {
		Shape s = factory.make("Square");
		assert(s instanceof Square);
	}

	@Test(expected = Exception.class)
	public void testInvalidShape() throws Exception {
		factory.make("Triangle");
	}
}
