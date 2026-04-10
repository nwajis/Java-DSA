public class BinominalCoef {

    public static int factorial(int n){
        int f= 1;
        int i = 1;
        while(i<=n){
            f = i*f;
            i++;
        }
        return f;
    }
    public static int binCoef(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        int ncr = n_fact/(nmr_fact*r_fact);
        return ncr;
    }


    // PRIME CHECK
    public static boolean isPrime(int n){
        boolean isPrime = true;

        for(int i = 2; i<Math.sqrt(n);i++){
            if(n%i==0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


    public static void main(String args[]){
        int n = 10;
        int r = 2;
        int  ncr = binCoef(n,r);
        System.out.println(ncr);

        //prime check
        String check = isPrime(33)?"Yes":"NO";
        System.out.print(check);
    }
}
