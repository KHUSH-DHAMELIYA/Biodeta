package com.example.biodeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt_name,edt_surname,edt_MB,edt_Email,edt_BD,edt_AD,edt_ED,edt_CT;
    CheckBox edt_CK,edt_DI,edt_PG;
    RadioGroup radio;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_name = findViewById(R.id.edt_name);
        edt_surname = findViewById(R.id.edt_surname);
        edt_MB = findViewById(R.id.edt_MB);
        edt_Email = findViewById(R.id.edt_Email);
        edt_BD = findViewById(R.id.edt_BD);
        edt_AD = findViewById(R.id.edt_AD);
        edt_ED = findViewById(R.id.edt_ED);
        edt_CT = findViewById(R.id.edt_CT);
        edt_CK = findViewById(R.id.edt_CK);
        edt_DI = findViewById(R.id.edt_DI);
        edt_PG = findViewById(R.id.edt_PG);
        radio = findViewById(R.id.radio);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = edt_name.getText().toString();
                String surname = edt_surname.getText().toString();
                String MB = edt_MB.getText().toString();
                String Email = edt_Email.getText().toString();
                String BD = edt_BD.getText().toString();
                String AD = edt_AD.getText().toString();
                String ED = edt_ED.getText().toString();
                String CT = edt_CT.getText().toString();
                String CK = edt_CK.getText().toString();
                String DI = edt_DI.getText().toString();
                String PG = edt_PG.getText().toString();


                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                if(!name.isEmpty() && !surname.isEmpty() && !MB.isEmpty() && !Email.isEmpty() && !BD.isEmpty() && !AD.isEmpty() && !ED.isEmpty() && !CK.isEmpty() && !DI.isEmpty() && !PG.isEmpty() ){
                    Toast.makeText(MainActivity.this, ""+name+"\n"+surname+"\n"+MB+"\n"+Email+"\n"+BD+"\n"+AD+"\n"+ED+"\n"+CK+"\n"+DI+"\n"+PG+"\n", Toast.LENGTH_SHORT).show();
                }
                else{
                    edt_name.setError("Enter Name");
                    edt_surname.setError("Enter surname");
                    edt_MB.setError("Enter MB");
                    edt_Email.setError("Enter Email");
                    edt_BD.setError("Enter BD");
                    edt_AD.setError("Enter AD");
                    edt_ED.setError("Enter ED");
                    edt_CT.setError("Enter CT");
                    edt_CK.setError("Enter CK");
                    edt_DI.setError("Enter DI");
                    edt_PG.setError("Enter PG");


                }
                startActivity(intent);
            }

        });



    }
}