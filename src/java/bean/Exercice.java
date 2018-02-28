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
public class Exercice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Societe societe;
    private double prix;
    private int type;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datelivr;
    private String libel;
    private String tva;

    public Exercice() {
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

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getDatelivr() {
        return datelivr;
    }

    public void setDatelivr(Date datelivr) {
        this.datelivr = datelivr;
    }

    public String getLibel() {
        return libel;
    }

    public void setLibel(String libel) {
        this.libel = libel;
    }

    public String getTva() {
        return tva;
    }

    public void setTva(String tva) {
        this.tva = tva;
    }

}
