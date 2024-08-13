package arraysCoursework;

/*
Exercise 1: Array Declaration and Initialization
Task: Declare an array of integers with 5 elements. Initialize the array with values 10, 20, 30, 40, 50. Print each element of the array.
Challenge: Modify the array to hold 10 elements, and initialize it using a loop that assigns values 10, 20, 30,..., 100.
*/
public class arrayDeclaration {
       public static void main(String[] args) {
        int [] num = {10, 20, 30, 40, 50};
        //Declare an array of integers with 5 elements.
           for (int j : num) {
               System.out.println(j);
           }
        //Modify the array to hold 10 elements, and initialize it using a loop that assigns values 10, 20, 30,..., 100
              num = new int[10];
              for (int i = 0; i < num.length; i++) {
                     num[i]= (i +1) * 10;
                     System.out.println(num[i]);
              }
    }
}
