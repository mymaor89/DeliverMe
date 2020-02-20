package sunspark.org.deliverme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Deliverers_Screen extends AppCompatActivity {
    TextView tvHead;
    TextView tvCont;
    TextView tvDist;
    Button btnAccept;
    ImageButton ibtnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deliverers__screen);
    }
}
