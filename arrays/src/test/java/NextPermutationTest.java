import org.junit.Ignore;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class NextPermutationTest {

    private int[] expected;
    private int[] input;

    @Test
    public void nextPermutation1() {
        expected = new int[]{1, 2, 0, 3};
        input = new int[]{1, 0, 3, 2};

        test(expected, input);
    }

    @Test
    @Ignore
    public void nextPermutation2() {
//        expected = Arrays.asList();
//        input = Arrays.asList(3, 2, 1, 0);
//
//        test(expected, input);
    }

    @Test
    public void nextPermutation3() {
        expected = new int[]{2, 1, 0};
        input = new int[]{2, 0, 1};

        test(expected, input);
    }

    private void test(int[] expected, int[] input) {
        final int[] actual = NextPermutation.nextPermutation(input);
        IntStream.range(0, expected.length).forEach(i ->
            assertEquals(expected[i], actual[i])
        );
    }

}