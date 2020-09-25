/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19parsingstring;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {
    public void run(){
        System.out.println("-------------- Работа со строкой --------------");
        System.out.println("------------------------------------------------");
        System.out.println("Список задач: ");
        System.out.println("1. Посчитать количесиво слов в строке");
        System.out.println("2. Найти указанную подстроку в исходной строке");
        System.out.println("3. Заменить исходную строку строку на указанную");
        System.out.println("4. Удалить все теги из html строки");
        System.out.println("5. Удалить конкретный тег");
        System.out.println("------------------------------------------------");
        System.out.println("Введите исходную строку");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("------------------------------------------------");
        System.out.println("Выберите номер задачи: ");
        String task = scan.nextLine();    
        switch (task) {
            case "1":
                System.out.println("Вы выбрали: Посчитать количесиво слов в строке");
                System.out.println("Количество слов в строке "+ this.getCountWords(str));
                break;
            case "2":
                System.out.println("Вы выбрали: Найти указанную подстроку в исходной строке");
                break;
            case "3":
                System.out.println("Вы выбрали: Заменить исходную строку строку на указанную");
                break;
            case "4":
                System.out.println("Вы выбрали: Удалить все теги из html строки");
                break;
            case "5":
                System.out.println("Вы выбрали: Удалить конкретный тег");
                break;
            default:
                System.out.println("НЕТ такой задачи");
        }
            
    }
    private int getCountWords(String str) {
        if(str.isEmpty()) {
            return 0;
        }
        String[] arrStr = str.split(" ");
        return arrStr.length;
    }
    
}
