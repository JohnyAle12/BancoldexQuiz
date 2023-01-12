package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Provider;
import com.example.demo.services.ProviderService;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Autowired
    ProviderService providerService;

    @GetMapping
    public ArrayList<Provider> getProviders()
    {
        return providerService.getProviders();
    }

    @PostMapping
    public Provider savProvider(@RequestBody Provider provider)
    {
        return providerService.saveProvider(provider);
    }
}
