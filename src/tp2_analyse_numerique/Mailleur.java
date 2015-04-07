package tp2_analyse_numerique;

import Fonctions.IFonction;
import java.util.ArrayList;

public interface Mailleur {
    public int getN();
    public void setN(int n);
    public boolean isUniform();
    public ArrayList<Double> getPointList();
    public ArrayList<Double> getIntervalList();
    public ArrayList<Double> getFList(); //f(xi)
    public void setFonction(IFonction f);
}
