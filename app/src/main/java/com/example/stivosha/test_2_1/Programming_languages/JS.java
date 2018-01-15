package com.example.stivosha.test_2_1.Programming_languages;

public class JS {
    private static double web_lvl = 8;
    private static double app_lvl = 0;
    private static double android_lvl = 0;
    private static double server_lvl = 8;
    private static double game_lvl = 0;
    private static int time_for_create_simple_program = 2;
    private static int time_to_study = 1;
   /* public JS(){
        this.time = 2;
        this.web_lvl = 8;
        this.app_lvl = 0;
        this.game_lvl = 0;
        this.server_lvl = 8;
        this.android_lvl = 0;
    }*/

    public static double return_result(String type){
        switch (type){
            case "сайт": return ((JS.web_lvl + JS.server_lvl)/JS.time_for_create_simple_program);
            case "script для игры": return JS.game_lvl/JS.time_for_create_simple_program;
            case "web сервер": return JS.server_lvl/JS.time_for_create_simple_program;
            case "приложение для PC": return JS.app_lvl/JS.time_for_create_simple_program;
            case "android приложение": return JS.android_lvl/JS.time_for_create_simple_program;
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
        JS.web_lvl = web_lvl;
    }

    public static void setApp_lvl(double app_lvl) {
        JS.app_lvl = app_lvl;
    }

    public static void setAndroid_lvl(double android_lvl) {
        JS.android_lvl = android_lvl;
    }

    public static void setServer_lvl(double server_lvl) {
        JS.server_lvl = server_lvl;
    }

    public static void setGame_lvl(double game_lvl) {
        JS.game_lvl = game_lvl;
    }

    public static void setTime_for_create_simple_program(int time_for_create_simple_program) {
        JS.time_for_create_simple_program = time_for_create_simple_program;
    }

    public static void setTime_to_study(int time_to_study) {
        JS.time_to_study = time_to_study;
    }
}
