import java.util.Arrays;

public class App {

    public void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(" " + array[i] + " "); 
        }
    }

    public void reverseArray(int [] array){
        int start = 0; 
        int end = array.length - 1; 
        while(start < end){
            int temp = array[start]; 
            array[start] = array[end]; 
            array[end] = temp; 
            start++;
            end--; 
        }

    }


    public void minArray1(int [] array){

        if(array==null || array.length ==0){
            throw new IllegalArgumentException("Invalid input"); 
        }
        
        int min = array[0]; 

        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i]; 
            }
        }

        System.out.println(min);
    }

    //função com complexidade Big(O2) para achar o segundo maior valor de um array of integers: 

    public int findSecondMaxValue(int[] array){ 

        //1º vamos ordenar o array em ordem crescente, pois se o array estiver na ordem crescente o último index armazenará o maior valor e o penúltimo index o segundo maior

        for(int i = 0; i < array.length - 1; i++) {

            for(int k = i+1; k < array.length; k++) {  

                if(array[i] > array[k]){  //Se value at index i for maior que o value at next index (k)
                    int temp = array[i];   //então trocamos de lugar, o value at index i é salvo in temporally variable
                    array[i] = array[k]; //é trocado a posição dos array, fazendo que o value na posição seguinte venha para posição anterior
                    array[k] =temp; //o array na posição seguinte recebe o que estava na posição anterior
                } 
            }
          
        }
        
        System.out.println(Arrays.toString(array)); //vai imprimir o array na ordem crescente, ou seja, do menor para o maior
        
        /*Agora temos a seguinte situação, visualize esses dois arrays

         * array1 = {1,2,3,4,5,6}  --> O último valor é o maior (array1[lentgh -1]) e o penúltimo é o segundo maior (array[lentgh-2])
         * nessa situação basta retornar o valor armazenado no penúltimo index!!
         * 
         * porém, E... se tivermos o seguinte array: 
         * 
         * array2 = {1,2,3,4,5,6,6,6,6,6,6} --> Veja o penúltimo valor é igual ao último, ou seja as duas ultimas posições do index
         * são ocupadas pelos maiores valores do array, então nem sempre o valor armezenado no pnúltimo index é o segundo maior
         * 
         * PARA RESOLVERMOS ISSO PRECISAMOS DA SEGUNDA PARTE DO METHOD: 
         */
       
        int secondMax = 0; //inicializar 

        if(array[array.length-1] == array[array.length-2]){ //verifica se o valores at último e penúltimo index são igual, se true: 

            int count = 0; //inicializamos a variable of loop control
            int i = array.length -2; //armazenamos o valor na penúltima posição do array na variable i

            while(count < i){ //entramos no loop que vai iteirar da penúltima posição para as primeiras ou seja de trás pra frente
            
                if(array[i] == array[i-1]){ //aqui vamos comparar a valor at penultima posição do index com o valor da antepenúltima posição (lembre-se de que os valores da última e pnúltima já foram comparados no primeiro if)
                    i--; //and so on (e assim por diante até o valores serem diferentes)
                } else{
                   secondMax = array[i-1]; //quando os valores da posição atual de i for diferente da anterior, acharemos o segundo maior valor do array.
                    break; 
                }
            }

        } else{

            secondMax = array[array.length-2]; //caso os valores armazenados nas últimas posições do array na ORDEM CRESCENTE forem diferentes
                                              //a variable secondMax já recebe a penúltima posição do array que nessa situação será o segundo maior value of array.
        }

        

        return secondMax; 

        //esse metódo tem complexidade Big(o2) pois possui dois loops 3 if's e else então é um metódo mais lento e consome mais memory

        } 


    //**************************************************************************************************************************************** */

    public int findSecondMaxValue1(int[] array){ //outra solução para achar o segundo maior valor do array

    //Esse metódo tem um abordagem que consome menos memória e roda mais rápido, pois tem apenas um loop e um if-else-----------
    // para entender melhor esse segundo metódo acessar: https://youtu.be/UULE-HyfERc

        int maxValue = Integer.MIN_VALUE; 
        int secondMax = Integer.MIN_VALUE; 
        
        for(int i = 0; i < array.length; i++){

            if(array[i] > maxValue){
                secondMax = maxValue;
                maxValue = array[i]; 
            }else if(array[i] > secondMax && array[i] != maxValue){
                secondMax = array[i]; 
            }
        }

        return secondMax; 
    }

    /******************************************************************************************************************************************************** */

    //-----------------------Como mover todos os zeros de um array para as posições finais sem alterar a posição dos demais? ----------------------------

    public int [] moveAllZeros(int[] array){

        int end = array.length -1; 
        for(int i = 0; i < array.length; i++){

            if(array[i] == 0){
                int holzero = array[i];

                for(int k = i +1; k < array.length - k; k++){
                    array[i] = array[k]; 
                    array[k] = array[k+1];
                }
            array[end-i] = holzero; 
                
            }

        }

        return array;
    }

    public static void main(String[] args) throws Exception {
        
        App teste = new App(); 
        int[] numb = {0,1,0,4,12};
        //teste.minArray1(numb);
        //System.out.println(teste.findSecondMaxValue(numb)); //complexidade Big(o2)
        //System.out.println(teste.findSecondMaxValue1(numb));
        System.out.println(Arrays.toString(teste.moveAllZeros(numb))); 
        
        
    }
}
