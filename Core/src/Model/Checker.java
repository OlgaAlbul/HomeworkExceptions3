package Model;

public class Checker {
    public UserData checkData(String[] s){
        if(s.length!=1) {
            UserData checkedUserData = new UserData();
            String[] name = new String[3];
            int k = 0;
            for (int i = 0; i < s.length; i++) {
                if (s[i].length() == 1 && s[i].equals("f") || s[i].equals("m")) {
                    checkedUserData.setSex(s[i].charAt(0));
                } else if (s[i].matches("[0-9]+")) {
                    checkedUserData.setTelefoneNumber(s[i]);
                } else if (s[i].contains(".")) {
                    String[] birthDay = s[i].split(".");
                    if (birthDay.length == 3) {
                        for (int j = 0; j < birthDay.length; j++) {
                            if (!birthDay[j].matches("[0-9]+0")) {
                                System.out.println("Exception");
                            }
                        }
                    }
                    checkedUserData.setBirthday(s[i]);
                } else if (s[i].length() != 1 && !s[i].matches("[0-9]+") && !s[i].contains(".")) {
                    name[k] = s[i];
                    k++;
                }
                checkedUserData.setName(name);
            }
            return checkedUserData;
        } else if (s.length==1) {
            if (s[0].equals("-1")) {
               throw new RuntimeException("You have not entered enough data");
            }else{
                throw new RuntimeException("You have entered more data than required");
            }
        }return null;
    }
}
