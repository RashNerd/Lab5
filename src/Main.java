import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(arrayToString(a));
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
}