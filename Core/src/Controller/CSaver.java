package Controller;

import Model.Saver;
import Model.UserData;

public class CSaver {
    public void saveCheckUserData(UserData s){
        Saver saver = new Saver();
        saver.save(s);
    }
}
