/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalchallenge;

import Food.Snack;
import Food.Drink;
import Merchandise.Merchandise;
import java.util.ArrayList;

public class SalesTransaction {

    private String transactDateTime;
    private String customerName;
    private ArrayList<Drink> drinks;
    private ArrayList<Snack> snacks;
    private ArrayList<Merchandise>merchandise;
    private String customerPaymentMethod;
    private String creditCardName;
    private String creditCardNumber;
    private double amountPaid;

//    public SalesTransaction(String transactDateTime, String customerName, ArrayList<Drink> drinks,
//                            ArrayList<Snack> snacks, String customerPaymentMethod, String creditCardName,
//                            String creditCardNumber, double amountPaid) {
//        this.transactDateTime = transactDateTime;
//        this.customerName = customerName;
//        this.drinks = new ArrayList<Drink>(drinks);
//        this.snacks = new ArrayList<Snack>(snacks);
//        this.customerPaymentMethod = customerPaymentMethod;
//        this.creditCardName = creditCardName;
//        this.creditCardNumber = creditCardNumber;
//        this.amountPaid = amountPaid;
//    }

    public SalesTransaction(String transactDateTime, String customerName) {
        this.transactDateTime = transactDateTime;
        this.customerName = customerName;
        this.drinks = new ArrayList<>();
        this.snacks = new ArrayList<>();
        this.merchandise = new ArrayList<>();


    }

    public String getTransactDateTime() {
        return transactDateTime;
    }

    public void setTransactDateTime(String transactDateTime) {
        this.transactDateTime = transactDateTime;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<Drink> drinks) {
        this.drinks = drinks;
    }

    public ArrayList<Snack> getSnacks() {
        return snacks;
    }

    public void setSnacks(ArrayList<Snack> snacks) {
        this.snacks = snacks;
    }
    public ArrayList<Merchandise> getMerchandise(){
        return merchandise;
    }
    public void setMerchandise(ArrayList<Merchandise>merchandise){
        this.merchandise = merchandise;
    }

    public String getCustomerPaymentMethod() {
        return customerPaymentMethod;
    }

    public void setCustomerPaymentMethod(String customerPaymentMethod) {
        this.customerPaymentMethod = customerPaymentMethod;
    }

    public String getCreditCardName() {
        return creditCardName;
    }

    public void setCreditCardName(String creditCardName) {
        this.creditCardName = creditCardName;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }
    
    public double tabulateSale()
    {
        double totalDrinkCosts = 0;
        double totalSnackCosts = 0;
        double totalMerchandiseCosts = 0;
        double grandTotal;
        double salesTax;
        final double taxRate = .07;

        for (int i = 0; i < getSnacks().size(); i++) {
            totalSnackCosts += getSnacks().get(i).getCost();
        }

        for (int i = 0; i < getDrinks().size(); i++) {
            totalDrinkCosts += getDrinks().get(i).getCost();
        }
        for(int i = 0; i < getMerchandise().size(); i++){
            totalMerchandiseCosts += getMerchandise().get(i).getCost();
        }

        grandTotal = totalSnackCosts + totalDrinkCosts + totalMerchandiseCosts;

        salesTax = grandTotal * taxRate;
        grandTotal += salesTax;
        return grandTotal;
    }

    @Override
    public String toString() {
        String receipt = "\n----------------------------------------------\n";
        receipt +=
                transactDateTime + " " +
                        customerName + " " ;
        if (!drinks.isEmpty())
            receipt += " \n Drinks: " + drinks;
        if (!snacks.isEmpty())
            receipt += " \n Snacks: " + snacks;
        if(!merchandise.isEmpty())
            receipt += " \n Merch: " + merchandise;

        receipt += " \n Payment Method: " + customerPaymentMethod;
        if (customerPaymentMethod != null && customerPaymentMethod.equalsIgnoreCase("credit card")) {
            receipt += "\n Credit Card: " + creditCardName +
                    " Credit Card Number: " + creditCardNumber;
        }
        receipt += " AmountPaid=" + amountPaid;
        receipt += "\n----------------------------------------------\n";

        return receipt;
    }

}

