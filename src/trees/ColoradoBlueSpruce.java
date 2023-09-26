package trees;

import utils.DefaultDict;

public class ColoradoBlueSpruce extends Tree {
    public ColoradoBlueSpruce() {
        description = "Colorado Blue Spruce";
        hasStar = false;
        decorationFrequencies = new DefaultDict<String>(this.toString());
    }

    @Override
    public double getCost() {
        return 20;
    }

    @Override
    public String toString() {
        return "Colorado Blue Spruce";
    }
}
