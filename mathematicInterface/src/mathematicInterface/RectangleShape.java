package mathematicInterface;

public class RectangleShape implements MathematicShape {
	private double width;
    private double height;

    public RectangleShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    
    public double getAreaData() {
        return width * height;
    }

    
    public double getPerimeterData() {
        return 2 * (width + height);
    }

}
