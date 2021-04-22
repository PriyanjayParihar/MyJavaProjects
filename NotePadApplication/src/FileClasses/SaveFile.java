/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author priya
 */
public class SaveFile {
    
    public static void saveFile(String str,String path) throws FileNotFoundException, IOException{
        System.out.println("saved worked");
        File file=new File(path);
        if(!file.exists()){
            System.out.println(file.exists());
            System.out.println(file.createNewFile());
        }
        PrintWriter pw=new PrintWriter(file);
        System.out.println("from savefile class data is "+str);
        pw.println(str);
        pw.close();
            
                    
        
        
    }
    
}
