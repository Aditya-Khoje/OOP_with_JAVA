/*
Name :- Aditya Khoje
Roll No :- SYITA156
Design a class named weather report that holds a daily weather report with data members day_of_month, 
hightemp, lowtemp, amount_rain and amount_snow. Use different types of constructors to initialize the 
objects. Write a program to generate monthly report that displays average of each attribute. 
*/

import java.util.Scanner;

class Wheather {
    int date_of_month;
    float high_temp;
    float low_temp;
    float rain_amount;
    float snow_amount;

    Wheather() {

    }

    Wheather(int dom, float ht, float lt, float rm, float sm) {

        date_of_month = dom;
        high_temp = ht;
        low_temp = lt;
        rain_amount = rm;
        snow_amount = sm;
    }

    void setData() {
        Scanner scan = new Scanner(System.in);
        float temp;
        int date;

        System.out.print("Enter the date of month : ");
        date = scan.nextInt();
        date_of_month = date;
        System.out.print("Enter highest temperature : ");
        temp = scan.nextFloat();
        high_temp = temp;
        System.out.print("Enter lowest temperature : ");
        temp = scan.nextFloat();
        low_temp = temp;
        System.out.print("Enter amount of rain  : ");
        temp = scan.nextFloat();
        rain_amount = temp;
        System.out.print("Enter amount of snow : ");
        temp = scan.nextFloat();
        snow_amount = temp;
        System.out.println();
    }

    void showData() {
        System.out.print("Enter the date of month : ");
        System.out.print("Enter highest temperature : ");
        System.out.print("Enter lowest temperature : ");
        System.out.print("Enter amount of rain  : ");
        System.out.print("Enter amount of snow : ");
        System.out.println();
    }

    static void showAvg(float ht, float lt, float rm, float sm) {
        System.out.println("Average highest temperature : " + ht);
        System.out.println("Average lowest temperature : " + lt);
        System.out.println("Average amount of rain : " + rm);
        System.out.println("Average amount of snow : " + sm);
    }

}

public class Assignment2 {

    public static void main(String args[]) {
        int n;
        float ht = 0, lt = 0, rm = 0, sm = 0;

        System.out.print("Enter the number of days in month : ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        Wheather[] arr = new Wheather[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Wheather();
            arr[i].setData();
        }

        for (int i = 0; i < n; i++) {

            ht += arr[i].high_temp;
            lt += arr[i].low_temp;
            rm += arr[i].rain_amount;
            sm += arr[i].snow_amount;

        }

        ht = ht / n;
        lt = lt / n;
        rm = rm / n;
        sm = sm / n;

        Wheather.showAvg(ht, lt, rm, sm);

    }
}