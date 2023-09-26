package trees;

import utils.DefaultDict;

public class DouglasFir extends Tree {
    public DouglasFir() {
        description = "Douglas Fir";
        hasStar = false;
        decorationFrequencies = new DefaultDict<String>(this.toString());
    }

    @Override
    public double getCost() {
        return 15;
    }

    @Override
    public String toString() {
        return "Douglas Fir";
    }
}
