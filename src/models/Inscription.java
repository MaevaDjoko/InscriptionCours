/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;


/**
 *
 * @author SOKENG
 */

public class Inscription implements Serializable {

    private static final long serialVersionUID = 1L;
    protected InscriptionPK inscriptionPK;
    private int debut;
    private int fin;
    private Cours cours;
    private Etudiant etudiant;

    public Inscription() {
    }

    public Inscription(InscriptionPK inscriptionPK) {
        this.inscriptionPK = inscriptionPK;
    }

    public Inscription(InscriptionPK inscriptionPK, int debut, int fin) {
        this.inscriptionPK = inscriptionPK;
        this.debut = debut;
        this.fin = fin;
    }

    public Inscription(String matricule, String code) {
        this.inscriptionPK = new InscriptionPK(matricule, code);
    }

    public InscriptionPK getInscriptionPK() {
        return inscriptionPK;
    }

    public void setInscriptionPK(InscriptionPK inscriptionPK) {
        this.inscriptionPK = inscriptionPK;
    }

    public int getDebut() {
        return debut;
    }

    public void setDebut(int debut) {
        this.debut = debut;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inscriptionPK != null ? inscriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscription)) {
            return false;
        }
        Inscription other = (Inscription) object;
        if ((this.inscriptionPK == null && other.inscriptionPK != null) || (this.inscriptionPK != null && !this.inscriptionPK.equals(other.inscriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Inscription[ inscriptionPK=" + inscriptionPK + " ]";
    }
    
}
