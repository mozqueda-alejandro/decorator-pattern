package decorators;

import trees.Tree;
import utils.DefaultDict;
import static utils.UI.joinStrings;

public class Ruffles extends TreeDecorator {
    public Ruffles(Tree tree) {
        super(tree);
    }

    @Override
    public String getDescription() {
        return joinStrings(tree.getDescription(), toString());
    }

    @Override
    public double getCost() {
        return tree.getCost() + 1;
    }

    @Override
    public String toString() {
        return "Ruffles";
    }

    //    @Override
    public DefaultDict<String> getDecorationFrequencies() {
        DefaultDict<String> decorations = tree.getDecorationFrequencies();
        decorations.add(toString());
        return decorations;
    }
}
