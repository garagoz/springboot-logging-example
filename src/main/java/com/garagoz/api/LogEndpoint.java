package com.garagoz.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/message")
public class LogEndpoint {

    @GetMapping
    public String showMessage() {
        log.info("Called show message method");
        return internalLogDetail();
    }

    private String internalLogDetail() {
        try {
            log.debug("Started method internalLogDetail");
            Thread.sleep(1000);
            return "API Message";
        } catch (InterruptedException e) {
            log.error("Hata : {}", e);
        }

        return "";
    }
}
