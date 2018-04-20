package examen;

/**
 *
 * @author Fernando Peña
 */
public class Solucion {
    public boolean problema(String s){
        String r;
        boolean band = false;
        
        for (int i = 0; i < s.length(); i++){
            for (int j = i + 1; j <= s.length(); j++){
                r = s;
                if(s.substring(i, j).equals(s))
                    continue;
                while(!r.equals("")){
                    if(!r.startsWith(s.substring(i, j)))
                        band = false;
                    r = r.substring(j - 1, s.length() - 1);
                }
                if(band)
                    return true;
                //System.out.println(s.substring(i, j)); 
           }
        }
        return false;
    }
            
}
