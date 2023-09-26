import java.util.List;
import trees.*;
import static java.lang.Integer.parseInt;
import static utils.UI.*;

public class Main {
    public static void main(String[] args) {
        printBoxedHeader("Christmas Tree Decorator");
        List<String> mainMenu = List.of("Print example transaction","New Tree");
        List<String> treeTypes = List.of("Balsam Fir", "Colorado Blue Spruce", "Douglas Fir", "Fraser Fir");
        List<String> treeDecorations = List.of("Balls Blue", "Balls Red", "Balls Silver", "LEDs", "Lights", "Ribbons", "Ruffles", "Star");

        do {
            String input;
            printMenu(mainMenu, true);
            input = sc.nextLine();
            if (input.equals("0")) break;
            if (!inRange(input, 1, 2)) continue;

            if (input.equals("1")) {
                testTree();
                sc.nextLine();
                continue;
            }

            do {
                printMenu("Select a tree type:", treeTypes);
                input = sc.nextLine();
            } while (!inRange(input, 1, treeTypes.size()));

            int selection = parseInt(input);
            String treeType = treeTypes.get(selection - 1);
            Tree tree = TreeFactory.getTree(treeType);

            while (true) {
//                System.out.println("\n");
                printMenu("Select a decoration:", treeDecorations, true);
                input = sc.nextLine();
                if (input.equals("0")) break;
                if (!inRange(input, 1, treeDecorations.size())) continue;

                selection = parseInt(input);
                String treeDecoration = treeDecorations.get(selection - 1);
                tree = TreeDecoratorFactory.getTreeDecorator(treeDecoration, tree);
            }

            System.out.println("Decorations: ");
            assert tree != null;
            System.out.println(tree.getDecorationFrequencies());
            System.out.println("Description: " + tree.getDescription());
            System.out.println("Total cost: $" + tree.getCost());
        } while (true);
    }

    private static void testTree() {
        Tree tree = TreeFactory.getTree("Balsam Fir");
        tree = TreeDecoratorFactory.getTreeDecorator("Balls Blue", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Balls Red", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Balls Silver", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("LEDs", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Lights", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Ribbons", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Ruffles", tree);
        tree = TreeDecoratorFactory.getTreeDecorator("Star", tree);
        System.out.println(tree.getDescription());
        System.out.println(tree.getCost());
        System.out.println(tree.getDecorationFrequencies());
    }
}