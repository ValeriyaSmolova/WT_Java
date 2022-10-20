package main.java.lab1.Task5;

import main.java.lab1.IOServices.Reader.Implement.ConsoleReader;
import main.java.lab1.IOServices.Writer.Implement.ConsoleWriter;
import main.java.lab1.Task5.Sequence.DeleteNumber;

public class Tester5 {
    public static void test(){
        
        var writer = ConsoleWriter.getInstance();
        var reader = ConsoleReader.getInstance();

        writer.WriteLn("Input size:");
        var size = reader.ReadInt();

        var min_element = new DeleteNumber();

        var array = new int[size];
        for (int i = 0; i < array.length; i++) {
            writer.WriteLn("Input element " + (i + 1) + ":");
            array[i] = reader.ReadInt();
        }

        writer.WriteLn(min_element.getMinAmountOfElements(array) + " - element to remove");
    }
}
