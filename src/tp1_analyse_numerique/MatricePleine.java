package tp1_analyse_numerique;

import java.util.Vector;

public class MatricePleine extends MatriceAbs{
    private double[][] matrice;
    
    public MatricePleine(){
        
    }

    @Override
    public void init(Vector<String> loadFile, int ligne, int colonne){
        matrice = new double[ligne][colonne];
        String[] elt;
        for (int i = 0; i < ligne; i++) {
            elt = loadFile.get(i).split(" ");
            for (int j = 0; j < colonne; j++) {
                matrice[i][j] = Double.parseDouble(elt[j]);
            }
        }
    }
    
    @Override
    public double get(int i, int j) {
        throw new UnsupportedOperationException("Pas encore implementé."); 
    }

    @Override
    public void set(int i, int j, double a) {
        if((i >= getNombreLigne()) || (j >= getNombreColone())){
            
        }
    }

    @Override
    public int getNombreLigne() {
        return nombreLigne;
    }

    @Override
    public int getNombreColone() {
        return nombreColonne;
    }

    


    
}
