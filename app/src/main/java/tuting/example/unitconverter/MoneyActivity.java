package tuting.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MoneyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);

        DecimalFormat df = new DecimalFormat("##.##");
        Button button = (Button)findViewById(R.id.DollarsToRuppees);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText dollarText = (EditText) findViewById(R.id.editTextDollars);
                EditText ruppeeText = (EditText) findViewById(R.id.editTextRuppees);
                if (TextUtils.isEmpty(dollarText.getText().toString())){
                    Toast.makeText(MoneyActivity.this,"Empty field not allowed!",
                            Toast.LENGTH_SHORT).show();
                }else {
                    double dollars = Double.valueOf(dollarText.getText().toString());
                    double ruppees = dollars*81.51;

                    ruppeeText.setText(df.format(ruppees));
                }
            }
    });

    Button button1 = (Button)findViewById(R.id.RuppeesToDollars);
        button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            EditText DollarText = (EditText) findViewById(R.id.editTextDollars);
            EditText RuppeeText = (EditText) findViewById(R.id.editTextRuppees);
            if (TextUtils.isEmpty(RuppeeText.getText().toString())){
                Toast.makeText(MoneyActivity.this, "Empty field not allowed!",
                        Toast.LENGTH_SHORT).show();
            }else {
                double Ruppee = Double.valueOf(RuppeeText.getText().toString());
                double dollar = Ruppee/81.51;

                DollarText.setText(df.format(dollar));
            }
        }
    });





    }
}