public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    double[] getDiscriminant(){
        double delta = b*b - 4*a*c;

        if(delta<0) {
            return null;
        } else if(delta==0){
            double root = -b / (2*a);
            return new double[]{root};
        } else {
            double r1 = (-b + Math.sqrt(delta))/(2*a);
            double r2 = (-b - Math.sqrt(delta))/(2*a);
            return new double[]{r1,r2};
        }
    }






}

