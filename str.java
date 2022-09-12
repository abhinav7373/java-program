public class str {
    public static void main(String []args){
        StringBuilder sc = new StringBuilder("akash");
        System.out.println(sc);
        sc.setCharAt(1,'s');
        System.out.println(sc);
        sc.insert(0,'t');
        System.out.println(sc);
    }
    
}