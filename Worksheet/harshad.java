public class harshad {
    public static boolean isHarshad(int n){

        int num=n;
        int sum=0;
        while(n>0){
            sum+= n%10;
            n=n/10;
        }

        if(num%sum==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n=171;
        System.out.println(isHarshad(n));
    }
}
