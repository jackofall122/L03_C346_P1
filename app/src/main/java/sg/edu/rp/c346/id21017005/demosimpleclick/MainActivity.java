package sg.edu.rp.c346.id21017005.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay=findViewById(R.id.textViewDisplay);
        btnDisplay=findViewById(R.id.buttonDisplay);
        etInput=findViewById(R.id.et1);
        tbtn=findViewById(R.id.toggleButtonEnabled);
        rgGender=findViewById(R.id.rg);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String genderText="";
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId==R.id.radioButtonGenderMale){
                    genderText+="He says";
                }
                else{
                    genderText+="She says";
                }
                if(tbtn.isChecked()){
                    String stringResponse=etInput.getText().toString();
                    tvDisplay.setText(genderText+" "+stringResponse);
                }

        }
        });
    }
}