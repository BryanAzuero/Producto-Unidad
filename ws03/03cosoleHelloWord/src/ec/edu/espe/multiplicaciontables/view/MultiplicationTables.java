/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.multiplicaciontables.view;

/**
 *
 * @author Bryan Azuero
 */
public class MultiplicationTables {
    public static void main(String[] args ){
        System.out.println("Multiplication tables from 1 to 10");
        for(int j=1;j<=10;j++){
            System.out.println("Multiplication table "+j);
            for(int i=0;i<=10;i++){
                int result=i*j;
                System.out.println(+j+ "X"+i+"="+result);
            }
            System.out.println("==========================");
        }
    }
}
