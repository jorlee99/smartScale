package com.example.scale;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.content.DialogInterface.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

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
        Button btn_SubmitInput = (Button)findViewById(R.id.Submit);

        ListView listView = (ListView) findViewById(R.id.leftListView);
        ArrayList<String> list = new ArrayList<String>();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, list);

        ListView masslistView = (ListView) findViewById(R.id.rightListView);
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, list2);

        btn_ResetInputs.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View v) {
              editText.setText("");
              weight.setText("");
//              InputMethodManager imm =(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
//              imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
          }
        });

        btn_SubmitInput.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               String foods = editText.getText().toString();

               list.add(foods);
               listView.setAdapter(arrayAdapter);
               arrayAdapter.notifyDataSetChanged();

               String mass = weight.getText().toString();

               list2.add(mass);
               masslistView.setAdapter(arrayAdapter2);
               arrayAdapter2.notifyDataSetChanged();
           }
        });


//        AutoCompleteTextView foodList = findViewById(R.id.Foodlist);

    }
}