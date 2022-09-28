public class arr3 {
    public static void moveX(String sc,int idx,int count,String newString){
        if(idx == sc.length()){
            for(int i=0;i<count;i++){

                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = sc.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveX(sc, idx+1, count, newString);
        }
        else{
            newString += currChar;
            moveX(sc, idx+1, count, newString);
        }

    }
    public static void main(String []args){
       moveX("axbcxxd",0,0,"");   
    }
}