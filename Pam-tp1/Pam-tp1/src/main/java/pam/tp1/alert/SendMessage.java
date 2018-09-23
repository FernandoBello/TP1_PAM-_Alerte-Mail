package pam.tp1.alert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendMessage implements ISendMessage {
@Autowired
    public JavaMailSender emailSender;

    public void sendMessage(String message){
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("fernandobello.ocampo@hotmail.com");
        mail.setSubject("Alert");
        mail.setText(message);
        emailSender.send(mail);
    }
}
