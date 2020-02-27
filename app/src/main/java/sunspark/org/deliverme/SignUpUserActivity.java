package sunspark.org.deliverme;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SignUpUserActivity extends AppCompatActivity {
   EditText firstName, lastName,email;
    ImageView profilePic;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requests_page);

        firstName =(EditText)findViewById(R.id.firstName);
        lastName =(EditText)findViewById(R.id.lastName);
        profilePic = (ImageView) findViewById(R.id.image);
        email= (EditText) findViewById(R.id.Email);

        button =  (Button) findViewById(R.id.signUp);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
    }

}
