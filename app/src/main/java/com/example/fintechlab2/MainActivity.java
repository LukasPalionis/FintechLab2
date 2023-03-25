package com.example.fintechlab2;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.example.fintechlab2.Utils.TextCounter;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    EditText txtMain;
    Spinner spOptionSelection;
    String wordsSelected;
    String emptyTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvResult = findViewById(R.id.tvResult);
        this.txtMain = findViewById(R.id.txtMain);
        this.spOptionSelection = findViewById(R.id.spOptionSelection);
        this.wordsSelected = getResources().getString(R.string.words_selected);
        this.emptyTextMessage = getResources().getString(R.string.empty_text_message);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.counting_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spOptionSelection.setAdapter(adapter);
    }

    public void onBtnCalculateClick(View view) {
        if(txtMain.getText().toString().isEmpty() ){
            Toast.makeText(this, emptyTextMessage, Toast.LENGTH_LONG).show();
        } else{
            if(this.spOptionSelection.getSelectedItem().toString().equalsIgnoreCase(wordsSelected)){
                int wordsCount = TextCounter.getWordsCount(this.txtMain.getText().toString());
                String wordsCountFormatted = String.valueOf(wordsCount);
                this.tvResult.setText(wordsCountFormatted);
            } else{
                int charsCount = TextCounter.getCharsCount(this.txtMain.getText().toString());
                String charsCountFormatted = String.valueOf(charsCount);
                this.tvResult.setText(charsCountFormatted);
            }
        }
    }
}
