package com.anaaa.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtnpm;
    TextView txtnama;
    EditText editnpm;
    EditText editnama;
    Button btnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnpm = (TextView) findViewById(R.id.txtnpm);
        txtnama = (TextView) findViewById(R.id.txtnama);
        editnpm = (EditText) findViewById(R.id.editnpm);
        editnama = (EditText) findViewById(R.id.editnama);
        btnsend = (Button) findViewById(R.id.btnsend);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strnpm = editnpm.getText().toString();
                String strnama = editnama.getText().toString();

                txtnpm.setText(strnpm);
                txtnama.setText(strnama);

                Intent send = new Intent(MainActivity.this,
                        Main2Activity.class);
                send.putExtra("npm",strnpm);
                send.putExtra("nama",strnama);
                startActivity(send);
                finish();

            }
        });
    }
}
