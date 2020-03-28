package sunspark.org.deliverme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Requests_page extends AppCompatActivity {
    int sumBuyN = 0, sumDeliveryN = 0;
    Button btn6, btn7, btn4, btn5;
    EditText sumBuy, sumDelivery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requests_page);
        sumBuy = (EditText) findViewById(R.id.editText6);
        sumBuy.setText(String.valueOf(sumBuyN), TextView.BufferType.EDITABLE);
        sumDelivery = (EditText) findViewById(R.id.editText4);
        sumDelivery.setText(String.valueOf(sumDeliveryN), TextView.BufferType.EDITABLE);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sumBuyN > 0) {
                    sumBuyN--;
                    sumBuy.setText(String.valueOf(sumBuyN), TextView.BufferType.EDITABLE);
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumBuyN++;
                sumBuy.setText(String.valueOf(sumBuyN), TextView.BufferType.EDITABLE);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sumDeliveryN > 0) {
                    sumDeliveryN--;
                    sumDelivery.setText(String.valueOf(sumDeliveryN), TextView.BufferType.EDITABLE);
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumDeliveryN++;
                sumDelivery.setText(String.valueOf(sumDeliveryN), TextView.BufferType.EDITABLE);
            }
        });
    }
}
