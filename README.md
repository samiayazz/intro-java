# Kodlama.IO Ödevleri 2022 Java Kampı

---

## Başlarken:

#### Main fonksiyonunda **hangi ödevin çalışacağını belirlemek için kullanılan**, iki satırdan oluşan bir işlem bulunmaktadır.

> - **İlk olarak**, çalıştırılmak istenen ödev şu yol ile belirtilmelidir;\
`Homework` **enum'ı** içerisindeki, çalıştırılmak istenen ödeve karşılık gelen anahtar;\
`HomeworkSelector` **nesnesi** içerisindeki `homeWorkToSelect` **özelliğine** aktarılmalıdır.
> - #### ___Örnek:___
> ``` java
> HomeworkSelector.homeworkToSelect = Homework.WEEK1_MINI_PROJE_SAYI_BULMA;
> ```
> - Örnekte görüldüğü gibi anahtarlar; **ödevin verildiği hafta** ve **ödev adının** birleşiminden oluşuyor.

> - **Daha sonra**, belirtilen ödevin sınıfına, `HomeworkSelector` nesnesi içerisindeki `selectHomework` metodu
çağırılarak erişilebilir.
> - Tüm ödev sınıfları `Homework` adında bir arayüze sahiptir ve bu arayüz `executeHomework` adında tek bir metottan oluşur.
> - erişilen sınıfın, `Homework` tipli bir değişkene aktarılması ve bu değişken üzerinden `executeHomework` metodunun çağırılması sonucu, belirtilen ödev çalıştırılacaktır.
> - #### ___Örnek:___
> ``` java
> homeworks.weeks.Homework methodToExecute = (homeworks.weeks.Homework) HomeworkSelector.selectHomework();
> methodToExecute.executeHomework();
>  ```
 
___

## Paket Yapısı:

> [Ödevler](https://github.com/samiayazz/intro-java/tree/main/src/homeworks) / [Haftalar](https://github.com/samiayazz/intro-java/tree/main/src/homeworks/weeks)
> - [1. Hafta](https://github.com/samiayazz/intro-java/tree/main/src/homeworks/weeks/week1)
> - [2. Hafta](https://github.com/samiayazz/intro-java/tree/main/src/homeworks/weeks/week2)
> - [3. Hafta](https://github.com/samiayazz/intro-java/tree/main/src/homeworks/weeks/week3)

---