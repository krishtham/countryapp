package com.pradeep.Country.Controller;

import com.pradeep.Country.Service.CountryService;
import com.pradeep.Country.domain.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController
{
    @Autowired
    private CountryService ctryService;

    @GetMapping("/")
    public String index()
    {
        return "Greetings from Country App!";
    }

    @GetMapping(value ="capital/{country}")
    public String getCountryCapital(@PathVariable String country)
    {
        Country ctry = ctryService.getCountry(country);

        return "I might have implemented "+ctry.getCountry();
    }

    @PostMapping("create")
    public Country createBook(@RequestBody Country ctry)
    {
        return ctryService.createCountry(ctry);
    }

}
