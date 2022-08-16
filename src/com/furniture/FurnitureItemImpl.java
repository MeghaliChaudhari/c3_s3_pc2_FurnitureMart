package com.furniture;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem obj = new FurnitureItem();
        obj.setFurnitureCode(101);
        obj.setFurnitureType("table");
        obj.setGradeOfFurniture("grade1");
        obj.setFurnitureUsage("outdoor");
        obj.setPrice(10);

        System.out.println("Discounted price is $"+obj.calculateDiscount(obj.getGradeOfFurniture(), obj.getFurnitureUsage()));

    }
}
