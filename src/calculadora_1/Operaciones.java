/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora_1;

/**
 *
 * @author juqui
 */
public class Operaciones {
    
    //Atributos
    //Metodos 
    //Metodos de suma
    
    public int suma(int numero1, int numero2){
        int suma=numero1+numero2;
        return suma;
    }
    
    public int restar(int numero1, int numero2){
        int resta=numero1-numero2;
        return resta;
    }
    
    public int multiplicar(int numero1, int numero2){
        int multiplicacion=numero1*numero2;
        return multiplicacion;
    }
    
    public int dividir(int numero1, int numero2){
        int dividir=numero1/numero2;
        return dividir;
    }
    
    public void mostrarResultados(int suma, int resta, int multiplicacion, int dividir){
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);            
        System.out.println("La multiplicacion es " + multiplicacion);
         System.out.println("La division es " + dividir);
    }
    
}
