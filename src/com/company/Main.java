package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int counter = 1;

        while(counter <= 10)
        {
            System.out.println(" %d " + counter);
            ++counter;

            User user = new User();
            user.number="08163246611";
                    System.out.println(user.number);
            user.getNumber();
            System.out.println("user.surname");

        } //end while


    }
}
