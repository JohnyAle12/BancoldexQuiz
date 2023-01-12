package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.Provider;
import com.example.demo.repositories.ProviderRepository;

@Service
public class ProviderService {
    @Autowired
    private ProviderRepository providerRepository;

    public ArrayList<Provider> getProviders()
    {
        return (ArrayList<Provider>) providerRepository.findAll();
    }

    public Provider saveProvider(Provider provider)
    {
        return providerRepository.save(provider);
    }

    public Optional<Provider> getProvider(Long id)
    {
        return providerRepository.findById(id);
    }
}
