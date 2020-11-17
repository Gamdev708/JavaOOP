/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

/**
 *
 * @author Vision-PC
 */
public class MailSend {
    
    public static void Mail(String to)
    {
        
        String from = "rustyrepaire@gmail.com";
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", 465);
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("rustyrepaire@gmail.com", "rusty789@");
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("This is test Subject!");
            message.setText("This is a test mail");
            Transport.send(message);
            System.out.println("Sent message sucessfully....");
        } catch (Exception e) {
            e.printStackTrace();;
            // TODO code application logic here
        }
    }
    
}
