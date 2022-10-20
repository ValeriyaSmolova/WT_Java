package main.java.lab1.Task3.Calculator;

public class FuncCalculator {
    private double a;
    private double b;
    private double h;

    public FuncCalculator( double a, double b, double h){
        this.a = a;
        this.b = b;
        this.h= h;
    }

    public void getResult(){
        System.out.println("_______________________");
        System.out.println("|____X_____|_____Y____|");
        double curr = a;
        while(curr<=b)
        {
            System.out.printf("| %-8.2f | %-8.2f | \r\n", curr, Math.tan(curr));
            curr+= h;
        }
        System.out.println("________________________");
    }
}