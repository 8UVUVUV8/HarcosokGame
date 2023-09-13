import java.util.ArrayList;
import java.util.HashMap;

public class CreatFighter {

    public static void creatFighter(ArrayList<String> names){

        HashMap<String, int[]> fightersWhitPower = new HashMap<String, int[]>();

        for (int i = 0; i < names.size(); i++) {
            int[] levels = {0,0,0};
            for (int j = 0; j < 3; j++) {
                levels[j] = GivePower.getPowerLevel();
            }
            fightersWhitPower.put(names.get(i), levels);
        }
        for (String i : fightersWhitPower.keySet()) {
            System.out.println("Name: "+i+"--> Erö:"+fightersWhitPower.get(i)[0]+" Sebeség:"+fightersWhitPower.get(i)[1]+" Védelem:"+fightersWhitPower.get(i)[2]);
        }

        Fight.doTheFight(fightersWhitPower);
    }
    //folyt köv HashMap
    
}
