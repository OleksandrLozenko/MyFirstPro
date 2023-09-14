/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv22myfirstpro;

import java.util.Scanner;
import tasks.MyArrays;
import tasks.MyStrings;

/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        boolean repeat = true;
        System.out.println("Здравствуйте!");
        do{
            System.out.println("Выберите задачу: ");
            System.out.println("0. Закрыть программу");
            System.out.println("1. Демонстрация свойств строки");
            System.out.println("2. Демонстрация свойств массивa");
            
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    MyStrings mySrtings = new MyStrings();
                    mySrtings.doStrings();
                    break;
                case 2:
                    MyArrays myArrays = new MyArrays();
                    myArrays.doMyArrays();
                    break;
                default:
                    System.out.println("Выберите цифру из списка");
                    System.out.println("---------------------");
            }
        }while(repeat);
        System.out.println("Программа закрыта");
    }
}
