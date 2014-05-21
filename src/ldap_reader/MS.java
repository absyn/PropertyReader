package ldap_reader;


import ldap_reader.LdapReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a.belovol
 */
public class MS {
    public static void main(String[] args) {
        String mail = "e-mail";
        mail = LdapReader.getUserMail("a.belovol");
        System.out.println(mail);
    }
    
}
