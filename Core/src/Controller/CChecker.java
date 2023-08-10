package Controller;

import Model.Checker;
import Model.UserData;

public class CChecker {
    public UserData checkUserData(String[] s){
        Checker checkUserData = new Checker();
        return checkUserData.checkData(s);
    }
}
