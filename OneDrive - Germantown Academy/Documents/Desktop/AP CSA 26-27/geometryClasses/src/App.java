public class App{

    public static void main(String[] args) throws Exception {
        Point a = new Point( MathTools.randInt(1, 10), 3);
        System.out.println(a.getX());

        Point b = new Point(MathTools.randInt(1, 10), 3);
        System.out.println(b.getY());
        
    }
}
