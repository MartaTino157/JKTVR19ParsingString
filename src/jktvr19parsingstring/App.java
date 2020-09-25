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
    private Scanner scan = new Scanner(System.in);
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
        System.out.println("Введите исходную строку латиницей");
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
                int n = this.searchSubString(str);
                if(n >= 0) {
                    System.out.println("Строка найдена в позиции "+n);
                }else{
                    System.out.println("Такой строки не найдено");
                }
                break;
            case "3":
                System.out.println("Вы выбрали: Заменить исходную строку строку на указанную");
                System.out.println("Результат: "+this.replaceString(str));
                break;
            case "4":
                System.out.println("Вы выбрали: Удалить все теги из html строки");
                //<html><head><title>Say: "Hello!"</title></head><body><h1>Hello everyone!</h1></body></html>
                System.out.println("Результат: "+this.deliteTags(str));
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
    private int searchSubString(String str) {
        System.out.println("Введите искомую строку");
        String subStr = scan.nextLine();
        int n = str.toLowerCase().indexOf(subStr.toLowerCase());
        return n;
    }

    private String replaceString(String str) {
        System.out.println("Введите искомую строку");
        String subStr = scan.nextLine();
        System.out.println("На что заменить: ");
        String replaceStr = scan.nextLine();
        StringBuffer sb = new StringBuffer(str);
        int firstIndex = str.indexOf(subStr);
        int endIndex = firstIndex + subStr.length();
        sb.replace(firstIndex, endIndex, replaceStr);
        return sb.toString();
    }

    private String deliteTags(String str) {
        String str = n;
        while (true) {
            int fIndex = str.indexOf("<");
            if(fIndex == -1) break;
            int sIndex = str.indexOf(">");
            StringBuffer sb = new StringBuffer(str);
            sb.delete(fIndex, sIndex);
            String n = sb.toString();
            return n;
        }     

    }
    
}
