package velo.ladaalpha.fields.math.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import velo.ladaalpha.fields.math.AlgorithmicBezierCurve;
import velo.ladaalpha.fields.math.Point;

// TODO: Auto-generated Javadoc
/**
 * The Class BezierCurveTEst.
 */
class BezierCurveTEst {

	/**
	 * Test.
	 */
	@Test
	void test() {
		
		ArrayList<Point> points = new ArrayList<Point>();
		points.add(new Point(1, 1));
		points.add(new Point(1, 2));
		points.add(new Point(2, 2));
		points.add(new Point(2, 1));
		
		AlgorithmicBezierCurve bc = new AlgorithmicBezierCurve(points);
		Point leprt = bc.compute(0.3);
		System.out.println(leprt);
	}

}
