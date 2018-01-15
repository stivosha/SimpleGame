package com.example.stivosha.test_2_1.Programming_languages;

public class Java {
    private static double web_lvl = 1;
    private static double app_lvl = 3;
    private static double android_lvl = 8;
    private static double server_lvl = 1;
    private static double game_lvl = 3;
    private static int time_for_create_simple_program = 2;
    private static int time_to_study = 2;
   /* public Java(){
        this.time = 2;
        this.web_lvl = 1;
        this.app_lvl = 3;
        this.game_lvl = 3;
        this.server_lvl = 1;
        this.android_lvl = 8;
    }*/
   public static double return_result(String type){
       switch (type){
           case "сайт": return ((Java.web_lvl + Java.server_lvl)/Java.time_for_create_simple_program);
           case "script для игры": return Java.game_lvl/Java.time_for_create_simple_program;
           case "web сервер": return Java.server_lvl/Java.time_for_create_simple_program;
           case "приложение для PC": return Java.app_lvl/Java.time_for_create_simple_program;
           case "android приложение": return Java.android_lvl/Java.time_for_create_simple_program;
       }
       return -1;
   }
    public static double getWeb_lvl() {
        return web_lvl;
    }

    public static double getApp_lvl() {
        return app_lvl;
    }

    public static double getAndroid_lvl() {
        return android_lvl;
    }

    public static double getServer_lvl() {
        return server_lvl;
    }

    public static double getGame_lvl() {
        return game_lvl;
    }

    public static int getTime_for_create_simple_program() {
        return time_for_create_simple_program;
    }

    public static int getTime_to_study() {
        return time_to_study;
    }

    public static void setWeb_lvl(double web_lvl) {
        Java.web_lvl = web_lvl;
    }

    public static void setApp_lvl(double app_lvl) {
        Java.app_lvl = app_lvl;
    }

    public static void setAndroid_lvl(double android_lvl) {
        Java.android_lvl = android_lvl;
    }

    public static void setServer_lvl(double server_lvl) {
        Java.server_lvl = server_lvl;
    }

    public static void setGame_lvl(double game_lvl) {
        Java.game_lvl = game_lvl;
    }

    public static void setTime_for_create_simple_program(int time_for_create_simple_program) {
        Java.time_for_create_simple_program = time_for_create_simple_program;
    }

    public static void setTime_to_study(int time_to_study) {
        Java.time_to_study = time_to_study;
    }
}