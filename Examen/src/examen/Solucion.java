package examen;

/**
 *
 * @author Fernando Peña
 */
public class Solucion {
    public boolean problema(String s){
        String r, sub;
        boolean band = false;
        
        for (int i = 0; i < s.length(); i++){
            for (int j = i + 1; j <= s.length(); j++){
                r = s;
                sub = s.substring(i, j);
                
                if(sub.equals(s))
                    continue;
                
                while(!r.equals("")){
                    if(!r.startsWith(sub))
                        band = false;
                    r = r.substring(sub.length() - 1, s.length() - 1);
                    System.out.println(r.length());
                }
                if(band)
                    return true;
                //System.out.println(s.substring(i, j)); 
           }
        }
        return false;
    }
            
}
