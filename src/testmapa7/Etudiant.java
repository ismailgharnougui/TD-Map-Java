/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmapa7;

/**
 *
 * @author sanabenfadhel
 */
public class Etudiant implements Comparable<Etudiant>{
    private int id;
    private String nom;

    public Etudiant() {
    }

    public Etudiant(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + '}';
    }

    @Override
    public int hashCode() {
        return id; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etudiant other = (Etudiant) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Etudiant o) {
        
        return this.id-o.id;
    }
    
    
}
