import java.util.Arrays;


public class App {

    //-------------------Method for sort String Array in Dictionary Order (Ordem Alfabética)--------------------------//

    public String [] stringSort(String [] array){

        for(int i = 0; i < array.length - 1; i++) {

            for(int k = i+1; k < array.length; k++) {  

                if(array[i].compareToIgnoreCase(array[k]) > 0){ //below there an comment explain the .compareToIgnoreCase method of String Class
                    String temp = array[i];   
                    array[i] = array[k]; 
                    array[k] = temp; 
                }
          
            }
        }

        return array; 
    }
/*
 * We can also compare String values lexicographically (think dictionary order) using the .compareTo() method. 
 * When we call the .compareTo() method, each character in the String is converted to Unicode; then the Unicode 
 * character from each String is compared.
 * The method will return an int that represents the difference between the two Strings.
 * For example:

    String flavor1 = "Mango";
    String flavor2 = "Peach";
 
    System.out.println(flavor1.compareTo(flavor2)); 

* Our program above will output -3.
* When we use .compareTo(), we must pay attention to the return value:

* If the method returns 0, the two Strings are equal.
* If the value is less than 0, then the String object is lexicographically less than the String object argument.
* If the value is greater than 0, then the String object is lexicographically greater than the String object argument.
* In the example above, "Mango" comes before "Peach", so we get a negative number (we specifically get -3 
* because the Unicode values of "M" and "P" differ by 3). If we did flavor2.compareTo(flavor1), we would get 3, 
* signifying that "Peach" is greater than "Mango". Note: Make sure to pay attention to capitalization when using .compareTo(). 
* Upper case and lower case letters have different Unicode values. For example, when comparing "Mango" and "Peach", we got -3, 
* meaning that "Mango" was smaller. But if we compare "mango" and "Peach" we get 29. The Unicode value for lower case "m" is 
* actually larger than upper case "P". Using .compareToIgnoreCase() will perform the same task, but will  not consider upper/lower case.
 */

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String[] names = {"Jack", "Ana", "Felipe", "Marcos", "Marcelo", "adelina", "Bruna", "Denis", "danilo"}; 
        App teste = new App(); 
        String[] namesDicOrder = teste.stringSort(names); 

        System.out.println(Arrays.toString(namesDicOrder));

        String line = "The Heav'ns and all the Constellations rung";   
        
        //Study method's .substring of class String
        System.out.println(line.substring(4, 11)); //output "Heav'ns"

        //Method .indexOf off Class String
        System.out.println(line.indexOf("H")); //Outuput 4
        System.out.println(line.indexOf("s")); //Output 10

        //Method .substring(beginIndex(String.indexOf(), endIndex(String.indexOf()))); 
        System.out.println(line.substring(line.indexOf("H"), line.indexOf(" an")));//Output "Heav'ns"

        //Method .charAt(index) of Class String. 
        System.out.println(line.charAt(13)); 

        /*Main Method's of String Class:
         * String class:
         * .length()
         * .concat()
         * .indexOf()
         * .charAt()
         * .equals() / .equalsIgnoreCase()
         * .substring()
         * .toUpperCase() / .toLowerCase()
         */
    }
}
