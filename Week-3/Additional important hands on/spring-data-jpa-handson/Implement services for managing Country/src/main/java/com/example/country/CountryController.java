package com.example.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping
    public List<Country> getAll() {
        return service.getAllCountries();
    }

    @GetMapping("/{code}")
    public Optional<Country> getByCode(@PathVariable String code) {
        return service.getCountryByCode(code);
    }

    @PostMapping
    public Country add(@RequestBody Country country) {
        return service.addCountry(country);
    }

    @DeleteMapping("/{code}")
    public void delete(@PathVariable String code) {
        service.deleteCountry(code);
    }
}
