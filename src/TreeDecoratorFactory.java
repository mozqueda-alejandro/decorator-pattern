import decorators.*;
import trees.Tree;

public class TreeDecoratorFactory {
    public static Tree getTreeDecorator(String decoratorName, Tree tree) {
        decoratorName = decoratorName.replaceAll("\\s+", "").toLowerCase();
        return switch (decoratorName) {
            case "ballsblue" -> new BallsBlue(tree);
            case "ballsred" -> new BallsRed(tree);
            case "ballssilver" -> new BallsSilver(tree);
            case "ribbons" -> new Ribbons(tree);
            case "ruffles" -> new Ruffles(tree);
            case "star" -> {
                if (tree.hasStar) {
                    System.out.println("Tree already has a star");
                    yield tree;
                }
                yield new Star(tree);
            }
            case "lights" -> new Lights(tree);
            case "leds" -> new LEDs(tree);
            default -> throw new IllegalArgumentException("Invalid decorator name: " + decoratorName);
        };
    }
}
