public abstract class Game {

    abstract void startPlay();
    abstract void endPlay();



    //template method
    public final void play(){

        //start game
        startPlay();

        //end game
        endPlay();
    }
}