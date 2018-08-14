import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader2 {
    public static void main(String[] args) {
        String text = "Вася заработал 8000 рублей, Петя - 70000 рубля, а Маша - 100000 рублей";

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(text);

        int sum = 0;
        while (m.find()) {
            sum += Integer.parseInt(m.group());
        }
        System.out.println("Суммарный заработок: " + sum);

//        String fragments[] = text.split("\\s*,\\s*");
//        int sum = 0;
//        for (int i = 0; i < fragments.length; i++) {
//            sum += Integer.parseInt(fragments[i].replaceAll("[^0-9]+", ""));
//        }

        //       System.out.println(sum);
    }
}