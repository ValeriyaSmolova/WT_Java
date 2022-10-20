package main.java.lab1.Task1;

import main.java.lab1.IOServices.Reader.Implement.ConsoleReader;
import main.java.lab1.IOServices.Writer.Implement.ConsoleWriter;
import main.java.lab1.Task1.Math.FunctionResult;

public class Tester1 {
    public static void test(){
        
        var writer = ConsoleWriter.getInstance();
        var reader = ConsoleReader.getInstance();
        var calculator = new FunctionResult();
        
        writer.WriteLn("Input x:");
        var x = reader.ReadDouble();
        
        writer.WriteLn("Input y:");
        var y = reader.ReadDouble();
        
        writer.WriteLn("Result = " + calculator.Calculate(x, y));
    }

}

