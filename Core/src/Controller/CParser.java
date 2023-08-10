package Controller;

import Model.Parser;

public class CParser {

    public String[] parseUserInput(String s){
        Parser parser = new Parser();
        String[] parseData = parser.userParse(s);
        return parseData;
    }
}
