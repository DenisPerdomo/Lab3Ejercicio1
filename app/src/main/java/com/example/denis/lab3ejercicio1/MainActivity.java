package com.example.denis.lab3ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast notification = Toast.makeText(this,"Ejecutando onCreate",Toast.LENGTH_LONG);
        notification.show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast notification = Toast.makeText(this,"Ejecutando onstart",Toast.LENGTH_LONG);
        notification.show();
        // The activity is about to become visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast notification = Toast.makeText(this,"Ejecutando onresume",Toast.LENGTH_LONG);
        notification.show();
        // The activity has become visible (it is now "resumed").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast notification = Toast.makeText(this,"Ejecutando onpause",Toast.LENGTH_LONG);
        notification.show();
        // Another activity is taking focus (this activity is about to be "paused").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast notification = Toast.makeText(this,"Ejecutando onstop",Toast.LENGTH_LONG);
        notification.show();
        // The activity is no longer visible (it is now "stopped")
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast notification = Toast.makeText(this,"Ejecutando onRestart",Toast.LENGTH_LONG);
        notification.show();
        // The activity is about to be destroyed.
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast notification = Toast.makeText(this,"Ejecutando ondestroy",Toast.LENGTH_LONG);
        notification.show();
        // The activity is about to be destroyed.
    }
    public void finalizar (View v){
        finish();
    }
}
