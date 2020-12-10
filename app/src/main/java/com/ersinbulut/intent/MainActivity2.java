package com.ersinbulut.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView =findViewById(R.id.textView);
        editText2=findViewById(R.id.editText2);

        Intent gelenIntent = getIntent();
        String s = gelenIntent.getStringExtra("deger1");
        textView.setText(s);
    }

    public void btnGeriGonder(View view){
        Intent i = new Intent();
        i.putExtra("deger2",editText2.getText().toString());
        setResult(RESULT_OK,i);
        finish();
    }


}