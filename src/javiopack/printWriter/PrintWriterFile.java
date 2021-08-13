/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javiopack.printWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author singh
 */
public class PrintWriterFile {
    
    public static void main(String[] args) throws IOException
    {
       FileWriter fw = new FileWriter("abcd.txt");
        
        PrintWriter pw = new PrintWriter(fw);
        
        pw.write(100);
        pw.println(100);
        
        pw.println(true);
        pw.println('c');
        
        pw.println("Somendra");
        pw.flush();
        pw.close();
        
    }
    
}
