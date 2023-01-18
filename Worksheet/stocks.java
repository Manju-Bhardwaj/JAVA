import java.util.Scanner;

public class stocks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array:");
        int n= sc.nextInt();
        int []arr= new int[n];
        System.out.println("enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int max=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int newMax=arr[j]-arr[i];
                if(newMax >max){
                    max= newMax;
                }
            }
        }
        System.out.println(max);
    }
}
