
public class ComputeVolume {

	public static void main(String[] args) {
		double area;
		double radius;
		double volume;
		int length;
		
		radius = 5.5;
		area = 95.0331;
		volume = 1140.4;
		length = 12;
		
		area = radius * radius * 3.14159;
		volume = area * length;
		
		
		System.out.println ("The area of the cylinder is " + area);
		System.out.println ("The volume of the cylinder is " + volume);
		
		

	}

}
