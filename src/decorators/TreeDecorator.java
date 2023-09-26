package decorators;

import trees.Tree;
import utils.DefaultDict;


public abstract class TreeDecorator extends Tree {
    public Tree tree;

    public TreeDecorator() { }

    public TreeDecorator(Tree tree) {
        hasStar = tree.hasStar;
        this.tree = tree;
    }

    public abstract String getDescription();
    public abstract DefaultDict<String> getDecorationFrequencies();
}
