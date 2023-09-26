import trees.*;
import decorators.*;

public class TreeFactory {
    public static Tree getTree(String treeType) {
        treeType = treeType.replaceAll("\\s+","");
        if (treeType.equalsIgnoreCase("BALSAMFIR")) {
            return new BalsamFir();
        } else if (treeType.equalsIgnoreCase("DOUGLASFIR")) {
            return new DouglasFir();
        } else if (treeType.equalsIgnoreCase("FRASERFIR")) {
            return new FraserFir();
        } else if (treeType.equalsIgnoreCase("COLORADOBLUESPRUCE")) {
            return new ColoradoBlueSpruce();
        } else {
            return null;
        }
    }
}
