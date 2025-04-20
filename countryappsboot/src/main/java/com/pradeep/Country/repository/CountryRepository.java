package com.pradeep.Country.repository;

import com.pradeep.Country.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>
{
    Country findOneByCountry(String country);
}
