public class merge {
    public static void conqure(int arr[],int st,int mid,int en){
        int merged[] = new int[en];
        int idx1 = st;
        int idx2 = mid+1;
        int x =0;
        
    }
    public static void sortMerge(int arr[],int st,int en){
        if(st >= en){
            return;
        }
        int mid = si + (ei-si)/2;
        sortMerge(arr, st, mid);
        sortMerge(arr, mid +1, en);
        conqure(arr,st,mid,en);
    }
    public static void main(String []args){
        int arr[] = {5,2,1,7,3,4};
        int n = arr.length;
        sortMerge(arr,1,n);
        for(int i = 1;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
