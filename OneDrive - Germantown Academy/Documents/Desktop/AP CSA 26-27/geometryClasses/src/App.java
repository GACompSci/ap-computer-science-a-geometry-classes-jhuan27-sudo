public class App{

    public static void main(String[] args) throws Exception {
        Point a = new Point( MathTools.randInt(1, 10), 3);
        System.out.println(a.getX());

        Point b = new Point(MathTools.randInt(1, 10), 3);
        System.out.println(b.getY());

        Circle c = new Circle(a, MathTools.randInt(1, 10));
        System.out.println(c.getArea());
        System.out.println(c.getRadius());
        
    }
}
