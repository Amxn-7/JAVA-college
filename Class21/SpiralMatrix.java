// package Class21;

// public class SpiralMatrix {
//     public static void main(String[] args) {
        
//     }
//     public static void printSpiral(int[][] arr){
//         int m=arr.length;
//         int n=arr[0].length;
//         int top=0;
//         int bottom=n-1;
//         int left=0;
//         int right=m-1;
//         while(top<=bottom){
//             for(int i=left;i<right;i++){
//                 System.out.println(arr[top][i]);
//             }
//             top++;
//             for(int i=top;i<bottom;i++){
//                 System.out.println(arr[i][right]);
//             }
//             right--;
//             for(int i=right;i>=left;i--){
//                 System.out.println(arr[bottom][i]);
//             }
//             bottom++;
//             for(int i=bottom;i>=top;i--){
//                 System.out.println(arr[left][]);
//             }
//         }
        
//     }
// }


package Class21;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = 
        {{1,2,3},
        {4,5,6},
        {7,8,9}};
        printSpiral(arr);
    }
    public static void printSpiral(int[][] arr){
        int m=arr.length;
        int n=arr[0].length;
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=m-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;
            for(int i=right;i>=left;i--){
                System.out.print(arr[bottom][i]+" ");
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                System.out.print(arr[left][i]+" ");
            }
            left++;
        }
        
    }
}