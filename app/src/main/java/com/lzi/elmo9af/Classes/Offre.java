package com.lzi.elmo9af.Classes;

import java.util.Date;

public class Offre {

    private int offre_id;
    private String title;
    private String description;
    private String service;
    private String client;
    private Date offre_date;
    public Offre(){}
    public Offre(int offre_id, String title, String description, String client, Date offre_date) {
        this.offre_id = offre_id;
        this.title = title;
        this.description = description;
        this.client = client;
        this.offre_date = offre_date;
    }

    public int getOffre_id() {
        return offre_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getClient() {
        return client;
    }

    public Date getOffre_date() {
        return offre_date;
    }

    public void setOffre_id(int offre_id) {
        this.offre_id = offre_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setOffre_date(Date offre_date) {
        this.offre_date = offre_date;
    }
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
    @Override
    public String toString() {
        return "Offre{" +
                "offre_id=" + offre_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", client='" + client + '\'' +
                ", offre_date=" + offre_date +
                '}';
    }
}
