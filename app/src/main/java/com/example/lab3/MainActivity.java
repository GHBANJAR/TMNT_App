package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget .Spinner ;
import android.widget.Switch;
import android.widget. TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private  Spinner spinner ;
private  ImageView imageView ;
private  TextView textView ;
private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.image);
        textView= findViewById(R.id.text);

        String[] tmnt = {" choose a character" , "Leonardo" , "Donatello" ,"Raphael  ", "Michelangelo "};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,tmnt);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?>parent, View view, int position, long id) {
               switch (position){
                   case  1 : imageView.setImageResource(R.drawable.l);
                   textView.setText("The leader of the group, he is named after Leonardo da Vinci. He is depicted wearing a blue mask and wielding two katanas ");
                   break;
                   case 2 : imageView.setImageResource(R.drawable.d);
                       textView.setText("The team's resident technologist, he is named after Donatello. He is depicted wearing a purple mask and wielding a bo staff ");
                       break;
                   case  3 : imageView.setImageResource(R.drawable.r);
                       textView.setText("The team's muscle, he is named after Raphael. He is depicted wearing a red mask and wielding two sai");
                       break;
                   case  4  : imageView.setImageResource(R.drawable.m);
                       textView.setText("The team's comic relief he is named after Michelangelo. He is depicted wearing an orange mask and welding a pair of nunchalou.");
                       break;
               }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });






    }

    public void a(View view) {
    }
}