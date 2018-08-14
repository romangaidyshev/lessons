import java.util.Scanner;

public class HumanitarianAid2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество ящиков: ");
        int boxes = Integer.parseInt(input.nextLine());

        System.out.println("Грузовик 1:" + "\nКонтейнер 1:");
        // container capacity:
        final int CONT_CAPACITY = 27;
        //quantity of containers in truck
        final int CONT_IN_TRUCK = 12;
        //truck capacity:
        final int TRUCK_CAPACITY = CONT_CAPACITY * CONT_IN_TRUCK;

        int cont = 1, trucks = 1;
        for (int i = 1; i <= boxes; i++) {
            System.out.println("Ящик " + i);
            if (i % TRUCK_CAPACITY == 0) {
                trucks++;
                System.out.println("Грузовик " + trucks + ":");
            }
            if (i % CONT_CAPACITY == 0) {
                cont++;
                System.out.println("Контейнер " + cont + ":");
            }
        }
    }
}



