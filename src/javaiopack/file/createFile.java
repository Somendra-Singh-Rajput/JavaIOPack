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
public class createFile {
    public static void main(String[] args) throws IOException
    {
        File f = new File("abc.txt");
        System.out.println(f.exists());
        
        f.createNewFile();
        System.out.println(f.exists());
    }
    
}
