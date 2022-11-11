/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setprosit;

import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Trunks
 */
public class EspritHashSet implements GestionEnseignant {

    Set<Enseignant> hashSetEtudiant;

    public EspritHashSet() {
        this.hashSetEtudiant = new HashSet<Enseignant>();
    }

    @Override
    public void ajouterEnseignant(Enseignant e) {
        hashSetEtudiant.add(e);

    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return hashSetEtudiant.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
          for (Enseignant e : hashSetEtudiant) {
            if (e.getId() == id) {
                return true;
            }
        }
          return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        hashSetEtudiant.remove(e);
    }

    @Override
    public void displayEnseignants() {
        System.out.println(hashSetEtudiant);
    }

}
