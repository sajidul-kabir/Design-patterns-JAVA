import java.util.HashMap;

public class TreeFactory {
    private static final HashMap treeMap = new HashMap();

    public static ParticleRender getTree(String treeType){
        Tree tree = (Tree) treeMap.get(treeType);
        if(tree==null){
             tree=new Tree(treeType);
             treeMap.put(treeType,tree);
            System.out.println("Creating New Type of Tree of "+treeType);
        }

        return tree;
    }
}
