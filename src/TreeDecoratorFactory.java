import decorators.*;
import trees.Tree;

public class TreeDecoratorFactory {
    public static Tree getTreeDecorator(String decoratorName, Tree tree) {
        return switch (decoratorName) {
            case "BallsBlue" -> new BallsBlue(tree);
            case "BallsRed" -> new BallsRed(tree);
            case "BallsSilver" -> new BallsSilver(tree);
            case "Ribbons" -> new Ribbons(tree);
            case "Ruffles" -> new Ruffles(tree);
            case "Star" -> {
                if (tree.hasStar) {
                    System.out.println("Tree already has a star");
                    yield tree;
                }
                tree = new Star(tree);
                yield tree;
            }
            case "Lights" -> new Lights(tree);
            case "LEDs" -> new LEDs(tree);
            default -> null;
        };
    }
}
