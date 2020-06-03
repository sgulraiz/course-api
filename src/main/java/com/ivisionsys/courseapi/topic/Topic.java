package com.ivisionsys.courseapi.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This is the Topic Object. Entity annotation tells the JPA that this is my entity class.
 * This class (Topic) will be represented as a table in the database. Each instance of this
 * class will be treated as a row on the Topic table
 *
 */

@Entity
public class Topic {

    //ID annotation placed right before the field tells the JPA that this field is the primary column in the table.
    //the fields are treated as the columns in the table.
    @Id
    private String id;
    private String name;
    private String description;

    //Default no-arg constructor
    public Topic(){

    }

    //Constructor
    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    //Getters and setters


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
