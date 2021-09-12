package com.example.menubar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {

        switch (item.getItemId())
        {

            case R.id.call:
                Toast.makeText(MainActivity.this,"call",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.block:
                Toast.makeText(MainActivity.this,"block",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.help:
                Toast.makeText(MainActivity.this,"help",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.report:
                Toast.makeText(MainActivity.this,"report",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.notification:
                Toast.makeText(MainActivity.this,"notification",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.account:
                Toast.makeText(MainActivity.this,"account",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.chat:
                Toast.makeText(MainActivity.this,"chat",Toast.LENGTH_SHORT).show();
                return true;



        default:
            return super.onOptionsItemSelected(item);
    }

    }
    @Override
    public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu)
    {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.activity_menu,menu);
        return true;
    }
}