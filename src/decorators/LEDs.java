package decorators;

import trees.Tree;
import utils.DefaultDict;
import static utils.UI.joinStrings;

public class LEDs extends TreeDecorator {
    public LEDs(Tree tree) {
        super(tree);
    }

    @Override
    public String getDescription() {
        return joinStrings(tree.getDescription(), toString());
    }

    @Override
    public double getCost() {
        return 2 + tree.getCost();
    }

    @Override
    public String toString() {
        return "LEDs";
    }

    //    @Override
    public DefaultDict<String> getDecorationFrequencies() {
        DefaultDict<String> decorations = tree.getDecorationFrequencies();
        decorations.add(toString());
        return decorations;
    }
}
