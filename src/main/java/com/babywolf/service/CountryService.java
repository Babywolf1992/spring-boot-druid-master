package com.babywolf.service;

import com.babywolf.entity.Country;
import com.babywolf.mapper.CountryMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by babywolf on 17/3/19.
 */
public class CountryService {
    @Autowired
    private CountryMapper countryMapper;

    public List<Country> getAll(Country country) {
        if (country.getPage() != null && country.getRows() != null) {
            PageHelper.startPage(country.getPage(), country.getRows());
        }
        return countryMapper.selectAll();
    }

    public Country getById(Integer id) {
        return countryMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {
        countryMapper.deleteByPrimaryKey(id);
    }

    public void save(Country country) {
        if (country.getId() != null) {
            countryMapper.updateByPrimaryKey(country);
        }else {
            countryMapper.insert(country);
        }
    }
}
