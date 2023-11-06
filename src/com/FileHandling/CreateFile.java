package com.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CreateFile {

    public static void main(String[] args) {

//        String path = "D:\\IntelijiSumitRepository\\File Handling Folder\\simple.txt";
//
//        File file = new File(path);
//        try {
//            boolean newFile = file.createNewFile();
//            if (newFile) {
//                System.out.println("New file created");
//            } else {
//                System.out.println("newFile is already present");
//            }
//        } catch ( Exception e) {
//            e.printStackTrace();
//        }
//

        //2nd way to create n write in file
       //with  FileOutputStream 


        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter file name withe Location: ");

            String fileName = sc.nextLine();

            FileOutputStream fos = new FileOutputStream(fileName , true);
            System.out.println("Enter file content :");
            String contant = sc.nextLine();
            byte[] b = contant.getBytes();

            fos.write(b);
            fos.close();

            System.out.println("File location is saved :");
        }catch (Exception e)
        {
            System.out.println("Error");
        }





    }
}
