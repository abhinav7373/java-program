public class sumMinusprod {
    public static void main(String []args){
        int n = 234;
        int pro =1;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            pro = rem*pro;
            sum = sum+rem;

        }
        System.out.println(pro);
        System.out.println(sum);
        System.out.println(pro-sum);
    }
}
