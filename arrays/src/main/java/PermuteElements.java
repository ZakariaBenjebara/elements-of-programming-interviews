import java.util.List;

import static java.util.stream.Collectors.toList;

public final class PermuteElements {

    /*
    6.9
    */

    public static List<Integer> applyPermutation(List<Integer> perm, List<Integer> a) {
        return perm.stream().map(a::get).collect(toList());
    }
}
