package homeworks;

import homeworks.enums.Homework;
import homeworks.weeks.week1.*;
import homeworks.weeks.week2.*;

import java.util.HashMap;
import java.util.Map;

public class HomeworkSelector {
    private static final Map<Homework, Object> HOMEWORKS = new HashMap<>() {{
        put(Homework.WEEK1_HELLO_WORLD, new HelloWorld());
        put(Homework.WEEK1_VARIABLES, new Variables());
        put(Homework.WEEK1_DATA_TYPES, new DataTypes());
        put(Homework.WEEK1_CONDITIONALS, new Conditionals());
        put(Homework.WEEK1_RECAP_DEMO_1, new RecapDemo1());
        put(Homework.WEEK1_SWITCH, new Switch());
        put(Homework.WEEK1_LOOPS, new Loops());
        put(Homework.WEEK1_ARRAYS, new Arrays());
        put(Homework.WEEK1_RECAP_DEMO_2, new RecapDemo2());
        put(Homework.WEEK1_MULTI_DIMENSIONAL_ARRAY, new MultiDimensionalArray());
        put(Homework.WEEK1_STRINGS, new Strings());
        put(Homework.WEEK1_MINI_PROJE_ASAL_SAYILAR, new MiniProjeAsalSayilar());
        put(Homework.WEEK1_MINI_PROJE_SESLI_HARFLER, new MiniProjeSesliHarfler());
        put(Homework.WEEK1_MINI_PROJE_MUKEMMEL_SAYILAR, new MiniProjeMukemmelSayilar());
        put(Homework.WEEK1_MINI_PROJE_ARKADAS_SAYILAR, new MiniProjeArkadasSayilar());
        put(Homework.WEEK1_MINI_PROJE_SAYI_BULMA, new MiniProjeSayiBulma());
        put(Homework.WEEK2_METHODS, new Methods());
    }};

    public static Homework homeworkToSelect;

    public static Object selectHomework() {
        try {
            Object selectedHomework = HOMEWORKS.get(homeworkToSelect);
            if (selectedHomework == null) {
                throw new Exception("\"" + homeworkToSelect + "\" anahtarının, \"HOMEWORKS\" listesinde karşılığı bulunamadı!");
            } else if (selectedHomework.getClass().getInterfaces().length != 1 || selectedHomework.getClass().getInterfaces()[0] != homeworks.weeks.Homework.class) {
                throw new Exception("Çalıştırılacak olan ödev sınıfı \"homeworks.weeks.Homework\" arayüzünden kalıtılmak zorundadır!");
            } else {
                return selectedHomework;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}