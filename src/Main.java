import java.util.List;
import trees.*;
import static java.lang.Integer.parseInt;
import static utils.UI.*;

public class Main {
    static List<String> mainMenu = List.of("Try homework example","Try Fully Decorated Tree","New Tree");
    static List<String> treeTypes = List.of("Balsam Fir", "Colorado Blue Spruce", "Douglas Fir", "Fraser Fir");
    static List<String> treeDecorations = List.of("Balls Blue", "Balls Red", "Balls Silver", "LEDs", "Lights", "Ribbons", "Ruffles", "Star");

    public static void main(String[] args) {
        printBoxedHeader("Christmas Tree Decorator");
        while (true) {
            printMenu(mainMenu, true);
            input = sc.nextLine();
            selection = inRange(input, 0, mainMenu.size());
            switch (selection) {
                case 0 -> System.exit(0);
                case 1 -> testHomeworkTree();
                case 2 -> testFullyDecoratedTree();
                case 3 -> createTree();
            }
        }
    }

    private static void createTree() {
        // Select a Christmas tree (e.g. Balsam Fir) and return it from factory
        do {
            System.out.println();
            printMenu("Select a tree type:", treeTypes);
            input = sc.nextLine();
            selection = inRange(input, 1, treeTypes.size());
        } while (selection == -1);
        String treeType = treeTypes.get(selection - 1);
        Tree tree = TreeFactory.getTree(treeType);

        // Select decorations to decorate the new tree
        while (true) {
            System.out.println();
            printMenu("Select a decoration:", treeDecorations, true);
            input = sc.nextLine();
            selection = inRange(input, 0, treeDecorations.size());
            if (selection == -1) continue; // Invalid selection
            if (selection == 0) break;

            selection = parseInt(input);
            String treeDecoration = treeDecorations.get(selection - 1);
            tree = TreeDecoratorFactory.getTreeDecorator(treeDecoration, tree);
        }

        System.out.println("Decorations: ");
        assert tree != null;
        System.out.println(tree.getDecorationFrequencies());
        System.out.println("Description: " + tree.getDescription());
        System.out.println("Total cost: $" + tree.getCost());
    }

    private static void testHomeworkTree() {
        Tree tree = TreeFactory.getTree("Colorado Blue Spruce");
        tree = TreeDecoratorFactory.getTreeDecorator("Star", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Ruffles", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Star", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Ruffles", tree);
        System.out.println(tree.getDescription());
        System.out.println(tree.getCost());
        System.out.println(tree.getDecorationFrequencies());
        System.out.println("Press enter to continue");
        sc.nextLine();
    }

    // Uses all decorations at least once
    // Uses Star decoration 3 times
    private static void testFullyDecoratedTree() {
        Tree tree = TreeFactory.getTree("Fraser Fir");
        tree = TreeDecoratorFactory.getTreeDecorator("Balls Blue", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Balls Blue", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Balls Red", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Balls Red", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Balls Silver", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Balls Silver", tree);

        tree = TreeDecoratorFactory.getTreeDecorator("Star", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Star", tree);

        tree = TreeDecoratorFactory.getTreeDecorator("LEDs", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("LEDs", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Lights", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Lights", tree);

        tree = TreeDecoratorFactory.getTreeDecorator("Ribbons", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Ruffles", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Star", tree);
        System.out.println(tree.getDescription());
        System.out.println(tree.getCost());
        System.out.println(tree.getDecorationFrequencies());
        System.out.println("\nPress enter to continue");
        sc.nextLine();
    }
}