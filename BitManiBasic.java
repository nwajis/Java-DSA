public class BitManiBasic {

    //Binary to Decimal
    public static int binToDec(int bin){
        int pow = 0;
        int dec = 0;
        while(bin>0){
            int ldig = bin%10;
            dec = dec + ldig*(int)Math.pow(2, pow);
            bin = bin/10;
            pow++;
        }
        return dec;

    }

    //Decimal to Binary
    public static int decToBin(int n){
        int bin = 0;
        int pow = 0;
        while(n>0){
            int rem = n%2;
            bin = bin + rem*(int)Math.pow(10,pow);
            n = n/2;
            pow++;
        }
        return bin;
    }


    public static void main(String args[]){

        int dec = binToDec(1011);
        System.out.println(dec);

        int bin = decToBin(10);
        System.out.println(bin);
    }
}
