package com.yaberz.eryprj2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editNama,editNpm,editTtl,editAgama,editFakultas,editProdi;
    private Button btnGetData;
    String Nama,Npm,Ttl,Agama,Fakultas,Prodi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNama     = (EditText) findViewById(R.id.isiNama);
        editNpm      = (EditText) findViewById(R.id.isiNpm);
        editTtl      = (EditText) findViewById(R.id.isiTtl);
        editAgama    = (EditText) findViewById(R.id.isiAgama);
        editFakultas = (EditText) findViewById(R.id.isiFakultas);
        editProdi    = (EditText) findViewById(R.id.isiProdi);
        btnGetData  = (Button) findViewById(R.id.btnambildata);

        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Nama       = editNama.getText().toString();
                Npm       = editNpm.getText().toString();
                Ttl        = editTtl.getText().toString();
                Agama      = editAgama.getText().toString();
                Fakultas   = editFakultas.getText().toString();
                Prodi      = editProdi.getText().toString();

                Intent go = new Intent(MainActivity.this,eryprj3.class);
                go.putExtra("Nama",Nama);
                go.putExtra("Npm",Npm);
                go.putExtra("Ttl",Ttl);
                go.putExtra("Agama",Agama);
                go.putExtra("Fakultas",Fakultas);
                go.putExtra("Prodi",Prodi);
                startActivity(go);

                finish();
            }
        });

    }
}

