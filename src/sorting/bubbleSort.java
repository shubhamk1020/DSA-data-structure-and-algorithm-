package sorting;

public class bubbleSort {

    public static void bubble(int arr[]){
        for(int i = 0; i<arr.length-1;i++){
           for(int j = 0 ; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

    }
    public static void printArr(int arr[]){
            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i]+ " ");
            }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {2,10,8,4,13};
        bubble(arr);
        printArr(arr);

    }
}
