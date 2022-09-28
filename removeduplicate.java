public class removeduplicate {
    public static boolean []map = new boolean[26];
    public static void remove(String sc, int idx ,String newString){
        if(idx ==sc.length()){
            System.out.println(newString);
            return;
        }
        char currChar = sc.charAt(idx);
        if(map[currChar - 'a']){
            remove(sc, idx+1,newString);
        }
        else{
            newString += currChar;
            map[currChar - 'a'] = true;
            remove(sc, idx+1, newString);
        }
    }
    public static void main(String []args){
        remove("abbccddaee",0,"");
    }
}
