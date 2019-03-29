import java.util.Scanner;

import static java.lang.String.*;

public class NauticalMilesInteractive {
    public static void main(String[] args) {
        final double num_of_kilometers = 1.852;
        final double num_of_miles = 1.150779;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of Nautical Miles: ");
        double nauticalMiles = in.nextDouble();
        // One mile is equal to 1.609 kilometers
        // mile (1 nautical mile = 1.1508 statute miles )

        String nautical_to_miles_string = "%.5f nautical miles is equal to %.5f in miles";

        System.out.println(format(nautical_to_miles_string, nauticalMiles, (nauticalMiles * num_of_miles)));

        String nautical_to_kilometers_string = "%.5f nautical miles is equal to %.5f in kilometers";

        System.out.println(format(nautical_to_kilometers_string, nauticalMiles, (nauticalMiles * num_of_kilometers)));

    }
}

