/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreprise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cgay
 */
public class Membre {

    private HashSet<Employe> lesEmployes;

    public Membre() {
        lesEmployes = new HashSet<>();
    }

    public void ajouter(Employe g) {
        lesEmployes.add(g);
    }

    public void ajouterFichier() {
        Scanner scan = null;
        try {
            scan = new Scanner(new File("D:/Colin/doc perso/2A/ListeEmploye"));
            scan.useDelimiter("\r\n");
            while(scan.hasNext())
            {
                String line = scan.next();
                String[] values = line.split(" ");
                int indice = Integer.valueOf(values[3]);
                String classe = values[4];
                if (values[4].equals("commercial")){
                    int indice2 = Integer.valueOf(values[5]);
                    Employe a = new Commercial(values[0], values[1], values[2], indice, indice2);
                    lesEmployes.add(a);
                }
                if (values[4].equals("responsable")){
                    Employe a = new Responsable(values[0], values[1], values[2], indice);
                    lesEmployes.add(a);
                }
                if (values[4].equals("employeDeBase")){
                    Employe a = new EmployeDeBase(values[0], values[1], values[2], indice);
                    lesEmployes.add(a);
                }
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Membre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @Override
    public String toString() {
        return "Membre de l'entreprise =" + lesEmployes + "/n" + '}';
    }
}
