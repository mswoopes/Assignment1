//OK. Ozgur Aktunc

public class Circle {

	public static void main(String[] args) {
		
		int radius = 5;
		
		double diameter = radius + radius;
		//One error here, this should also be multiplied by PI.
				
		double area = radius * radius * Math.PI;
		
		System.out.println("The radius of the circle is " + radius);
		
		System.out.println("The area of this circle is " + area);
		
		System.out.println("The diameter of this circle is " + diameter);
		
	}
}
