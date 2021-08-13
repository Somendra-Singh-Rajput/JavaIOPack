/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaiopack.bufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author singh
 */
public class BufferedReaderFile {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileReader fr = new FileReader("demo1.txt");
        
        BufferedReader br = new BufferedReader(fr);
        
        String line  = br.readLine();
        
        while(line!=null){
            System.out.println(line);
            line=br.readLine();
        }
        br.close();
    }
    
}
