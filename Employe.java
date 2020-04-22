/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreprise;

import java.util.Objects;
/**
 *
 * @author cgay
 */
public abstract class Employe implements Payable {
   protected String nom;
    protected String prenom;
    protected String matricule;
    protected int indiceSalarial;
    protected int Salaire;

    public Employe(String nom, String prenom, String matricule, int indiceSalarial) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
    }

   @Override
    public String toString() {
        return "Employés {" + "Nom : " + nom + ", Prénom : " + prenom + ", Matricule : " + matricule + "}";

    }
    
    public abstract void CalculerSalaire();
    

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setIndiceSalarial(int indiceSalarial) {
        this.indiceSalarial = indiceSalarial;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
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
        final Employe other = (Employe) obj;
        if (this.indiceSalarial != other.indiceSalarial) {
            return false;
        }
        if (this.Salaire != other.Salaire) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.matricule, other.matricule)) {
            return false;
        }
        return true;
    }
    
    
    

}


