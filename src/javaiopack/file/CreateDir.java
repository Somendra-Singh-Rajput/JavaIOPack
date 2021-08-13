/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaiopack.file;

import java.io.File;

/**
 *
 * @author singh
 */
public class CreateDir {
    public static void main(String[] args)
    {
        File f = new File("Demo");
        
        System.out.println(f.exists());
        
        f.mkdir();
        
        System.out.println(f.exists());
    }
    
}
