package com.example.dodolire;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class FormActivity extends AppCompatActivity {
    Spinner typeSpinner, ageSpinner, themeSpinner, genreSpinner;
    EditText prenomInput, motcleInput;
    Button genererBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        typeSpinner = findViewById(R.id.spinnerType);
        ageSpinner = findViewById(R.id.spinnerAge);
        themeSpinner = findViewById(R.id.spinnerTheme);
        genreSpinner = findViewById(R.id.spinnerGenre);
        prenomInput = findViewById(R.id.editPrenom);
        motcleInput = findViewById(R.id.editMotcle);
        genererBtn = findViewById(R.id.genererBtn);

        genererBtn.setOnClickListener(v -> {
            String type = typeSpinner.getSelectedItem().toString();
            String age = ageSpinner.getSelectedItem().toString();
            String theme = themeSpinner.getSelectedItem().toString();
            String genre = genreSpinner.getSelectedItem().toString();
            String prenom = prenomInput.getText().toString();
            String motcle = motcleInput.getText().toString();

            Story story = StoryGenerator.generate(type, age, theme, genre, prenom, motcle);

            Intent intent = new Intent(FormActivity.this, StoryViewActivity.class);
            intent.putExtra("titre", story.getTitre());
            intent.putExtra("contenu", story.getContenu());
            startActivity(intent);
        });
    }
}