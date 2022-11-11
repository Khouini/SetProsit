/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setprosit;

import java.util.Comparator;

/**
 *
 * @author Trunks
 */
public class parId implements Comparator<Enseignant> {

    @Override
    public int compare(Enseignant e1, Enseignant e2) {
        return e1.getId() - e2.getId();

    }

}
