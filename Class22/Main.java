package Class22;
public class Main {  
    public static int InsertionSort(int[] arr){
        int energy=0;
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
                energy+=4;
            }
            arr[j+1]=key;
        }
        return energy;
    }
    public static int SelectionSort(int[] arr){
        int energy=0;
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
                energy+=4;
            }
        }
        return energy;
    }
     public static int BubbleSort(int[] arr){
        int energy=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    energy+=4;
                }
            }
        }
        return energy;
    }
}
