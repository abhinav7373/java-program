public class fibnacci {
    public static void main(String []args){
        int n=5;
        int a=0;
        int b= 1;
        System.out.print(a+""+b);
        for(int i =0;i<n;i++){
            int sum = a+b;
            System.out.print(sum);
            int temp = a;
            a=b;
            b=sum;
        }
    }
}