package com.example.stivosha.test_2_1.Programming_languages;

public class Cpp {
    private static double web_lvl = 0;
    private static double app_lvl = 14;
    private static double android_lvl = 4;
    private static double server_lvl = 0;
    private static double game_lvl = 14;
    private static int time_for_create_simple_program = 4;
    private static int time_to_study = 3;
   /* public Cpp(){
        this.time = 4;
        this.web_lvl = 0;
        this.app_lvl = 14;
        this.game_lvl = 14;
        this.server_lvl = 0;
        this.android_lvl = 4;
    }*/
    public static double return_result(String type){
        switch (type){
            case "сайт": return ((Cpp.web_lvl + Cpp.server_lvl)/Cpp.time_for_create_simple_program);
            case "script для игры": return Cpp.game_lvl/Cpp.time_for_create_simple_program;
            case "web сервер": return Cpp.server_lvl/Cpp.time_for_create_simple_program;
            case "приложение для PC": return Cpp.app_lvl/Cpp.time_for_create_simple_program;
            case "android приложение": return Cpp.android_lvl/Cpp.time_for_create_simple_program;
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
        Cpp.web_lvl = web_lvl;
    }

    public static void setApp_lvl(double app_lvl) {
        Cpp.app_lvl = app_lvl;
    }

    public static void setAndroid_lvl(double android_lvl) {
        Cpp.android_lvl = android_lvl;
    }

    public static void setServer_lvl(double server_lvl) {
        Cpp.server_lvl = server_lvl;
    }

    public static void setGame_lvl(double game_lvl) {
        Cpp.game_lvl = game_lvl;
    }

    public static void setTime_for_create_simple_program(int time_for_create_simple_program) {
        Cpp.time_for_create_simple_program = time_for_create_simple_program;
    }

    public static void setTime_to_study(int time_to_study) {
        Cpp.time_to_study = time_to_study;
    }
}