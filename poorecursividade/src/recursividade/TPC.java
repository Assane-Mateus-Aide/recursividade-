/*
Classe em java responsavek en coverter um decimal para binario 
 */
package recursividade;

import java.nio.file.Path;

/**
 *
 * @author Assane
 */
public class TPC {
    /**
     * Algoritmo que calcula o número de digitos binários de um número n (inteiro positivo) 
     * ou seja converte um número inteiro positivo em um binário.
     * @param num o que sera convertido em binario
     */
    static void decimalBinario(int num){
        if (num==0) {
          return;
        }
         decimalBinario(num/2);
         System.out.print(num%2);
        
    }
    /**
     * Faça um método recursivo que realize a multiplicação entre dois números
     * inteiros, sem utilizar o operador de multiplicação (*).
     * @param numx
     * @param numy
     * @return 
     */
    
    public static int multiplicarSemMultiplicador(int numx,int numy){
        
          if (numx==1) {
            return numy;
          }
          if (numy==1) {
            return numx;
          }
       //   return numx+somarSucessivamente(numx, numy-1);    poderia ser este trecho pois a multiplicacao e comutativa
          return numy+multiplicarSemMultiplicador(numx-1, numy);    
       
    }
    
    /**
     * Faça um programa (utilizando recursividade) que peça para o 
     * utilizador digitar um número, em seguida, faça a soma de todos os algarismos do 
     * número. Exemplos: 1111 = 1+1+1+1 = 4 2090 = 2+0+9+0 = 11.
     * @param num
     * @return 
     */
    
    static int somarAlgarismos(int num){
        if (num==0) {
            return num;
        }
        return somarAlgarismos(num/10)+num%10;
      
    }
    
    static int quantidade(int num, int n, int i){
        if (num==0) {
            return i;
        }
        if (num%10==n) {
            i++;
        }
        return quantidade(num/10, n, i);
    
    }
    
    static void combinacoes(){
        
    }
    
    static void listarDirectorios(Path dir){
        
    }
    
    
    
    
    
    
    public static void main(String[] args) {
         //decimalBinario(4);
        // System.out.println(somarAlgarismos("1212"));
         
    }
    
    
}
