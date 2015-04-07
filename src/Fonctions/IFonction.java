package Fonctions;

import java.util.ArrayList;

public interface IFonction {    
    ArrayList<Double> getList(ArrayList a);
    //evaluer a n'inporte quel pt
    Double value(Double a);
    void init(ArrayList<Double> a);
}
