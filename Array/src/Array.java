import java.util.Arrays;

public class Array {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //declarando um array simples

        int[] teste; //array declarado

        //Agora com array declarado vamos inicializar
        //Quando o array é inicializado ele passa reservar espaço na memória para armanezar os dados
        //Syntax: arrayName = new dataType[size of array]
        teste = new int[5]; //aqui foi inicializado o array chamado teste com espaço para store 5 elementos
        
        //------O Array também pode ser declarado e inicializado na mesma linha
        
        int[] myArray = new int[5]; // o array myArray foi declarado e inicializado na mesma linha

        String[] myArray2 = new String[5]; //Agora declaramos e inicializamos um array com dataType = String

        // ---- Podemos declarar, inicializar e armanezar os elementos no nosso array de uma só vez

        int[] myLife = {33,88,99,45,69}; // Agora criamos, inicializamos e fizemos o store dos elementos no Array3

        //Adicionando valores de maneira manual ao Array teste

        teste[0] = 25; //add 25 to index position 0
        teste[1] = 50; 
        teste[2] = 91; 
        int  x = 25;
        int y = 33; 
        int average = (x+y)/2; 
        teste[3] = average; //o array pode armazenar uma variável que referencia um integer
        teste[4] = x; // index 4 is the last

        //teste[5] = 88; //Nessa linha ocorrerá um erro (rodar para ver) pois não tem no array o index de número 5
        //o cumprimento do array ou "length" é sempre seu valor -1 ou seja
        // o array teste tem size 5 ou o length (cumprimento do indice) sera igual length - 1 no caso do array teste (5 -1)
        // então o indíce do array teste vai de 0-1-2-3-4 (um total de 5 index começando do 0 para store os elementos)

        //---------------Adicionando elementos no Array através de um Loop

        int storeArray = 0; 

        System.out.println("O cumprimento do myArray é " + myArray.length); //myArray tem um cumprimento = 5. 

        for(int i =0; i < myArray.length; i++){ 
            
            int randomNumber = 20*i; //aquie criei um cálculo qualquer para gerar um número (value/valor) que é a add em cada position (index) do array
            myArray[i] = storeArray + randomNumber; //em cada iteração é add um valor a cada index do array
            System.out.println("No loop " + i + " o Meu Número Random é " + randomNumber +" é foi add posição do meu array " + i + " Armazenou " + myArray[i]);

        }
        
        System.out.println("\n" + Arrays.toString(myArray));
        
    }
}
