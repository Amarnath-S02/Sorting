import java.util.Scanner;

public class MergeSort {
  public static void merge(int[] arr,int low,int mid,int high){
      int left=low;
      int right=mid+1;
      int index=0;
      int[] temp=new int[high-low+1];
      while(left<=mid && right<=high){
          if(arr[left]<=arr[right]){
              temp[index++]=arr[left++];
          }
          else{
              temp[index++]=arr[right++];
          }
      }
          while(left<=mid){
              temp[index++]=arr[left++];
          }
          while(right<=high){
              temp[index++]=arr[right++];
          }


    
  }
    public static void mergeSort(int[] arr,int low,int high){

        if(low<high){
            int mid=(low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        mergeSort(arr,0,arr.length-1);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
