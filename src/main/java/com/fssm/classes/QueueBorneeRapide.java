package com.fssm.classes;

public class QueueBorneeRapide {
    private Object[] elements;
    private int taille;
    private int capacite;

    public QueueBorneeRapide(int capacite) {
        this.capacite = capacite;
        this.elements = new Object[capacite]; // Initialize the array
        this.taille = 0;
    }

    public int taille() {
        if (elements == null) {
            throw new IllegalStateException("Queue is not initialized properly.");
        }
        return taille;
    }

    public boolean estPleine() {
        return taille == capacite;
    }

    public boolean estVide() {
        return taille == 0;
    }

    public void ajouteElement(Object element) {
        if (estPleine()) {
            throw new IllegalStateException("Queue is full");
        }
        elements[taille++] = element;
    }

    public Object retireElement() {
        if (estVide()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = elements[0];
        for (int i = 1; i < taille; i++) {
            elements[i - 1] = elements[i];
        }
        taille--;
        return element;
    }
}
