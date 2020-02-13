/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baskel;

/**
 *
 * @author flynn
 */
public class membre {
    int id;
    String nom;
    String prenom;
    String email;
    String date;
    String password;

    public membre( String nom, String prenom, String email, String date, String password) {
        
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.date = date;
        this.password = password;
    }

   

    public membre() {
    }

   

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getDate() {
        return date;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "membre{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", date=" + date + ", password=" + password + '}';
    }
  
    
}
