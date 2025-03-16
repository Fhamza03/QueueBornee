package com.fssm.classes;

public class QueueBorneeLente {
    private int[] queue;
    private int size;
    private int front;
    private int rear;

    public QueueBorneeLente(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public boolean estPleine() {
        return (rear == size - 1);
    }

    public boolean estVide() {
        return (front == -1 || front > rear);
    }

    public void ajouteElement(int element) {
        if (estPleine()) {
            throw new IllegalStateException("Queue is full");
        }
        if (front == -1) {
            front = 0;
        }
        queue[++rear] = element;
    }

    public int supprimeElement() {
        if (estVide()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front++];
    }

    public int getSize() {
        if (estVide()) {
            return 0;
        }
        return rear - front + 1;
    }
}
