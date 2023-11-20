package contasCodigo;

public class RetangCalc {

		public double width;
		public double height;
		
		
		public double area() {
			double area = height * width;
			return area;
		}
		
		public double perimetro() {
			double perimetro = 2 * (height + width);
			return perimetro;
		}
		
		public double diagonal() {
			double diagonal = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
			return diagonal;
		}
		
		
		
}
