package com.furniture;

public class FurnitureItem {
    private int furnitureCode;
    private String furnitureType;
    private String gradeOfFurniture;
    private String color;
    private String furnitureUsage;
    private float price;

    static final int DISCOUNT = 5;

    FurnitureItem(){
        furnitureCode = 0;
        furnitureType = null;
        gradeOfFurniture = null;
        color = null;
        furnitureUsage = null;
        price = 0.0f;
    }

    public void setFurnitureCode(int furnitureCode) {
        this.furnitureCode = furnitureCode;
    }

    public int getFurnitureCode() {
        return furnitureCode;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setGradeOfFurniture(String gradeOfFurniture) {
        this.gradeOfFurniture = gradeOfFurniture;
    }

    public String getGradeOfFurniture() {
        return gradeOfFurniture;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFurnitureUsage(String furnitureUsage) {
        this.furnitureUsage = furnitureUsage;
    }

    public String getFurnitureUsage() {
        return furnitureUsage;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
    public float calculateDiscount(String gradeOfFurniture,String furnitureUsage){
        float p = 0.0f;
        if(getGradeOfFurniture().equals("grade1") && getFurnitureUsage().equals("outdoor")){
            p = getPrice() - ((getPrice() * DISCOUNT)/100);
        }
        return p;
    }
}
