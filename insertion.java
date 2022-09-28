public class insertion {
    public static void main(String []args){
        int arr[] = {1,3,8,2,5};
        System.out.println("insertion sort ");
        for(int i= 1;i<5;i++){
            int temp =  arr[i];
            int j=i-1;
            while(j>=0 && (arr[j]>temp)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for(int i = 0;i<5;i++)
        System.out.println(arr[i] + " ");
    }
}