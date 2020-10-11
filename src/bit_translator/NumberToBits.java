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

//this class converts numbers to bits
package bit_translator;

public class NumberToBits {
    int number;
    //int noConstructor = 1000;

    public NumberToBits(int number){
        this.number = number;
    }  
    
    public int findDiv(int div){
        int localDiv = div / 2;           
        return localDiv;
    }
    public int findMod(int mod){
        int localMod = mod % 2;
        return localMod;
    }
    //converts numbers to bits
    public String convertNumberToBits(int input){
        int[] dividends = new int[8];
        int[] modulus = new int[8];
        
        String orderedBitsString = "";
        StringBuilder bits = new StringBuilder();
        
        //divide input integer by two and get the 
        //modulus to find if each bit is a one or zero
        
        int innerDiv = input;
        int innerMod = input;
        String res = "";
        
        for(int i = 0; i < dividends.length; i++){
            modulus[i] = findMod(innerDiv);
            dividends[i] = findDiv(innerDiv);       
            innerDiv = dividends[i];
        
        }    
           
        for(int x = modulus.length - 1; x >= 0; x--) {
            bits.append(modulus[x]);
            res = bits.toString();   
        }       
        //return the result
        return res;
    }
    
}
