package com.manjurulhoque.quotex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewQuote;
    private ImageButton btnPrevious, btnNext;
    String[] quotes;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext = findViewById(R.id.btnNext);
        btnPrevious = findViewById(R.id.btnPrevious);
        mTextViewQuote = findViewById(R.id.textViewQuote);

        quotes = getResources().getStringArray(R.array.quotes);

        mTextViewQuote.setText(quotes[i]);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if (i > quotes.length - 1) {
                    i = 0;
                }
                mTextViewQuote.setText(quotes[i]);
            }
        });

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i--;
                if (i < 0) {
                    i = quotes.length - 1;
                }
                mTextViewQuote.setText(quotes[i]);
            }
        });
    }
}
