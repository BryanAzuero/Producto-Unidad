/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FileTxt.model;

import java.io. *;

/**
 *
 * @author USUARIO
 */
public class Data {
    static int totalLines;
    static int totalterms;
    
    public static void save(String fileName,String record){
        
        System.out.println("calling save method, with parameters : " +fileName +" and" + record);
    }
    
    public static void find(String fileName,String term){
        File file = new File(fileName);         
        
        try {
            if(file.exists()) {
                BufferedReader readfile = new BufferedReader(new FileReader(file));
                String readLine;
                while((readLine = readfile.readLine()) != null) {
                    totalLines = totalLines + 1;
                    String[] terms = readLine.split(" ");
                    for(int i = 0 ; i < terms.length ; i++) {
                        if(terms[i].equals(term)) {
                            totalterms = totalterms + 1;
                            System.out.println(readLine);
                            System.out.println(" The line: " + totalLines + " the words was found: " + term);
                            System.out.println("");
                        }
                    }
                }
            }
            System.out.println("the word: " + term + "it was found " + totalterms + " in the file");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
