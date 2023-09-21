package com.techprimers;

import com.techprimers.world.HelloWorld;
import com.techprimers.youtube.HelloYoutube;
public class Main {
    public static void main(String[] args){

        HelloYoutube helloYoutube = new HelloYoutube();
        helloYoutube.print();
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.printHello();
    }
}
