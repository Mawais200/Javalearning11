// Syntax for a basic Java program
public class MergeSort {
    public static void Conqour(int arr[],int start, int mid,int end){
        int merger[]= new int[end-start+1];
        int index1=start;
        int index2=mid+1;
        int x=0;
        while(index1<=mid && index2<=end){
            if(arr[index1]<arr[index2]){
                merger[x++]=arr[index1++];

            }
            else{
                merger[x++]=arr[index2++];
            }
        }
        while(index1<=mid){
            merger[x++]=arr[index1++];


        }
        while(index2<=end){
            merger[x++]=arr[index2++];
            

        }
        for(int i=0,j=start; i<merger.length;i++,j++){
            arr[j]=merger[i];
;
        }

    }
    public static void Divide(int arr[],int start,int end){
        if(start>=end){
            return;
        }

       int mid=start+(end-start)/2;
        Divide(arr, start, mid);
        Divide(arr, mid + 1, end);
        Conqour(arr,start,mid,end);
    }
    public static void main(String[] args) {
       int arr[]= {6,3,9,5,2,8};
       int n=arr.length;
       Divide(arr, 0, n-1);

    }
}