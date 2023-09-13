import java.lang.Math;

public class GivePower {
    
    private static int powerLevel(){
        int pLevel;
        pLevel=(int) Math.round(Math.random()*100);
        return pLevel;
    }

    public static int getPowerLevel(){
        return powerLevel();
    }
}
