import java.util.Scanner;

public class ArraysLab4 {

    public static void main(String[] args) {

        int size;
        int[][] array;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число  - количество строк и столбцов матрицы: ");
        size = sc.nextInt();

        array = new int[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Введите элемент array[" + i + "][" + j + "]:");
                array[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        int div;
        int count = 0;
        double average = 0.0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    sum += array[i][j];
                    count++;
                }
            }
        }

        if (count != 0) {
            div = count;
            average = (double) sum / div;

            System.out.println("Cреднее арифметическое = " + average);
        } else {
            System.out.println("No");
        }
    }
}