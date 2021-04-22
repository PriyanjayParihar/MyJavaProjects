/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotePadApplication.gui;


import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author priya
 */
public class FileChooserPopUp {
    public static String jChooserControl(){
         JFileChooser jFileChooser=new JFileChooser();  
         jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
         jFileChooser.setFileFilter(new FileNameExtensionFilter("java File", "java"));
          jFileChooser.setFileFilter(new FileNameExtensionFilter("Text Document", "txt"));
         //jFileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Text Document", "txt"));
         
         if(jFileChooser.showSaveDialog(null)== JFileChooser.APPROVE_OPTION){
              
               String path=jFileChooser.getSelectedFile().toString();
               System.out.println(jFileChooser.getFileFilter().getDescription().equals("Text Document"));
               String desc=jFileChooser.getFileFilter().getDescription();
               switch (desc){
                   case "Text Document":{
                       if(!path.endsWith(".txt"))
                           path=path+".txt";break;
                   }
                   case "java File": {
                       if(!path.endsWith(".java"))
                           path=path+".java";break;
                   }
                       
                       
               }
               
               System.out.println(path);
               return path;
         }
         
        return null;
                   
       
    }
    public static void main(String[] args) {
        FileChooserPopUp.jChooserControl();
    }
}
