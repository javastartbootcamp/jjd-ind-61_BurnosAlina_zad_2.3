package pl.javastart.task;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Mojito";
        drink1.price = 13.0;
        drink1.alcoholic = true;

        Ingredients ingredient1 = new Ingredients();
        ingredient1.name = "woda";
        ingredient1.amount = 100;
        drink1.ingredient1 = ingredient1;

        Ingredients ingredient2 = new Ingredients();
        ingredient2.name = "sok cytrynowy";
        ingredient2.amount = 50;
        drink1.ingredient2 = ingredient2;

        Ingredients ingredient3 = new Ingredients();
        ingredient3.name = "wodka";
        ingredient3.amount = 60;
        drink1.ingredient3 = ingredient3;

        int drink1Capacity = ingredient1.amount + ingredient2.amount + ingredient3.amount;

        System.out.printf(Locale.ENGLISH, "Drink: %s%nCena: %.1fzl%nCzy zawiera alkohol? %b%nSkladniki:" +
                "%n%s%n%s%n%s%nPojemnosc: %dml", drink1.name, drink1.price, drink1.alcoholic,
                ingredient1.name, ingredient2.name, ingredient3.name, drink1Capacity);
    }
}
