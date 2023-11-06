/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.sql.*;
import java.text.SimpleDateFormat;

import service.ConnexionDB;


/**
 *
 * @author SOKENG
 */

public class Etudiant implements Serializable {

    private static final long serialVersionUID = 1L;
    private String matricule;
    private String nom;
    private Date dateNaiss;
    private String telephone;
    private String mail;
    private String sexe;
    private short statut;
    private List<Inscription> inscriptionList;

    public Etudiant() {
    }

    public Etudiant(String matricule) {
        this.matricule = matricule;
    }

    public Etudiant(String matricule, String nom, Date dateNaiss, String telephone, String sexe, short statut) {
        this.matricule = matricule;
        this.nom = nom;
        this.dateNaiss = dateNaiss;
        this.telephone = telephone;
        this.sexe = sexe;
        this.statut = statut;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public short getStatut() {
        return statut;
    }

    public void setStatut(short statut) {
        this.statut = statut;
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
        hash += (matricule != null ? matricule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etudiant)) {
            return false;
        }
        Etudiant other = (Etudiant) object;
        if ((this.matricule == null && other.matricule != null) || (this.matricule != null && !this.matricule.equals(other.matricule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Etudiant[ matricule=" + matricule + " ]";
    }

	public int save() {
		
		ConnexionDB c = new ConnexionDB();
		c.chargerDriver("com.mysql.jdbc.Driver");
		c.connexion("jdbc:mysql://localhost:3306/inscription_cours","root","");
		int n=c.creation("insert into etudiant values('"+this.matricule+"','"+this.nom+"','"+new java.sql.Date(this.getDateNaiss().getTime())+"','"+this.telephone+"','"+this.mail+"','"+this.sexe+"','"+this.statut+"')");
		
		return n;

	}
    
}
