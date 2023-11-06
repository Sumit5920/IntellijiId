package com.FileHandling;

import java.io.File;
import java.util.Arrays;

public class PrintFilename {

    public static void main(String[] args) {

        String path = "C:\\Users\\amitu\\Downloads";
        File file = new File(path);
        File[] dir = file.listFiles();
        Arrays.sort(dir);
        for (File e : dir) {
            if(e.isFile()){
                System.out.println("File "+e.getName()+"path"+e.getPath());
            }
            else if(e.isDirectory())
            {
                System.out.println("Dir"+e.getName());
            }
            else
            {
                System.out.println("Other "+e.getName());
            }
            
        }

    }
}

