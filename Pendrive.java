package com.pendrivepro;

import javax.swing.text.html.HTMLDocument;
import java.util.Arrays;
import java.util.UUID;

public class Pendrive {
    private final String id;
    private String title;
    private String summary;
    private String Description;
    private String brand;
    private Price price;
    private String productCode;
    private String[] features;
    private Productstatus status;
    private Faq[] question;
    private Image[] gallery;
    private Productspecification[]  specification;

    public int featurecout;
    public int specount;

    public Pendrive(String title, String description, Price price) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.Description = description;
        this.price = price;
        this.status = Productstatus.COMMING_SOON;
        this.features = new String[10];
        this.specification = new Productspecification[10];
        this.gallery = new Image[10];
        this.question = new Faq[10];
        featurecout =0;
        specount =0;
    }

    public Pendrive(String title, String summary, String description, String brand, Price price, String productCode) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.summary = summary;
        Description = description;
        this.brand = brand;
        this.price = price;
        this.productCode = productCode;
        featurecout =0;
        specount =0;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String[] getFeatures() {
        return features;
    }

    public void setFeatures(String[] features) {
        this.features = features;
    }

    public Productstatus getStatus() {
        return status;
    }

    public void setStatus(Productstatus status) {
        this.status = status;
    }

    public Faq[] getQuestion() {
        return question;
    }

    public void setQuestion(Faq[] question) {
        this.question = question;
    }

    public Image[] getGallery() {
        return gallery;
    }

    public void setGallery(Image[] gallery) {
        this.gallery = gallery;
    }

    public Productspecification[] getSpecification() {
        return specification;
    }

    public void setSpecification(Productspecification[] specification) {
        this.specification = specification;
    }

    public void addFeatures(String allfeatures){
        features[featurecout]= allfeatures;
    }
    public void addSpecifications(Productspecification allSpecifications){
        specification[featurecout]= allSpecifications;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", Description='" + Description + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", productCode='" + productCode + '\'' +
                ", features=" + Arrays.toString(features) +
                ", status=" + status +
                ", question=" + Arrays.toString(question) +
                ", gallery=" + Arrays.toString(gallery) +
                ", specification=" + Arrays.toString(specification) +
                '}';
    }
}
