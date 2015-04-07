package tp1_analyse_numerique;

import java.util.Vector;

public interface MatriceInt {
    static double epsilon  = 0.000001;
    double get(int i, int j);
    void set(int i, int j, double a);
    int getNombreLigne();
    int getNombreColone();
    double trace();
    double determinant();
    MatriceInt inverse();
    MatriceInt somme(MatriceInt matrice);
    MatriceInt produit(MatriceInt matrice);
    MatriceInt produit(double scalaire);
    public void init(Vector<String> loadFile, int ligne, int colonne);
    //init(n, m, nom_nul_zero);
    //void getNomZero(Vector row, Vector col, Vector val); code qui peut etre inserer dans IProvider
    // il est preferable d'utiliser les listes car ils sont au sommet de l'interface
    
}
