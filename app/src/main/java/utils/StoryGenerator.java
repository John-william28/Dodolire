package com.example.dodolire;

import com.example.dodolire.models.Story;

public class StoryGenerator {
    public static Story generate(String type, String age, String theme, String genre, String prenom, String motcle) {
        String titre = "L'aventure de " + prenom;
        String contenu = "Il était une fois, un personnage appelé " + prenom + " qui adorait les " + motcle + ". Un jour, il partit à la découverte de " + theme + ".";
        return new Story(titre, contenu);
    }
}