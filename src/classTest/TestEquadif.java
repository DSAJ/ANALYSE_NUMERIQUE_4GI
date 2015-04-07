package classTest;
import Fonctions.IFonction;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import provider.provider_eqau_dif_dyna;
import tp2_analyse_numerique.EquationDifferentielle;
import tp2_analyse_numerique.Mailleur;

public class TestEquadif {
    public static void main(String[] args){
        provider_eqau_dif_dyna provider = new provider_eqau_dif_dyna();
        Hashtable param = provider.getParam();
        String[] p = param.get("paramfonction").toString().split("-");
        ArrayList<Double> paramFonction  = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            paramFonction.add(Double.parseDouble(p[i]));
        }
        try {
            try {
                Mailleur mailleur = (Mailleur)Class.forName((String)param.get("typeMailleur")).newInstance();
                mailleur.setN((int)param.get("n"));
                IFonction fonction = (IFonction)Class.forName((String)param.get("typefonction")).newInstance();                
                fonction.init(paramFonction);
                mailleur.setFonction(fonction);
                EquationDifferentielle equadif = (EquationDifferentielle)Class.forName((String)param.get("methode")).newInstance();                
                equadif.init(mailleur, Double.parseDouble((String) param.get("a")), Double.parseDouble((String) param.get("b")), Double.parseDouble((String) param.get("c")), Double.parseDouble((String) param.get("U0")), Double.parseDouble((String) param.get("Un")));
                ArrayList<Double> result = equadif.getU();
                System.out.println(result.get(1));
                
                
            } catch (InstantiationException ex) {
                Logger.getLogger(TestEquadif.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(TestEquadif.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestEquadif.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}


