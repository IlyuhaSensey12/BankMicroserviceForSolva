package com.example.BankMicroservice.controller;

import java.net.MalformedURLException;

import com.example.BankMicroservice.service.IRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestClient {

    @Autowired
    private IRateService iRateService;

    @GetMapping ("/test")
    public void test() throws MalformedURLException {
        iRateService.getAndSaveData();
    }
}
