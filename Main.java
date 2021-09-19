package com.pendrivepro;

public class Main {
    public static void main(String[] args) {
        Pendrive pendrive1 = new Pendrive("Avada","descroption", new Price(10,20));

        pendrive1.setBrand("nike");
        pendrive1.setProductCode("20ED");
        pendrive1.setStatus(Productstatus.IN_STOCK);
        pendrive1.setSummary("Summary");
        System.out.println(pendrive1);


    }
}
