package com.mossad.AmaPets_veterinario.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mossad.AmaPets_veterinario.model.request.BaseRequest;

@RestController
@RequestMapping("/")
public class BaseController {
    @Value("${app.name}")
    private String nombreApp;

    @Value("${app.version}")
    private String versionApp;


    @GetMapping("")
    public BaseRequest baseController() {
        return new BaseRequest(nombreApp, versionApp);
    }
}