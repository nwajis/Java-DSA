public class Pattern2 {

    //Hollow Rectangle
    public static void HollowPattern(int r, int c){
        int i = 1;
        while(i<=r){
            int j = 1;
            while(j<=c){
                if(i==1 || i == r || j == 1 || j == c){
                    System.out.print("* ");
                }
                else System.out.print("  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    //Half Pyramid
    public static void halfPyramid(int n){
        int i = 1;
        
        while(i<=n){
            //spaces
            int j = n-i;
            while(j>0){
                System.out.print("  ");
                j--;
            }

            //stars
            int k = 1;
            while(k<=i){
                System.out.print("* ");
                k++;
            }
            System.out.println();

            i++;
        }        
    }


    // Half inverted number pyramid
    public static void invNumPyr(int n){
        
        while(n>0){
            int j = 1;
            while(j<=n){
                System.out.print(" "+j);
                j++;
            }
            System.out.println();
            n--;
        }

    }

    //Numberic Pyramid
    public static void NumPyr(int n){

        int count = 1;
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=i){
                System.out.print(" "+count);
                count++;
                j++;
            }
            System.out.println();
            i++;
        }
    }


    // 0-1 triangle
    public static void zeroOne(int n){

        for(int i = 1;i<=n; i++){
            for(int j = 1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }


    //Butterfly Pattern

    public static void butterFly(int n){
        //upper
        int k = 1;
        while(k<=n){
            //p1
            for(int i = 1;i<=k;i++){
                System.out.print(" *");
            }
            //p2
            for(int i = n-k; i>0;i--){
                System.out.print("  ");
            }
            //p3
            for(int i = n-k; i>0;i--){
                System.out.print("  ");
            }
            //p4
            for(int i = 1;i<=k;i++){
                System.out.print(" *");
            }
            k++;
            System.out.println();
            
        }

        //Lower
        int l = 1;
        while(l<=n){
            //p1
            for(int i = n-l+1;i>0;i--){
                System.out.print(" *");
            }
            //p2
            for(int i = 1; i<l;i++){
                System.out.print("  ");
            }
            //p3
            for(int i = 1; i<l;i++){
                System.out.print("  ");
            }
            //p4
            for(int i = n-l+1;i>0;i--){
                System.out.print(" *");
            }
            l++;
            System.out.println();
        }
    }

    //Parallelogram
    public static void parrPatt(int n){

        int k = 1;
        while(k<=n){
            //p1
            for(int i = n-k;i>0;i--){
                System.out.print("  ");
            }

            //p2
            for(int i = 1;i<=k;i++){
                System.out.print("* ");
            }

            //p3
            for(int i = n-k;i>0;i--){
                System.out.print("* ");
            }

            System.out.println();
            k++;
        }
    }

    //Diamond
    public static void diamond(int n){

        //Upper Part
        int k = 1;
        while(k<=n){
            //r1
            for(int i = n-k;i>0;i--){
                System.out.print("  ");
            }

            //r2
            for(int i = 1;i<=k;i++){
                System.out.print("* ");
            }

            //r3
            for(int i = 1; i<k;i++){
                System.out.print("* ");
            }

            k++;
            System.out.println();

        }

        //Lower Part
        int l = 1;
        while(l<=n){

            //r1
            for(int i = 1; i<=l; i++){
                System.out.print("  ");
            }

            //r2
            for(int i = n-l; i>0;i--){
                System.out.print("* ");
            }
            //r3
            for(int i = n-l-1;i>0;i--){
                System.out.print("* ");
            }
            System.out.println();
            l++;
        }
    }

    //Palindromic Pattern
    public static void palinNumPat(int n){
        int k = 1;
        while(k<=n){
            int count = k;
            int count2 = 2;
            //r1
            for(int i = n-k; i>0;i--){
                System.out.print("   ");
            }
            //r2
            for(int i = 1; i<=k;i++){
                System.out.print(count+ "  ");
                count--;
            }

            //r3
            for(int i = 1; i<k;i++){
                System.out.print(count2+ "  ");
                count2++;
            }
            System.out.println();
            k++;
        }
    }

    




    public static void main(String args[]){
        int r = 4, c = 5;
        int n = 5;
        HollowPattern(r, c);

        halfPyramid(n);

        invNumPyr(5);

        NumPyr(5);

        zeroOne(5);
        butterFly(4);
        parrPatt(5);
        diamond(4);
        palinNumPat(5);

    }
    
}
