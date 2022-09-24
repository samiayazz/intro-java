import homeworks.HomeworkSelector;
import homeworks.enums.Homework;

public class Main {
    public static void main(String[] args) {
        //Burada Homework enum kullanılarak, program çalıştığında hangi ödevin çalıştırılacağı belirleniyor.
        HomeworkSelector.homeworkToSelect = Homework.WEEK1_MINI_PROJE_SAYI_BULMA;

        //Yukarıda belirlenen ödev, burada execute metodu ile çalıştırılıyor.
        homeworks.weeks.Homework methodToExecute = (homeworks.weeks.Homework) HomeworkSelector.selectHomework();
        methodToExecute.executeHomework();
    }
}