import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String shape = scanner.nextLine();
        double area=0;
        double pai = 3.14;
        if(shape.equals("circle")){
            double a = scanner.nextDouble();
            area = pai*Math.pow(a,2);
        }
        if(shape.equals("rectangle")){
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            area = a*b;
        }

        if(shape.equals("triangle")){
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            double p = (a+b+c)/2;
            area= Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }

        System.out.println(area);

    }
}