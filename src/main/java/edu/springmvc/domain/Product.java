package edu.springmvc.domain;

import java.io.Serializable;
import java.time.ZonedDateTime;

/**
 * @author ibraim
 */
public class Product implements Serializable {

    private Long id;

    private String name;

    private ZonedDateTime created;

    public Product() {}

    public Product(Long id, String name, ZonedDateTime created) {
        this.id = id;
        this.name = name;
        this.created = created;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZonedDateTime getCreated() {
        return created;
    }

    public void setCreated(ZonedDateTime created) {
        this.created = created;
    }
}
