package com.example.stivosha.test_2_1.Classes;


public class Person {
    private static boolean dead = false;
    private static double money = 100;
    private static double respect = 0;
    private static double iq = 90;
    private static double money_for_food = 1;
    private static int day = 0;
    private static int money_for_up = 0;
    /*public Person(){
        this.money_for_up = 0;
        this.iq = 90;
        this.respect = 0;
        this.money = 100;
        this.money_for_food = 1;
        this.month = 0;
    }*/

    public static boolean getDead() {
        return dead;
    }

    public static void setDead(boolean dead) {
        Person.dead = dead;
    }

    public static void setMoney_for_up(int money_for_up) {
        Person.money_for_up = money_for_up;
    }

    public static int getMoney_for_up() {

        return money_for_up;
    }

    public static double getMoney_for_food() {
        return money_for_food;
    }

    public static int getDay() {
        return day;
    }

    public static void setMoney_for_food(double money_for_food_) {
        money_for_food_ = money_for_food_*100;
        money_for_food_ = Math.round(money_for_food_);
        Person.money_for_food = money_for_food_/100;
    }

    public static void setDay(int day) {
        Person.day = day;
    }

    public static double getMoney() {
        return money;
    }

    public static double getRespect() {
        return respect;
    }

    public static double getIq() {
        return iq;
    }

    public static void setMoney(double money_)
    {   money_*=100;
        money_ = Math.round(money_);
        Person.money = money_/100;
    }

    public static void setRespect(double respect_) {
        respect_*=100;
        respect_ = Math.round(respect_);
        Person.respect = respect_/100;
    }

    public static void setIq(double iq_) {
        iq_ *= 100;
        iq_ = Math.round(iq_);
        Person.iq = iq_/100;
    }
}
