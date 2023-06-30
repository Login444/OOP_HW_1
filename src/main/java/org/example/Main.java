package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Category allMeat = new Category("Мясо", new ArrayList<>());
        Goods meat1 = new Goods("Говядина", 200, 5);
        Goods meat2 = new Goods("Свинина", 250, 4);
        Goods meat3 = new Goods("Курица", 150, 3);

        allMeat.getGoods().add(meat1);
        allMeat.getGoods().add(meat2);
        allMeat.getGoods().add(meat3);

        allMeat.printAllGoods();

        Category allVeg = new Category("Овощи", new ArrayList<>());

        Goods veg1 = new Goods("Огурец", 50, 3);
        Goods veg2 = new Goods("Томат", 132, 4);
        Goods veg3 = new Goods("Баклажан", 80, 5);

        allVeg.getGoods().add(veg1);
        allVeg.getGoods().add(veg2);
        allVeg.getGoods().add(veg3);

        allVeg.printAllGoods();

        Category allBakery = new Category("Выпечка", new ArrayList<>());

        Goods bak1 = new Goods("Хлеб", 55, 5);
        Goods bak2 = new Goods("Слойка с малиной", 43, 4);
        Goods bak3 = new Goods("Пончик", 15, 2);

        allBakery.getGoods().add(bak1);
        allBakery.getGoods().add(bak2);
        allBakery.getGoods().add(bak3);

        allBakery.printAllGoods();

        User user1 = new User( "login1", 12345, new Basket(new ArrayList<>()));
        User user2 = new User( "login2", 12345, new Basket(new ArrayList<>()));
        User user3 = new User( "login3", 12345, new Basket(new ArrayList<>()));

        buyGoods(user1, bak1, allMeat, allVeg, allBakery);
        buyGoods(user1, meat2, allMeat, allVeg, allBakery);
        buyGoods(user2, meat1, allMeat, allVeg, allBakery);
        buyGoods(user3, veg1, allMeat, allVeg, allBakery);
        buyGoods(user3, bak3, allMeat, allVeg, allBakery);

        user1.printUserPurchase();
        user2.printUserPurchase();
        user3.printUserPurchase();

        allMeat.printAllGoods();
        allVeg.printAllGoods();
        allBakery.printAllGoods();
    }

    private static void buyGoods(User user, Goods good, Category allMeat, Category allVeg, Category allBakery) {
        user.getPurchase().add(good);
        if (allMeat.getGoods().contains(good)){
            allMeat.getGoods().remove(good);
        }

        if (allVeg.getGoods().contains(good)){
            allVeg.getGoods().remove(good);
        }

        if (allBakery.getGoods().contains(good)){
            allBakery.getGoods().remove(good);
        }
    }
}