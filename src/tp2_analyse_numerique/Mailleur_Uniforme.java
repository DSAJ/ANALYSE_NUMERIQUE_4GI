package tp2_analyse_numerique;

import java.util.ArrayList;

public class Mailleur_Uniforme extends Abs_Mailleur{

    @Override
    public boolean isUniform() {
        return true;
    }

    public Mailleur_Uniforme() {
    }

    @Override
    public ArrayList<Double> getPointList() {
        ArrayList<Double> listePoint = new ArrayList<>();
        for (int i = 0; i < getN(); i++) {
            Double val = (i*1.0/(taille-1));
            listePoint.add(i, val);
        }
        return listePoint;
    }

    @Override
    public ArrayList<Double> getIntervalList() {
        ArrayList<Double> listeInterval = new ArrayList<>();
        for (int i = 0; i < getN()-1; i++) {
            Double val = (1.0/(taille-1));
            listeInterval.add(i, val);
        }
        return listeInterval;
    }
    
    @Override
    public ArrayList<Double> getFList(){
        return fonction.getList(this.getPointList());
    }
    
}
