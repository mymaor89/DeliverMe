package sunspark.org.deliverme;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AlertDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                AlertDialogActivity.this);

        // set title
        alertDialogBuilder.setTitle("דיאלוג");

        // set dialog message
        alertDialogBuilder
                .setMessage("תלחץ כן בשביל לצאת!")
                .setCancelable(false)
                .setPositiveButton("כן",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, close
                        // current activity
                        AlertDialogActivity.this.finish();
                    }
                })
                .setNegativeButton("לא",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();
        setContentView(R.layout.activity_alert_dialog);
    }
}



