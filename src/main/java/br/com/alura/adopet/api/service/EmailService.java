package br.com.alura.adopet.api.service;

import br.com.alura.adopet.api.model.Adocao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void envioDeEmail(Adocao adocao, String subject, String text) {

        SimpleMailMessage email = new SimpleMailMessage();
        email.setFrom("adopet@email.com.br");
        email.setTo(adocao.getTutor().getEmail());
        email.setSubject(subject);
        email.setText(text);
        emailSender.send(email);
    }
}
