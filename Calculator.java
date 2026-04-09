import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        long n1 = sc.nextInt();

        System.out.print("ENter second number: ");
        long n2 = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch(op){
            case '+' : System.out.println(n1+n2);
                        break;
            case '-' : System.out.println(n1-n2);
                        break;
            case '/' : System.out.println(n1/n2);
                        break;
            case '*' : System.out.println(n1*n2);
                        break;
            case '%' : System.out.println(n1%n2);
                        break;
            default: System.out.println("Please enter a valid operator");
        }

    }
    
}
