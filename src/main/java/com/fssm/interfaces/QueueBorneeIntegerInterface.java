package com.fssm.interfaces;

public interface QueueBorneeIntegerInterface {
    public Integer capacite();
    public Integer taille();
    public Boolean estVide();
    public Boolean estPleine();
    public Integer ajouteElement(Integer element);
    public Integer supprimeElement();
}
