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
public class BultinIr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Societe societe;
    private double salaires;
    private double autres;
    private double totale;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datedeclar;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dernierdel;

    public BultinIr() {
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSalaires() {
        return salaires;
    }

    public void setSalaires(double salaires) {
        this.salaires = salaires;
    }

    public double getAutres() {
        return autres;
    }

    public void setAutres(double autres) {
        this.autres = autres;
    }

    public double getTotale() {
        return totale;
    }

    public void setTotale(double totale) {
        this.totale = totale;
    }

    public Date getDatedeclar() {
        return datedeclar;
    }

    public void setDatedeclar(Date datedeclar) {
        this.datedeclar = datedeclar;
    }

    public Date getDernierdel() {
        return dernierdel;
    }

    public void setDernierdel(Date dernierdel) {
        this.dernierdel = dernierdel;
    }
}
