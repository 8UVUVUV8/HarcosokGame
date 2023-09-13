import java.util.ArrayList;
import java.util.HashMap;

public class TheWinner {
    public static void theStrongest(HashMap<String, int[]> fightersWhitPower,int index){

        ArrayList<String> onlyFightersNames = new ArrayList<String>();

        //System.out.println("the winner method souts");

        for (String i : fightersWhitPower.keySet()) {
            onlyFightersNames.add(i);
            //System.out.println(i);
          }

        System.out.println("A leggerösebb: "+onlyFightersNames.get(index));
    }
}
