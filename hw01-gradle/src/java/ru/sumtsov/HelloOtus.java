package ru.sumtsov;

import com.google.common.collect.Ordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HelloOtus {
    public static void main(String args[]) {

        List<Integer> figures = new ArrayList<Integer>();

        figures.add(6);
        figures.add(22);
        figures.add(20);
        figures.add(44);
        figures.add(5);

        Ordering ordering = Ordering.natural();
        System.out.println("As-is order: " + figures);


        Collections.sort(figures,ordering);
        System.out.println("Sorted order: " + figures);

     }
}
