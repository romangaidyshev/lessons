import java.util.Scanner;

public class ArraysLab1 {

    public static void main(String[] args) {

        int size;
        double[] array;

        Scanner sc = new Scanner(System.in);
        System.out.print("\n Введите размер массива: ");
        size = sc.nextInt();

        array = new double[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите вещественное число: ");
            array[i] = sc.nextDouble();
        }

        double sum = 0.0;
        int last = 0;
        int first = 0;
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > 0) {
                first = j;
                count++;
                break;
            }
        }
        for (int c = (array.length - 1); c >= 0; c--) {
            if (array[c] > 0) {
                last = c;
                count++;
                break;
            }
        }

        for (int e = (first + 1); e < last; e++) {
            sum += array[e];
        }


        System.out.println(count >= 1 ? "\nСумма элементов = " + sum : "\n 0.0");
}

}

