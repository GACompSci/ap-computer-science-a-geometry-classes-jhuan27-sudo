public class Circle {
    private Point center;
    private int radius;


    public Circle(Point x, int y){
        center = x;
        radius = y;
    }

    public int getRadius(){
        return radius;
    }
    public double getArea(){
        return MathTools.round((Math.pow(radius, 2))*(Math.PI), 2);
    }
}