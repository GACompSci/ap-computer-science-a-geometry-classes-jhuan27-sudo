public class Rectangle{

    private Point corner;
    private int length;
    private int width;

    public Rectangle(Point corner, int length, int width){
        this.corner = corner;
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        double area = length*width;
        return MathTools.round(area, 2);
    }
}