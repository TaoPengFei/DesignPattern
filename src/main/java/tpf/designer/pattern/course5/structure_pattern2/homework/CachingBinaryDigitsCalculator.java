package tpf.designer.pattern.course5.structure_pattern2.homework;

import java.util.HashMap;

public class CachingBinaryDigitsCalculator implements BinaryDigitsCalculator {

    private BinaryDigitsCalculator binaryDigitsCalculator;
    private HashMap cache = new HashMap();

    public CachingBinaryDigitsCalculator(BinaryDigitsCalculator calculator) {
        this.binaryDigitsCalculator = calculator;
    }

    @Override
    public synchronized byte calculateBinaryDigit(int n) {
        final Integer N = new Integer(n);
        Byte B = (Byte) cache.get(N);
        if (B == null) {
            byte b =
                    binaryDigitsCalculator.calculateBinaryDigit(n);
            cache.put(N, new Byte(b));
            return b;
        } else {
            return B.byteValue();
        }
    }
}
