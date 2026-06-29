package Phase0.FinalNPS;

public class Guest {

    String name, unit;

    Guest(String name, String unit) {
        this.name = name;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return name + " " + unit;
    }
}
