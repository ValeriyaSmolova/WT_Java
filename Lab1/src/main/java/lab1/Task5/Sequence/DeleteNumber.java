package main.java.lab1.Task5.Sequence;

public class DeleteNumber {
    
    public int getMinAmountOfElements(int[] sequence) {
        int maxIncSequenceLength = 0;
        int currentIncSequenceLength;
        boolean isSequenceInc;

        for (int i = 0; i < sequence.length; i++) {
            isSequenceInc = true;
            currentIncSequenceLength = 1;
            for (int j = i + 1; (j < sequence.length) && isSequenceInc; j++) {
                if (sequence[j - 1] < sequence[j]) {
                    currentIncSequenceLength++;
                } else {
                    isSequenceInc = false;
                }
            }
            maxIncSequenceLength = Math.max(maxIncSequenceLength, currentIncSequenceLength);
        }
        return sequence.length - maxIncSequenceLength;
    }
}