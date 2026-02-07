import java.util.Scanner;

class lineComparison {
    public static void main (String[] args) {
        System.out.println("Welcome to line comparison computing!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Points of x1 and y1 for line one : ");
        double l1x1 = sc.nextDouble();
        double l1y1 = sc.nextDouble();

        System.out.println("Points of x2 and y2 for line one : ");
        double l1x2 = sc.nextDouble();
        double l1y2 = sc.nextDouble();

        Double length1 = Math.sqrt(Math.pow((l1x2 - l1x1), 2) + Math.pow((l1y2 - l1y1), 2));
        System.out.println("Length of line one : " + length1);

        System.out.println("Points of x1 and y1 for line two : ");
        double l2x1 = sc.nextDouble();
        double l2y1 = sc.nextDouble();

        System.out.println("Points of x2 and y2 for line two : ");
        double l2x2 = sc.nextDouble();
        double l2y2 = sc.nextDouble();

        Double length2 = Math.sqrt(Math.pow((l2x2 - l2x1), 2) + Math.pow((l2y2 - l2y1), 2));
        System.out.println("Length of line two : " + length2);

        if (length1.equals(length2)) {
            System.out.println("Both lines are eqlal.");
        } else {
            System.out.println("Lines are not equal.");
        }

        sc.close();
    }
}