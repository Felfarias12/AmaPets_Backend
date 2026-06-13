package com.mossad.amapets_mascota.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mossad.amapets_mascota.model.requests.BaseRequests;


@RestController
@RequestMapping("/")
public class BaseController {
    @Value("${app.name}")
    private String nombreApp;

    @Value("${app.version}")
    private String versionApp;


    @GetMapping("")
    public BaseRequests baseController() {
        return new BaseRequests(nombreApp, versionApp);
    }
}