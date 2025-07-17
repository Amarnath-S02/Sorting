import java.util.Scanner;

public class SelectionSort {
    public static int[] selectionSort(int n,int[] arr){
        int min;
        for(int i=0;i<=n-2;i++){
            min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }


            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;


        }
        return arr;
    }
    public  static  void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        selectionSort(n,arr);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
