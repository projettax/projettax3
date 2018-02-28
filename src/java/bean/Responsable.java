/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author yasser
 */
@Entity
public class Responsable extends Employe implements Serializable {

    private static final long serialVersionUID = 1L;
    private String login;
    private String password;
    private int droit;
    private boolean root;

    public Responsable() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDroit() {
        return droit;
    }

    public void setDroit(int droit) {
        this.droit = droit;
    }

    public boolean isRoot() {
        return root;
    }

    public void setRoot(boolean root) {
        this.root = root;
    }
    
}
