package kata6;

import java.math.BigInteger;

//Your task is to return the amount of white rectangles in a NxN spiral.
// Your font may differ, if we talk of white rectangles, we talk about the symboles in the top row.
public class CountOfSpiral {

    public static void main(String[] args) {
        BigInteger bigInteger = BigInteger.valueOf(7l);
        sum(bigInteger);
    }

    public static BigInteger sum(BigInteger size) {
        BigInteger result = size;
        size = size.subtract(BigInteger.ONE);
        result = result.add(size);
        result = result.add(size);
        size =  size.subtract(BigInteger.TWO);
        while (size.subtract(BigInteger.TWO).compareTo(BigInteger.ZERO) == 1
        || size.subtract(BigInteger.TWO).compareTo(BigInteger.ZERO) == 0){
            System.out.println(result.toString());
            if(size.subtract(BigInteger.TWO).compareTo(BigInteger.ONE) == 0){
                result = result.add(BigInteger.ONE);
            }
                result = result.add(size);

            if(size.subtract(BigInteger.TWO).compareTo(BigInteger.ZERO) == 1
                || size.subtract(BigInteger.TWO).compareTo(BigInteger.ZERO) == 0){
                result = result.add(size);
            }
            size =  size.subtract(BigInteger.TWO);
        }
        System.out.println(result.intValue());
        return result;
    }

}
