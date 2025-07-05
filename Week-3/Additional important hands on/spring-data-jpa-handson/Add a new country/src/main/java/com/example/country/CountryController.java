package com.example.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryRepository repository;

    // ✅ Add new country
    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return repository.save(country);
    }

    // ✅ Find country by code
    @GetMapping("/{code}")
    public Optional<Country> getCountryByCode(@PathVariable String code) {
        return repository.findById(code);
    }
}
