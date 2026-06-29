package Phase0.P29NPS9;

public class Guest {

    String name, unit;

    Guest(String name, String unit) {
        this.name = name;
        this.unit = unit;
    }

    @Override
    public String toString() {
        this.name = this.name.toUpperCase();
        this.unit = this.unit.toUpperCase();
        return "You set the guest name to " + this.name + " and your unit number is " + this.unit;
    }
}
