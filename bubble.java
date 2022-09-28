public class bubble {
    public static void main(String []args){
        int []arr = {45,1,85,6,47};
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j]= temp;
                }
            }
        }
        System.out.print(arr);
    }
}