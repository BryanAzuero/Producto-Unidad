/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filetxt;
import ec.edu.espe.FileTxt.model.Person;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author USUARIO
 */
public class FileTxt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person Student = new Person();
        Scanner leer = new Scanner(System.in);
        String name="";
        String lastname="";
        String address="";
        int age=0;
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo = new File("Person.txt");
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                System.out.println("Enter name");
                name=leer.nextLine();
                Student.setName(name);
                System.out.println("Enter lastname");
                lastname=leer.nextLine();
                Student.setLastname(lastname);
                System.out.println("Enter the address");
                address=leer.nextLine();
                Student.setAddress(address);
                System.out.println("Enter age");
                age=leer.nextInt();
                Student.setAge(age);
                leer.nextLine();
                
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                linea.println("name:"+Student.getName());
                linea.println("lastname:"+Student.getLastname());
                linea.println("address:"+Student.getAddress());
                linea.println("age:"+Student.getAge());
                linea.println("*****************************");
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(FileTxt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                
                System.out.println("Enter name");
                name=leer.nextLine();
                Student.setName(name);
                System.out.println("Enter lastname");
                lastname=leer.nextLine();
                Student.setLastname(lastname);
                System.out.println("Enter the address");
                address=leer.nextLine();
                Student.setAddress(address);
                System.out.println("Enter age");
                age=leer.nextInt();
                Student.setAge(age);
                leer.nextLine();
                
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                linea.println("name:"+Student.getName());
                linea.println("lastname:"+Student.getLastname());
                linea.println("address:"+Student.getAddress());
                linea.println("age:"+Student.getAge());
                linea.println("*****************************");
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(FileTxt.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
     
        
    }
    
    
    
    
}
