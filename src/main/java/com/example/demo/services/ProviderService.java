package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.Provider;
import com.example.demo.repositories.ProviderRepository;

@Service
public class ProviderService {
    @Autowired
    ProviderRepository providerRepository;

    public ArrayList<Provider> getProviders()
    {
        return (ArrayList<Provider>) providerRepository.findAll();
    }

    public Provider saveProvider(Provider provider)
    {
        return providerRepository.save(provider);
    }
}
