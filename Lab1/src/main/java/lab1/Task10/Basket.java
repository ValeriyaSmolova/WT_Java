package main.java.lab1.Task10;

import java.util.List;

public class Basket {
    
    private List<Ball> balls;

    public Basket(){}
    public Basket(List<Ball> balls){
        this.balls= balls;
    }

    public List<Ball> getBalls(){
        return balls;
    }
    public void setBalls(List<Ball> balls){
        this.balls= balls;
    }
}