package com.pradeep.Country.Service;

import com.pradeep.Country.Service.dto.CountryDTO;
import com.pradeep.Country.domain.Country;
import com.pradeep.Country.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService
{
    @Autowired
    private CountryRepository ctryRepository;

    public Country getCountry(String country)
    {
        Country ctry = ctryRepository.findOneByCountry(country);

        return ctry;
    }


}
