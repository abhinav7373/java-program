public class occu {
    public static int first = -1;
    public static int last = -1;
    public static void findElement(String sc,int idx,char element){
        if(idx == sc.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current = sc.charAt(idx);
        if(current == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findElement(sc, idx+1, element);

    }
    public static void main(String []args){
        findElement("abdjgaasdfja",0,'a');
    }
}
