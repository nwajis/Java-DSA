import java.util.*;
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

            
        }

        public static void main(String args[]){

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

        }
}
