package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int INTm1 = -1;
    public static final int INT12 = 12;
    public static final int INT11 = 11;
    private final int[] numbers = new int[INT12];

    public int total = INTm1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INTm1;
    }

    public boolean isFull() {
        return total == INT11;
    }

    protected int peekaboo() {
        if (callCheck())
            return INTm1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INTm1;
        return numbers[total--];
    }

}
