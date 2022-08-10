/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Merchandise;

/**
 *
 * @author jgonz
 */
public class Merchandise {
    private String nameOfMerch;
    private String size;
    private double unitPrice;
    private int quantity;
    private double cost;
    
    public Merchandise(String nameOfMerch, String size, double unitPrice, int quantity, double cost){
        this.nameOfMerch = nameOfMerch;
        this.size = size;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.cost = cost;
    }
    public String getNameOfMerch(){
        return nameOfMerch;
    }
    public void setNameOfMerch(String nameOfMerch){
        this.nameOfMerch = nameOfMerch;
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public double getCost(){
        return cost;
    }
    public void setCOst(double cost){
        this.cost = cost;
    }
    
    @Override
    public String toString() {
        return "Merchandise{" + "nameOfMerch=" + nameOfMerch + ", size=" 
                + size + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", cost=" + cost + '}';
    }
    
}
