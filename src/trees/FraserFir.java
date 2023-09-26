package trees;

import utils.DefaultDict;

public class FraserFir extends Tree {
    public FraserFir() {
        description = "Fraser Fir";
        hasStar = false;
        decorationFrequencies = new DefaultDict<String>(this.toString());
    }

    @Override
    public double getCost() {
        return 12;
    }

    @Override
    public String toString() {
        return "Fraser Fir";
    }
}
