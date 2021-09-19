package com.pendrivepro;


import java.util.UUID;

public class Productspecification {
    private String id;
    private String value;
    private String group;

    public Productspecification(String value, String group) {
        this.id = UUID.randomUUID().toString();
        this.value = value;
        this.group = group;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
