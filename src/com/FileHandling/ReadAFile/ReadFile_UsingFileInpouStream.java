package com.FileHandling.ReadAFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile_UsingFileInpouStream {

    public static void main(String[] args) {
        String path = "D:\\IntelijiSumitRepository\\File Handling Folder\\Naven.txt";
        FileInputStream fip = null;
        try {
            File file = new File(path);
            fip = new FileInputStream(file);
            System.out.println("File content is");
            int c = 0;
            while ((c = fip.read())!=-1)
            {
               // System.out.println(c);//return byte value
                System.out.print((char) c);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try {
                fip.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
