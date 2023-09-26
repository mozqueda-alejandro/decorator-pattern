package decorators;

import trees.Tree;
import utils.DefaultDict;
import static utils.UI.joinStrings;

public class BallsBlue extends TreeDecorator {
    public BallsBlue(Tree tree) {
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
        return "BallsBlue";
    }

    //    @Override
    public DefaultDict<String> getDecorationFrequencies() {
        DefaultDict<String> decorations = tree.getDecorationFrequencies();
        decorations.add("BallsBlue");
        return decorations;
    }
}
