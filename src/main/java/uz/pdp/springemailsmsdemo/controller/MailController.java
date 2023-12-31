package uz.pdp.springemailsmsdemo.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.springemailsmsdemo.dto.EmailDto;
import uz.pdp.springemailsmsdemo.service.EmailService;

@RestController
@RequestMapping("/api/email")
@RequiredArgsConstructor
public class MailController {


    private final EmailService mailService;

    @PostMapping
    public HttpEntity<?> sendEmail(@RequestBody EmailDto emailDto) {
        return ResponseEntity.ok(mailService.sendEmail(emailDto));

    }
}
