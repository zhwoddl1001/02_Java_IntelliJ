package com.kh.CollectionEx.pack1.listEx;

public class Snack {
    private String name;
    private int pice;
    private int quantity;

    public Snack() {
    }

    public Snack(String name,int pice,int quantity) {
        this.name = name;
        this.pice = pice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getPice() {
        return pice;
    }

    public void setPice(int pice) {
        this.pice = pice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    @Override
    public String toString() {
        return "Snack{" +
                "name='" + name  +
                ", pice=" + pice +
                ", quantity=" + quantity
                ;
    }
}
