/**
 * Name: Drew Williams
 * Course: Computer Organization I (11533)
 * Section: 221
 * Semester: Fall 2016
 * Class Time: Tuesday/Thursday 10:00-11:50am
 * Lab: #1
 * 
 * This program provides a GUI that a user can use to either convert an 8-bit 
 * binary value into a decimal or a decimal number equal to or less than 255
 * into an 8-bit unsigned string of bits. 
 * 
 * I have also provided a drop down menu so the user can select which conversion
 * to perform, as well as a clear button to erase the text fields, an exit button
 * to exit the program, and a calculate button which tells the program when to 
 * calculate the numbers in the text field. This displays the answer to the 
 * result text field.
 * 
 * There is also input error detection and correction in my code. If the user
 * enters a bad character or a numerical value outside of the programs bounds
 * the user is alerted. Also white space is automatically erased.
 */

package bit_translator;

import java.util.Arrays;

public class BitsToNumber {
    String bits;
    
    public BitsToNumber(String bits){
        this.bits = bits;
    }   

    public String convertBitsToNumber(String myNumber){
        
        int bitSum = 0;
        String bitSumString = "";
        //parse string to integer
        int input = Integer.parseInt(myNumber);
        //create char array
        char[] charArray = myNumber.toCharArray();    
        //loop which itterates over char array of bits
        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] != '0'){
                //check each bit for zero or one and 
                //add amount to bitSum total
                switch(i) {
                    case 0: bitSum += 128;
                    break;
                    case 1: bitSum += 64;
                    break;
                    case 2: bitSum += 32;
                    break;
                    case 3: bitSum += 16;
                    break;
                    case 4: bitSum += 8;
                    break;
                    case 5: bitSum += 4;
                    break;
                    case 6: bitSum += 2;
                    break;
                    case 7: bitSum += 1;
                    break;
                }
            }   
                    
            }     
        //convert bitSum total back to a string    
        bitSumString = Integer.toString(bitSum);
        //return the result
        return bitSumString;
    }
    
}