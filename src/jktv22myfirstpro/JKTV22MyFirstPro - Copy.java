/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv22myfirstpro;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV22MyFirstPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String firstname = scanner.nextLine();
        System.out.print("Введите вашу фамилию: ");
        String lastname = scanner.nextLine();
        System.out.println("Hello " + firstname + " " + lastname + "!");
        System.out.print("Введите год вашего рождения: ");
        int currentYear = 2023;
        int currentMonth = 9;
        int currentDay = 7;
        int yourYear = scanner.nextInt();
        int yourMonth = scanner.nextInt();
        int yourDay = scanner.nextInt();
        int old = currentYear - yourYear;
        int year = currentYear - yourYear;
        int month = currentMonth - yourMonth;
        int day = currentDay - yourDay;
        System.out.println("Вам " + old + " лет");
        System.out.println("Вам " + year + " лет" + month + " mesjacev" + day + " dnei");
        Object obj = new Object();*/
        
        MyClass myClass = new MyClass(1);
        myClass.setNum(2);
        System.out.println(myClass.getNum());
    }
    
}
