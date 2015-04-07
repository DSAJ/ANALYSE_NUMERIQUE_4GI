package provider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

public class provider_eqau_dif_dyna {
    private static final String FICHIER_PROPERTIES       = "param.properties";
            
    public Hashtable getParam(){
        Hashtable param = new Hashtable();
        Properties properties = new Properties();
	InputStream fichierProperties = null;
        
        try {
            fichierProperties = new FileInputStream(FICHIER_PROPERTIES);
            properties.load(fichierProperties);
            Enumeration<?> e = properties.propertyNames();
            
            while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			String value = properties.getProperty(key);
			System.out.println(key + " " + value);
                        param.put(key, value);
		}
            
            
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
        provider_eqau_dif_dyna provider = new provider_eqau_dif_dyna();
        Hashtable param = provider.getParam();
        Enumeration e = param.elements();
        while(e.hasMoreElements()){
           System.out.println(e.nextElement());
        }
        
        
    }
    
}
