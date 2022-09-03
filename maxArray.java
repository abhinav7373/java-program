public class maxArray {
    public static void main(String args[]){
        int arr[] = {45,78,65,42,95,266};
        System.out.println("given no are ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int max = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("greatest no is "+ max);
    }
}