package kata7;

import java.util.Arrays;

public class PonyExpress {

    public static void main(String[] args) {
        System.out.println(riders(new int[] {6, 9, 40, 25, 11, 28, 35, 9, 32, 31, 28, 16, 29, 36, 22}));
    }

    public static int riders(final int[] stations) {
        int sum = Arrays.stream(stations).sum();
        System.out.println("SUM - " + sum);
        int countOfRiders =1;
        int sumOfLength = 0;
        for (int i = 0; i < stations.length; i++) {
            if(sumOfLength + stations[i] > 100){
                countOfRiders++;
                sumOfLength = 0;
            }
            sumOfLength += stations[i];
        }
        return countOfRiders;
    }

}
