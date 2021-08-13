/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javiopack.bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author singh
 */
public class BufferedWriterFile {
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("demo1.txt");
        
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write(100);
        
        bw.newLine();
        char[] ch={'a','b','c'};
        bw.write(ch);
        
        bw.newLine();
        
        bw.write("Somendra");
        
        bw.newLine();
        
        bw.write("Singh Rajput");
        
        bw.flush();
        
        bw.close();
        
    }   
}
