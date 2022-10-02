public class quicksort {
    public static int partition( int arr[],int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j =low ;j<high;j++){
            if(arr[j]<pivot){
                 i++;
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static void sortElement(int arr[],int low ,int  high){
        if(low<high){
            int pivot = partition(arr,low,high);
            sortElement(arr,low,pivot-1);
            sortElement(arr, pivot +1, high);
        }
    }
    public static void main(String []args){
        int arr[] = {6,2,7,8,3,1};
        int n = arr.length;
        sortElement(arr,0,n-1);
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + "  ");
        } 
    }
}