package Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cafe deathBrew = new Cafe();
        deathBrew.loadMenuData();
        for (int i = 0; i < deathBrew.coffeeMenu.size() ; i++){
            System.out.println(deathBrew.coffeeMenu.get(i));
        }

       // System.out.println(darkBrew.coffeeMenu);
    }
}
