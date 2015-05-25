//ïœçX
package com.example.noel.tr2kadai2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    Button tashi,hiki,kake,wari;
    EditText atai1,atai2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tashi = (Button) findViewById(R.id.tashi);
        hiki = (Button) findViewById(R.id.hiki);
        kake = (Button) findViewById(R.id.kake);
        wari = (Button) findViewById(R.id.wari);
        atai1 = (EditText) findViewById(R.id.text1);
        atai2 = (EditText) findViewById(R.id.text2);


        tashi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(MainActivity.this, KekkaActivity.class);
                i.putExtra("key", Integer.parseInt(atai1.getText().toString())+Integer.parseInt(atai2.getText().toString()));
                startActivity(i);
            }
        });
        hiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(MainActivity.this, KekkaActivity.class);
                i.putExtra("key", Integer.parseInt(atai1.getText().toString())-Integer.parseInt(atai2.getText().toString()));
                startActivity(i);
            }
        });
        kake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(MainActivity.this, KekkaActivity.class);
                i.putExtra("key", Integer.parseInt(atai1.getText().toString())*Integer.parseInt(atai2.getText().toString()));
                startActivity(i);
            }
        });
        wari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(MainActivity.this, KekkaActivity.class);
                i.putExtra("key", Integer.parseInt(atai1.getText().toString())/Integer.parseInt(atai2.getText().toString()));
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
