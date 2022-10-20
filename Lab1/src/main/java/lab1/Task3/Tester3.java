package main.java.lab1.Task3;

import main.java.lab1.IOServices.Reader.Implement.ConsoleReader;
import main.java.lab1.IOServices.Writer.Implement.ConsoleWriter;
import main.java.lab1.Task3.Calculator.FuncCalculator;

public class Tester3 {
    public static void test(){
        
        var writer = ConsoleWriter.getInstance();
        var reader = ConsoleReader.getInstance();

        writer.WriteLn("Input a:");
        var a = reader.ReadDouble();

        writer.WriteLn("Input b:");
        var b = reader.ReadDouble();

        writer.WriteLn("Input h:");
        var h = reader.ReadDouble();

        var func = new FuncCalculator(a,b,h);
        func.getResult();

    }
}
