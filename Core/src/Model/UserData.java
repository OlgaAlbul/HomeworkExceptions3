package Model;

import java.util.Arrays;

public class UserData {
    private String[] name = new String[3];
    private String birthday;
    private String telefoneNumber;
    private char sex;

    public UserData() {
    }

    public String getName() {
        return name[0];
    }

    public String getBirthday() {
        return birthday;
    }

    public String getTelefoneNumber() {
        return telefoneNumber;
    }

    public char getSex() {
        return sex;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setTelefoneNumber(String telefoneNumber) {
        this.telefoneNumber = telefoneNumber;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "name=" + Arrays.toString(name) +
                ", birthday='" + birthday + '\'' +
                ", telefoneNumber=" + telefoneNumber +
                ", sex=" + sex +
                '}';
    }
}

