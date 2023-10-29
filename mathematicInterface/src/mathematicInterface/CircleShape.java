package mathematicInterface;


public class CircleShape implements MathematicShape {
	private double radius;

    public CircleShape(double radius) {
        this.radius = radius;
    }

   
    public double getAreaData() {
        return Math.PI * radius * radius;
    }

    
    public double getPerimeterData() {
        return 2 * Math.PI * radius;
    }

}
