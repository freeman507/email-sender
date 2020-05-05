package br.com.felipezanella.emailsender.endpoint;

import br.com.felipezanella.emailsender.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("email")
public class EmailEndpoint {

    @Autowired
    private EmailService emailService;

    @GetMapping
    public void enviar() {
        emailService.enviar("freeman.zanella@gmail.com", "teste spring", "ola");
    }
}
