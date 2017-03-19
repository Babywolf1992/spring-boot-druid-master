package com.babywolf.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * Created by babywolf on 17/3/19.
 */
public class BaseEntity {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Transient
    private Integer page = 1;

    @Transient
    private Integer rows = 10;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
