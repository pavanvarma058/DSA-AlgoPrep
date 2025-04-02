public class WaveForm {
    public static void main(String[] args) {
        // Print the given mat[n][m] in wave form
        int[][] arr = {
                {25, 38, 65, 96},
                {1, 2, 3, 4},
                {44, 45, 55, 54},
                {24, 32, 41, 81},
                {95, 88, 87, 78},
        };
        int n = 5;
        int m = 4;

        for (int i = 0; i < n; i++) {
            if(i%2==0){
                for (int j=0; j<m; j++){
                    System.out.print(arr[i][j] + " ");
                }
            }else {
                for (int j=m-1; j>=0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
