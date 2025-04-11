package com.example.dodolire;

public class Story {
    private String titre;
    private String contenu;

    public Story(String titre, String contenu) {
        this.titre = titre;
        this.contenu = contenu;
    }

    public String getTitre() {
        return titre;
    }

    public String getContenu() {
        return contenu;
    }
}