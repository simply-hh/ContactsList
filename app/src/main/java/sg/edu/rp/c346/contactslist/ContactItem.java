package sg.edu.rp.c346.contactslist;

/**
 * Created by 16039009 on 23/7/2018.
 */

public class ContactItem {
    private String name;
    private String code;
    private int num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ContactItem(String name, String code, int num) {
        this.name = name;
        this.code = code;
        this.num = num;

    }

    @Override
    public String toString() {
        return "ContactItem{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", num=" + num +
                '}';
    }
}
