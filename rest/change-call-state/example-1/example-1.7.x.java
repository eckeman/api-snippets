// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.Twilio;
import com.twilio.http.HttpMethod;
import com.twilio.rest.api.v2010.account.Call;

public class Example {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String AUTH_TOKEN = "your_auth_token";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    // Get an object from its sid. If you do not have a sid,
    // check out the list resource examples on this page
    Call call = Call.updater("CAe1644a7eed5088b159577c5802d8be38")
        .setUrl("http://demo.twilio.com/docs/voice.xml").setMethod(HttpMethod.POST).update();

    System.out.println(call.getDateUpdated());
  }
}
