import java.util.*;
public class JavaBasics {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Number 1: ");
        int n1 = sc.nextInt();

        System.out.print("Number 2: ");
        int n2 = sc.nextInt();

        System.out.print("Ye raha output: " + n1 + n2); //yeh string concatenation hai, isliye output 12 aayega agar n1=1 aur n2=2
        int sum = n1 + n2;
        System.out.print("\nOutput M1: " + sum); // yeh integer addition hai, isliye output n1 + n2 ayega.
        System.out.print("\nOutput M2: " + (n1+n2)); // yeh integer addition hai, isliye output n1 + n2 ayega.



        //implicit conversion
        int a = 5;
        long b = a; //int to long
        System.out.println("\nImplicit conversion: " + b);


        //explicit conversion
        
        double c = 45;
        int d = (int) c; //double to int
        System.out.println("Explicit conversion: " + d);

        //NOTE: Implicit conversion is done automatically by the compiler when it can safely convert a smaller data type to a larger data type without losing information.
        // Explicit conversion, on the other hand, requires the programmer to manually specify the type to which they want to convert, 
        // and it may lead to loss of information if not done carefully.
    
    
        // Type promotion in expressions
        byte x = 10;
        byte y = 20;
        long z = 30;
        long result = x + y + z; // x and y are promoted to long before addition
        System.out.println("Type promotion in expressions: " + result);


        //Conditional statements
        System.out.print("Conditional statements: ");
        int d1 =sc.nextInt();
        int d2 = sc.nextInt();
        if(d1>d2) System.out.println("d1 is larger");
        else System.out.println("d2 is larger");


        // Prime number check
        System.out.print("Enter a number to check if it's prime: ");
        int d3 = sc.nextInt();
        if(d3%2==0 && d3!=2) System.out.println("Not a prime number");
        else System.out.println("Prime number");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}