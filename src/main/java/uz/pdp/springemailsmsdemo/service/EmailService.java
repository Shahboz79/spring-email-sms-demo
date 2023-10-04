package uz.pdp.springemailsmsdemo.service;

import uz.pdp.springemailsmsdemo.dto.EmailDto;
import uz.pdp.springemailsmsdemo.payload.ApiResponse;

public interface EmailService {

    ApiResponse sendEmail(EmailDto emailDto);
}
