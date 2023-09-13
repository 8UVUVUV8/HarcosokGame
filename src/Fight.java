import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Fight {
    public static void doTheFight(HashMap<String, int[]> fightersWhitPower){

        ArrayList<Integer> wholePower = new ArrayList<Integer>();

        for (int[] i : fightersWhitPower.values()) {
            
            Integer addedPowerLevels = i[0]+i[1]+i[2];
            wholePower.add(addedPowerLevels);
          }

          Integer strongest = Collections.max(wholePower);

        for (int i = 0; i < fightersWhitPower.size(); i++) {
            //System.out.println(i+"  "+wholePower.get(i));
            if(wholePower.get(i)==strongest){
                //System.out.println("ö a leg erösebb"+wholePower.get(i)+"index: "+i);
                TheWinner.theStrongest(fightersWhitPower,i);
            }
            
        
        }

        
    }
}
