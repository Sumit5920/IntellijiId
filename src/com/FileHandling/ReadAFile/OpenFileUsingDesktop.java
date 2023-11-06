package com.FileHandling.ReadAFile;

import java.awt.*;
import java.io.File;

public class OpenFileUsingDesktop {

    public static void main(String[] args) {

        String path = "D:\\IntelijiSumitRepository\\File Handling Folder\\Naven.txt";

        try{

           File file = new File(path);
           if (!Desktop.isDesktopSupported())
           {
               System.out.println("Cnanot supported");
               return;
           }

            Desktop deskt = Desktop.getDesktop();
           if (file.exists()){
               deskt.open(file); //launch file
           }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
