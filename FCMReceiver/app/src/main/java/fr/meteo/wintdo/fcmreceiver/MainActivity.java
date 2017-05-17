package fr.meteo.wintdo.fcmreceiver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Logs FCM token of the application
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("Token", "Refreshed token: " + refreshedToken);

        setContentView(R.layout.activity_main);

        // Subscribes the application to the topics general
        FirebaseMessaging.getInstance().subscribeToTopic("general");
    }
}
