package provider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Properties;

public class provider_eqau_dif {
    private static final String FICHIER_PROPERTIES       = "param.properties";
    private static final String TYPE_MAILLEUR = "typeMailleur";
    private static final String N = "n";
    private static final String A = "a";
    private static final String B = "b";
    private static final String C = "c";
    private static final String METHODE = "methode";
    private static final String FONCTION = "fonction";
    private static final String U = "u";
    private static final String U0 = "u0";
    private static final String ERREUR = "erreur"; 
            
    public Hashtable getParam(){
        Hashtable param = new Hashtable();
            String typeMailleur;
            String n;
            String a;
            String b;
            String c;
            String methode;
            String fonction;
            String u;
            String  u0;
            String erreur; 
        
        Properties properties = new Properties();
	InputStream fichierProperties = null;
        
        try {
            fichierProperties = new FileInputStream(FICHIER_PROPERTIES);
            properties.load(fichierProperties);
            typeMailleur = properties.getProperty( TYPE_MAILLEUR );
            param.put(TYPE_MAILLEUR, typeMailleur);
            n = properties.getProperty( N );
            param.put(N, n);
            a = properties.getProperty( A );
            param.put(A, a);
            b = properties.getProperty( B );
            param.put(B, b);
            c = properties.getProperty( C );
            param.put(C, c);
            methode = properties.getProperty( METHODE );
            param.put(METHODE, methode);
            fonction = properties.getProperty( FONCTION );
            param.put(FONCTION, fonction);
            u = properties.getProperty( U );
            param.put(U, u);
            u0 = properties.getProperty( U0 );
            param.put(U0, u0);
            erreur = properties.getProperty( ERREUR );
            param.put(ERREUR, erreur);
            
        } catch (Exception e) {
        } finally {
		if (fichierProperties != null) {
			try {
				fichierProperties.close();
			} catch (IOException e) {
			}
		}
        }
        return param;
    }
    public static void main(String[] args) {
        provider_eqau_dif provider = new provider_eqau_dif();
        Hashtable param = provider.getParam();
        System.out.println(param.get(TYPE_MAILLEUR));
        
    }
    
}
