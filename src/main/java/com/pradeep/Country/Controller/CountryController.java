package com.pradeep.Country.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController
{
    @GetMapping("/")
    public String index()
    {
        return "Greetings from Country App!";
    }

    @GetMapping(value ="capital/{country}")
    public String getCountryCapital(@PathVariable String country)
    {
        return "I have not yet implemented the capital for " + country;
    }

}
