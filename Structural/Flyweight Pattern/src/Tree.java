public class Tree implements ParticleRender{
    private int x;
    private int y;
    private String treeType;

    Tree(String treeType){
        this.treeType=treeType;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void render() {

        System.out.println("TreeType : " + treeType + ", x : " + x + ", y :" + y );
    }
}
