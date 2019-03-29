public class InchesToFeet {
    public static void main(String[] args) {
        final int rate_of_feet_to_inch = 12;

        int num_of_inches  = 86;

        String feet_to_inch_string = "%d inches = %d feet %d inches";
        System.out.println(String.format(feet_to_inch_string,
                num_of_inches, (num_of_inches / rate_of_feet_to_inch), (num_of_inches % rate_of_feet_to_inch)));
    }
}


