public class MultidimensionalArray {
    public static void main(String[] args){
        int arr[][]={{1,2,3,4,5},
        {1,2,3,4,5}};
        System.out.println(arr[0][1]);
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+ "\t");
            }
            System.out.println();
        }
    }
}
