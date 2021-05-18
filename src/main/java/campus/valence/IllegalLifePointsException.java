package campus.valence;

//---------------------------------------------------------------------------------------------

public class IllegalLifePointsException extends Exception{


    private int life;


    public IllegalLifePointsException(int life) throws IllegalLifePointsException{
        super("100 life points is too much!");
        this.life = life;

    }


//---------------------------------------------END------------------------------------------------
}
