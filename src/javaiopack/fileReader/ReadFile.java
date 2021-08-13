/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaiopack.fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author singh
 */
public class ReadFile {
    
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileReader fr = new FileReader("abc.txt");
        
        int i=fr.read();
        while(i!=-1)
        {
            System.out.println((char)i);
            
            i=fr.read();
        }
    }
    
}
