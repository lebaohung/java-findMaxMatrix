import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("FIND MAX ARRAY IN MATRIX");
        Scanner inputScn = new Scanner(System.in);
        System.out.print("Input row: ");
        int row = inputScn.nextInt();
        System.out.print("Input column: ");
        int col = inputScn.nextInt();
        double[][] arr = new double[row][col];
        System.out.println("Input value of " + arr.length + " rows and " + arr[0].length + " columns: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = inputScn.nextDouble();
            }
        }
        double max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The maximum value of matrix is " + max);
    }
}
