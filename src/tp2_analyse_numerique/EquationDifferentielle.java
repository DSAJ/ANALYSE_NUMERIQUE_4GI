package tp2_analyse_numerique;

import java.util.ArrayList;

public interface EquationDifferentielle {
    public ArrayList<Double> getU();
    public void init(Mailleur mailleur, double a, double b, double c, double U0, double Un);
}
