package com.sayak.databaseCRUD.topics;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class topics {
    @Id
    private String id;
    private String name;
    private String description;

    public topics() {
    }

    public topics(String id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
