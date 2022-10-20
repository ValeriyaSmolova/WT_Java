package main.java.lab1.Task2;

import main.java.lab1.IOServices.Reader.Implement.ConsoleReader;
import main.java.lab1.IOServices.Writer.Implement.ConsoleWriter;
import main.java.lab1.Task2.Implement.FullArea;
import main.java.lab1.Task2.Implement.RectangleArea;
import main.java.lab1.Task2.Interface.Area;

public class Tester2 {
    public static void test(){
        
        var writer = ConsoleWriter.getInstance();
        var reader = ConsoleReader.getInstance();
        Area taskArea = new FullArea(
                new RectangleArea(-4, 0, 8, 5),
                new RectangleArea(-6, -3, 12, 3)
        );
    
        writer.WriteLn("Input x:");
        var x = reader.ReadDouble();
    
        writer.WriteLn("Input y:");
        var y = reader.ReadDouble();
    
        writer.WriteLn("Point " + (taskArea.Contains(x, y) ? "in" : "not in") + " area");  
    }
}
