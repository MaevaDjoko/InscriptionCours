package service;

import java.sql.*;



public class ConnexionDB {
	
	private Connection con;
	
    public ConnexionDB() {
    }

    //methode d'enregistrement du Drivers
    public void chargerDriver (String drivername){
        try {
            Class.forName(drivername);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //methode de connexion à la bd
    public void connexion (String url, String user, String password){
        try {
            con = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //creation d'une requete
    public int creation (String query){
        try {
            Statement s1 = con.createStatement();
            int n= s1.executeUpdate(query);
            return n;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    

}
