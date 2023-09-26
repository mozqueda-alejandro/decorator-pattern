package trees;

import utils.DefaultDict;

public abstract class Tree {
    String description = "Unknown Tree";
    public DefaultDict<String> decorationFrequencies;
    public boolean hasStar;

    public void initTree(String description) {
        hasStar = false;
        this.description = description;
        decorationFrequencies = new DefaultDict<String>(description);
    }

    public String getDescription() {
        return description + " tree decorated with ";
    }

    public DefaultDict<String> getDecorationFrequencies() {
        return decorationFrequencies;
    }

    public abstract double getCost();
    public abstract String toString();
}
