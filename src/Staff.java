package src;

import java.io.FileWriter;
import java.io.IOException;

public class Staff {
    private String staffId, staffName, staffPosition;

    public void addStaff(String id, String name, String position) {
        staffId = id;
        staffName = name;
        staffPosition = position;

        try {
            FileWriter writer = new FileWriter("../database/staff.csv");
            writer.write(id + "," + name + "," + position);
            writer.write("\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

    public void removeStaff(String id) {

    }

    public void reset() {

    }

    public void exit() {

    }
}
