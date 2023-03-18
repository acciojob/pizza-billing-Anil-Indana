package com.driver;

public class Pizza {

    private int cheesePrice;
    private int toppingsPrice;
    private int basePrice;
    private int totalPrice;
    private int paperBagPrice;
    private String bill;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isPaperBagAdded;
    private boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        // your code goes here
        if(isVeg){
            this.basePrice = 300;
            this.toppingsPrice = 70;
        }
        else{
            this.toppingsPrice = 120;
            this.basePrice = 400;
        }
        paperBagPrice = 20;
        cheesePrice = 80;
        isCheeseAdded = false;
        isToppingsAdded = false;
        isPaperBagAdded = false;
        totalPrice = basePrice;
        bill = "Base Price Of The Pizza: " + basePrice + "\n";

    }

    public int getPrice(){
       return this.totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            totalPrice += cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            totalPrice += toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded){
            totalPrice += paperBagPrice;
            isPaperBagAdded = true;
        }

    }
    public String getBill(){
        if(!isBillGenerated){
            if(isCheeseAdded){
                bill += "Extra Cheese Added: " + cheesePrice + "\n";
            }
            if(isToppingsAdded){
                bill += "Extra Toppings Added: " + toppingsPrice + "\n";
            }
            if(isPaperBagAdded){
                bill += "Paperbag Added: " + paperBagPrice + "\n";
            }
            bill += "Total Price: " + totalPrice + "\n";
            isBillGenerated = true;
        }
        return bill;
    }
}
