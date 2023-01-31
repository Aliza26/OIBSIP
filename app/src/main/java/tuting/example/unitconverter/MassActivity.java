package tuting.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);

        DecimalFormat df = new DecimalFormat("##.##");
        Button button = (Button)findViewById(R.id.ClickGrams);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText gramsText = (EditText) findViewById(R.id.editTextGrams);
                EditText poundsText = (EditText) findViewById(R.id.editTextPounds);
                if (TextUtils.isEmpty(gramsText.getText().toString())){
                    Toast.makeText(MassActivity.this,"Empty field not allowed!",
                            Toast.LENGTH_SHORT).show();
                }else {
                    double grams = Double.valueOf(gramsText.getText().toString());
                    double p = grams/453.59237;

                    poundsText.setText(df.format(p));
                }
            }
        });

        Button button1 = (Button)findViewById(R.id.ClickPounds);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText poundsText = (EditText) findViewById(R.id.editTextPounds);
                EditText gramsText = (EditText) findViewById(R.id.editTextGrams);
                if (TextUtils.isEmpty(poundsText.getText().toString())){
                    Toast.makeText(MassActivity.this, "Empty field not allowed!",
                            Toast.LENGTH_SHORT).show();
                }else {
                    double pounds = Double.valueOf(poundsText.getText().toString());
                    double p = pounds*453.59237;

                    gramsText.setText(df.format(p));
                }
            }
        });

    }


}