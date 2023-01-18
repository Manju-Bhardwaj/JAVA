import java.util.Scanner;

public class rank {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array:");
        int n= sc.nextInt();
        int []arr= new int[n];
        System.out.println("enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
int arr1[]= new int[n];
        //sorting the array
        arr1=bubble(arr,n-1,0);
        System.out.println("enter marks to know rank: ");
        int marks= sc.nextInt();

        for (int i = arr1.length-1; i >=0; i--) {
            if(arr1[i]==marks){
                System.out.println(n-i);
            }
        }
    }
    static int[] bubble(int[] arr,int r,int c){
        if(r==0){
            return arr;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                //swap
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr,r,c+1);
        }else {
            bubble(arr,r-1,0);

        }
        return arr;
    }


}
