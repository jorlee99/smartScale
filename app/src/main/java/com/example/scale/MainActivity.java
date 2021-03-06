package com.example.scale;

import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.content.DialogInterface.OnClickListener;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    private static final String[] FOODS = new String[]{
      "Chicken" , "Beef", "Pork"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText weight = findViewById(R.id.Edit_Text);
        AutoCompleteTextView editText = findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, FOODS);
        editText.setAdapter(adapter);
    
        Button btn_ResetInputs = (Button)findViewById(R.id.Reset);

        btn_ResetInputs.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View v) {
              editText.setText("");
              weight.setText("");
          }
        });
//        AutoCompleteTextView foodList = findViewById(R.id.Foodlist);

    }
}