public class ColWiseMatrix {
    public static void main(String[] args) {
        // Print the given mat[m][n] col wise
        int[][] arr = {
                {25, 38, 65, 96},
                {1, 2, 3, 4},
                {44, 45, 55, 54},
                {24, 32, 41, 81},
                {95, 88, 87, 78},
        };
        int n = 5;
        int m = 4;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
