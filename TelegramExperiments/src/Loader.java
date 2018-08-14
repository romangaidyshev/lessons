import org.javagram.TelegramApiBridge;
import org.javagram.response.AuthAuthorization;
import org.javagram.response.AuthCheckedPhone;
import org.javagram.response.AuthSentCode;
import org.telegram.api.requests.TLRequestAuthSendCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TelegramApiBridge bridge = new TelegramApiBridge("149.154.167.50:443", 147335, "c77cc7ac24a7ddff4461f0d25a33b29b");
        String phoneNumber;
        System.out.println("Please, type phone number");
        phoneNumber = reader.readLine().replaceAll("[^1-9]+","");
        AuthCheckedPhone checkedPhone = bridge.authCheckPhone(phoneNumber);
        System.out.println(phoneNumber + " registered? " + checkedPhone.isRegistered());
        if (checkedPhone.isRegistered()) {
            bridge.authSendCode(phoneNumber);
            System.out.println("Enter your sms code");
            AuthAuthorization authSignIn = bridge.authSignIn(reader.readLine().trim());
            System.out.println(authSignIn.getUser().getFirstName() + " " + authSignIn.getUser().getLastName());
            bridge.authLogOut();
        }

    }

}
