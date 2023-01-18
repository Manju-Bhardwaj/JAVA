import java.util.*;
public class exponentiation {
    public static double myPow(double x, int n) {
        double ans =1.0;
        long nn = n;
        if (nn < 0) {
            nn = -1 * nn;
        }
        while (nn > 0) {

        if (nn % 2 == 1) {
            ans = ans * x;
            nn = nn-1;
        } else {

            x = x * x;
            nn = nn / 2;

        }
        }

    if(n<0)
    {
        ans=( double)(1.0) / (double) (ans);
    }
    return ans;
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter x: ");
        int x= sc.nextInt();
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        double ans= myPow(x,n);
        System.out.println("Answer: "+ ans);
    }
}
