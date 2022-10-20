package main.java.lab1.Task1.Math;

public class FunctionResult {
    public double Calculate(double x, double y) {
        double result = Math.sin(x + y);
        result *= result;
        result++;
        double divisor = (2 * x) / (1 + x * x + y * y);
        divisor = x - divisor;
        divisor = 2 + Math.abs(divisor);
        result /= divisor;
        return result + x;
    }
}