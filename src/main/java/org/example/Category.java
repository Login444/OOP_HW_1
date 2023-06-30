package org.example;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList goods;


    public Category(String name, ArrayList goods) {
        this.name = name;
        this.goods = goods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getGoods() {
        return goods;
    }

    public void setGoods(ArrayList goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", goods=" + goods +
                '}';
    }

    public void printAllGoods(){
        System.out.println();
        System.out.println(name);
        for (int i = 0; i < goods.size(); i++) {
            System.out.println(goods.get(i).toString());
        }
    }
}
