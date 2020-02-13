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
public class Baskel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
         DataSource ds =  DataSource.getInstance();
        
       
        membre p = new membre("hedi", "aloui","iheb@aloui.com","18/08/1997","testtest");
           membre p1 = new membre("aaaa", "eeeee","dddd@aloui.com","18/08/1997","testtest");
        
        membreservice ps = new membreservice();
      //  ps.ajouterMembre(p);
        ps.DeleteRow(7);
        //System.out.println(ps.afficher());
        ps.modifierMembre(p1,10);
        String critere = "id";
        System.out.println(ps.trier(critere));
        
    }
    
}
