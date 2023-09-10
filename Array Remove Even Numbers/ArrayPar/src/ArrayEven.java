import java.util.Arrays;

public class ArrayEven {

    /*if we want to get only odd numbers from a give array
     * for that first will would count how much odd numbers 
     * our array have.
     */

    public static int[] removeEven(int [] array) {

       int oddCount = 0; 
        for(int i = 0; i < array.length; i++){
            if(array[i]%2 != 0){   //if a number was even, the  module those number will return 0 and don't increment oddCount
                oddCount++;        //Otherwise if was odd number module to 2 will return 1, so 1 it's diferent to 0, if condition return true, make oddCount be increament
            }
        }

    /*Now known how many odd numbers the array contains
     * will be possible create a new array only with odd Numbers
     * and remove all even intengers numbers. 
     */
        int [] oddNumbers = new int [oddCount];
        int index = 0; 
        for(int i = 0; i < array.length; i++) { //aqui novamente iremos percorrer todo o array que contém int pares e impares
            if(array[i] %2 != 0){ //faremos o teste para verificar se o número at index i é par ou impar
                oddNumbers[index] = array[i] ; //Caso seja impar esse número será atribuído ao nosso array de impares oddNumbers. 
                index ++; 
            }
        }

       
        return oddNumbers; 
    }

    public static int[] reverseArray(int[] arr){

        int reverseCount = arr.length -1;                  /*here we create the array starter and reverse array */
        int[] reverseArray = new int[arr.length];          //the reverse array have the same lentgh of starter array
                                                           // we'll iterate starter array at last index, with reverse array at first index swap values
        for(int i = 0; i < arr.length; i++) {
            reverseArray[i] = arr[reverseCount]; 
            reverseCount --; 
        }

        return reverseArray; 
    }

    //Another solution for reverse Array is throught while loop: 

    public static int[] whileReverse(int[] arr, int start, int end) {
        start = 0; //index at first position (zero)
        end = arr.length-1; 
        while(start < end){
            int holderTemp = arr[start]; //the variable holderTemp holds temporally the value  at index [start ou zero]
            arr[start] = arr[end]; //here swap value at index starter (zero) with value at last index (length -1)
            arr[end] = holderTemp; //finally value at last index swap for value at starter index
            start++; 
            end--; 
        }
        return arr; 
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        
        int[] colection = {1,2,3,4,5,6,98,65,88,54}; 

        System.out.println("Array com integers pares e impares " + Arrays.toString(colection));

        int [] onlyOddInt = removeEven(colection);

        System.out.println("Arrays only with odd intergers" + Arrays.toString(onlyOddInt));

        int[] reverseArray = reverseArray(colection); 

        System.out.println("Arrays na ordem revertida" + Arrays.toString(reverseArray));

        int[] reverseWithWhile = whileReverse(colection, 0, colection.length); 
        
        System.out.println("Arrays na ordem revertida com while" + Arrays.toString(reverseWithWhile));
    }
}
