import java.util.Scanner;

public class InsertionSort {

        public  static int[] insertionSort(int n,int[] arr){
            for(int i=0;i<n;i++){
                int j=i;
                while(j>0 && arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
                }
            }
            return arr;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            insertionSort(n,arr);

            for(int i=0;i<n;i++){
                System.out.println(arr[i]);
            }
        }
    }


