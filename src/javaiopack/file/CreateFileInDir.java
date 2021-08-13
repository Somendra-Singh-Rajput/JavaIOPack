/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaiopack.file;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author singh
 */
public class CreateFileInDir {
    public static void main(String[] args) throws IOException
    {
     
        File f = new File("Sam");
        
        f.mkdir();
        
        File f1 = new File("Sam","sam.txt");
        f1.createNewFile();
        
        //FIle creation in a specified dir
        
        File f2 = new File("F:\\Txt","abc.pdf");
        
        f2.createNewFile();
               
    }
}
