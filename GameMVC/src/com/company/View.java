package com.company;


import java.util.Scanner;

public class View{
    public void type(String message) {
        System.out.println(message);
    }

    Scanner sc = new Scanner(System.in);

    public int read(){
        return sc.nextInt();
    }

}
