package com.fssm.classes;

import com.fssm.interfaces.QueueBorneeIntegerInterface;

import java.util.ArrayList;

public class QueueBorneeInteger implements QueueBorneeIntegerInterface {
    private Integer capacite;
    private ArrayList<Integer> queue;

    public QueueBorneeInteger(Integer capacite) throws IllegalArgumentException {
        if (capacite < 0) {
            throw new IllegalArgumentException("Capacite should be a positive integer");
        } else {
            this.capacite = capacite;
            this.queue = new ArrayList<>();
        }
    }

    public QueueBorneeInteger(){
        this.capacite = 0;
        this.queue = new ArrayList<>();
    }

    @Override
    public Integer capacite() {
        return this.capacite;
    }

    @Override
    public Integer taille() {
        return this.queue.size();
    }

    @Override
    public Boolean estVide() {
        if(taille() == 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Boolean estPleine() {
        if(taille() == capacite()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Integer ajouteElement(Integer element) {
        if(estPleine()){
            throw  new IllegalArgumentException("Queue is full");
        }else{
            this.queue.add(element);
            return element;
        }
    }

    @Override
    public Integer supprimeElement() {
        if(estVide()){
            throw  new IllegalArgumentException("Vide");
        }else {
            Integer element;
            element = this.queue.get(0);
            this.queue.remove(0);
            return element;
        }
    }
}
