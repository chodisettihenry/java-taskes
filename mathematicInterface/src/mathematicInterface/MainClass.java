package mathematicInterface;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	        
	        CircleShape circle = new CircleShape(5.0);
	        RectangleShape rectangle = new RectangleShape(4.0, 6.0);

	       
	        System.out.println("Circle Shape:");
	        System.out.println("Area of circle: " + circle.getAreaData());
	        System.out.println("Perimeter of circle: " + circle.getPerimeterData());

	        System.out.println("\nRectangle Shape:");
	        System.out.println("Area of rectangle: " + rectangle.getAreaData());
	        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeterData());
	   

	}

}
