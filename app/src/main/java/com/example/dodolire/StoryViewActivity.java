package com.example.dodolire;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class StoryViewActivity extends AppCompatActivity {
    TextView titreText, contenuText;
    Button quitterBtn, recommencerBtn, archiverBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_view);

        titreText = findViewById(R.id.titreHistoire);
        contenuText = findViewById(R.id.contenuHistoire);
        quitterBtn = findViewById(R.id.btnQuitter);
        recommencerBtn = findViewById(R.id.btnRecommencer);
        archiverBtn = findViewById(R.id.btnArchiver);

        String titre = getIntent().getStringExtra("titre");
        String contenu = getIntent().getStringExtra("contenu");

        titreText.setText(titre);
        contenuText.setText(contenu);

        quitterBtn.setOnClickListener(v -> finish());
        recommencerBtn.setOnClickListener(v -> finish());
        archiverBtn.setOnClickListener(v -> Toast.makeText(this, "Histoire archivée !", Toast.LENGTH_SHORT).show());
    }
}
