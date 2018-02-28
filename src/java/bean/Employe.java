/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author yasser
 */
@Entity
public class Employe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String cin;
    @ManyToOne
    private Societe societe;
    private String nom;
    private String tele;
    private String compte;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datenaiss;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datembauch;
    private String metier;
    private double salairbase;

    public Employe() {
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public Date getDatenaiss() {
        return datenaiss;
    }

    public void setDatenaiss(Date datenaiss) {
        this.datenaiss = datenaiss;
    }

    public Date getDatembauch() {
        return datembauch;
    }

    public void setDatembauch(Date datembauch) {
        this.datembauch = datembauch;
    }

    public String getMetier() {
        return metier;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    public double getSalairbase() {
        return salairbase;
    }

    public void setSalairbase(double salairbase) {
        this.salairbase = salairbase;
    }

}
