/*
    FizzBuzz.java
    This program outputs numbers from 1 to 100 that prints Fizz for multiples of 3, Buzz for the multiples of 5 and FizzBuzz for the multiples of both 3 and 5.
    Author: CMK
 */
public class FizzBuzz {
    public static void main(String[]args){

        for(int i = 1; i <= 100; i++) {

           if((i % 3 == 0) && (i % 5 == 0)){
               System.out.println("FizzBuzz");
           }else if(i % 3 == 0){
               System.out.println("Fizz");
           }else if(i % 5 == 0){
               System.out.println("Buzz");
           }else{
               System.out.println(i);
           }
        }

    }
}
