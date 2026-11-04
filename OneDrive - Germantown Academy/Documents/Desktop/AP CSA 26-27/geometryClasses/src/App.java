public class App{

    public static void main(String[] args) throws Exception {
        Point a = new Point(MathTools.randInt(1, 10), 3);
        System.out.println(a.getX());

        Point b = new Point(MathTools.randInt(1, 10), 3);
        System.out.println(b.getY());

        Point z = new Point(MathTools.randInt(1, 10), 3);
        System.out.println(z.getX());

        Circle c = new Circle(a, MathTools.randInt(1, 10));
        System.out.println(c.getArea());
        System.out.println(c.getRadius());

        Rectangle d = new Rectangle(b, MathTools.randInt(1, 10),  MathTools.randInt(1, 10));
        System.out.println(d.getArea());

        Triangle e = new Triangle(a, b, z);
        System.out.println(e.getArea());
        
    }
}
