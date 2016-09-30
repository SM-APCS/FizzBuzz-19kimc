/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author Mr. T - Chad Kim
 * @class AP CSA
 */
public class FizzBuzz {

    /**
     * i used a for loop to print the numbers from 1 to 100 and inside that I
     * inserted an if and if else statement print Fizz when the modulator 
     * prints 0 and the same concept for printing Buzz in place of multiples of
     * 5
     */
    public static void main(String[] args) {
        /**
     * i used a for loop to print the numbers from 1 to 100 and inside that I
     * inserted an if and if else statement print Fizz when the modulator 
     * prints 0 and the same concept for printing Buzz in place of multiples of
     * 5
     */
        for(int i = 1; i < 101; i++)
        {
            if(i % 3 == 0)
            {   
                System.out.println("Fizz");
            }
            else if(i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
    
}
