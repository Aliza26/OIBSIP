package tuting.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button lengthButton, MassButton, AngleButton, MoneyButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lengthButton = (Button)findViewById(R.id.length);
        MassButton = (Button)findViewById(R.id.UnitsOfMass);
        AngleButton = (Button)findViewById(R.id.UnitsOfAngle);
        MoneyButton = (Button)findViewById(R.id.Money);

        lengthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

        MoneyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MoneyActivity.class);
                startActivity(intent);
            }
        });

        AngleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AngleActivity.class);
                startActivity(intent);
            }
        });

        MassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MassActivity.class);
                startActivity(intent);
            }
        });



    }
}