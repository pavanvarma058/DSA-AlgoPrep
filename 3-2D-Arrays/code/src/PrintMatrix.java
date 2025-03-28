public class PrintMatrix {
    public static void main(String[] args) {
        // Print the given mat[n][m] row wise
        int[][] arr = new int[][]{
                {25, 38, 65, 96},
                {1, 2, 3, 4},
                {44, 45, 55, 54},
                {24, 32, 41, 81},
                {95, 88, 87, 78},
        };

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}