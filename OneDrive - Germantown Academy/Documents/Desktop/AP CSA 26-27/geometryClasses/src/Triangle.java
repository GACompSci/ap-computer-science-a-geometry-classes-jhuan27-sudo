public class Triangle {

    private Point a;
    private Point b;
    private Point c;
    
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea(){
        double side1 = MathTools.distance(a, b);
        double side2 = MathTools.distance(b, c);
        double side3 = MathTools.distance(a, c);

        double s = (side1 + side2 + side3) /2.0;
        double area = Math.sqrt(
            s * (s - side1) * (s - side2) * (s - side3)
        );

        return MathTools.round(area, 2);
        }
    }


