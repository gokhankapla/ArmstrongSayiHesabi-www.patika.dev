package com.gokhankaplan.armstrongsayihesabi;

import java.util.Scanner;

public class ArmstrongSayiHesabi {
    public static void main(String[] args) {
        int number, i, sum=0;
        int basamaksayisi = 0;
        int modenumber, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        number = input.nextInt();
        int number2 = number;

        while (number2!=0){
            number2 /= 10;
            basamaksayisi++;
        }

        System.out.println("Girdiğiniz sayının basamak sayısı: " + basamaksayisi);
        number2 = number;
        while (number2!=0){
            modenumber = number2 % 10;
            result=1;
            for (i = 1; i<=basamaksayisi; i++)
            {
                result *= modenumber;
            }
            sum += result;
            number2 /= 10;
        }
        System.out.println(sum);


    }
}
