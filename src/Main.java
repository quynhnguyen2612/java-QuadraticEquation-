import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập giá trị a: ");
        double a = scanner.nextDouble();
        System.out.println("nhập giá trị b: ");
        double b = scanner.nextDouble();
        System.out.println("nhập giá trị c: ");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double[] roots = equation.getDiscriminant();

        if (roots==null) {
            System.out.println("Phương trình vô nghiệm");
        } else  if(roots.length==1) {
            System.out.println("phương trình có 1 nghiệm: " + roots[0]);
        } else {
            System.out.println("Phương trình có 2 nghiệm: " + roots[0] + "va" + roots[1]);
        }


    }
}