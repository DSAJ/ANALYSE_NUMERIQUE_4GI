package tp1_analyse_numerique;

public abstract  class  MatriceAbs implements MatriceInt{    
    int nombreLigne;
    int nombreColonne;
    
    @Override
    public double trace() {
        double trace = 0;
        if( getNombreColone() == getNombreLigne()){
            for (int i = 0; i < getNombreLigne(); i++) {
                trace += get(i, i);
            }
        }else{
            throw new ArrayStoreException("La matricle n'est pas carré.");
        }
        return trace;
    }

    @Override
    public double determinant() {
        throw new UnsupportedOperationException("Pas encore implementé."); 
    }

    @Override
    public MatriceInt inverse() {
        throw new UnsupportedOperationException("Pas encore implementé."); 
    }

    @Override
    public MatriceInt somme(MatriceInt matrice) {
        throw new UnsupportedOperationException("Pas encore implementé."); 
    }

    @Override
    public MatriceInt produit(MatriceInt matrice) {
        throw new UnsupportedOperationException("Pas encore implementé."); 
    }

    @Override
    public MatriceInt produit(double scalaire) {
        throw new UnsupportedOperationException("Pas encore implementé."); 
    }
    
}
