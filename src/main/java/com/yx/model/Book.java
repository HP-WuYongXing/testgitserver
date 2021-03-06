package com.yx.model;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "BOOK".
 */
public class Book {

    private Long id;
    private Long hid;
    private String name;
    private String link;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Book() {
    }

    public Book(Long id) {
        this.id = id;
    }

    public Book(Long id, Long hid, String name, String link) {
        this.id = id;
        this.hid = hid;
        this.name = name;
        this.link = link;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHid() {
        return hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
