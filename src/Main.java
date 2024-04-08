import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        ArrayList<Covid19Data> list = fileHandler.loadFile();
        for(Covid19Data data : list){
            System.out.println(data);
        }
    }
}
