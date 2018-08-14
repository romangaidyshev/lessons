import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Birthday {

    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat(" - dd.MM.yyyy - EEE", Locale.ENGLISH);
        Calendar birthday = new GregorianCalendar();
        birthday.set(1974, Calendar.FEBRUARY, 27);
        Calendar now = new GregorianCalendar();

        for (int i = 0; !birthday.after(now); i++) {
            System.out.println(i + dateFormat.format(birthday.getTime()));
            birthday.add(Calendar.YEAR, 1);
        }
    }
}


