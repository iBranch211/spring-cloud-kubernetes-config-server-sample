package io.github.susimsek.springcloudkubernetesconfigserversample.controller;

import io.github.susimsek.springcloudkubernetesconfigserversample.dto.AccountContactInfoDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountController {

    private final AccountContactInfoDTO accountContactInfo;


    @GetMapping("/contact-info")
    public ResponseEntity<AccountContactInfoDTO> getContactInfo() {
        return ResponseEntity.ok(accountContactInfo);
    }

}