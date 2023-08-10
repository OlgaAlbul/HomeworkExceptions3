package Model;

public class Parser {
    public String[] userParse(String s){
        String[] exceptionNum = new String[1];
        String[] data = s.split(" ");
        if (data.length<6) {
            exceptionNum[0]= "-1";
            return exceptionNum;
        } else if (data.length>6) {
            exceptionNum[0]= "-2";
            return exceptionNum;
        }else{
            return data;
        }
    }
}
