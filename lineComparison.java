import java.util.Scanner;

class lineComparison {
    public static void main (String[] args) {
        System.out.println("Welcome to line comparison computing!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Points of x1 and y1 : ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Points of x2 and y2 : ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("Length of line is : "+ length);
    }
}