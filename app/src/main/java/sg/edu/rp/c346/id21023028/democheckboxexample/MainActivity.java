package sg.edu.rp.c346.id21023028.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    private double calcPay(double price, double discount){
        double pay = price * (1-discount/100);
        return pay;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link UI view to variables
        cbEnabled = findViewById(R.id.checkBoxDiscount);
        btnCheck = findViewById(R.id.buttonCheck);
        tvShow = findViewById(R.id.txtView);

        //listener for button
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // this code is commented out as further question in worksheet does not need code.
//                String msg = "The discount is%s given";
//                if (cbEnabled.isChecked()){
//                    msg = String.format(msg,""); //discount given msg
//                }
//                else{
//                    msg = String.format(msg," not"); //discount not given msg
//                }
//                tvShow.setText(msg); //display msg

                Toast.makeText(MainActivity.this,"Button Click",Toast.LENGTH_LONG)
                    .show();
                Log.i("MyActivity", "Inside onClick()"); //Code used to show logcat msg

                if(cbEnabled.isChecked()) {
                    double pay = calcPay(100, 20);
                    tvShow.setText("The discount is given. You need to pay " + pay);
                }
                else {
                    double pay = calcPay(100, 0);
                    tvShow.setText("The discount is not given. You need to pay " + pay);
                }
            }
        });
    }
}