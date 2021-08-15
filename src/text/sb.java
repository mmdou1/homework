package text;

import java.io.Serializable;

public class sb implements Serializable {
    private  int number;
    private transient String name;

    public sb(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public sb() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "sb{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
