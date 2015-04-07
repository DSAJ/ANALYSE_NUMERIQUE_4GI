package provider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;
import tp1_analyse_numerique.MatriceInt;

 public class Provider {
    String filename;

    public Provider(String filename) {
        this.filename = filename;
    }
    
    public boolean fichierVide(){
        return loadFile().size() == 0;
    }
    public int getligne(){
        if(!fichierVide()){
            if(getTypeFile().equals("tab")){
                return loadFile().size();
            }else{
                return Integer.parseInt(loadFile().get(0).split("-")[0]);
            }
        }else{
            return -1;
        }
    }
    public int getColonne(){
        if(!fichierVide()){
            if(getTypeFile().equals("tab")){
                return loadFile().get(0).split(" ").length;
            }else{
                return Integer.parseInt(loadFile().get(0).split("-")[1]);
            }
        }else{
            return -1;
        }
    }
    
    public String getTypeFile(){
        int debut = this.filename.lastIndexOf(".") + 1;
        int fin = this.filename.length();
        String m = this.filename.substring(debut,fin);
        if(m.equals("coord")){
            return "coord";
        }
        else{
            if(m.equals("tab")){
                return "tab";
            }
            else{
                return null;
            }
        }
    }
    
    public Vector<String> loadFile(){
        Vector<String> tab = new Vector<>();
        try {            
            String ligne;
            BufferedReader fichier = new BufferedReader(new FileReader(this.filename));
            while ((ligne = fichier.readLine()) != null) {
                tab.add(ligne);
            }
            fichier.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
            return tab;
    }


    
}
