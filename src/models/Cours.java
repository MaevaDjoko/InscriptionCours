/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.util.List;

import service.ConnexionDB;


/**
 *
 * @author SOKENG
 */

public class Cours implements Serializable {

    private static final long serialVersionUID = 1L; 
    private String code;
    private String libelle;
    private int volume;
    private int credit;
    private List<Inscription> inscriptionList;

    public Cours() {
    }

    public Cours(String code) {
        this.code = code;
    }

    public Cours(String code, String libelle, int volume, int credit) {
        this.code = code;
        this.libelle = libelle;
        this.volume = volume;
        this.credit = credit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public List<Inscription> getInscriptionList() {
        return inscriptionList;
    }

    public void setInscriptionList(List<Inscription> inscriptionList) {
        this.inscriptionList = inscriptionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cours)) {
            return false;
        }
        Cours other = (Cours) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Cours[ code=" + code + " ]";
    }
    
    public int save1() {
		
		ConnexionDB c = new ConnexionDB();
		c.chargerDriver("com.mysql.jdbc.Driver");
		c.connexion("jdbc:mysql://localhost:3306/inscription_cours","root","");
		int n=c.creation("insert into cours values('"+this.code+"','"+"','"+this.libelle+"','"+"','"+this.volume+"','"+this.credit+"')");
		
		return n;

	}
}
