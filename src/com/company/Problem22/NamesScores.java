package com.company.Problem22;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NamesScores {
    public static void main ( String args[] ) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader("src/com/company/Problem22/Names.txt")).useDelimiter(",");
        ArrayList<String> names = new ArrayList<>();
        long result = 0;
        while (sc.hasNext()) {
            String next = sc.next();
            next = next.replaceAll("\"", "");
            names.add(next);
        }
        sc.close();
        Collections.sort(names);
        int count = 0;
        for ( String name : names ) {
            count++;
            long val = 0;
            for ( int i = 0; i < name.length(); i++ ) {
                val += name.charAt(i) - 'A' + 1;
            }
            result += val * count;
        }
        System.out.println(result);
    }
}
