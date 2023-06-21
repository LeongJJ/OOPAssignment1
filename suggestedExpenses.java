/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LeongJunJie
 */
public class suggestedExpenses {

    private int age;
    private int maritalStatus;
    private int carOwnershipStatus;
    private int dependentStatus;
    private double income;
    private int numberOfChild;
    private double shortTermSavings;
    private double mediumTermSavings;
    private double longTermSavings;
    private double wants;
    private double needs;
    private double suggestedExpenses;

    //default constructor
    public suggestedExpenses() {
    }

    //constructor with parameter
    public suggestedExpenses(int age, int maritalStatus, int numberOfChild, int carOwnershipStatus, int dependentStatus, double income) {
        this.age = age;
        this.maritalStatus = maritalStatus;
        this.numberOfChild = numberOfChild;
        this.carOwnershipStatus = carOwnershipStatus;
        this.dependentStatus = dependentStatus;
        this.income = income;
    }

    //get and set method for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    //get and set method for maritalStatus
    public int getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(int maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    
    //get and set method for numberOfChild
    public int getNumberOfChild() {
        return numberOfChild;
    }

    public void setNumberOfChild(int numberOfChild) {
        this.numberOfChild = numberOfChild;
    }
    
    //get and set method for carOwnershipStatus
    public int getCarOwnershipStatus() {
        return carOwnershipStatus;
    }

    public void setCarOwnershipStatus(int carOwnershipStatus) {
        this.carOwnershipStatus = carOwnershipStatus;
    } 
    
    //get and set method for dependentStatus
    public int getDependentStatus() {
        return dependentStatus;
    }

    public void setDependentStatus(int dependentStatus) {
        this.dependentStatus = dependentStatus;
    }
    
    //get and set method for income
     public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
    
    //method to calculate budget allocation
    public void calculateBudgetAllocation() {
        shortTermSavings = income * 0.1;
        mediumTermSavings = income * 0.1;
        longTermSavings = income * 0.1;
        wants = income * 0.25;
        needs = income * 0.45;
    }

    //method to calculate suggested expenses
    public void calculateSuggestedExpenses() {
        if (maritalStatus == 1) {
            if (numberOfChild == 1) {
                suggestedExpenses = 4200.0;
            } else if (numberOfChild >= 2) {
                suggestedExpenses = 4940.0;
            } else {
                if (age >= 60) {
                    suggestedExpenses = 2330;
                } else {
                    if (carOwnershipStatus == 1) {
                        suggestedExpenses = 1760.0;
                    } else if (carOwnershipStatus == 2) {
                        suggestedExpenses = 2290.0;
                    }
                }
            }
        } else if (maritalStatus == 2) {
            if (numberOfChild == 0) {
                suggestedExpenses = 4110.0;
            } else if (numberOfChild == 1) {
                suggestedExpenses = 5360.0;
            } else if (numberOfChild >= 2) {
                suggestedExpenses = 6100.0;
            } else {
                if (age >= 60) {
                    suggestedExpenses = 3020;
                }
            }
        }
    }

    //method to display budget allocation
    public void displayBudgetAllocation() {
        System.out.println("\nBudget Allocation:");
        System.out.println("Short-term Savings: " + shortTermSavings);
        System.out.println("Medium-term Savings: " + mediumTermSavings);
        System.out.println("Long-term Savings: " + longTermSavings);
        System.out.println("Wants: " + wants);
        System.out.println("Needs: " + needs);
    }

    //method to display suggested expenses
    public void displaySuggestedExpenses() {
        System.out.println("\nSuggested Expenses Budget: " + suggestedExpenses);
    }

    //method to campare suggested expenses based on income
    public void compareWithSuggestedExpenses() {
        if ((wants + needs) > suggestedExpenses) {
            System.out.println("\nYou have exceeded your budget.");
        } else {
            System.out.println("\nYou are within your budget.");
        }
    }
}
