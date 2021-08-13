/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaiopack.fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author singh
 */
public class ReadFile2 {
    
     public static void main(String[] args) throws FileNotFoundException, IOException
    {
        File f = new File("abc.txt");
        
        FileReader fr = new FileReader(f);
        
        char[] ch = new char[(int)f.length()];
        
        fr.read(ch);
        for(char ch1:ch)
        {
            System.out.println(ch1);
        }
    }
    
}
