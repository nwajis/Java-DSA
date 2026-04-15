public class Arrays {
    
    
        //update value in array
        public static void updateMarks(int marks[]){
            for(int i = 0 ; i<marks.length;i++){
                marks[i] = marks[i] + 20;
            }
        }


        //Linear Search
        public static int Lsearch(int arr[], int key){
            for(int i = 0; i<arr.length; i++){
                if(arr[i]==key) return 1;
            }
            return -1;
        }

        //Largest number;
        public static int largestNum(int arr[]){
            int maxi = Integer.MIN_VALUE;
            for(int i = 0 ; i<arr.length; i++){
                if(arr[i]>maxi) maxi = arr[i];
            }
            return maxi;
        }

        //Binary Search
        public static int binSearch(int arr[], int key){
            int s = 0 ;
            int e = arr.length-1;
            int mid = s + (e-s)/2;
            while(s<=e){
                if(key == arr[mid]) return mid;
                if(key<arr[mid]){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
                mid = s + (e-s)/2;
            }
            return -1;
        }

        //reverse an array
        public static void revArr(int arr[]){
            int temp = 0;
            int first = 0;
            int last = arr.length-1;
            while(first<last){
                temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
                first++;
                last--;
            }
        }

        //Pairs in array
        public static void pairsInArr(int arr[]){
            int totP = 0;
            for(int i = 0; i < arr.length; i++){
                int curr = arr[i]; // 50, 40, 30 , 20 , 10
                for(int j = i+1; j<arr.length; j++){
                    System.out.print("("+curr+" "+arr[j]+")");
                    totP++;
                }
                System.out.println();
            }
            System.out.print("Total Pairs: "+ totP);
        }


        //Print Subarray
        public static void subArray(int arr[]){
            int totalSubArr = 0;
            for(int i = 0 ; i<arr.length; i++){
                int start = i;
                for(int j = i ; j<arr.length; j++){
                    int end = j;
                    for(int k = start; k<=end; k++){
                        System.out.print(arr[k]+" ");
                    }
                    totalSubArr++;
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println("Total Sub Arrays: "+totalSubArr);
        }

        //Maximum Subarray Sum(Brute Force)
        public static int maxSubArrSum(int arr[]){
            int maxSum = Integer.MIN_VALUE;
            for(int i = 0;i<arr.length;i++){
                int start = i;
                for(int j = i; j<arr.length;j++){
                    int end = j;
                    int currSum = 0;
                    for(int k = start; k<=end; k++){
                        currSum += arr[k];
                    }
                    if(currSum>maxSum) maxSum = currSum;
                }
            }
            return maxSum;
        }

        //Max Sub array sum( Prefix sum)
        public static int maxSubArrPre(int arr[]){

            int curSum=0;
            int maxSum = Integer.MIN_VALUE;

            //Prefix array
            int prefixArr[] = new int [arr.length]; 
            prefixArr[0] = arr[0];
            for(int i = 1; i<arr.length; i++){
                prefixArr[i] = prefixArr[i-1]+ arr[i];
            }

            for(int i =0; i<arr.length; i++){
                int start = i;
                for(int j = i; j<arr.length; j++){
                    int end = j;
                    curSum = start == 0 ? prefixArr[end] : prefixArr[end] - prefixArr[start-1];
                    if(maxSum<curSum) maxSum = curSum;
                }
            }
            return maxSum;
        }


        //Kadanes algorithm for subarray sum
        public static int kadanes(int arr[]){
            int maxSum = Integer.MIN_VALUE;
            int currSum = 0;
            for(int i = 0; i<arr.length;i++){
                currSum = currSum + arr[i];
                maxSum = Math.max(currSum, maxSum);
                if(currSum<0){
                    currSum = 0;
                }
            }
            return maxSum;
        }



        public static void main(String args[]){

            int amray[] = new int[6];
            amray[0] = 1;
            int marks [] = {12,13,15};

            updateMarks(marks);

            for(int i = 0;i<marks.length; i++){
                System.out.print(marks[i]+ " ");
            }


            int arr[] = {12,14,13,1,34,20};
            System.out.println("Linear Search: "+ Lsearch(arr, 14));
            System.out.println("Largest in an Arr: " +largestNum(arr));

            int arr2[] = {10,20,30,40,50};
            System.out.println("Binary search "+binSearch(arr2, 3));

            System.out.println("Before reverse");
            for(int i = 0; i<arr2.length;i++){
                System.out.print(" "+ arr2[i]);
            }
            
            System.out.println();


            revArr(arr2);
            System.out.println("After reverse");
            for(int i = 0; i<arr2.length;i++){
                System.out.print(" "+ arr2[i]);
            }

            System.out.println();
            pairsInArr(arr2);

            System.out.println();
            subArray(arr2);
            

            int arr3[] = {-1,-2,-3,-4,-5,-10};
            System.out.println();
            System.out.println("Max sub array sum: "+maxSubArrSum(arr3));

            System.out.println("Max sub array(prefix): "+ maxSubArrPre(arr3));

            System.out.println("Max sub array sum using kadanes algo: "+kadanes(arr3));


        }
}
