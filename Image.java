package com.pendrivepro;

import java.util.UUID;

public class Image {
    private final String id;
    private String url;
    private String title;
    private boolean isPrimary;

    public Image(String url, String title) {
        this.id = UUID.randomUUID().toString();
        this.url = url;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public void setPrimary(boolean primary) {
        isPrimary = primary;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", isPrimary=" + isPrimary +
                '}';
    }
}
