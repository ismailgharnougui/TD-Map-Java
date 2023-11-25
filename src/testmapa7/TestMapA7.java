/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmapa7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author sanabenfadhel
 */
public class TestMapA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap hash = new HashMap();
        hash.put("test", 3);
        hash.put(5, "3A7");
        hash.put("test", 5.3);
        hash.put(5, "3A5");

        System.out.println(hash);
        System.out.println(hash.size());

        HashMap<Etudiant, String> hase = new HashMap<>();
        Etudiant et1 = new Etudiant(1, "sana");

        Etudiant et2 = new Etudiant(2, "dorra");

        Etudiant et3 = new Etudiant(3, "wiem");
        Etudiant et4 = new Etudiant(3, "wiem");

        hase.put(et1, "3A5");
        hase.put(et2, "3A2");
        hase.put(et4, "3A3");
        hase.put(et3, "3A7");
        hase.put(et1, "3A1");

        System.out.println(hase);
        System.out.println(hase.size());
        System.out.println(et3.hashCode());

        System.out.println(et4.hashCode());

        System.out.println(hase.containsKey(et4));

        System.out.println(hase.containsValue("3A5"));

        System.out.println(hase.remove(et3));

        System.out.println(hase.remove(new Etudiant(4, "nom")));

        System.out.println(hase);
        String va=hase  .get(et2);

        System.out.println(hase.get(et2));

        //parcours des clés
        Set<Etudiant> set = hase.keySet();

        for (Etudiant et : hase.keySet()) {
            System.out.println(et);
        }
        //parcours les valeurs
        Collection<String> ensem = hase.values();

        for (String val : hase.values()) {
            System.out.println(val);
        }
        //parcours clé/valeur avec deux méthodes
        for (Etudiant et : hase.keySet()) {
            String valeur = hase.get(et);
            System.out.println(et + " vale=" + valeur);
        }

        for (Map.Entry<Etudiant, String> mpe : hase.entrySet()) {
            Etudiant et = mpe.getKey();
            String str = mpe.getValue();
        }

        TreeMap<Integer,String> trein=new TreeMap();
        
        trein.put(5,"test");
        trein.put(8, "test12");
        
        trein.put(7,"test1");
        trein.put(5,"test3");
        
        System.out.println(trein);
        
        
        TreeMap<Etudiant,String> tree=new TreeMap();
        tree.put(et4, "rr");
        tree.putAll(hase);
        
        System.out.println(tree);
        
        
    }

}
