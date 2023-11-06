package com.FileHandling.ImageHandling;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageH {
    public static void main(String[] args) {
        try {

            //url image
//            URL url = new URL("https://images-eu.ssl-images-amazon.com/images/G/31/img21/Scroll/Camera/Topdeal/n/Desktop_CC_2X._SY608_CB575822413_.jp");
//            BufferedImage img = ImageIO.read(url);
//
//            //convert jgp to another format
//
//            ImageIO.write(img,"jpg", new File("D:\\IntelijiSumitRepository\\File Handling Folder\\Image\\laptop.jpg"));
//            ImageIO.write(img,"gif", new File("D:\\IntelijiSumitRepository\\File Handling Folder\\Image\\laptop.gif"));
//            ImageIO.write(img,"png", new File("D:\\IntelijiSumitRepository\\File Handling Folder\\Image\\laptop.png"));
//            ImageIO.write(img,"bmp", new File("D:\\IntelijiSumitRepository\\File Handling Folder\\Image\\laptop.bmp"));
//            System.out.println("By url Done");

            //file or desktop image
            File file = new File("D:\\IntelijiSumitRepository\\File Handling Folder\\Image\\neture.jpg");
            BufferedImage img = ImageIO.read(file);

            //convert jgp to another format

            ImageIO.write(img,"jpg", new File("D:\\IntelijiSumitRepository\\File Handling Folder\\Image\\netures.jpg"));
            ImageIO.write(img,"gif", new File("D:\\IntelijiSumitRepository\\File Handling Folder\\Image\\netures.gif"));
            ImageIO.write(img,"png", new File("D:\\IntelijiSumitRepository\\File Handling Folder\\Image\\netures.png"));
            ImageIO.write(img,"bmp", new File("D:\\IntelijiSumitRepository\\File Handling Folder\\Image\\netures.bmp"));
            System.out.println("By file Done");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
