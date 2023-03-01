package com.javapack.test;

public class ArithmeticOperations {
    public static void main(String[] args) {
        byte bAdd = -127 + 1;
        byte bSubtract = -34 - (-56);
        byte bMultiply = 12 * 2;
        byte bDivide = 35/5;

        System.out.println(bAdd + ", " + bSubtract + ", " + bMultiply + ", " + bDivide);

        short sAdd = 5679 + (-645);
        short sSubtract = 7985 - 9833;
        short sMultiply = -24 * 689;
        short sDivide = -786 / -82;

        System.out.println(sAdd + ", " + sSubtract + ", " + sMultiply + ", " + sDivide);

        long lAdd = -5275372 + 8273827;
        long lSubtract = 9128672 - 73;
        long lMultiply = 712552 * 767;
        long lDivide = 31572514 / (-62);

        System.out.println(lAdd + ", " + lSubtract + ", " + lMultiply + ", " + lDivide);

        float fAdd = 3445.67f + 3537.766f;
        float fSubtract = -2343.738f - (-7236.111f);
        float fMultiply = 67.87f * 871.77f;
        float fDivide = 92398.736f / 72637.872f;

        System.out.println(fAdd + ", " + fSubtract + ", " + fMultiply + ", " + fDivide);

        double dAdd = -52771527.6712671 + (-86182618.78172);
        double dSubtract = 268326382.82638 - (-17527152.861872);
        double dMultiply = 517527152.81628 * 716218.128;
        double dDivide = -186281628.71927 / (-172571572.9872979);

        System.out.println(dAdd + ", " + dSubtract + ", " + dMultiply + ", " + dDivide);
    }
}
