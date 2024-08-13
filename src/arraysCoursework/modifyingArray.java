package arraysCoursework;

import java.util.Scanner;

/*
Exercise 2: Accessing and Modifying Array Elements
Task: Create an array of strings with 4 elements representing names. Replace the third element with a new name and print all the names.
Challenge: Write a method that takes the array and a name as arguments and returns the index of that name in the array.
 */
public class modifyingArray {
    public static void main(String[] args) {
        //Task 1
        String [] name ={"jake","Anna","john","Tom"};
        for(String n :name){
            System.out.println(n);
        }

       //Challenge
        Scanner input = new Scanner(System.in);
        String[] names = {"jake", "Anna", "john", "Tom"};
        System.out.println("Enter the name you want to search: ");
        String searchName = input.nextLine();
        System.out.println("The index of the name is: " + findIndex(names, searchName));
    }

    public static int findIndex(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1; // return -1 if the target is not found in the array
    }
}
