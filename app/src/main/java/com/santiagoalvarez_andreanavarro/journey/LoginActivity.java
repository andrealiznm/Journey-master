package com.santiagoalvarez_andreanavarro.journey;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Santiago on 9/03/2018.
 */

public class LoginActivity extends AppCompatActivity {

    TextView tvRegister;
    EditText etUser, etPass;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        tvRegister = findViewById(R.id.tvRegister);
        etUser = findViewById(R.id.etUser);
        etPass = findViewById(R.id.etPass);

    }

    public void register(View view) {
        int id = view.getId();

        if(id == R.id.tvRegister){
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivityForResult(intent,1234);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1234 && resultCode == RESULT_OK){

            etUser.setText(String.valueOf(data.getExtras().getString("user")));
            etPass.setText(String.valueOf(data.getExtras().getString("pass")));
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void acept(View view) {
        
    }


}
