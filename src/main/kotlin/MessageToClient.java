import org.example.Client;
import org.example.Mailer;
import org.example.PersonalInfo;

public class MessageToClient {

    public void sendMessageToClient(
            Client client,
            String message,
            Mailer mailer
    ) {

        if (client == null || message == null) return;

        PersonalInfo personalInfo = client.getPersonalInfo(); //NullPointerException
        if (personalInfo == null) return;

        String email = personalInfo.getEmail();
        if (email == null) return;

        mailer.sendEmail(email, message);
    }

    public static void main(String[] args) {
        MessageToClient messageToClient = new MessageToClient();
        messageToClient.sendMessageToClient(null, null, null);
    }

}
