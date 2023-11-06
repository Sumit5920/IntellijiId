package com.FileHandling;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {

        files();

        }

        public static void files()
        {
            File fle = new File("D:\\IntelijiSumitRepository\\File Handling Folder\\Demo.txt");
            File outputfle = new File("D:\\IntelijiSumitRepository\\File Handling Folder\\Demo_copy.txt");

            FileInputStream fileInputStream= null;
            FileOutputStream fileOutputStream = null;

            try {
                fileInputStream = new FileInputStream(fle);
                fileOutputStream = new FileOutputStream(outputfle);
                System.out.println("First try executed");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

            try {
                System.out.println(fileInputStream.available());//byte value
                System.out.println("second try executed");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

//read file
            try
            {
                int i;
                while ((i = fileInputStream.read())!=-1){
                    fileOutputStream.write(i);
                }
            }
            catch (Exception e)
            {
                System.out.println("Error found"+e.getMessage());
            }

            //close both stram
            finally {
                if (fileInputStream != null)
                {
                    try {
                        fileInputStream.close();
                        System.out.println("Input stram closed");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(fileOutputStream !=null)
                {
                    try {
                        fileOutputStream.close();
                        System.out.println("outputstream closed");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
