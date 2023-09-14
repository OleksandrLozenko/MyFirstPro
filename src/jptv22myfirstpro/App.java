package jptv22myfirstpro;

import java.util.Scanner;
/**
 *
 * @author Sanya
 */
public class App {

    private final Scanner sc;
    boolean repeat = true;
    
    public App() { 
        this.sc = new Scanner(System.in);
    }
    
    public void run(){
        do{
            System.out.println("Выберите задачу из списка: " + "\n");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Демонстрация работы со строками");
            System.out.println("2. Демонстрация работы с массивами");
            System.out.print("Номер задачи: ");
            
            int user  = sc.nextInt(); sc.nextLine();
            
            switch (user) {
                case 0:
                    System.out.print("Вы выбрали -> Dыход из программы!");
                    repeat = false;
                    break;
                    
                case 1:
                    System.out.print("Вы выбрали задачу -> Демонстрация работы со строками!" + "\n");
                    
                    break;
                    
                case 2:   
                    System.out.print("Вы выбрали задачу -> Демонстрация работы с массивами!" + "\n");
                    
                    break;
                    
                default:
                    System.out.print("Выберите номер задачи из списка = (1,2) или выйдите из программы = (0)!" + "\n");
            }
        }while(repeat);
        
    }
    
    
    
}
