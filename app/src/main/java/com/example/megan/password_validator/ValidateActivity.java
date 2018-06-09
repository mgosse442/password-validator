package com.example.megan.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ValidateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editText);
                TextView textView = findViewById(R.id.textView);

                int rulesPassed = Validator.validate(editText.getText().toString());
                if (rulesPassed < 5) {
                    textView.setText("Your password is not strong enough");
                }
                else {
                    textView.setText("Your password is strong!");
                }
            }
        });
    }
}