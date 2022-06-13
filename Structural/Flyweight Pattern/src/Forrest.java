public class Forrest {
    private static final String treeTypes[] = { "Oak", "Coconut", "Sakura", "Apple", "Blueberry" };

    private static String getRandomTreeType() {
        return treeTypes[(int)(Math.random()*treeTypes.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }


    public static void main(String[] args) {

        for (int i=0;i<20;i++){

            Tree tree = (Tree) TreeFactory.getTree(Forrest.getRandomTreeType());
            tree.setX(getRandomX());
            tree.setY(getRandomY());
            tree.render();
        }




    }
}
