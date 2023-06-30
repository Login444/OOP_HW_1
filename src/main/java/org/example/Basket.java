package org.example;

import java.util.ArrayList;
import java.util.function.IntFunction;

public class Basket extends ArrayList {
    public Basket() {
    }

    @Override
    public String toString() {
        return "Basket{" +
                "purchase=" + purchase +
                '}';
    }

    protected ArrayList purchase;

    public Basket(ArrayList purchase) {
        this.purchase = purchase;
    }

    public ArrayList getPurchase() {
        return purchase;
    }

    public void setPurchase(ArrayList purchase) {
        this.purchase = purchase;
    }

    @Override
    public Object[] toArray(IntFunction generator) {
        return super.toArray(generator);
    }
}

