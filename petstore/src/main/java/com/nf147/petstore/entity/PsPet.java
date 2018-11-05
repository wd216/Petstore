package com.nf147.petstore.entity;

public class PsPet {
    private Integer id;

    private PsCategory category;


    private String name;

    private String photo_urls;

    private Integer tags_id;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PsCategory getCategory() {
        return category;
    }

    public void setCategory(PsCategory category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhoto_urls() {
        return photo_urls;
    }

    public void setPhoto_urls(String photo_urls) {
        this.photo_urls = photo_urls == null ? null : photo_urls.trim();
    }

    public Integer getTags_id() {
        return tags_id;
    }

    public void setTags_id(Integer tags_id) {
        this.tags_id = tags_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public PsPet() {
    }

    public PsPet(PsCategory category, String name, String photo_urls, Integer tags_id, String status) {
        this.category = category;
        this.name = name;
        this.photo_urls = photo_urls;
        this.tags_id = tags_id;
        this.status = status;
    }

    public PsPet(PsCategory category, String name, Integer tags_id, String status) {
        this.category = category;
        this.name = name;
        this.tags_id = tags_id;
        this.status = status;
    }

    public PsPet(Integer id, PsCategory category, String name, String photo_urls, Integer tags_id, String status) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.photo_urls = photo_urls;
        this.tags_id = tags_id;
        this.status = status;
    }
}