package decorators;

import trees.Tree;
import utils.DefaultDict;
import static utils.UI.joinStrings;

public class Star extends TreeDecorator {
    public Star(Tree tree) {
        this.tree = tree;
        hasStar = true;
    }

    @Override
    public String getDescription() {
        if (tree.hasStar) {
            System.out.println("Tree already has a star");
            return tree.getDescription();
        }
        return joinStrings(tree.getDescription(), toString());
    }

    @Override
    public double getCost() {
        if (tree.hasStar) {
            return tree.getCost();
        }
        return tree.getCost() + 4;
    }

    @Override
    public String toString() {
        return "Star";
    }

//    @Override
    public DefaultDict<String> getDecorationFrequencies() {
        DefaultDict<String> decorations = tree.getDecorationFrequencies();
        decorations.add(toString());
        return decorations;
    }
}
