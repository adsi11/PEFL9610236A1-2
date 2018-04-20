package examen;

/**
 *
 * @author Fernando Peña
 */
public class Solucion {
    public boolean problema(String s){
        String r, sub;
        boolean band = true;
        
        for (int i = 0; i < s.length(); i++){
            for (int j = i + 1; j <= s.length(); j++){
                r = s;
                sub = s.substring(i, j);
                
                if(sub.equals(s))
                    continue;
                
                while(!r.equals("")){
                    if(!r.startsWith(sub)){
                        band = false;
                        break;
                    }
                    r = r.substring(sub.length(), s.length() - 1);
                }
                
                if(r.equals(""))
                    return true;
                //System.out.println(s.substring(i, j)); 
           }
        }
        return false;
    }
            
}
