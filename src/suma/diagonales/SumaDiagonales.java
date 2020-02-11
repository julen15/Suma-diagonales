/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.diagonales;
import java.util.Scanner;

/**
 *
 * @author demen
 */
public class SumaDiagonales {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args){
        Scanner consola =new Scanner(System.in);
        int x,y;
        int rt1=0,rt2=0;
     System.out.println("Programa que suma las diagonales de una matriz nxn y da como resultado el valor absoluto de su diferencia ");
        System.out.print("Digite las  dimensiones de la matriz ");
        x= consola.nextInt();
        y=x;
        int matriz [][]=new int [x][y] ;
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                System.out.print("Digite los valores["+i+"]["+j+"]");
                matriz[i][j]=consola.nextInt();
            }
        }
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                System.out.print(matriz[i][j]+" ");
                
                        
            }
            System.out.println(); 
        }
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                if(i==j)
                {
                    rt1+=matriz[i][j];
                }
            }
        }
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
               if((i+j)==x-1)
               {
                   rt2+=matriz[i][j];
                   
                   
               }
            }
        }
        
        System.out.println("La suma de la primera diagonal es:"+rt1);
        System.out.println("La suma de la segunda diagonal es:"+rt2);
        System.out.println("La diferencia entre las diagonales es:"+(rt1-rt2));
        
    }
    
 }
