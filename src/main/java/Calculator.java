import java.util.Scanner;

public class Calculator {

    Scanner reader = new Scanner(System.in);
    double result, first, second;
    char operator;

    public void inputIxpression() {

        System.out.print("Enter two numbers: ");

        first = reader.nextDouble();
        second = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");

        operator = reader.next().charAt(0);

    }

    public double calculate(char operator) {


        switch (operator) {
            case '+':
                return result = first + second;


            case '-':
                return result = first - second;


            case '*':
                return result = first * second;


            case '/':
                return result = first / second;


            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                break;
        }
        return result;
    }

    public void print() {

        System.out.printf("%.1f %c %.1f = %.1f",first,operator,second,result);
        }
}
