public final class NextPermutation {

    /*
    6.10
    */

    public static int[] nextPermutation(int[] permutation) {
        int i = permutation.length - 2;
        while (i >= 0 && permutation[i] >= permutation[i + 1]) --i;

        if (i == -1) {
            return new int[]{};
        }

        int j = permutation.length - 1;
        for (int k = i + 1; k < permutation.length; ++k) {
            if (permutation[k] > permutation[i]) {
                j = k;
            } else {
                break;
            }
        }

        ArraysUtils.swap(permutation, i, j);
        for (int l = i + 1; l < permutation.length - 1; l++) {
            ArraysUtils.swap(permutation, l, l + 1);
        }
        return permutation;
    }

    private NextPermutation() {}
}
