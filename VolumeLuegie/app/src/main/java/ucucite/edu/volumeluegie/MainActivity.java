package ucucite.edu.volumeluegie;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    EditText heightdata;
    EditText weightdata;
    TextView showresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heightdata=findViewById(R.id.height);
        weightdata=findViewById(R.id.weight);
        showresult=findViewById(R.id.resultko);

    }

    public void calculatemassindex(View view) {

        String weight = weightdata.getText().toString();
        String height = heightdata.getText().toString();
        if(weight.isEmpty()){
            weightdata.setError("Kindly enter your Weight");
        }
        else if(height.isEmpty()){
            heightdata.setError("Kindly enter your Height");
        }

        else {
            float h = Float.parseFloat(height);
            float w = Float.parseFloat(weight);
            double a = (h * h * 0.01 * 0.01 );

            double bmi = w /a;

            Toast.makeText(this, "The result is: "+bmi, Toast.LENGTH_LONG).show();

            showresult.setText(String.valueOf(bmi));


    }
}

    public void reset(View view) {
        heightdata.setText("");
        weightdata.setText("");
        showresult.setText("");
    }
}