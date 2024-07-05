# ZOOtopia!!!

## Project Overview:

The code appears to be a Java program for managing a virtual zoo or wildlife attraction. It focuses on different aspects of managing attractions, visitor profiles, animal profiles, and ticket sales. The code is structured into several classes that handle specific functionalities. Let's break down the major components:

## Visitor Profile Management:

visitor_profile class is responsible for managing visitor profiles. It stores visitor information such as name, age, phone number, balance, email, category, membership, and attraction tickets.

The class provides methods for buying attraction tickets and using them, setting visitor balance, category, and membership.

## Attraction Management:

Attraction class is used to manage attractions within the zoo. It contains a list of attraction_profile objects, each representing an individual attraction.

The class allows you to add, view, and modify attractions. You can set descriptions, prices, discounts, and schedules for each attraction.

It also provides methods to view attraction details, attraction-based discounts, and remove attractions.

You can track the most popular attraction based on the number of tickets sold.

## Animal Management:

The code includes classes for managing different types of animals, including mammals, amphibians, and reptiles.

These animal classes inherit from an abstract Animal class and provide methods to add animals, set counts, remove animals, feed them, and read about them. They maintain a list of animal profiles.

## Data Structures:

The code makes use of ArrayLists for storing visitor profiles, attractions, and animal profiles.
Main Functionality:

The program is for selling attraction tickets, managing visitor profiles, managing various types of animals, and providing information about attractions and animals. It also supports adding, modifying, and removing attractions, as well as tracking their popularity.

## ASSUMPTIONS:
Admin Password: @3qwerty

1.scheduleEvents --> used to change the schedule of an attraction
2.manage_attraction--> used to only change cost and description of an attraction 
3.category number --> 1.  Mammals
		    2. Amphibians
		    3. Reptiles

4.For discounts, there are three ways. 
First, there could be discount based on the age, i.e. minor or senior.
Second, there could be different categories a visitor can belong to (for eg. student, army). 
Inside 'add Discount', if admin adds a discount for some category and the category doesn't already exists then it would be added to the category list or if the category already exists then discount would be added to it. 
Third, there could some discount on few selected attractions.

5. 1 visitor is already added in the code. 

6.If two or more attraction have the same number of tickets sold, then popular attraction will show only the first in the serial number.


USAGE:

Follow the given steps in the home folder(the same directory where this readme resides):
1) mvn clean 
2) mvn compile
3) mvn package
4) java -jar ./target/ZooBuddies-1.0-SNAPSHOT.jar org.example.Main args


