/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LeongJunJie
 */
import java.util.Scanner;

public class user {

    public static void main(String[] args) {
        
        int age;
        int maritalStatus;
        int dependentStatus;
        int numberOfChild = 0;
        int carOwnershipStatus;
        double income;
        Scanner scanner = new Scanner(System.in);
        
        //scanner to get user information
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
                
        System.out.println("Enter your marital status: 1.Single 2.Married ");
        maritalStatus = scanner.nextInt();
        
        System.out.println("Enter your dependent status: 1.with children 2.without children");
        dependentStatus = scanner.nextInt();
        if (dependentStatus == 1) {
            System.out.print("Enter the number of your child): ");
            numberOfChild = scanner.nextInt();
        }
        
        System.out.print("Enter your car ownership status: 1.public transport user 2.car owner");
        carOwnershipStatus = scanner.nextInt();

        System.out.print("Enter your monthly income: ");
        income = scanner.nextDouble();

        suggestedExpenses userBudget = new suggestedExpenses(age, maritalStatus, numberOfChild, carOwnershipStatus, dependentStatus, income);

        //method from suggest expenses class
        userBudget.calculateBudgetAllocation();
        userBudget.calculateSuggestedExpenses();

        userBudget.displayBudgetAllocation();
        userBudget.displaySuggestedExpenses();

        userBudget.compareWithSuggestedExpenses();
    }
}
