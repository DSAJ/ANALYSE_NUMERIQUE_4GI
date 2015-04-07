package tp2_analyse_numerique;

import Fonctions.IFonction;
import java.util.ArrayList;

public abstract class Abs_Mailleur implements Mailleur{
    public IFonction fonction;
    public int taille;
    
    @Override
    public int getN() {
        return taille;
    }

    @Override
    public void setN(int n) {
        this.taille = n;
    }
    
    @Override
    public void setFonction(IFonction g){
        this.fonction = g;
    }
}
