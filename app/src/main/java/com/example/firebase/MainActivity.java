package com.example.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText textusername;
    EditText password;
    Button login;
    Button googlesignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textusername=(EditText)findViewById(R.id.editText2);
        password=(EditText)findViewById(R.id.editText4);
        login=(Button)findViewById(R.id.button);
        googlesignin=(Button)findViewById(R.id.button2);

        googlesignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"well signin",Toast.LENGTH_LONG).show();
               Intent intent=new Intent(MainActivity.this,phone.class);
               startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"login succesfull",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,login.class);
                startActivity(intent);
            }


        });
    }
}
