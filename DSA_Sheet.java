public class DSA_Sheet {
    
    //Trapped Rainwater Problem
    public static int trappedWater(int height[]){
        int n = height.length;

        //left max boundary
        int leftarr[] = new int[n];
        leftarr[0] = height[0];
        for(int i = 1; i<n; i++){
            leftarr[i] = Math.max(height[i], leftarr[i-1]);
        }

        //right max boundary
        int rightarr[] = new int[n];
        rightarr[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            rightarr[i] = Math.max(height[i], rightarr[i+1]);
        }

        int trappedWat = 0;
        for(int i = 0; i<n; i++){
            //cal water level : Min(lefmax, rightmax)
            int waterLevel = Math.min(leftarr[i], rightarr[i]);
            // Trapped water : (water level - height)*widhth
            trappedWat += waterLevel - height[i];
        }
        return trappedWat;
    }



    public static void main(String args[]){

        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(arr));
    }
}
