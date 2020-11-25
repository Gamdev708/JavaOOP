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
 * @author S.D.P.M.Siriwardana
 */
public class MailSend {
    
    public static void Mail(String to,String name)
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
            message.setSubject("Your vehicle is fully Repaired/Restored");
            message.setText("Dear "+name+"\n Please arrive to Rusty Repaire to obatin your vehicle");
            Transport.send(message);
            System.out.println("Sent message sucessfully....");
        } catch (Exception e) {
            e.printStackTrace();;
            // TODO code application logic here
        }
    }
    
    public static void SuppMail(String to,String name,String supply)
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
            message.setSubject("Stocks have depleted");
            message.setText("Dear "+name+"\n"+"Our shop's requests you to bring order of "+supply+" since it has depleted");
            Transport.send(message);
            System.out.println("Sent message sucessfully....");
        } catch (Exception e) {
            e.printStackTrace();;
            // TODO code application logic here
        }
    }
}
