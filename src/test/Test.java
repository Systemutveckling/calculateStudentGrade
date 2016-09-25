/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


/**
 *
 * @author hampus
 */
public class Test {

    public static void main(String[] args) throws InterruptedException{
        
        int[] students = new int[6];
        
        Random rnd = new Random();
       
        
        for(int i = 1; i < students.length;i++){
        int randomGrade = rnd.nextInt(5)+1;
        students[i] += randomGrade;
        System.out.print("Betyg för student " + i + " är " + students[i] + " --->");
        for(int j = 1; j <= students[i];j++){
            System.out.print(" * ");
        }
                System.out.println("");

        }

    }
    
}
    
    

