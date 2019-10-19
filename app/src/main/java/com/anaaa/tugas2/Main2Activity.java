package com.anaaa.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    TextView txtdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtdata = (TextView) findViewById(R.id.txtdata);

        Intent data = getIntent();
        String npm = data.getStringExtra("npm");
        String nama = data.getStringExtra("nama");

        txtdata.setText(npm + "\n" +nama);
    }

    @Override
    public void onBackPressed(){
        Intent back = new Intent(Main2Activity.this,
                MainActivity.class);
        startActivity(back);
        finish();
    }
}
