import java.util.Scanner;

public class QuickSort {
    public static int f(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;

        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }

            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;
    }
    public static int[] qucikSort(int[] arr,int low,int high){
        if(low<high){
            int pivot=f(arr,low,high);
            qucikSort(arr,low,pivot-1);
            qucikSort(arr,pivot+1,high);
        }
        return  arr;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        qucikSort(arr,0,arr.length-1);

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
