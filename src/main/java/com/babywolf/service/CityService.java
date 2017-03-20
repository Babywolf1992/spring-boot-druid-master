package com.babywolf.service;

import com.babywolf.entity.City;
import com.babywolf.mapper.CityMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by babywolf on 17/3/19.
 */
@Service
public class CityService {
    @Autowired
    private CityMapper cityMapper;

    public List<City> getAll(City city) {
        if (city.getPage() != null && city.getRows() != null) {
            PageHelper.startPage(city.getPage(), city.getRows());
        }
        return cityMapper.selectAll();
    }

    public City getById(Integer id) {
        return cityMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {
        cityMapper.deleteByPrimaryKey(id);
    }

    public void save(City city) {
        if (city.getId() != null) {
            cityMapper.updateByPrimaryKey(city);
        }else {
            cityMapper.insert(city);
        }
    }
}
