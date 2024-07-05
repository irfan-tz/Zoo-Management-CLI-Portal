package org.example;
//import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String passcode = "@3qwerty";
        attraction attraction0 = new attraction();
        //animals animals0 = new animals();
        Mammals mammals0 = new Mammals();

        Amphibians amphibians0 = new Amphibians();
        Reptiles reptiles0 = new Reptiles();

        Visitor visitor0 = new Visitor();

        System.out.println("Welcome to ZOOtopia!\n");

        while (true) {
            System.out.println("1. Enter as Admin\n2. Enter as a Visitor\n3. View Special Deals\n4. Exit the ZOOtopia\n");

            Scanner sc0 = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int choice_0 = sc0.nextInt();
            sc0.nextLine();         //consume newline of nextInt
            //if admin is selected
            if (choice_0 == 1) {
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Enter Admin Password: ");
                    String pass = sc1.nextLine();
                    if (pass.equals(passcode)) {
                        //the user enters the admin menu
                        while (true) {
                            System.out.println("Admin Menu:\n" +
                                    "1. Manage Attractions\n" +
                                    "2. Manage Animals\n" +
                                    "3. Schedule Events\n" +
                                    "4. Set Discounts\n" +
                                    "5. Set Special Deal\n" +
                                    "6. View Visitor Stats\n" +
                                    "7. View Feedback\n" +
                                    "8. Exit\n");

                            Scanner sc2 = new Scanner(System.in);
                            System.out.println("Enter your choice: ");
                            int choice_1 = sc1.nextInt();
                            sc1.nextLine();         //consume newline of nextInt

                            if (choice_1 == 1) {
                                //1. Manage Attractions
                                //change cost and description of an attraction
                                attraction0.viewAttraction();
                                Scanner sc3 = new Scanner(System.in);
                                System.out.println("Enter the serial number of the attraction: ");
                                int serial = sc3.nextInt();
                                sc3.nextLine();         //consume newline of nextInt

                                System.out.println("1. Change the description\n2.Change the cost \n");
                                int choice_2 = sc3.nextInt();
                                sc3.nextLine();         //consume newline of nextInt

                                //System.out.println("choice_2: \n"+choice_2);
                                if (choice_2 == 1) {
                                    Scanner sc4 = new Scanner(System.in);
                                    System.out.println("Enter the new description: ");
                                    String desc = sc4.nextLine();
                                    attraction0.changeDescription(serial-1, desc);
                                } else if (choice_2 == 2) {
                                    Scanner sc4 = new Scanner(System.in);
                                    System.out.println("Enter the new cost: ");
                                    int cost = sc4.nextInt();
                                    sc4.nextLine();         //consume newline of nextInt

                                    attraction0.changeCost(serial-1, cost);
                                }
                            } else if (choice_1 == 2) {
                                //2. Manage Animals

                                System.out.println("Manage Animals:\n" +
                                        "1. Add Animal\n" +
                                        "2. Update Animal Details\n" +
                                        "3. Remove Animal\n" +
                                        "4. Exit\n");
                                Scanner sc3 = new Scanner(System.in);
                                int choice_2 = sc3.nextInt();
                                sc3.nextLine();         //consume newline of nextInt
                                if (choice_2 == 1) {
                                    //1. Add Animal

                                    Scanner sc4 = new Scanner(System.in);
                                    System.out.println("Animal types:\n1.Mammals\n2.Amphibians\n3.Reptiles\n");
                                    System.out.println("Enter Animal Type Serial No.: ");
                                    int animal_type_serial = sc3.nextInt();
                                    String newline = sc3.nextLine();        //consume newLine

                                    System.out.println("Enter Animal Name: ");
                                    String animal_name = sc3.nextLine();

                                    System.out.println("Enter Animal Sound: ");
                                    String animal_sound = sc3.nextLine();

                                    System.out.println("Enter Animal History: ");
                                    String animal_desc = sc3.nextLine();

                                    ArrayList<String> animal = new ArrayList<>();

                                    int result = 0;
                                    if (animal_type_serial == 1){
                                        animal.add(animal_name);
                                        animal.add(animal_sound);
                                        animal.add(animal_desc);
                                        result = mammals0.addAnimal(animal);
                                    }
                                    else if (animal_type_serial == 2){
                                        animal.add(animal_name);
                                        animal.add(animal_sound);
                                        animal.add(animal_desc);
                                        result = amphibians0.addAnimal(animal);
                                    } else if (animal_type_serial == 3){
                                        animal.add(animal_name);
                                        animal.add(animal_sound);
                                        animal.add(animal_desc);
                                        result = reptiles0.addAnimal(animal);
                                    }
                                    else{
                                    }

                                    if (result == 0)
                                    {
                                        System.out.println("It could not be added due to some errors.\n");
                                    }
                                    else if (result == 1)
                                    {
                                        System.out.printf("%s added to Zoo.\n",animal_name);
                                    }

                                } else if (choice_2 == 2) {
                                    //2. Update Animal Details

                                    System.out.println("Increase the count of animal.\n");
                                    System.out.println("Available animals:\n");
                                    System.out.println("1. ");
                                    mammals0.print();
                                    System.out.println("2. ");
                                    amphibians0.print();
                                    System.out.println("3. ");
                                    reptiles0.print();

                                    Scanner sc4 = new Scanner(System.in);

                                    System.out.println("Enter the animal category number of the animal: ");
                                    int category_number = sc4.nextInt();
                                    sc4.nextLine();         //consume newline of nextInt
                                    System.out.println("Enter the animal name: ");
                                    String animal = sc4.nextLine();
                                    System.out.println("Enter the count of the animals: ");
                                    int count = sc4.nextInt();
                                    sc4.nextLine();         //consume newline of nextInt

                                    int result = 0;
                                    if (category_number == 1){
                                        String animal_type = "mammals";
                                        result = mammals0.addMore(animal, count);
                                    }
                                    else if (category_number == 2){
                                        String animal_type = "amphibians";
                                        result = amphibians0.addMore(animal, count);
                                    } else if (category_number == 3){
                                        String animal_type = "reptiles";
                                        result = reptiles0.addMore(animal, count);
                                    }
                                    if (result == 0)
                                    {
                                        System.out.println("Some error occurred while updating animal detail.\n");
                                    }
                                    else if (result == 1)
                                    {
                                        System.out.println("Detail updated successfully.\n");
                                    }

                                } else if (choice_2 == 3) {
                                    //3. Remove Animal

                                    System.out.println("Available animals:\n");
                                    mammals0.print();
                                    amphibians0.print();
                                    reptiles0.print();

                                    Scanner sc4 = new Scanner(System.in);

                                    System.out.println("Enter the animal category number of the animal: ");
                                    int category_number = sc4.nextInt();
                                    sc4.nextLine();         //consume newline of nextInt
                                    System.out.println("Enter the animal name: ");
                                    String animal = sc4.nextLine();

                                    int result = 0;
                                    if (category_number == 1){
                                        String animal_type = "mammals";
                                        result = mammals0.remove(animal);
                                    }
                                    else if (category_number == 2){
                                        String animal_type = "amphibians";
                                        result = amphibians0.remove(animal);
                                    } else if (category_number == 3){
                                        String animal_type = "reptiles";
                                        result = reptiles0.remove(animal);
                                    }
                                    if (result == 0)
                                    {
                                        System.out.println("Some error occurred while updating animal detail.\n");
                                    }
                                    else if (result == 1)
                                    {
                                        System.out.println("Detail updated successfully.\n");
                                    }
                                    if (result == 0)
                                    {
                                        System.out.println("Some error occurred while removing animal.\n");
                                    }
                                    else if (result == 1)
                                    {
                                        System.out.printf("%s deleted successfully.\n",animal);
                                    }
                                }
                                else {
                                    continue;
                                }

                            } else if (choice_1 == 3) {
                                //3. Schedule Events

                                attraction0.viewAttraction();

                                Scanner sc3 = new Scanner(System.in);

                                System.out.println("Enter the serial of the attraction to change its schedule: ");
                                int index = sc3.nextInt();
                                sc3.nextLine();         //consume newline of nextInt

                                System.out.println("Enter the opening time in 24hr HHMM format: ");
                                int open = sc3.nextInt();
                                sc3.nextLine();         //consume newline of nextInt

                                System.out.println("Enter the closing time in 24hr HHMM format: ");
                                int close = sc3.nextInt();
                                sc3.nextLine();         //consume newline of nextInt

                                attraction0.set_Schedule(index,open,close);
                                System.out.println("Schedule changed successfully.");

                            } else if (choice_1 == 4) {
                                //4. Set Discounts
                                // Discount is for age and membership

                                Scanner sc3 = new Scanner(System.in);
                                System.out.println("Set Discounts:\n" +
                                        "1. Add Discount\n" +
                                        "2. Modify Discount\n" +
                                        "3. Remove Discount\n" +
                                        "4. Exit\n");

                                System.out.println("Enter your choice: ");
                                int choice_2 = sc3.nextInt();
                                sc3.nextLine();         //consume newline of nextInt

                                if (choice_2 == 1)
                                {
                                    System.out.println("Add discount\n 1. based on visitors' category\n 2. on an attraction.");
                                    Scanner sc4 = new Scanner(System.in);
                                    int choice_3 = sc4.nextInt();
                                    sc4.nextLine();         //consume newline of nextInt
                                    if (choice_3 == 1)
                                    {
                                        System.out.println("If your entered category doesn't already exist then it would be created as a new visitor category \nor if the category already exists we'd add discount to it.\n");

                                        visitor0.printCategoriesDiscount();

                                        System.out.println("Enter Discount Category: ");
                                        String category = sc4.nextLine();

                                        System.out.println("Enter Discount Percentage (e.g., 20 for 20%): ");
                                        int discount = sc4.nextInt();
                                        sc4.nextLine();         //consume newline of nextInt

                                        visitor0.addDiscount(category, discount);
                                    }
                                    else if (choice_3 == 2)
                                    {
                                        attraction0.viewAttraction();
                                        System.out.println("Enter the number of the attraction for which you want to add discount: ");
                                        int serial = sc4.nextInt();
                                        sc4.nextLine();         //consume newline of nextInt

                                        System.out.println("Enter the discount: ");
                                        int discount = sc4.nextInt();
                                        sc4.nextLine();         //consume newline of nextInt

                                        attraction0.setDiscount(serial, discount);
                                    }
                                }
                                else if (choice_2 == 2)
                                {
                                    System.out.println("1. Change age-based discount.\n2. Change category-based discount.\n 3. Change attraction-based discount.\n");
                                    System.out.println("Enter your choice: ");

                                    Scanner sc4 = new Scanner(System.in);
                                    int choice_3 = sc4.nextInt();
                                    sc4.nextLine();         //consume newline of nextInt

                                    if (choice_3 == 1)
                                    {
                                        System.out.println("1. For minor.\n2.For senior.");
                                        int choice_4 = sc4.nextInt();
                                        sc4.nextLine();         //consume newline of nextInt
                                        if (choice_4 == 1)
                                        {
                                            System.out.println("Enter the new age limit for minor discount: ");
                                            int age = sc4.nextInt();
                                            sc4.nextLine();         //consume newline of nextInt
                                            System.out.println("Enter the minor discount: ");
                                            int discount = sc4.nextInt();
                                            sc4.nextLine();         //consume newline of nextInt
                                            visitor0.setAgeDiscount(0,age,discount);
                                        }
                                        else if (choice_4 == 2)
                                        {
                                            System.out.println("Enter the new age limit for senior discount: ");
                                            int age = sc4.nextInt();
                                            sc4.nextLine();         //consume newline of nextInt
                                            System.out.println("Enter the senior discount: ");
                                            int discount = sc4.nextInt();
                                            sc4.nextLine();         //consume newline of nextInt
                                            visitor0.setAgeDiscount(2,age,discount);
                                        }
                                    }
                                    else if (choice_3 == 2)
                                    {
                                        visitor0.printCategoriesDiscount();

                                        System.out.println("Enter Discount Category: ");
                                        String category = sc4.nextLine();

                                        System.out.println("Enter Discount Percentage (e.g., 20 for 20%): ");
                                        int discount = sc4.nextInt();
                                        sc4.nextLine();         //consume newline of nextInt

                                        visitor0.addDiscount(category,discount);
                                    }
                                    else if (choice_3 == 3)
                                    {
                                        attraction0.viewAttraction();
                                        System.out.println("Enter the number of the attraction for which you want to add discount: ");
                                        int serial = sc4.nextInt();
                                        sc4.nextLine();         //consume newline of nextInt

                                        System.out.println("Enter the discount: ");
                                        int discount = sc4.nextInt();
                                        sc4.nextLine();         //consume newline of nextInt

                                        attraction0.setDiscount(serial - 1, discount);
                                    }
                                }
                                else if (choice_2 == 3)
                                {
                                    System.out.println("Remove\n1. Category based discount.\n2. Attraction based discount.\n");
                                    Scanner sc4 = new Scanner(System.in);
                                    int choice_3 = sc4.nextInt();
                                    sc4.nextLine();         //consume newline of nextInt
                                    if (choice_3 == 1) {
                                        visitor0.printCategoriesDiscount();

                                        System.out.println("Enter the name of category you want to remove: ");
                                        String category = sc4.nextLine();

                                        int result = visitor0.removeCategory(category);

                                        if (result == 0) {
                                            System.out.printf("%s removed successfully.", category);
                                        } else {
                                            System.out.printf("%s could not be found.", category);
                                        }
                                    }
                                    else if (choice_3 == 2)
                                    {
                                        attraction0.viewAttractionDiscount();
                                        int index = sc4.nextInt();
                                        sc4.nextLine();         //consume newline of nextInt

                                        attraction0.setDiscount(index - 1, 0);
                                    }
                                }
                                else
                                {
                                    continue;
                                }

                            } else if (choice_1 == 5) {
                                //5. Set Special Deal

                                System.out.println("Below are the already available deals:");
                                visitor0.printSpecialDeals();

                                Scanner sc3 = new Scanner(System.in);
                                System.out.println("Enter the number of tickets: ");
                                int tickets = sc3.nextInt();
                                sc3.nextLine();         //consume newline of nextInt
                                System.out.println("Enter the discount");
                                int discount = sc3.nextInt();
                                sc3.nextLine();         //consume newline of nextInt

                                visitor0.setSpecialDeals(tickets,discount);

                            } else if (choice_1 == 6)
                            {
                                //6. View Visitor Stats

                                System.out.printf("-Total visitors: %d\n", visitor0.visitorCount());
                                System.out.printf("-Total revenue: %d\n", visitor0.getRevenue());
                                System.out.printf("-Most Popular Attraction: %s\n",attraction0.name(attraction0.popularAttraction()));
                            }
                            else if (choice_1 == 7)
                            {
                                //7. View Feedback
                                visitor0.printFeedbacks();
                            }
                            else if (choice_1 == 8) {
                                //8. Exit
                                break;
                            } else {
                                System.out.println("Enter a correct option.");
                            }
                        }
                    }
                    else
                    {
                        //user entered wrong password
                        System.out.println("You have entered wrong password!\nYou do not belong to ZOOtopia.\nEnter the correct password or you'll be reported to the Law Enforcement.\n");
                        continue;
                    }
            }

            //if visitor is selected
            else if (choice_0 == 2)
            {
                while(true) {
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("1. Register\n2. Login\n 3. Go back\n");
                    int choice_1 = sc1.nextInt();
                    sc1.nextLine();         //consume newline of nextInt

                    if (choice_1 == 1) {
                        Scanner sc2 = new Scanner(System.in);
                        System.out.println("Enter Visitor Name: ");
                        String name = sc2.nextLine();

                        System.out.println("Enter Visitor Age: ");
                        int age = sc2.nextInt();
                        sc2.nextLine();         //consume newline of nextInt

                        System.out.println("Enter Visitor Phone Number: ");
                        long phno = sc2.nextLong();
                        sc2.nextLine();         //consume newline of nextInt

                        System.out.println("Enter Visitor Balance: ");
                        int balance = sc2.nextInt();
                        sc2.nextLine();         //consume newline of nextInt

                        System.out.println("Enter Visitor Email: ");
                        String email = sc2.nextLine();

                        System.out.println("Enter Visitor Password: ");
                        String passwd = sc2.nextLine();

                        System.out.println("Enter Visitor category (if any valid, else press enter): ");
                        String category = sc2.nextLine();

                        //method overloading for category availability
                        if (category.isEmpty()) {
                            visitor0.addVisitor(name, age, phno, balance, email, passwd);
                        }
                        else {
                            visitor0.addVisitor(name, age, phno, balance, email, passwd, category);
                        }

                        System.out.println("Successfully registered.\n");

                    } else if (choice_1 == 2) {
                        System.out.println("Enter name/email: ");
                        String identifier = sc1.nextLine();
                        System.out.println("Enter  Password: ");
                        String pass = sc1.nextLine();
                        int login = visitor0.login(identifier, pass);

                        if (login != 0) {
                            System.out.println("You have successfully logged in.!\n");
                            while (true)
                            {
                                System.out.println("Visitor Menu:\n" +
                                        "1. Explore the Zoo\n" +
                                        "2. Buy Membership\n" +
                                        "3. Buy Tickets\n" +
                                        "4. View Discounts\n" +
                                        "5. View Special Deals\n" +
                                        "6. Visit Animals\n" +
                                        "7. Visit Attractions\n" +
                                        "8. Leave Feedback\n" +
                                        "9. Log Out\n");

                                Scanner sc2 = new Scanner(System.in);
                                System.out.println("Enter your choice: ");
                                int choice_2 = sc2.nextInt();
                                sc2.nextLine();         //consume newline of nextInt

                                if (choice_2 == 1)
                                {   //1. Explore the Zoo
                                    System.out.println("Explore the Zoo:\n" +
                                            "1. View Attractions\n" +
                                            "2. View Animals\n" +
                                            "3. Exit\n");

                                    System.out.println("Enter your choice: ");
                                    int choice_3 = sc2.nextInt();
                                    sc2.nextLine();         //consume newline of nextInt
                                    if (choice_3 == 1) {
                                        attraction0.viewAttraction();
                                    } else if (choice_3 == 2){
                                        mammals0.print();
                                        amphibians0.print();
                                        reptiles0.print();
                                    } else {
                                        continue;
                                    }
                                }
                                else if (choice_2 == 2)
                                {   //2. Buy Membership

                                    if (visitor0.viewMembership(login) != 0){
                                        System.out.println("Membership already bought.\n");
                                        continue;
                                    }
                                    System.out.println("Buy Membership: \n");
                                    System.out.printf("1. Basic Membership (₹%d)\n",visitor0.getMembershipPrice(0));
                                    System.out.printf("2. Premium Membership (₹%d)\n",visitor0.getMembershipPrice(1));
                                    int choice_3 = sc2.nextInt();
                                    sc2.nextLine();         //consume newline of nextInt

                                    int membershipStatus = visitor0.buyMembership(login, choice_3);
                                    if (membershipStatus == 0){
                                        System.out.println("Membership not bought.\n");
                                    }
                                    System.out.printf("Balance: ₹%d\n",visitor0.balanceLeft(login));
                                }
                                else if (choice_2 == 3)
                                {   //3. Buy Tickets

                                    if (visitor0.viewMembership(login) == 0)
                                    {
                                        System.out.println("Buy a membership first to purchase tickets.\n");
                                        continue;
                                    }
                                    else if (visitor0.viewMembership(login) == 2)
                                    {
                                        System.out.println("Premium membership already bought. No need to purchase tickets.\n");
                                        continue;
                                    }
                                    //down here is only for basic membership users
                                    System.out.println("Buy Tickets. \n");

                                    attraction0.viewAttractionPrice();
                                    System.out.println("Enter your choice: ");
                                    int serial = sc2.nextInt();
                                    sc2.nextLine();         //consume newline of nextInt

                                    System.out.println("Enter the number of tickets: ");
                                    int tickets = sc2.nextInt();
                                    sc2.nextLine();         //consume newline of nextInt


                                    //calculate price, if it fits the balance.
                                    int attrDiscount = attraction0.getDiscount(serial -1);
                                    int price = visitor0.calculateAmount(login, attraction0.viewCost(serial -1), tickets, attrDiscount);

                                    if (visitor0.balanceLeft(login) < price){
                                        System.out.println("Not enough balance left.\n");
                                        System.out.printf("Balance: ₹%d\n",visitor0.balanceLeft(login));
                                        continue;
                                    }

                                    visitor0.buyAttractionTicket(login,serial-1,price,tickets);
                                    attraction0.SOLD(serial -1, tickets);

                                    System.out.println("Ticket bought successfully.");
                                    System.out.printf("Balance: ₹%d\n",visitor0.balanceLeft(login));
                                }
                                else if (choice_2 == 4)
                                {   //4. View Discounts

                                    visitor0.printAgeDiscount();
                                    visitor0.printCategoriesDiscount();
                                    attraction0.viewAttractionDiscount();
                                }
                                else if (choice_2 == 5)
                                {   //5. View Special Deals
                                    visitor0.printSpecialDeals();
                                }
                                else if (choice_2 == 6)
                                {   //6. Visit Animals
                                    while (true) {
                                        System.out.println("1.Mammals\n2.Amphibians\n3.Reptiles\n4.Go back\n");
                                        System.out.println("Select one category: ");
                                        int category = sc2.nextInt();
                                        sc2.nextLine();

                                        if (category == 1) {
                                            mammals0.print();
                                            System.out.println("Enter the animal name: ");
                                            String name = sc2.nextLine();

                                            System.out.println("1.Feed\n2.Read\n");
                                            int choice_3 = sc2.nextInt();
                                            sc2.nextLine();
                                            if (choice_3 == 1)
                                            {
                                                mammals0.feed(name);
                                            } else if (choice_3 == 2) {
                                               mammals0.read(name);
                                            }
                                        } else if (category == 2) {
                                            amphibians0.print();
                                            System.out.println("Enter the animal name: ");
                                            String name = sc2.nextLine();

                                            System.out.println("1.Feed\n2.Read\n");
                                            int choice_3 = sc2.nextInt();
                                            sc2.nextLine();
                                            if (choice_3 == 1)
                                            {
                                                amphibians0.feed(name);
                                            } else if (choice_3 == 2) {
                                                amphibians0.read(name);
                                            }
                                        } else if (category == 3) {
                                            reptiles0.print();
                                            System.out.println("Enter the animal name: ");
                                            String name = sc2.nextLine();

                                            System.out.println("1.Feed\n2.Read\n");
                                            int choice_3 = sc2.nextInt();
                                            sc2.nextLine();
                                            if (choice_3 == 1)
                                            {
                                                reptiles0.feed(name);
                                            } else if (choice_3 == 2) {
                                                reptiles0.read(name);
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                else if (choice_2 == 7)
                                {   //7. Visit Attractions
                                    if (visitor0.viewMembership(login) == 0)
                                    {
                                        System.out.println("Buy a membership first to visit attractions.\n");
                                        continue;
                                    }
                                    System.out.println("Visit Attractions:\n" +
                                            "Select an Attraction to Visit:\n" +
                                            "1. Jungle Safari\n" +
                                            "2. Botanical Garden\n" +
                                            "3. Dinosaur Show\n" +
                                            "4. Exit\n");
                                    System.out.println("Enter your choice: ");
                                    int serial = sc2.nextInt();
                                    sc2.nextLine();         //consume newline of nextInt

                                    if (visitor0.viewMembership(login) == 1)
                                    {
                                        int ticketStatus = visitor0.useAttractionTickets(login, serial -1);

                                        if (ticketStatus == 0)
                                        {
                                            System.out.println("Ticket not available. Basic Members need to buy separate tickets for the attractions.\n");
                                            continue;
                                        }
                                    }
                                    System.out.println("Thank you for visiting. Hope you enjoyed the attraction.\n");
                                }
                                else if (choice_2 == 8)
                                {   //8. Leave Feedback

                                    System.out.println("Leave Feedback:\n");
                                    System.out.println("Enter your feedback (max 200 characters): ");
                                    String feedback = sc2.nextLine();

                                    visitor0.addFeedback(feedback);
                                    System.out.println("Thank you for your feedback.\n");
                                }
                                else if (choice_2 == 9)
                                {   //9. Log Out
                                    break;
                                }
                            }
                        }
                    }
                    else
                    {
                        break;
                    }
                }
            }

            // if view Discounts is selected
            else if (choice_0 == 3) {
                System.out.println("I see. You are just passing by and interested to check out our deals. I also do this sometimes.\nHere they are:");

                visitor0.printSpecialDeals();
                visitor0.printAgeDiscount();
                visitor0.printCategoriesDiscount();
                attraction0.viewAttractionDiscount();

            } else if (choice_0 == 4) {
                break;
            } else {
                System.out.println("Enter a valid option.\n");
                continue;
            }
        }

        System.out.println("Hate to see you go😖, but love to watch you leave.🫠\n");
    }
}

class Visitor {
    private ArrayList<visitor_profile> visitor = new ArrayList<>();
    //ageDiscount with 4 indices
    //zeroth -> minor age; first -> minor discount; second -> senior age; third -> senior discount
    private ArrayList<Integer> ageDiscount = new ArrayList<>();
    private Dictionary<String, Integer> categoryDiscount = new Hashtable<>();
    private ArrayList<Integer> specialDeals = new ArrayList<>();
    private ArrayList<String> Feedback = new ArrayList<>();
    private int[] membershipPrice = {30, 80};
    public Visitor()
    {
        visitor_profile v0 = new visitor_profile();
        v0.setName("Sample Name 1");
        v0.setAge(21);
        v0.setPasswd("tested");
        v0.setEmail("testee@test.com");
        v0.setBalance(100);
        v0.setPhone_no(9874563210L);
        visitor.add(v0);

        visitor_profile v1 = new visitor_profile();
        v1.setName("Sample Name 2");
        v1.setAge(23);
        v1.setPasswd("tested");
        v1.setEmail("tested@testee.com");
        v1.setBalance(100);
        v1.setPhone_no(9123453210L);
        visitor.add(v1);

        ageDiscount.add(10);
        ageDiscount.add(18);
        ageDiscount.add(60);
        ageDiscount.add(20);

        //initialize all specialDiscount elements to zero while extending it to 10
        for (int i=0; i <11; i++)
        {
            specialDeals.add(0);
        }
        specialDeals.set(2,15);
        specialDeals.set(3,30);
    }

    private int revenue = 0;
    public int getRevenue() {
        return revenue;
    }
    public void printSpecialDeals() {
            for (int i = 1; i < specialDeals.size(); i++) {
                if (specialDeals.get(i) ==0 )
                {
                    continue;
                }
                System.out.printf("Buy %d tickets and get %d%% off.\n", i, specialDeals.get(i));
            }
    }

    public void setSpecialDeals(int tickets, int discount) {
        specialDeals.set(tickets, discount);
    }


    public int visitorCount()
    {
        return visitor.size();
    }

    public void printAgeDiscount() {
        System.out.println("Age-based Discounts are: ");
        System.out.printf("Age <%d: -%d%%\n",ageDiscount.get(0),ageDiscount.get(1));
        System.out.printf("Age >%d: -%d%%\n",ageDiscount.get(2),ageDiscount.get(3));
    }

    public void setAgeDiscount(int index, int age, int discount) {
        ageDiscount.set(index, age);
        ageDiscount.set(index + 1, discount);
    }

    public int removeCategory(String key)
    {
        return categoryDiscount.remove(key);
    }

    public int login(String identifier, String passwd) {
        //if the identifier contains '@' then we treat it like an email and check only in email fields
        //and if not then check only name fields
        boolean containsAtSymbol = identifier.contains("@");
        if (containsAtSymbol) {
            for (int i = 0; i< visitor.size(); i++) {
                if (visitor.get(i).getEmail().equals(identifier)) {
                    if (visitor.get(i).getPasswd().equals(passwd)) {
                        return i;
                    } else {
                        return 0;
                    }
                } else {
                    continue;
                }
            }
            System.out.println("The given email does not exist in our record.\n");
        } else {
            for (int i = 0; i< visitor.size(); i++) {
                if (visitor.get(i).getName().equals(identifier)) {
                    if (visitor.get(i).getPasswd().equals(passwd)) {
                        return i;
                    } else {
                        return 0;
                    }
                } else {
                    continue;
                }
            }
            System.out.println("The given name does not exist in our record.\n");
        }
        return 0;
    }

    public void addVisitor (String name, int age, long phno, int balance, String email, String passwd)
    {
        visitor_profile v2 = new visitor_profile();
        v2.setName(name);
        v2.setAge(age);
        v2.setPhone_no(phno);
        v2.setBalance(balance);
        v2.setEmail(email);
        v2.setPasswd(passwd);
        visitor.add(v2);
    }
    public void addVisitor (String name, int age, long phno, int balance, String email, String passwd, String category)
    {
        visitor_profile v2 = new visitor_profile();
        v2.setName(name);
        v2.setAge(age);
        v2.setPhone_no(phno);
        v2.setBalance(balance);
        v2.setEmail(email);
        v2.setPasswd(passwd);
        v2.setCategory(category);
        if (!((Hashtable<String, Integer>) categoryDiscount).containsKey(category))
        {
            categoryDiscount.put(category, 0);
        }
        visitor.add(v2);

    }

    public void printCategoriesDiscount()
    {
        if (categoryDiscount.size() == 0)
        {
            System.out.println("No category-based discount added, as of yet.\n");
            return;
        }
        Enumeration<String> m = this.categoryDiscount.keys();
        System.out.println("Already entered categories and discounts:\n");
        int index = 1;
        while (m.hasMoreElements()) {
            String key = m.nextElement();
            System.out.printf("%d. %s: -%d%%\n", index, key, this.categoryDiscount.get(key));
            index += 1;
        }

    }

    public void addDiscount( String category, int discount)
    {
        categoryDiscount.put(category, discount);
    }

    public void addFeedback(String feedback)
    {
        this.Feedback.add(feedback);
    }

    public void printFeedbacks()
    {
        if (Feedback.isEmpty())
        {
            System.out.println("No feedback as of yet.");
        }
        else {
            int serial = 1;
            for (String str : Feedback) {
                System.out.printf("%d. %s\n",serial,str);
            }
        }
    }

    public int balanceLeft(int index)
    {
        return visitor.get(index).getBalance();
    }
    public int buyMembership(int index, int membership)
    {
        visitor.get(index).setMembership(membership);
        if (membership == 1)
        {
            if (visitor.get(index).getBalance() < membershipPrice[0]){
                System.out.println("Not enough balance.\n");
                return 0;
            }
            visitor.get(index).setBalance(visitor.get(index).getBalance() - membershipPrice[0]);
            //System.out.printf("balance in class: %d\n",visitor.get(index).getBalance());
            revenue += membershipPrice[0];
        }
        else if (membership == 2)
        {
            if (visitor.get(index).getBalance() < membershipPrice[1]){
                System.out.println("Not enough balance.\n");
                return 0;
            }
            visitor.get(index).setBalance(visitor.get(index).getBalance() - membershipPrice[1]);
            revenue += membershipPrice[1];
        }
        else
        {
            System.out.println("Invalid membership selected.");
            return 0;
        }
        System.out.printf("%s membership bought successfully.\n",visitor.get(index).getMembershipName());
        return 1;
    }
    public int getMembershipPrice(int index) {
        return membershipPrice[index];
    }
    public int viewMembership(int index)
    {
        return visitor.get(index).getMembership();
    }

    public int calculateAmount(int login, int cost, int tickets, int attrDiscount){

        int agediscount = 0;
        if (visitor.get(login).getAge() < ageDiscount.get(0))
        {
            agediscount = ageDiscount.get(1);
        } else if (visitor.get(login).getAge() > ageDiscount.get(0)) {
            agediscount = ageDiscount.get(3);
        }

        int catDiscount = 0;
        //System.out.printf("category: %s",visitor.get(login).getCategory());
        if (visitor.get(login).getCategory() != null)
        {
            catDiscount = categoryDiscount.get(visitor.get(login).getCategory());
        }

        int dealsDiscount = 0;
        if (specialDeals.get(tickets) != 0)
        {
            dealsDiscount = specialDeals.get(tickets);
        }

        System.out.printf("attrDisc: %d, ageDisc: %d, catDisc: %d, dealsDisc: %d\n",attrDiscount,agediscount,catDiscount,dealsDiscount);

        //do the all calculations of discounts and deals
        double totalDiscount =  attrDiscount +agediscount + catDiscount + dealsDiscount;

        return (int) ((tickets * cost) - (tickets * cost)*totalDiscount*0.01);
    }
    public void buyAttractionTicket (int login, int attractionIndex, int price, int tickets)
    {
        if (visitor.get(login).getBalance() < price)
        {
            System.out.println("shouldnt be here\n");
            //not enough balance
            return ;
        }
        if (price < 0){
            System.out.println("Lucky day for you!\nYou are getting money from us on buying ticket because of all the clubbed discounts.\n");
        }
        visitor.get(login).setBalance(visitor.get(login).getBalance() - price);
        revenue += price;

        visitor.get(login).addAttractionTickets(attractionIndex, tickets);
        System.out.printf("Balance in class: %d\n",visitor.get(login).getBalance());
    }
    public int useAttractionTickets(int login, int attractionIndex)
    {
        ArrayList<Integer> attractionTickets = visitor.get(login).getAttractionTickets();
        for (int i=0; i<attractionTickets.size(); i++)
        {
            if (attractionTickets.get(i) == attractionIndex)
            {
                attractionTickets.remove(i);
                System.out.println("1 Ticket used.\n");
                visitor.get(login).setAttractionTickets(attractionTickets);
                return 1;
            }
        }
        return 0;
    }
}

class visitor_profile {
    private String name;
    private int age;
    private long phone_no;
    private String passwd;
    private int balance;
    private String email;
    private String category = null;
    private int membership = 0;     //membership = 0 means no membership; 1 means basic; 2 means premium
    private ArrayList<Integer> attractionTickets = new ArrayList<>();
    public ArrayList<Integer> getAttractionTickets() {
        return attractionTickets;
    }
    public void addAttractionTickets(int attractionIndex, int tickets) {
        for (int i = 0; i<tickets; i++)
            this.attractionTickets.add(attractionIndex);
    }
    public void setAttractionTickets(ArrayList<Integer> AttractionTickets){
        this.attractionTickets = AttractionTickets;
    }
    public int getMembership() {
        return membership;
    }
    public void setMembership(int membership) {
        this.membership = membership;
    }
    public String getMembershipName(){
        if(membership == 0){
            return "None";
        }
        else if (membership == 1){
            return "Basic";
        }
        else if (membership == 2){
            return "Premium";
        }
        else{
            return "ERROR";
        }
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(long phone_no) {
        this.phone_no = phone_no;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class attraction{
    private ArrayList<attraction_profile> attr = new ArrayList<>();
    //implement half of modifyAttraction in the main block
    public attraction()
    {
        attraction_profile attr_prof0 = new attraction_profile();
        attr_prof0.setName("dinosaur show");
        attr_prof0.setID("001");
        attr_prof0.setDescription("Spectacular show about animals that are not even alive, only designed to appeal to your imagination, your only safe and happy place. We appeal to your imagination and you satisfyingly pay us great money. 🫠");
        attr_prof0.setCost(30);
        attr_prof0.setTickets_sold(0);
        attr_prof0.setSchedule(1200,1800);

        attr.add(attr_prof0);

        attraction_profile attr_prof1 = new attraction_profile();
        attr_prof1.setName("safari experience");
        attr_prof1.setID("002");
        attr_prof1.setDescription("Morty, we're going on a safari. It's like an animal show, but instead of clowns, it's Mother Nature herself, Morty, putting on a 'pre-human screw-up' display.");
        //add this when someone purchases a ticket to safari --> "That lion over there is the apex predator of this ecosystem. It's at the top of the food chain, and everything else is afraid of it. Except for me, of course. I could kill that lion with my bare hands if I wanted to."
        attr_prof1.setCost(40);
        attr_prof1.setTickets_sold(0);
        attr_prof1.setSchedule(800,1700);

        attr.add(attr_prof1);

        attraction_profile attr_prof2 = new attraction_profile();
        attr_prof2.setName("botanical garden");
        attr_prof2.setID("003");
        attr_prof2.setDescription("Take a look into our botanical garden filled with rare and beautiful flora.💐 (i don't think i need to comment on this one, it's pretty straight-forward.)");
        attr_prof2.setCost(20);
        attr_prof2.setTickets_sold(0);
        attr_prof2.setSchedule(800,1900);

        attr.add(attr_prof2);
    }

    public String name(int index)
    {
        return attr.get(index).getName();
    }

    public void addAttraction(String name, String ID, int cost, String description, int open, int close)
    {
        attraction_profile attr_prof = new attraction_profile();
        attr_prof.setName(name);
        attr_prof.setID(ID);
        attr_prof.setDescription(description);
        attr_prof.setCost(cost);
        attr_prof.setTickets_sold(0);
        attr_prof.setSchedule(open,close);

        attr.add(attr_prof);
    }

    public void viewAttraction()
    {
        int serial = 1;
        for (attraction_profile attractionProfile : attr) {
            System.out.printf("%d. %s, Price: %d\n- %s\nTimings: %d - %d\n", serial, attractionProfile.getName(), attractionProfile.getCost(), attractionProfile.getDescription(),attractionProfile.getSchedule().get(0), attractionProfile.getSchedule().get(1));
            serial += 1;
        }
    }

    public void viewAttractionDiscount()
    {
        System.out.println("Attraction-based discounts:\n");
        int serial = 1;
        for (attraction_profile attractionProfile : attr) {
            System.out.printf("%d. %s, Discount: %d\n", serial, attractionProfile.getName(), attractionProfile.getDiscount());
            serial += 1;
        }
    }

    public void viewAttractionPrice()
    {
        int serial = 1;
        for (attraction_profile attractionProfile : attr) {
            System.out.printf("%d. %s, Price: %d\n", serial, attractionProfile.getName(), attractionProfile.getCost());
            serial += 1;
        }
    }
    public void removeAttraction(String attraction_name)
    {
        for (int i=0; i< attr.size(); i++)
        {
            if (attr.get(i).getName().equals(attraction_name))
            {
                attr.remove(i);
            }
            else
            {
                continue;
            }
        }
    }

    public void setDiscount(int index, int discount )
    {
        attr.get(index).setDiscount(discount);
    }
    public int getDiscount(int index){
        return attr.get(index).getDiscount();
    }

    public void changeDescription(int index, String description)
    {
        attr.get(index).setDescription(description);
    }
    public int viewCost(int index){return attr.get(index).getCost(); }
    public void changeCost(int index, int cost) {attr.get(index).setCost(cost);  }

    public void set_Schedule(int index, int open, int close)
    {
        attr.get(index -1).setSchedule(open,close);
    }

    public int popularAttraction() {
        int maximum = 0;
        for (int i=1; i<attr.size(); i++)
        {
            if (attr.get(i).getSales() > attr.get(maximum).getSales())
            {
                maximum = i;
            }
        }
        return maximum;
    }
    public int SOLD(int index, int tickets) {
        this.attr.get(index).SOLD(tickets);
        return this.attr.get(index).getCost();
    }
}

class attraction_profile
{
    private String name;
    private String ID;
    private int tickets_sold;
    private int cost;
    private String description;
    private ArrayList<Integer> schedule = new ArrayList<>();
    private int discount = 0;

    public int getSales() {
        return sales;
    }
    public void SOLD(int tickets) {
        this.sales += tickets;
    }

    private int sales = 0;

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public ArrayList<Integer> getSchedule() {
        return schedule;
    }
    //HHMM format of timing
    public void setSchedule(int open, int close) {
        try {
            if (open > 2400 || close > 2400 || open < 0 || close < 0 || close < open) {
                throw new IllegalArgumentException("Incorrect Timings entered.");
            }
            else {
                if (schedule.size() == 2) {
                    schedule.set(0, open);
                    schedule.set(1, close);
                } else {
                    // If the list does not have at least 2 elements, you can add the elements.
                    schedule.add(open);
                    schedule.add(close);
                }
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    public int getTickets_sold() {
        return tickets_sold;
    }
    public void setTickets_sold(int tickets_sold) {
        this.tickets_sold = tickets_sold;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}

abstract class Animal{
    public abstract int addAnimal(ArrayList<String> animal);
    public abstract int addMore(String animal, int count);
    public abstract int remove(String animal);
    public abstract void feed(String animal);
    public abstract void read(String animal);
    public abstract void print();
}

class Mammals extends Animal{
    private ArrayList<AnimalProfile> mammals = new ArrayList<>();

    public Mammals(){
        AnimalProfile m0 = new AnimalProfile();
        m0.setName("Elephants");
        m0.setCount(4);
        m0.setSound("Blew a trumpet!");
        m0.setDescription("Throughout history, elephants have played a vital role in various cultures, revered for their immense strength and intelligence. They've been symbols of power and wisdom in many societies, and their use in warfare and transportation has left an indelible mark on human history. While admired, they've also faced exploitation and poaching, highlighting the urgent need for their conservation and protection. Today, elephants continue to captivate our imagination as majestic, gentle giants.");
        this.mammals.add(m0);

        AnimalProfile m1 = new AnimalProfile();
        m1.setName("Lion");
        m1.setCount(3);
        m1.setSound("ROARRR!!!");
        m1.setDescription("Lions, known as the \"King of the Jungle,\" have a storied history of symbolizing courage, strength, and royalty in numerous cultures. Ancient civilizations, like the Egyptians, revered them as symbols of power and regality. Despite facing habitat loss and conservation challenges, these majestic predators remain an iconic emblem of the wild.\nThey are just dope. What can I say.");
        this.mammals.add(m1);
    }
    public int addAnimal(ArrayList<String> animal){
        if (animal.size() == 3) {
                AnimalProfile m0 = new AnimalProfile();
                m0.setName(animal.get(0));
                m0.setCount(1);
                m0.setSound(animal.get(1));
                m0.setDescription(animal.get(2));
                this.mammals.add(m0);
                return 1;
        } else {
            System.out.println("The animal array must have a length of 2.");
            return 0;
        }
    }
    public int addMore(String animal, int count){
        try {
            for (int i=0; i<mammals.size(); i++) {
                if (mammals.get(i).getName().equals(animal)) {
                    mammals.get(i).setCount(count);
                    return 1;
                }
            }
            throw new IllegalArgumentException("Name not found in mammals");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    public int remove(String animal){
        try {
            for (int i=0; i<mammals.size(); i++) {
                if (mammals.get(i).getName().equals(animal)) {
                    mammals.remove(i);
                    return 1;
                }
            }
            throw new IllegalArgumentException("Name not found in mammals");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public void feed(String animal){
        for (int i=0; i<mammals.size(); i++) {
            if (mammals.get(i).getName().equals(animal)) {
                System.out.printf("%s\n",mammals.get(i).getSound());
            }
        }
    }

    public void read(String animal){
        for (int i=0; i<mammals.size(); i++) {
            if (mammals.get(i).getName().equals(animal)) {
                System.out.printf("%s\n",mammals.get(i).getDescription());
            }
        }
    }

    public void print(){
        System.out.println("Mammals: \n");
        for (int i=0; i<mammals.size(); i++) {
            System.out.printf("%d. Name: %s, Count: %d\n",i+1,mammals.get(i).getName(),mammals.get(i).getCount());;
        }
    }
}

class Amphibians extends Animal{
    private ArrayList<AnimalProfile> amphibians = new ArrayList<>();

    public Amphibians(){
        AnimalProfile m0 = new AnimalProfile();
        m0.setName("Salamanders");
        m0.setCount(6);
        m0.setSound("No sound.");
        m0.setDescription("Salamanders are ancient amphibians with a history dating back over 160 million years. They are known for their remarkable ability to regenerate lost body parts and are found in various habitats worldwide.");
        this.amphibians.add(m0);

        AnimalProfile m1 = new AnimalProfile();
        m1.setName("Toads");
        m1.setCount(11);
        m1.setSound("Croak...Croak..");
        m1.setDescription("Toads are amphibians known for their bumpy skin and a short, stout body. They have a fascinating history, as their existence dates back to ancient times, with diverse species found worldwide. These remarkable creatures have often been featured in folklore and myths, symbolizing transformation and adaptability.");
        this.amphibians.add(m1);
    }
    public int addAnimal(ArrayList<String> animal){
        if (animal.size() == 3) {
            AnimalProfile m0 = new AnimalProfile();
            m0.setName(animal.get(0));
            m0.setCount(1);
            m0.setSound(animal.get(1));
            m0.setDescription(animal.get(2));
            this.amphibians.add(m0);
            return 1;
        } else {
            System.out.println("The animal array must have a length of 2.");
            return 0;
        }
    }
    public int addMore(String animal, int count){
        try {
            for (int i=0; i<amphibians.size(); i++) {
                if (amphibians.get(i).getName().equals(animal)) {
                    amphibians.get(i).setCount(count);
                    return 1;
                }
            }
            throw new IllegalArgumentException("Name not found in mammals");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    public int remove(String animal){
        try {
            for (int i=0; i<amphibians.size(); i++) {
                if (amphibians.get(i).getName().equals(animal)) {
                    amphibians.remove(i);
                    return 1;
                }
            }
            throw new IllegalArgumentException("Name not found in mammals");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    public void feed(String animal){
        for (int i=0; i<amphibians.size(); i++) {
            if (amphibians.get(i).getName().equals(animal)) {
                System.out.printf("%s\n",amphibians.get(i).getSound());
            }
        }
    }

    public void read(String animal){
        for (int i=0; i<amphibians.size(); i++) {
            if (amphibians.get(i).getName().equals(animal)) {
                System.out.printf("%s\n",amphibians.get(i).getDescription());
            }
        }
    }
    public void print(){
        System.out.println("Amphibians: \n");
        for (int i=0; i<amphibians.size(); i++) {
            System.out.printf("%d. Name: %s, Count: %d\n",i+1,amphibians.get(i).getName(),amphibians.get(i).getCount());;
        }
    }
}

class Reptiles extends Animal{
    private ArrayList<AnimalProfile> reptiles = new ArrayList<>();
    public Reptiles(){
        AnimalProfile m0 = new AnimalProfile();
        m0.setName("Crocodiles");
        m0.setCount(4);
        m0.setSound("~grunt~");
        m0.setDescription("Crocodiles are ancient reptiles that have existed for over 200 million years. They are often referred to as \"living fossils\" due to their long evolutionary history and relatively unchanged physical characteristics.");
        this.reptiles.add(m0);

        AnimalProfile m1 = new AnimalProfile();
        m1.setName("Komodo Dragon");
        m1.setCount(3);
        m1.setSound("_hissss____");
        m1.setDescription("The Komodo dragon, a formidable lizard native to Indonesia, has a history dating back millions of years. These ancient reptiles are renowned for their large size, unique hunting capabilities, and distinct existence as the world's largest lizards.\nI mean, they are DRAGONSSS. They have dragon in their name. How cool is that! The name is enough.\n");
        this.reptiles.add(m1);
    }
    public int addAnimal(ArrayList<String> animal){
        if (animal.size() == 3) {
            AnimalProfile m0 = new AnimalProfile();
            m0.setName(animal.get(0));
            m0.setCount(1);
            m0.setSound(animal.get(1));
            m0.setDescription(animal.get(2));
            this.reptiles.add(m0);
            return 1;
        } else {
            System.out.println("The animal array must have a length of 2.");
            return 0;
        }
    }
    public int addMore(String animal, int count){
        try {
            for (int i=0; i<reptiles.size(); i++) {
                if (reptiles.get(i).getName().equals(animal)) {
                    reptiles.get(i).setCount(count);
                    return 1;
                }
            }
            throw new IllegalArgumentException("Name not found in mammals");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    public int remove(String animal){
        try {
            for (int i=0; i<reptiles.size(); i++) {
                if (reptiles.get(i).getName().equals(animal)) {
                    reptiles.remove(i);
                    return 1;
                }
            }
            throw new IllegalArgumentException("Name not found in mammals");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    public void feed(String animal){
        for (int i=0; i<reptiles.size(); i++) {
            if (reptiles.get(i).getName().equals(animal)) {
                System.out.printf("%s\n",reptiles.get(i).getSound());
            }
        }
    }

    public void read(String animal){
        for (int i=0; i<reptiles.size(); i++) {
            if (reptiles.get(i).getName().equals(animal)) {
                System.out.printf("%s\n",reptiles.get(i).getDescription());
            }
        }
    }
    public void print(){
        System.out.println("Reptiles: \n");
        for (int i=0; i<reptiles.size(); i++) {
            System.out.printf("%d. Name: %s, Count: %d\n",i+1,reptiles.get(i).getName(),reptiles.get(i).getCount());;
        }
    }
}

class AnimalProfile{

    String Name;
    int count;
    String sound;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    String description;
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}