package com.mossad.ama_pets_hospitalizacion.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mossad.ama_pets_hospitalizacion.model.request.BaseRequest;


@RestController
@RequestMapping("/")
public class BaseController {
    @Value("${nombreApp}")
    private String nombreApp;

    @Value("${versionApp}")
    private String versionApp;  


    @GetMapping("")
    public BaseRequest baseController() {
        return new BaseRequest(nombreApp, versionApp);
    }
}
