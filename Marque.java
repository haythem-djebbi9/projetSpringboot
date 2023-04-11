package com.example.marque.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMarque;
    private String nomMarque;
    private Double chiffreAffaire;
    private Date dateMarque;

    public Marque() {
        super();
    }

    public Marque(String nomMarque, Double chiffreAffaire, Date dateMarque) {
        super();
        this.nomMarque = nomMarque;
        this.chiffreAffaire = chiffreAffaire;
        this.dateMarque = dateMarque;
    }

    public Long getIdMarque() {
        return idMarque;
    }

    public void setIdMarque(Long idMarque) {
        this.idMarque = idMarque;
    }

    public String getNomMarque() {
        return nomMarque;
    }

    public void setNomMarque(String nomMarque) {
        this.nomMarque = nomMarque;
    }

    public Double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(Double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public Date getDateMarque() {
        return dateMarque;
    }

    public void setDateMarque(Date dateMarque) {
        this.dateMarque = dateMarque;
    }

    @Override
    public String toString() {
        return "Marque [idMarque=" + idMarque + ", nomMarque=" + nomMarque +
                ", chiffreAffaire=" + chiffreAffaire + ", dateMarque=" + dateMarque + "]";
    }
}
