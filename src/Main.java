import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.sortAfterAgeGroup();
        ui.printData();

        ui.sortAfterRegion();
        ui.printData();
    }
}
