package exercise;

import java.util.Arrays;

// BEGIN
public class ReversedSequence implements CharSequence {
    private char[] sequence;

    public ReversedSequence(String text) {
        int n = text.length();
        sequence = new char[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = text.charAt(n - 1 - i);
        }
    }
    @Override
    public int length() {

        return sequence.length;
    }

    @Override
    public char charAt(int i) {
        return sequence[i];
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return new String(Arrays.copyOfRange(sequence, i, i1));
    }

    @Override
    public String toString() {
        return new String(sequence);
    }
}
// END
