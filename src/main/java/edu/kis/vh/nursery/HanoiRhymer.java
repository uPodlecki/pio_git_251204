package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    public static final int INT0 = 0;
    int totalRejected = INT0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
