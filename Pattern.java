public class Pattern {
    public void main(String[] args){
        int n = 4;

        // square
        for(int i = 1;i <=n; i++){
            for(int j = 1; j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // star pattern
        System.out.println("Star Pattern");
        int n2 = 4;
        int i = 1;
        while(i<=n2){
            int j = 1;
            while(j<=i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

        //inverted star pattern
        System.out.println("Inverted Star Pattern");
        int k = 1, n3 = 6;
        while(k<=n3){
            int j = (n3-k)+1;
            while(j>=1){
                System.out.print("* ");
                j--;
            }
            System.out.println();
            k++;
        }


        // Half pyramid( 1, 12, 123...)
        System.out.println("Half Pyramid");
        int num4 = 5;
        int i4 = 1;
        while(i4<=num4){
            int j = 1;
            while(j<=i4){
                System.out.print(" " +j);
                j++;
            }
            System.out.println();
            i4++;
        }


        // Character pattern A, BC, DEF...)
        System.out.println("Half Pyramid");
        int num5 = 5;
        int i5 = 1;
        char ch = 'A';
        while(i5<=num5){
            int j = 1;
            while(j<=i5){
                System.out.print(" "+ch);
                ch++;
                j++;
            }
            System.out.println();
            i5++;
        }
    }
}
