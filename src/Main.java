import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 10},
                {4, 5, 6},
                {7, 8, 9}
        };
        // System.out.println(arrayToString(a));
        System.out.println(sumMinor(a));
    }
    public static String arrayToString(int[][] arr) {
        String stringArray = "{";
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (j == 0) {
                        stringArray += "{" + arr[i][0] + ", ";
                        continue;
                    }
                    if (j != arr[i].length - 1) {
                        stringArray += arr[i][j] + ", ";
                    }
                    else {
                        stringArray += arr[i][j] + "}";
                    }
                }
                if (i != arr.length - 1) {
                    stringArray += ",\n ";
                } else {
                    stringArray += "}";
                }
            }
        }
        return stringArray;
    }
    public static boolean TicTacToe(int[][] arr) {
        // Represent 0 with circle
        // Represent 1 with X
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == arr[i][j+1] && arr[i][j] == arr[i][j+2]) {
                    return true; // Check horizontal
                }
                if (arr[i][j] == arr[i+1][j] && arr[i][j] == arr[i+2][j]) {
                    return true; // Check vertical
                }
                if (arr[i][j] == arr[i+1][j+1] && arr[i][j] == arr[i+2][j+2]) {
                    return true; // Check diagonal
                }
                if ((i & j) != 0) {
                    if (arr[i][j] == arr[i-1][j-1] && arr[i][j] == arr[i-2][j-2])  {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static int sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static int sumMajor(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }
    public static int sumMinor(int[][] arr) {
        int sum = 0;
        int temp = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            sum += arr[temp][i];
            temp++;
        }
        return sum;
    }
    public static int min(int[][] a) {

    }
}