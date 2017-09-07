public final class ComputeParity {

    private ComputeParity() {}

    public static short parity(long n) {
        short result = 0;
        while (n != 0) {
            result ^= (n & 1);
            n >>>= 1;
        }
        return result;
    }
}
