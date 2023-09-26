package decorators;

import trees.Tree;
import utils.DefaultDict;
import static utils.UI.joinStrings;

public class Ribbons extends TreeDecorator {
    public Ribbons(Tree tree) {
        super(tree);
    }

    @Override
    public String getDescription() {
        return joinStrings(tree.getDescription(), toString());
    }

    @Override
    public double getCost() {
        return tree.getCost() + 2;
    }

    @Override
    public String toString() {
        return "Ribbons";
    }

    //    @Override
    public DefaultDict<String> getDecorationFrequencies() {
        DefaultDict<String> decorations = tree.getDecorationFrequencies();
        decorations.add(toString());
        return decorations;
    }
}
