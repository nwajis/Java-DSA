public class SortingAlgo {
    
    //Priting array fn
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }

    //Bubble sort: we compare the adjacent elements and swap them if they are in the wrong order and
    // we repeat this process until the entire array is sorted.
    public static void bubbleSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            boolean swapped = false;
            for(int j = 0 ; j<arr.length-i-1; j++){
                //swap
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break; // if(swapped == false) then exit inner loop.
        }
    }

    //Selection Sort: we find the minimum element in the unsorted array 
    //and swap it with the first element of the unsorted array and
    //  then we repeat this process for the remaining unsorted array until the entire array is sorted.
    public static void selecSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minPos = i;
            for(int j = i+1 ; j<arr.length; j++){
                if(arr[j]<arr[minPos]){
                    minPos = j;
                }
            }
            //swap (swapping outside the loop)
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }


    //Insertion sort : we assume that the first element is already sorted
    // and we start from the second element and compare it with the first element 
    // and if it is smaller than the first element then we swap it with the first element 
    // and if it is greater than the first element then we move to the next element 
    // and compare it with the first element and so on.
    public static void insertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding the correct position to insert
            while(prev>=0 && arr[prev]>curr){
                prev--;
            }
            //insertion
            int temp = arr[prev+1];
            arr[prev+1] = curr;
            curr = temp;
        }
    }

    //Counting sort
    public static void countingSort(int arr[]){

        //largest number(to create counting array)
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        //creating counting array
        int count[] = new int[largest+1];
        for(int i = 0; i<arr.length;i++){
            count[arr[i]]++;  //hashing
        }

        //sorting
        int j = 0;
        for(int i = 0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }


    public static void main(String args[]){
        int arr[] = {9,4,6,1,8,2,56};
        //bubbleSort(arr);
        //selecSort(arr);
        //insertionSort(arr);
        countingSort(arr);

        printArr(arr);

    }
    
}
