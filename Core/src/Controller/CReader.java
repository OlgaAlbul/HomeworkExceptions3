package Controller;

import Model.Reader;
import Model.UserData;

public class CReader {
    public String ReadUserInput(){
        Reader reader = new Reader();
        return reader.userInput();
    }
    public void readCheckedUserData(String s){
        Reader userDataReader = new Reader();
        userDataReader.readFileUserData(s);
    }
}
