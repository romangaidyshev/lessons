import java.util.Scanner;

public class ArraysLab2 {

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

        double max = array[0];
        double min = array[0];
        int k = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) > Math.abs(max)) {
                max = array[i];
                k = i;
            }
            if (Math.abs(array[i]) < Math.abs(min)) {
                min = array[i];
                j = i;
            }
        }

        if(Math.abs(k-j) > 1){
            int stelem = (k < j ? k : j);
            int endelem = (k < j ? j : k);


        double pr = 1.0;
        for (int i = stelem + 1; i < endelem; i++) {
            pr *= array[i];
        }
        System.out.println("Произведение элементов = " +pr);

    }
    else {
            System.out.println("0");
        }

}}