package com.example.test;

import static com.example.test.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from AnotherThread!!!");
    }
}
