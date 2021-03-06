package com.nf147.petstore.entity;

import java.util.Date;

public class PsOrder {
    private Integer id;

    private Integer pet_id;

    private Integer quantity;

    private Date ship_date;

    private String status;

    private byte[] complete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPet_id() {
        return pet_id;
    }

    public void setPet_id(Integer pet_id) {
        this.pet_id = pet_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getShip_date() {
        return ship_date;
    }

    public void setShip_date(Date ship_date) {
        this.ship_date = ship_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public byte[] getComplete() {
        return complete;
    }

    public void setComplete(byte[] complete) {
        this.complete = complete;
    }
}