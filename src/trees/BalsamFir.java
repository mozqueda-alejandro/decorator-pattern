package trees;

import utils.DefaultDict;

public class BalsamFir extends Tree {
    public BalsamFir() {
        initTree(toString());
    }

    @Override
    public double getCost() {
        return 5;
    }

    @Override
    public String toString() {
        return "Balsam Fir";
    }
}
