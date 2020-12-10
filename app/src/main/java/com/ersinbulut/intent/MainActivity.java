package com.ersinbulut.intent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
    }

    public void btnGonder(View view){
        Intent i = new Intent(this,MainActivity2.class);
        i.putExtra("deger1",editText.getText().toString());
        startActivityForResult(i,22);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==22 && resultCode == RESULT_OK){
            String sonuc = data.getStringExtra("deger2");
            textView.setText(sonuc);
        }
    }
}