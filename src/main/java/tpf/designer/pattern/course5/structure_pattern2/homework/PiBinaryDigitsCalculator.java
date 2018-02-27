package tpf.designer.pattern.course5.structure_pattern2.homework;


import java.util.HashMap;

public class PiBinaryDigitsCalculator implements BinaryDigitsCalculator {
    @Override
    public byte calculateBinaryDigit(int n) {
        return 0;
    }

    private byte runBBPAlgorithm(final int n) {
// Lengthy routine goes here ...
        return 0;
    }

    /*private HashMap cache = new HashMap();

    public synchronized byte calculateBinaryDigit(final int n) {

        final Integer N = new Integer(n);
        Byte B = (Byte) cache.get(N);
        if (B == null) {
            byte b = runBBPAlgorithm(n);
            cache.put(N, new Byte(b));
            return b;
        } else {
//            return B.byteValue();
        }
    }

    private byte runBBPAlgorithm(final int n) {
        // Lengthy routine goes here ...
        return 0;
    }*/
}