/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author yasser
 */
@Entity
public class Bultin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Societe societe;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datedeclar;
    private double vent;
    private double achat;
    private double facteurelec;
    private double facteureau;
    private double facteurinter;
    private double autre;
    private double total;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dernierdel;

    public Bultin() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public Date getDatedeclar() {
        return datedeclar;
    }

    public void setDatedeclar(Date datedeclar) {
        this.datedeclar = datedeclar;
    }

    public double getVent() {
        return vent;
    }

    public void setVent(double vent) {
        this.vent = vent;
    }

    public double getAchat() {
        return achat;
    }

    public void setAchat(double achat) {
        this.achat = achat;
    }

    public double getFacteurelec() {
        return facteurelec;
    }

    public void setFacteurelec(double facteurelec) {
        this.facteurelec = facteurelec;
    }

    public double getFacteureau() {
        return facteureau;
    }

    public void setFacteureau(double facteureau) {
        this.facteureau = facteureau;
    }

    public double getFacteurinter() {
        return facteurinter;
    }

    public void setFacteurinter(double facteurinter) {
        this.facteurinter = facteurinter;
    }

    public double getAutre() {
        return autre;
    }

    public void setAutre(double autre) {
        this.autre = autre;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getDernierdel() {
        return dernierdel;
    }

    public void setDernierdel(Date dernierdel) {
        this.dernierdel = dernierdel;
    }

}
