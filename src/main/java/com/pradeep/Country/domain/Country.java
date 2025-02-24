package com.pradeep.Country.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Country implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(length = 50, unique = true, nullable = false)
    private String country;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Country)) return false;

        Country country1 = (Country) o;
        return getId().equals(country1.getId()) && getCountry().equals(country1.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCountry());
    }
}
