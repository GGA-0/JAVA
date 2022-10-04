package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Window window = new Window(4, true);

        Room myRoom = new Room(window);
        myRoom.getWindow().openWindow();
        myRoom.getWindow().closeWindow();

    }
}
