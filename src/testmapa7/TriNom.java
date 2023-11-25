/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmapa7;

import java.util.Comparator;

/**
 *
 * @author sanabenfadhel
 */
public class TriNom implements Comparator<Etudiant>{

    @Override
    public int compare(Etudiant o1, Etudiant o2) {
        
        return o1.getNom().compareTo(o2.getNom());
    }
    
}
