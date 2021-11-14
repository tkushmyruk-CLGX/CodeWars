package kata6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//NOT RESOLVED
public class AreTheSame {

    public static void main(String[] args) {
        int[] a = new int[]{2,3,2};
        int[] b = new int[]{5,9,4};
        System.out.println(comp(a, b));
    }

    public static boolean comp(int[] a, int[] b) {

        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
        return !Arrays.stream(b).boxed().mapToDouble(Math::sqrt).filter(value -> {
            if(aList.contains(value)){
                return false;
            }
            return true;
        }).findAny().isPresent();
    }
}
