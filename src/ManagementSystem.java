import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olexande
 */
public class ManagementSystem {
    
    private static final String sFileName = "my.properties";
    private static String sDirSeparator = System.getProperty("file.separator");
    private static Properties props = new Properties();
    
    private static ManagementSystem instance;
    private ManagementSystem() throws Exception {
        File currentDir = new File(".");
        try {
            // определяем полный путь к файлу
            String sFilePath = currentDir.getCanonicalPath() + sDirSeparator + sFileName;
            // создаем поток для чтения из файла
            FileInputStream ins = new FileInputStream(sFilePath);
            // загружаем свойства
            props.load(ins);

            
            System.out.println(PropertyReader.getPop3Server());
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("IO Error!");
            e.printStackTrace();
        } 
    }
    
        public static void main(String[] args) {
        // определяем текущий каталог
//        File currentDir = new File(".");
//        try {
//            // определяем полный путь к файлу
//            String sFilePath = currentDir.getCanonicalPath() + sDirSeparator + sFileName;
//            // создаем поток для чтения из файла
//            FileInputStream ins = new FileInputStream(sFilePath);
//            // загружаем свойства
//            props.load(ins);
//            // выводим значение для свойства "property_server"
//            System.out.println("property_server " + props.getProperty("property_server"));
//            System.out.println("pop3_server " + props.getProperty("pop3_server"));
//            System.out.println("imap_server " + props.getProperty("imap_server"));
//            System.out.println("mxdomain " + props.getProperty("mxdomain"));
//            System.out.println("ldapdomain " + props.getProperty("pop3_server"));
//            System.out.println("ldaplogin " + props.getProperty("ldaplogin"));
//            System.out.println("ldap_base_domain " + props.getProperty("ldap_base_domain"));
//            System.out.println("smtpport " + props.getProperty("smtpport"));
//            System.out.println("pop3port " + props.getProperty("pop3port"));
//            System.out.println("imapport " + props.getProperty("imapport"));
//            System.out.println("organization " + props.getProperty("organization"));
//            System.out.println("ldap_bind_dn " + props.getProperty("ldap_bind_dn"));
//            
//            System.out.println("ldapport " + props.getProperty("ldapport"));
//            System.out.println("ldap_search_filter " + props.getProperty("ldap_search_filter"));
////            System.out.println("imap_server " + props.getProperty("imap_server"));
////            System.out.println("mxdomain " + props.getProperty("mxdomain"));
////            System.out.println("ldapdomain " + props.getProperty("pop3_server"));
////            System.out.println("ldaplogin " + props.getProperty("imap_server"));
//        }
//        catch (FileNotFoundException e) {
//            System.out.println("File not found!");
//            e.printStackTrace();
//        }
//        catch (IOException e) {
//            System.out.println("IO Error!");
//            e.printStackTrace();
//        }       
//            String tmp = ServerProps.getProperty_Server();
            System.out.println(ServerProps.getProperty_Server());
            System.out.println(UserProps.getFullName());
    }
}
