package provider;

import java.util.Vector;
import tp1_analyse_numerique.MatriceInt;

public interface IProvider {
    
    String getTypeFile();
    Vector<String> loadFile();
    int getligne();
    int getColonne();
}
