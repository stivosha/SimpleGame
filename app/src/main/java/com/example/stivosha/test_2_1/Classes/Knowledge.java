package com.example.stivosha.test_2_1.Classes;

import com.example.stivosha.test_2_1.Programming_languages.Java;

public class Knowledge {
    private static double knowledge_of_Python= 0;
    private static double knowledge_of_Java= 0;
    private static double knowledge_of_Cpp= 0;
    private static double knowledge_of_CSharp = 0;
    private static double knowledge_of_HTML= 0;
    private static double knowledge_of_JS = 0;
    /*public Knowledge(){
        this.knowledge_of_Cpp = 0;
        this.knowledge_of_CSharp = 0;
        this.knowledge_of_HTML = 0;
        this.knowledge_of_Java = 0;
        this.knowledge_of_JS = 0;
        this.knowledge_of_Python = 0;
    }*/
    public  static double getKnowlerge_of_any(String language){
        switch (language){
            case "python":return knowledge_of_Python;
            case "java":return knowledge_of_Java;
            case "C++":return knowledge_of_Cpp;
            case "C#":return knowledge_of_CSharp;
            case "HTML":return knowledge_of_HTML;
            case "JS":return knowledge_of_JS;
        }
        return -1;
    }
    public static double getKnowledge_of_Python() {
        return knowledge_of_Python;
    }

    public static String getAll(){
        return String.valueOf(knowledge_of_Python)+"\n"+String.valueOf(knowledge_of_Java)+"\n"+String.valueOf(knowledge_of_Cpp)+"\n"+String.valueOf(knowledge_of_CSharp)+"\n"+String.valueOf(knowledge_of_HTML)+"\n"+String.valueOf(knowledge_of_JS);
    }
    public static double getKnowledge_of_Java() {
        return knowledge_of_Java;
    }

    public static double getKnowledge_of_Cpp() {
        return knowledge_of_Cpp;
    }

    public static double getKnowledge_of_CSharp() {
        return knowledge_of_CSharp;
    }

    public static double getKnowledge_of_HTML() {
        return knowledge_of_HTML;
    }

    public static double getKnowledge_of_JS() {
        return knowledge_of_JS;
    }

    public static void setKnowledge_of_Python(double knowledge_of_Python) {
        Knowledge.knowledge_of_Python = knowledge_of_Python;
    }

    public static void setKnowledge_of_Java(double knowledge_of_Java) {
        Knowledge.knowledge_of_Java = knowledge_of_Java;
    }

    public static void setKnowledge_of_Cpp(double knowledge_of_Cpp) {
        Knowledge.knowledge_of_Cpp = knowledge_of_Cpp;
    }

    public static void setKnowledge_of_CSharp(double knowledge_of_CSharp) {
        Knowledge.knowledge_of_CSharp = knowledge_of_CSharp;
    }

    public static void setKnowledge_of_HTML(double knowledge_of_HTML) {
        Knowledge.knowledge_of_HTML = knowledge_of_HTML;
    }

    public static void setKnowledge_of_JS(double knowledge_of_JS) {
        Knowledge.knowledge_of_JS = knowledge_of_JS;
    }
}
