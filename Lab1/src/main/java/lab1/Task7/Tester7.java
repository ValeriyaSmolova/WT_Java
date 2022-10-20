package main.java.lab1.Task7;

import main.java.lab1.IOServices.Reader.Implement.ConsoleReader;
import main.java.lab1.IOServices.Writer.Implement.ConsoleWriter;
import main.java.lab1.IOServices.Writer.Interface.Writer;
import main.java.lab1.Task7.Sorting.ShellSort;

public class Tester7 {
    public static void test(){
        var writer = ConsoleWriter.getInstance();
        var reader = ConsoleReader.getInstance();

        writer.WriteLn("Input size:");
        var size = reader.ReadInt();

        var array = new int[size];
        for (int i = 0; i < array.length; i++) {
            writer.WriteLn("Input element " + (i + 1) + ":");
            array[i] = reader.ReadInt();
        }

        ShellSort.Sort(array);
        PrintArray(writer, array);
    }

    private static void PrintArray(Writer writer, int[] array) {
        for (int number : array) {
            writer.Write(number + " ");
        }
    }
}
