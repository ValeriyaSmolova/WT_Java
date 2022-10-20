package main.java.lab1.Task6;

import main.java.lab1.IOServices.Reader.Implement.ConsoleReader;
import main.java.lab1.IOServices.Writer.Implement.ConsoleWriter;
import main.java.lab1.IOServices.Writer.Interface.Writer;
import main.java.lab1.Task6.Matrix.ArrayTransformer;

public class Tester6 {
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

        var matrix = ArrayTransformer.TransformArray(array);
        PrintTable(writer, matrix);
    }

    private static void PrintTable(Writer writer, int[][] array) {
        for (int[] ints : array) {
            for (int number : ints) {
                writer.Write(number + " ");
            }
            writer.WriteLn("");
        }
    }
}
