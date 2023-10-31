/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formletterwriter;

/**
 *
 * @author gabri
 */
public class FormLetterWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         String FirstNameOnly = DisplaySalutation("Amahle");
         String FullName = DisplaySalutation("Amahle P");
         System.out.println(FirstNameOnly+" Thank you for your recent order.");
         System.out.println(FullName+" Thank you for your recent order.");
    }
    static String DisplaySalutation(String LastName) 
    {
        return "Dear Mr or Ms "+LastName;
    }

    static String DisplaySalutation(String FirstName,String LastName) 
    {
        return "Dear "+FirstName+" "+LastName;
    }
}
