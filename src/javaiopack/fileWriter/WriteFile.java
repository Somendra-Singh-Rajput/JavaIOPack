/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaiopack.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author singh
 */
public class WriteFile {
    
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("abc.txt",true);
        fw.write(98);
        fw.write("\nSomendra Singh rajput");
        fw.write("\n");
        char[] ch={'a','b','c'};
        fw.write(ch);
        fw.write("\n");
        fw.flush();
        fw.close();
        //System.out.println(fw);
    }
    
}
