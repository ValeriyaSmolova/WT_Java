package main.java.lab1.Task9;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import main.java.lab1.Task9.Entities.Ball;
import main.java.lab1.Task9.Entities.Basket;
import main.java.lab1.Task9.WeightAndColor.BasketInteraction;

public class Tester9 {
    public static void test(){
        var balls = new ArrayList<Ball>();
        var random = new Random();
        Color[] colors = { Color.BLUE, Color.GREEN, Color.RED};
        for (int i =0; i< 15; ++i){
            balls.add(new Ball(
                    random.nextInt(5),
                    colors[random.nextInt(colors.length)]
            ));
        }
        var basket = new Basket(balls);
        System.out.println("Total weight: "+  BasketInteraction.getBasketWeight(basket));
        System.out.printf("Count balls with blue color: "+ BasketInteraction.getCountBallsWithColor(basket,Color.BLUE));
    }

}
