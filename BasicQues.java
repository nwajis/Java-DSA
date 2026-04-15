import java.util.*;
public class BasicQues {
    public void main(String[] args){
    
        try (Scanner sc = new Scanner(System.in)) {
    
        // Reverse a number
        int num = 12345;
        int num2 = 123445;

        while(num>0){
            int digit = num%10;
            System.out.print(digit);
            num/=10;
        }

        System.out.println();

        //Method 2
        int rev = 0;
        while(num2>0){
            int dig = num2%10;
            rev = rev*10 + dig;
            num2/=10;
        }
        System.out.print("reversed: "+rev);
     
        System.out.println();


        
        // break keyword
        do{
            System.out.print("enter a num: ");
            int noi = sc.nextInt();
            if(noi%10 == 00) break;
            System.out.println(noi);
        }while(true);



        // continue
        do{
            System.out.print("pls enter a num: ");
            int noii = sc.nextInt();

            if(noii%10 == 0) continue;

            System.out.println("entered num was: "+noii);
        }while(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
