/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreprise;

/**
 *
 * @author cgay
 */
public class EmployeDeBase extends Employe {
    
    public EmployeDeBase(String nom, String prenom, String matricule, int indiceSalarial) {
        super(nom, prenom, matricule, indiceSalarial);
    }
    
    public void CalculerSalaire(){
        Salaire = indiceSalarial * 12;
    }
}