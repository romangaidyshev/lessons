import java.util.Scanner;

public class ArraysLab3 {

    public static void main(String[] args) {

        int n, m, k;
        int[][] array;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число  - количество строк матрицы: ");
        n = sc.nextInt();
        System.out.print("Введите число  - количество столбцов матрицы: ");
        m = sc.nextInt();
        System.out.print("Введите число K: ");
        k = sc.nextInt();
        array = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Введите элемент array[" + i + "][" + j + "]:");
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < k) {
                    array[i][j] = k;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

