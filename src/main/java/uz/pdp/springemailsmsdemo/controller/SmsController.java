package uz.pdp.springemailsmsdemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.springemailsmsdemo.dto.SmsDto;
import uz.pdp.springemailsmsdemo.service.SmsService;

@RestController
@RequestMapping("/api/sms")
@RequiredArgsConstructor
public class SmsController {

    private final SmsService smsService;


    @PostMapping
    public HttpEntity<?> sendSms(@RequestBody SmsDto smsDto) {
        return ResponseEntity.ok(smsService.sendSms(smsDto));

    }


}
