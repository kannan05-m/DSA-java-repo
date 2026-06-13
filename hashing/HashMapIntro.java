import java.util.*;
public class HashMapIntro {
    public static void main(String args []){
        HashMap<String , Integer > hm = new HashMap<>();
        hm.put("india" , 100);
        hm.put("china" , 150);
        hm.put("australia" , 15);
        hm.put("bhutan", 6);
        hm.put("USA" , 10);

        //Iterate 
        Set <String> keys = hm.keySet(); 
        System.out.println(keys); //will print collection of all  the keys from hashmap 

        //to run loop  - forEach loop 
        for(String k : keys ){
            System.out.println("keys : " + k + "value : " + hm.get(k) );
        }




    }

    
}
