package Phase0.P30NPS10;

public class Guest {

    String name, unit;

    Guest(String name, String unit) { //2 arg constructor
        this.name = name;
        this.unit = unit;
    }
    Guest () {
        this.name = "Nameless";
        this.unit = "Homeless";
    }

    @Override
    public String toString() {
        this.name = this.name.toUpperCase();
        this.unit = this.unit.toUpperCase();
        return "You set the guest name to " + this.name + " and your unit number is " + this.unit;
    }
}
