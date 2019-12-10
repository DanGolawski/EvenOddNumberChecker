package com.dangolawski;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int writtenNumber;
        while(true) {
            System.out.print("Write a number to check : ");
            writtenNumber = scanner.nextInt();
            System.out.println(EvenOddChecker.checkByBitwiseWay(writtenNumber) == 0 ? "Even" : "Odd");
            Thread.sleep(1500);
        }

    }
}
