package classTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import provider.Provider;

import tp1_analyse_numerique.MatriceInt;
public class TestMatrice {
    public static void main(String[] args) {

        try {
            MatriceInt mc = (MatriceInt)Class.forName(args[0]).newInstance();
            Provider resultatProvider = new Provider(args[1]);
            
            if(resultatProvider.getligne() != -1 && resultatProvider.getColonne() != -1){
                mc.init(resultatProvider.loadFile(),  resultatProvider.getligne(), resultatProvider.getColonne());
            }else{
                //code du log
            }
            
            try {
                String fileName = "data.tab";
                String ligne;
                
                BufferedReader lect = new BufferedReader(new FileReader(fileName));
		while (lect.ready() == true) {
                     ligne = lect.readLine();
			
			}
            } catch (NullPointerException a) {
			System.out.println("Erreur : pointeur null");
            } catch (IOException a) {
			System.out.println("Problème d'IO");
            }
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestMatrice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TestMatrice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TestMatrice.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    }
    
    public static double valeurAbsolue(double nbre){
        if(nbre < 0) return -nbre;
        else return nbre;
    }
}
