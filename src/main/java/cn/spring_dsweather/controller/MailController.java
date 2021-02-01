package cn.spring_dsweather.controller;

import cn.spring_dsweather.model.Weather;
import cn.spring_dsweather.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@EnableScheduling
public class MailController {

    private EmailService emailService;

    @Autowired
    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    @GetMapping("/send")
    @Scheduled(cron = "0/30 * * * * ?")
    public boolean sendEmail() {
        System.out.println("执行时间："+ LocalDateTime.now());
        return emailService.sendSimpleMessage();
    }

    @GetMapping("get-weather")
    public List<Weather> getWeather() {
        return emailService.getWeather();
    }
}
