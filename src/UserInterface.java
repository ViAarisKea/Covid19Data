import java.util.ArrayList;
import java.util.Collections;

public class UserInterface {
    private FileHandler fileHandler = new FileHandler();
    ArrayList<Covid19Data> data;

    public void readData(){
        data = fileHandler.loadFile();
    }
    public void sortAfterRegion(){
        readData();
        Collections.sort(data, new RegionComparator());
    }

    public void sortAfterAgeGroup(){
        readData();
        Collections.sort(data, new AldersGruppeComparator());
    }

    public void printData(){
        for(Covid19Data data : data){
            System.out.println(data);
        }
    }
}
