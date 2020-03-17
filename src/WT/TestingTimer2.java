package WT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestingTimer2 {

    public static void main(String[] args) throws IOException {
        int x =10;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long startTime = System.currentTimeMillis();
        while ((System.currentTimeMillis() - startTime) < x * 1000
                && !in.ready()) {
        }

        if (in.ready()) {
            System.out.println("You entered: " + in.readLine());
        } else {
            System.out.println("You did not enter data");
        }
    }

}
