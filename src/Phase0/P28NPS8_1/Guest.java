package Phase0.P28NPS8_1;

public class Guest {

    String name;
    int unit;

    Guest(String name, int unit) {
        this.name = name;
        this.unit = unit;
    }
    @Override
    public String toString() { //works
        return this.name + " " + this.unit;
    }
}
