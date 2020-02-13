/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baskel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author flynn
 */
public class membreservice {
     Connection cn = DataSource.getInstance().getConnexion();
    public void ajouterMembre(membre p){
        try {
            String requete = "insert into membre (nom, prenom,email,date,password) values (?,?,?,?,?)";
           
         
                PreparedStatement st = cn.prepareStatement(requete);
                st.setString(1, p.getNom());
                st.setString(2, p.getPrenom());
                st.setString(3, p.getEmail());
                st.setString(4, p.getDate());
                st.setString(5, p.getPassword());
    
            st.executeUpdate();
            System.out.println("PERSON ADDED!");
        } catch (SQLException ex) {
            
            System.out.println(ex.getMessage());
        }
    }
    
    public  void DeleteRow(int id) {
    try {  
        String requete = "DELETE FROM membre WHERE id = ?";
        PreparedStatement st = cn.prepareStatement(requete);
        st.setInt(1,id);
        st.executeUpdate(); 
        System.out.println("Person deleted!");
    } catch(Exception e) {
        System.out.println(e);
    }
    }
   
    public List<membre> afficher(){
        List<membre> list = new ArrayList<>();
        String requete = "select * from membre";
        try {
           
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(requete);
           while(rs.next()){
               membre p = new membre();
               p.setId(rs.getInt(1));
               p.setNom(rs.getString("nom"));
               p.setPrenom(rs.getString("prenom"));
               p.setEmail(rs.getString("email"));
               p.setDate(rs.getString("date"));
               p.setPassword(rs.getString("password"));
               list.add(p);
           }
        } catch (SQLException ex) {
            System.out.println("makhedmetesh");
        }
        return list;
    }
    public void modifierMembre(membre m, int id) {
        String qSql = "UPDATE membre SET nom=?,prenom=?,email=?,date=?, password=? WHERE id=?";
        PreparedStatement st = null;
        try {
              st = cn.prepareStatement(qSql);
                st.setString(1, m.getNom());
                st.setString(2, m.getPrenom());
                st.setString(3, m.getEmail());
                st.setString(4, m.getDate());
                st.setString(5, m.getPassword());
                st.setInt(6, id);
                
            st.executeUpdate();
            System.out.println("Admin Modif Bravo ");
        } catch (SQLException ex) {
            System.out.println("Admin Modif Erreur !!!");
        }
    }
    public List<membre> trier(String critere)
    {
         List<membre> list = new ArrayList<>();
         //System.err.println(critere);
         String   a = "select * from membre ORDER BY ";
         a=a+critere;
         System.out.println(a);
        String requete = a;
        try {
           
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(requete);
           while(rs.next()){
               membre p = new membre();
               p.setId(rs.getInt(1));
               p.setNom(rs.getString("nom"));
               p.setPrenom(rs.getString("prenom"));
               p.setEmail(rs.getString("email"));
               p.setDate(rs.getString("date"));
               p.setPassword(rs.getString("password"));
               list.add(p);
           }
        } catch (SQLException ex) {
            System.out.println("makhedmetesh");
        }
        return list;
    }
}
