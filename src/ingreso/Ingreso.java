/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingreso;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Ingreso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ingresar n números enteros, visualizar la suma de los números pares de la lista, 
        //cuantos pares existen y cuál es la media de los números impares.
        Scanner scanner =new Scanner(System.in);
        int n,i,x,a=0,b=0,c=0,d=0;
        double e;
        do{
            System.out.print("Valor de n : ");
            n=scanner.nextInt();
        }while(n<=0);
        for(i=1;i<=n;i++)
        {
            System.out.print("Ingrese numero : ");
            x=scanner.nextInt();
            if(x%2==0)
            {
                c++;
                a=a+x;
            }
            else
            {
               d++;
               b=b+x;
            }
        }
        if(c>0)
        {
            System.out.println("La suma de los numeros pares es : "+a);
            System.out.println("La cantidad de numeros pares es : "+c);
        }
        else
            System.out.println("No se Ingresaron numeros pares");
        if(d>0)
        {
            e=(double)b/d;
            System.out.println("La media de los impares es : "+e);
        }
        else
            System.out.println("No se Ingresaron numeros impares");
    
    }
    
}
