import java.util.ArrayList;

class merge{

    static void mergeSort(int[] arr, int l, int r){

        if(l>=r) return;

        int mid=(l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
       
    }

    static void merge(int[] arr, int l, int mid, int r){

        ArrayList<Integer> temp= new ArrayList<>();
        int i=l;
        int j=mid +1;

        while(i<=mid && j<= r){
            if(arr[i] <= arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                temp.add(arr[j]);
                j++;
            }
        }


        while(i <= mid){
            temp.add(arr[i]);
            i++;
        }
    }
   
    public static void main(String[] args) {
        
        int arr[]={4,8,2,6,4};
        mergeSort(arr, 0, arr.length-1);

    }
}