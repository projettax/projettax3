/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author yasser
 */
@Entity
public class Societe implements Serializable {

    @OneToMany(mappedBy = "societe")
    private List<Bultin> bultins;

    @OneToMany(mappedBy = "societe")
    private List<Employe> employes;

    @OneToMany(mappedBy = "societe")
    private List<Exercice> exercices;

    private static final long serialVersionUID = 1L;
    @Id
    private String idfsc;
    private String nom;
    @ManyToOne
    private Dgi dgi;
    private String service;
    private int regime;
    private double creditva;
    private double tvadue;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateouvertur;
    private String adresse;
    private String compte;
    @OneToOne
    private Penalite penalite;
    @OneToMany(mappedBy = "societe")
    private List<BultinIr> bultinIrs;

    public Societe() {
    }

    public Societe(String nom) {
        this.nom = nom;
    }

    public String getIdfsc() {
        return idfsc;
    }

    public void setIdfsc(String idfsc) {
        this.idfsc = idfsc;
    }

    public List<Bultin> getBultins() {
        return bultins;
    }

    public void setBultins(List<Bultin> bultins) {
        this.bultins = bultins;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public List<Exercice> getExercices() {
        return exercices;
    }

    public void setExercices(List<Exercice> exercices) {
        this.exercices = exercices;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Dgi getDgi() {
        return dgi;
    }

    public void setDgi(Dgi dgi) {
        this.dgi = dgi;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Penalite getPenalite() {
        return penalite;
    }

    public void setPenalite(Penalite penalite) {
        this.penalite = penalite;
    }

    public List<BultinIr> getBultinIrs() {
        return bultinIrs;
    }

    public void setBultinIrs(List<BultinIr> bultinIrs) {
        this.bultinIrs = bultinIrs;
    }

    public int getRegime() {
        return regime;
    }

    public void setRegime(int regime) {
        this.regime = regime;
    }

    public double getCreditva() {
        return creditva;
    }

    public void setCreditva(double creditva) {
        this.creditva = creditva;
    }

    public double getTvadue() {
        return tvadue;
    }

    public void setTvadue(double tvadue) {
        this.tvadue = tvadue;
    }

    public Date getDateouvertur() {
        return dateouvertur;
    }

    public void setDateouvertur(Date dateouvertur) {
        this.dateouvertur = dateouvertur;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

}
