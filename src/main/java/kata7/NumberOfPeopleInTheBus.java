package kata7;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {

    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream().mapToInt(stop -> stop[0] - stop[1]).sum();
    }
}
