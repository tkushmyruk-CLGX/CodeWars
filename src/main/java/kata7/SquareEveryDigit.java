package kata7;

import java.util.stream.Collectors;

//
//Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
//
//    For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
//
//    Note: The function accepts an integer and returns an integer
public class SquareEveryDigit {
    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }

    public static int squareDigits(int n) {
        String s = String.valueOf(n);
        String collect = s.chars()
            .mapToObj(c -> {
                int oneDigit = Character.getNumericValue(c);
                oneDigit *= oneDigit;
                return String.valueOf(oneDigit);
            })
            .collect(Collectors.joining());
        return Integer.parseInt(collect);
    }
}
