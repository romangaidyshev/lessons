import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FamiliaReg {
    public static void main(String[] args) {

        String text;

        Scanner sc = new Scanner(System.in);
        System.out.print("\n Введите ФИО: ");
        text = sc.nextLine().trim();


        Pattern p = Pattern.compile("s*+([А-ЯЁ][а-яё]++(?:-[А-ЯЁ][а-яё]++)?)\\s++([А-ЯЁ][а-яё]++)\\s++([А-ЯЁ][а-яё]++)\\s*+");
        Matcher matcher = p.matcher(text);

        if (matcher.matches()) {
            System.out.println("Фамилия: " + matcher.group(1) + "\nИмя:" + matcher.group(2) + "\nОтчество:" + matcher.group(3));
        } else {
            System.out.println("Данные введены неверно");
        }
    }
}
