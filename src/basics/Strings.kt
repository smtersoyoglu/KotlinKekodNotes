package basics

fun main() {
    /**
     * Yaklaşık olarak her karakter 2 byte (16 bits) yer kaplar.
     * Çit tırnak "" içerisine yazılan karakterler bütünüdür.
     * String bir değişken üzerindeki her bir karaktere index operatorü ile tek tek ulaşabiliriz
     * */

    val name = "Samet"
    println(name[0]) // T -- Indexler 0 ile başlar
    println(name[1]) // o
    println(name[5]) // Tolga string ifadesi 5 length uzunluğuna sahip ama bu ifadenin son
    // karakterine ulaşmak istediğimizde indexini 4 olarak belirtmeliyiz. Çünkü indexlenen
    // ifadelerde index 0 (sıfır) ile başlar.
    // Olmayan bir index'e ulaşmak istediğimizde ise program bize StringIndexOutOfBoundsException hatasını
    // fırlatır.

    /**
     * String Immutable'dır
     * String değişkenler immutabledır. Yani bir kez tanımlandıktan sonra, değerini değiştiremeyiz yada yeni bir değer set edilemez.
     *
     * Şimdi aklımıza söyle bir soru gelmiş olabilir. Ben var keywordünü kullanarak String tanımladıktan sonra o değişkenin değerini değiştirebiliyorum.
     * Ama sen burada yeni bir değer atayamazsın ve değiştiremezsin diyorsun. Tam olarak anlayamadım diyebilirsin?
     *
     * Şimdi gelelim cevabımıza:
     * Bunun arkasındaki yatan sebep String değişkenlerin bellekte saklanma durumlarından dolayıdır. Hatırlarsanız bu haftanın ilk sorusunda HEAP ve STACK kavramlarından bahsetmiştik.
     * Reference değerli olan değişkenlerin value ları HEAP tarafında ve bu value değerini referans eden değişkenlerin ise Stack bölümünde tutulduğundan konuşmuştuk.
     * String değişkenlerin de değerleri primitive bir değişken olmasına rağmen Heap bölümünde tutulur.
     * Yani biz String bir değişkene değer atadığımızda HEAP bölümünde yeni bir nesne oluşturulur ve değişkenimiz o nesneyi referans eder.
     * String üzerinde yapacağımız tüm işlemler bize yeni bir string nesnesi dönecektir.*/

    val surname = "ersoyoglu"
    println(name.uppercase()) // ERSOYOGLU
    println(name) // Tolga name değişkeni üzerinde değişiklik yapmadı.
    // Eğer ben String bir ifade üzerinde işlem yaptıktan sonra, işlem gerçekleşmiş değişken
    // ile işlemlerime devam etmek istiyorum diyorsanız onu yeni bir değişkene atamamız gerekiyor.

    val nameUppercase = name.uppercase()
    println(nameUppercase) // ERSOYOGLU


    /**
     * Stringler'de + Operatörü - Birleştirme İşlemleri
     * Farklı tipteki bir değişkenin önüne String bir değişken yada ifade koyarak toplarsak(+) operatörü ile, sonuç String olacaktır.
     * Ancak bir String değişken yada ifadenin sonuna + operatörü ile farklı tipte bir değişken eklersek kod çalışmaz ve bize hata verecektir.
     * */
    val numbersValue = "value" + (4+5+6) // value15
    //val numbersValue2 = (4+5+6) + "" // Hata verecektir.

    /**
    String format() Fonksiyonu
            Bu method, belirli bir String içinde yer tutucuları(placeholder) belirtilen değerlerle değiştirerek yeni bir String oluşturmamıza olanak tanır.
    Kotlin'deki format() fonksiyonu arka planda Javadaki format fonksiyonunu kullanır.

    **/


    /**Placeholders:

    %s : String
    %d Integer için
    %fFloat/Double
    %n Yeni bir satıra geçmek için
    */

    val boy = 1.854
    val boyMessage = String.format("Boyum: %.2f metre", boy)
    println(boyMessage)

    /**Burada 1.85 döndürür. Sondaki 4'ü almaz Çünkü biz 2 ondalık basamak kısmını al dedik. 2f 2 ondalık basamakla olduğunu belirtir. Noktadan sonra ne kadar ifade alacağını belirtmiş olduk.*/



}
