package tuting.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class AngleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angle);

        DecimalFormat df = new DecimalFormat("##.##");
        Button button = (Button)findViewById(R.id.Click);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText degreeText = (EditText) findViewById(R.id.editTextDegree);
                EditText radianText = (EditText) findViewById(R.id.editTextRadian);
                if (TextUtils.isEmpty(degreeText.getText().toString())){
                    Toast.makeText(AngleActivity.this,"Empty field not allowed!",
                    Toast.LENGTH_SHORT).show();
                }else {
                    double degree = Double.valueOf(degreeText.getText().toString());
                    double p = degree * 0.01745329;

                    radianText.setText(df.format(p));
                }
            }
        });

        Button button1 = (Button)findViewById(R.id.ClickRadian);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText degreeText = (EditText) findViewById(R.id.editTextDegree);
                EditText radianText = (EditText) findViewById(R.id.editTextRadian);
                if (TextUtils.isEmpty(radianText.getText().toString())){
                    Toast.makeText(AngleActivity.this, "Empty field not allowed!",
                    Toast.LENGTH_SHORT).show();
                }else {
                    double degree = Double.valueOf(radianText.getText().toString());
                    double p = degree / 0.01745329;

                    degreeText.setText(df.format(p));
                }
            }
        });

    }
}