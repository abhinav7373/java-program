public class recr {
        public static void printNo(int n){
            if(n==0){
                return;
            }
            System.out.println(n);
            printNo(n-1);
    }
        public static void main(String []args){
            System.out.println("watch result ");
            printNo(5);
        }
}