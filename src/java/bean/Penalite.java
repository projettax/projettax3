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
import javax.persistence.Temporal;

/**
 *
 * @author yasser
 */
@Entity
public class Penalite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double montant;
    private float taux;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datedernierdeclaration;
    public Long getId() {
        return id;
    }

    public Penalite() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public Date getDatedernierdeclaration() {
        return datedernierdeclaration;
    }

    public void setDatedernierdeclaration(Date datedernierdeclaration) {
        this.datedernierdeclaration = datedernierdeclaration;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }

}
