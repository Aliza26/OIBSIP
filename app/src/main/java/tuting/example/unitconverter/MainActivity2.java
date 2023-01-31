package tuting.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;


import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
import android.widget.TextView;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {

    ListView l,l1;
    TextView t1,t2,t3;
    EditText e1;
    String tutorials[]
            = {
            "mile", "yard",
            "km"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        l = findViewById(R.id.list);
        l1 = findViewById(R.id.list1);
        t1 = findViewById(R.id.label1);
        t2 = findViewById(R.id.label2);
        t3 = findViewById(R.id.result);
        e1 = findViewById(R.id.editTextNumberDecimal);
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<String>(
                this,
                R.layout.support_item,
                tutorials);
        l.setAdapter(arr);
        l1.setAdapter(arr);
        DecimalFormat df = new DecimalFormat("##.##");
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = arr.getItem(i);
                t1.setText(value);
                switch (i){
                    case 0:
                        double vmiles = Double.valueOf(e1.getText().toString());
                        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> adapterViewt, View view1, int j, long ll) {
                                String val = arr.getItem(j);
                                t2.setText(val);
                                switch(j){
                                    case 0:
                                        t3.setText(df.format(vmiles));
                                        break;
                                    case 1:
                                        double yard = vmiles*1760;
                                        t3.setText(df.format(yard));
                                        break;
                                    case 2:
                                        double kms = vmiles*1.609344;
                                        t3.setText(df.format(kms));
                                }
                            }
                        });
                        break;
                    case 1:
                        double vyards = Double.valueOf(e1.getText().toString());
                        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int j, long k) {
                                String val = arr.getItem(j);
                                t2.setText(val);
                                switch(j){
                                    case 0:
                                        double miles = vyards/1760;
                                        t3.setText(df.format(miles));
                                        break;
                                    case 1:
                                        t3.setText(df.format(vyards));
                                        break;
                                    case 2:
                                        double kms = vyards*0.0009144;
                                        t3.setText(df.format(kms));
                                        break;
                                }
                            }
                        });
                       break;

                    case 2:
                        double vkms = Double.valueOf(e1.getText().toString());
                        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int j, long k) {
                                String val = arr.getItem(j);
                                t2.setText(val);
                                switch(j){
                                    case 0:
                                        double miles = vkms/1.609344;
                                        t3.setText(df.format(miles));
                                        break;
                                    case 1:
                                        double yards = vkms*1093.6133;
                                        t3.setText(df.format(yards));
                                        break;
                                    case 2:
                                        t3.setText(df.format(vkms));
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });


    }
}
