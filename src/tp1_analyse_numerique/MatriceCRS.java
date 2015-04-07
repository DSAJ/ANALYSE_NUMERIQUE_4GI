package tp1_analyse_numerique;

import java.util.Vector;

public class MatriceCRS extends MatriceAbs{
    private double[] val;
    private double[] col_ind;
    private double[] row_ptr;
    
    @Override
    public void init(Vector<String> loadFile, int ligne, int colonne){
        
    }
   
    @Override
    public double get(int i, int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void set(int i, int j, double a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNombreLigne() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNombreColone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
