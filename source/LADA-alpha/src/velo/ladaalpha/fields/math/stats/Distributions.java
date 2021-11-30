package velo.ladaalpha.fields.math.stats;

import velo.ladaalpha.fields.math.Equation;
import velo.ladaalpha.fields.math.calculus.NumericalIntegration;

public class Distributions {
	private static class PDFequation extends Equation {		
		@Override
		public double compute(double input) {
			return (Math.pow(Math.E, -(Math.pow(input, 2)/2)))/(Math.sqrt(2*Math.PI));
		}
	}
	public static Double PDF(double z, DistributionDirections dir) {
	
		return dir.equals(DistributionDirections.LEQ)?NumericalIntegration.integrateSMPSN(new PDFequation(), -10, z, 1000):NumericalIntegration.integrateSMPSN(new PDFequation(), z, 10, 1000);
	}
}