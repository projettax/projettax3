/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author yasser
 */
@Entity
public class Dgi implements Serializable {

    @OneToMany(mappedBy = "dgi")
    private List<Societe> societes;

    @OneToMany(mappedBy = "dgi")
    private List<Ir> irs;

    @OneToMany(mappedBy = "dgi")
    private List<Is> iss;

    @OneToMany(mappedBy = "dgi")
    private List<Tva> tvas;

    private static final long serialVersionUID = 1L;
    @Id
    private String id;

    public Dgi() {
    }

    public Dgi(List<Societe> societes) {
        this.societes = societes;
    }

    public List<Societe> getSocietes() {
        return societes;
    }

    public void setSocietes(List<Societe> societes) {
        this.societes = societes;
    }

    public List<Ir> getIrs() {
        return irs;
    }

    public void setIrs(List<Ir> irs) {
        this.irs = irs;
    }

    public List<Is> getIss() {
        return iss;
    }

    public void setIss(List<Is> iss) {
        this.iss = iss;
    }

    public List<Tva> getTvas() {
        return tvas;
    }

    public void setTvas(List<Tva> tvas) {
        this.tvas = tvas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
