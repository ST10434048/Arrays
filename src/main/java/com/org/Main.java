package com.org;

import javax.swing.*;
import java.util.Arrays;
import java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the array:"));
        int[] collection = new int[size];
        int sum = 0;
        double average;
        for (int i=0; i  < collection.length;i++) {
            collection[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
            sum += collection[i];
        }

        //clone array
        int[] sorted = collection.clone();

        //sort cloned array
        Arrays.sort(sorted);

        JOptionPane.showMessageDialog(null,"Array in horizontal order: "+ Arrays.toString(collection));

        //cast to double for average
        average = (double) sum /collection.length;
        
        //display average, sum and sorted array
        JOptionPane.showMessageDialog(null,"The Sum: " + sum + "\nThe Average : " + average + "\nArray in sorted order: "+ Arrays.toString(sorted));

        //vertical display
        String vert= "";
        for(int i=0; i  < sorted.length;i++) {
            vert += sorted[i] +"\n";
        }
        JOptionPane.showMessageDialog(null, "Array vertically sorted: \n" + vert);

        //Smallest
        JOptionPane.showMessageDialog(null,"The Smallest: " + sorted[0]);

        //Largest
        JOptionPane.showMessageDialog(null,"The Largest: " + sorted[size-1]);

        // odd or even
        if(average%2 ==0 ) {
            JOptionPane.showMessageDialog(null,"The Average is even");
        }else{
            JOptionPane.showMessageDialog(null,"The Average is odd");
        }
    }



}