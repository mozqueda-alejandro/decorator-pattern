import trees.*;

public class TreeFactory {
    public static Tree getTree(String treeType) {
        treeType = treeType.replaceAll("\\s+","").toLowerCase();
        return switch (treeType) {
            case "balsamfir" -> new BalsamFir();
            case "coloradobluespruce" -> new ColoradoBlueSpruce();
            case "douglasfir" -> new DouglasFir();
            case "fraserfir" -> new FraserFir();
            default -> throw new IllegalArgumentException("Invalid tree type: " + treeType);
        };
    }
}
