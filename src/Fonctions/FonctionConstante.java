package Fonctions;

import java.util.ArrayList;

public class FonctionConstante extends AbsFonction{
    
    private Double valeur;

    public Double getValeur() {
        return valeur;
    }

    public void setValeur(Double valeur) {
        this.valeur = valeur;
    }

    public FonctionConstante(Double valeur) {
        this.valeur = valeur;
    }
    public FonctionConstante() {
        this.valeur = 0.0;
    }
    

    @Override
    public ArrayList<Double> getList(ArrayList a) {
        ArrayList<Double> fval= new ArrayList<>();
        for(int i=0; i<a.size();i++)
        {
            fval.add(i, valeur);
        }
        return fval;
    }
    
    public Double value(Double a){
        return getValeur();
    }
    public void init(ArrayList<Double> a){
        this.valeur = a.get(0);
    }

}
