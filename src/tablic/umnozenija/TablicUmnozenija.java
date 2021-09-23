
package tablic.umnozenija;

import java.util.Random;
import java.util.Scanner;

public class TablicUmnozenija {
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*ПРОГРАММА-ТЕСТ ДЛЯ ПРОВЕРКИ ЗНАНИЯ ТАБЛИЦЫ УНОЖЕНИЯ*");
        System.out.println("------------------------------------------------------");
        int max=10, min=1, attempt=0;
        Random random = new Random();
        for(int i=0;i<5;i++){
            int testNum1 = random.nextInt(max - min + 1)+min;
            int testNum2 = random.nextInt(max - min + 1)+min;
            int example=testNum1*testNum2;
            System.out.printf("%d*%d=",testNum1,testNum2);
            int answer= scanner.nextInt();
            if(answer==example){
                System.out.println(ANSI_GREEN + "*ПРАВИЛЬНО*" + ANSI_RESET);
                attempt++;
            }else{
                System.out.println(ANSI_RED + "*ОШИБКА*" + ANSI_RESET);
                
            }
               
                
            
        }
        switch (attempt) {
            case 5:
                System.out.println("Молодец!");
                break;
            case 4: case 3:
                System.out.println("Надо бы еще поучить!");
                break;
            default:
                System.out.println("Срочно нужно учить таблицу умножения!");
                break;
        }
    }    
    
}
