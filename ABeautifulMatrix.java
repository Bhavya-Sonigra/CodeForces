import java.util.Scanner;

public class ABeautifulMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        Scanner sc = new Scanner(System.in);
        int one = 0;
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 1){
                    one += Math.abs(i - 3);
                    one += Math.abs(j - 3);
                }
            }
        }
        System.out.print(one);
    }
}