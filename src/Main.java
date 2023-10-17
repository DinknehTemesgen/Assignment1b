import java.util.Scanner;

class Calculator {
    private String brand;
    private String model;

    // Constructor
    public Calculator(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void main(String[] args) {

        System.out.println("Hello! This is a simple calculator");


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter name of the Brand");
        input.nextLine();
        String brand = input.nextLine();
        System.out.println("Please enter name of the model");
        input.nextLine();
        String model = input.nextLine();

        Calculator cal= new Calculator( brand, model);
        System.out.println("Please enter 1 to add");
        System.out.println("Please enter 2 to subtract");
        System.out.println("Please enter 3 to multiply");
        System.out.println("Please enter 4 to divide");
        System.out.println("Please enter 5 to get the average of your entries");


        int operation = input.nextInt();

        switch (operation) {
            case 1:
                addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            case 5:
                average();
                break;
            default:
                System.out.println("Invalid operation choice");
        }
    }

    public static void addition() {
        Scanner input = new Scanner(System.in);

        int a, b, sum;
        System.out.println("Please enter the first number!");
        a = input.nextInt();
        System.out.println("Please enter the second number!");
        b = input.nextInt();
        sum = a + b;
        System.out.printf("The sum of a and b is %d%n", sum);
    }

    public static void subtraction() {
        Scanner input = new Scanner(System.in);

        int a, b, difference;
        System.out.println("Please enter the first number!");
        a = input.nextInt();
        System.out.println("Please enter the second number!");
        b = input.nextInt();
        difference = a - b;
        System.out.printf("The difference of a and b is %d%n", difference);
    }

    public static void multiplication() {
        Scanner input = new Scanner(System.in);

        int a, b, product;
        System.out.println("Please enter the first number!");
        a = input.nextInt();
        System.out.println("Please enter the second number!");
        b = input.nextInt();
        product = a * b;
        System.out.printf("The product of a and b is %d%n", product);
    }

    public static void division() {
        Scanner input = new Scanner(System.in);

        int a, b, quotient;
        System.out.println("Please enter the first number!");
        a = input.nextInt();
        System.out.println("Please enter the second number, BUT NOT 0!");
        b = input.nextInt();
        if (b != 0) {
            quotient = a / b;
            System.out.printf("The quotient of a and b is %d%n", quotient);
        } else {
            System.out.println("You entered an invalid number!");
        }
    }

    public static void average() {
        Scanner input = new Scanner(System.in);

        int n, sum = 0;
        double av;
        System.out.println("How many numbers would you like to use?");
        n = input.nextInt();
        System.out.println("Please enter your entries!");
        for (int i = 1; i <= n; i++) {
            sum += input.nextInt();
        }

        av = (double) sum / n;

        System.out.printf("The average of your entries is %f%n", av);
    }
}