package Model;

import java.io.FileWriter;
import java.io.IOException;

public class Saver {
    public void save(UserData s){
        String filePath = s.getName().toString() + ".txt";
        try(FileWriter write = new FileWriter(filePath,true)){
        write.write(s.toString());
        write.write("\n");
        }catch (IOException e){
            System.out.println(e.getMessage());
            System.out.println("Writing to the file failed");
        }

    }
}
