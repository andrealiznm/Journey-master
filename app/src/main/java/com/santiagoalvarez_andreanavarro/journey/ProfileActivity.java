package com.santiagoalvarez_andreanavarro.journey;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by Santiago on 9/03/2018.
 */

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_profile);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.mProfile){
            Toast.makeText(this, "Menu Presionado", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
            //intent.putExtra("practicas", 60);
            //intent.putExtra("avance", 20);
            //intent.putExtra("proyecto", 20);
            //startActivityForResult(intent,1234);
            //startActivity(intent);
            //finish(); // mata la actividad (quitarla de la cola)
        }
        return super.onOptionsItemSelected(item);
    }
}

