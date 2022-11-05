package sorting;

public class selectionSort {

    public static void selection(int arr[]){
        for(int i = 0 ; i<arr.length-1;i++){
            int minPos = i;
            for(int j = i+1; j<arr.length; j++){
                // for increasing order
                if(arr[minPos]>arr[j]){
                    // for Decreasing order --->>> if(arr[minPos]<arr[j]{
                    minPos = j;
                }

            }
            // swaping
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }

    }
     public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");

        }
     System.out.println();
 }
    public static void main(String[] args) {
        int arr[]={2,41,37,45,18};
        selection(arr);
        printArr(arr);

    }
}
