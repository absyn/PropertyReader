package propertyreader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a.belovol
 */
public class MBoxProps {

    public static String getSmtpPort() {
        String port;
        port = PropertyReader.getSmtpPort();
        System.out.println("MBoxProps " + PropertyReader.getSmtpPort());
        System.out.println("MBoxProps " + port);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return port;
    }
    
}
