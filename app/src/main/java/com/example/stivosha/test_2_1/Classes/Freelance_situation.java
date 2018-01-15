package com.example.stivosha.test_2_1.Classes;

public class Freelance_situation {
    private static String type;
    private static int time_for_work;
    private static double predict_result;
    private static String company;
    private static double money;
    public Freelance_situation(String type,int time_for_work,double predict_result,String company,double money_pr){
        this.type = type;
        this.company = company;
        this.predict_result = predict_result;
        this.time_for_work = time_for_work;
        this.money = money_pr;
    }
    public static String finished_line(){
        String day_for_job ="дней";
        switch (time_for_work){
            case 1: {day_for_job = "день"; break;}
            case 2: {day_for_job = "дня"; break;}
            case 3: {day_for_job = "дня"; break;}
            case 4: {day_for_job = "дня"; break;}
        }
        predict_result *=100;
        predict_result = Math.round(predict_result);
        predict_result /= 100;
        return ("Компании "+company+" требуется написать "+type+" за "+String.valueOf(time_for_work)+" "+day_for_job+", требуемый результат: "+String.valueOf(predict_result)+", оплата: "+String.valueOf(money)+"$.");
    }

}
