package basics

import java.util.*
import java.util.Locale.of


fun main() {
    /**
     *      Yaklaşık olarak her karakter basına 2 byte (16 bits) yer kaplar. UTF-16 encoding kullanır.
     *
     *      Çit tırnak("") içerisine yazilan karakterler bütünüdür.
     *      Bir String ifadenin tum karakterlerini tek tek alip Char bir listeye atayabiliriz.
     *      String bir değişken üzerindeki her bir karaktere index operatorü ile tek tek ulaşabiliriz.
     * */
    val name = "Samet"
    val char1 = 'S'
    val char2 = 'a'
    val char3 = 'm'
    val char4 = 'e'
    val char5 = 't'
    val nameArray = charArrayOf(char1, char2, char3, char4, char5)
    for (char in name) {
        println(char)
    }

    // 0-S , 1-a , 2-m , 3-e , 4-t
    println(name[0]) // S -- Indexler 0 ile başlar
    println(name[1]) // a
    //println(name[5]) // hata verir index 5 de eleman yok
    /** Samet ifadesi 5 length uzunluğuna sahip ama bu ifadenin son karakterine ulaşmak istediğimizde
     * indexini 4 olarak belirtmeliyiz. Çünkü indexlenen ifadelerde index 0 (sıfır) ile başlar.
     * Olmayan bir index'e ulaşmak istediğimizde ise program bize StringIndexOutOfBoundsException hatasını fırlatır.
     */

    val awesomeKekod = "Kekod is Awesome"

    val firstCharOfAwesomeKekod = awesomeKekod[awesomeKekod.indices.first]
    val firstCharOfAwesomeKekod2 = awesomeKekod[0]
    val lastCharOfAwesomeKekod = awesomeKekod[awesomeKekod.indices.last]
    val lastCharOfAwesomeKekod2 = awesomeKekod[15]

    /**
     *  String'ler immutable' dır. Bir String ilk değer ataması yapıldıktan sonra degerini degistiremez ya da yeni bir deger set edilemez. (Yani bir kez tanımlandıktan sonra, değerini değiştiremeyiz yada yeni bir değer set edilemez)
     *  String üzerinde yapacagimiz tüm islemler bize yeni bir String object'i dönecektir.  String'in ilk hali degismeyecektir.
     */
    var surName2 = "Sahin"
    surName2 = "Ersoyoglu" // Stringler özel bir yapıda duruyor. surName2'ye yeni bir deger atadigimizda arkaplan'da
    // yeni bir String object'si dönüyor. memory de artık 2 tane String degerimiz var ama artık ilkini isaret etmiyoruz son tanımladıgımız Ersoyoglu'nu isaret ediyoruz. Sadece String'lere özel bir durum.

    val surName = "ersoyoglu"
    println(surName.uppercase()) //ERSOYOGLU
    println(surName) //ersoyoglu surName değişkeni üzerinde değişiklik yapmadı.
    // Eğer ben String bir ifade üzerinde işlem yaptıktan sonra, işlem gerçekleşmiş değişken
    // ile işlemlerime devam etmek istiyorum diyorsanız onu yeni bir değişkene atamamız gerekiyor
    val surNameUppercase = surName.uppercase()
    println(surNameUppercase) // ERSOYOGLU

    /** TolgaPrim ders notu:
     *  Ben var keywordünü kullanarak String tanımladıktan sonra o değişkenin değerini değiştirebiliyorum.
     *  Ama sen burada yeni bir değer atayamazsın ve değiştiremezsin diyorsun. Tam olarak anlayamadım diyebilirsin?
     *
     * Şimdi gelelim cevabımıza:
     *  Bunun arkasındaki yatan sebep String değişkenlerin bellekte saklanma durumlarından dolayıdır.
     *  Reference değerli olan değişkenlerin value ları HEAP tarafında ve bu value değerini referans eden değişkenlerin ise Stack bölümünde tutulduğundan konuşmuştuk.
     *  String değişkenlerin de değerleri primitive bir değişken olmasına rağmen Heap bölümünde tutulur.
     *  Yani biz String bir değişkene değer atadığımızda HEAP bölümünde yeni bir nesne oluşturulur ve değişkenimiz o nesneyi referans eder.
     *  String üzerinde yapacağımız tüm işlemler bize yeni bir string nesnesi dönecektir.
     *
     *  Stringler Stack'de degiskenin ismini tutar, Heap'de degeri yer alir.
     *
     *  Garbage collector belirli aralıklarla Heap'de gezer. bakar ki artık referans edilmeyen, isaret edilmeyen value kaldıysa onu ucurur(memoryden komple siler). Yukar da ki Sahin'in silinmesi gibi
     *  ama bu zamana kadar Garbage collector calısana kadar Sahin ve Ersoyoglu degerleri beraber memoryde yer kaplayacaktır. ama surName2 her zaman 1 tane Stack de duruyor.
     * */

    /** Özetle:
     *  String’ler val ya da var olmalarına karşılık ikisinden biri olabilirler iki durumun ikisi için de String değişkenler immutable’dır.
     *  değişkenin kendisi var ya da val olduğu durumda zaten değişebilir, değişemez dedik ama burda ki immutable’lıktan kasıt orda ki value ifadesi memory de Heap alanda saklanırken üzerine atama yapılmaz.
     *  o Heap alanda saklanmaya devam eder Garbage collector belirli bir yerden sonra silecek ama yeni olan değer Heap alanında ikinci bir value olarak saklanır.
     *  bu yüzden ilk değer değişmediği için memory de hala kaldığı için bu durumda String değişkenler immutable’dır.
     *  ama tabi ki var olduğu durumda yeni bir değer alabilir  ama ilk değer hala memory de kaldığı için immutable denir. */


    /**
     *  Stringler'de + Operatörü - Birleştirme İşlemleri
     *  Farklı tipteki bir değişkenin önüne String bir değişken yada ifade koyarak toplarsak(+) operatörü ile, sonuç String olacaktır.
     *  Ancak bir String değişken yada ifadenin sonuna + operatörü ile farklı tipte bir değişken eklersek kod çalışmaz ve bize hata verecektir.
     * */

    val numbersValue: String = "value" + (4 + 2 + 8) // value14  -> bu ifade String oluyor.
    //val numbersValue2: String = (4+2+8) + "value" // Calismaz, Hata verecektir. String ifade önde olmalıdır.
    // val numbersValue2: String = (4+2+8).plus("value")  // Calismaz, Hata verecektir.

    println("numbersValue" + numbersValue)

    /**
     *  Herhangi bir degisken + operatorune ihtiyac duyulmadan direkt olarak "" arasina yazilarak kullanilabilir.
     *  bunun icin sadece $ isaretine ihtiyacimiz vardir. bu yapiya String template denir.
     *  Eger degiskenin bir ozelligine ihtiyac duyucaksak ${} seklinde kullanabiliriz.
     * */
    println("numbersValue $numbersValue")
    println("numbersValue \$numbersValue") // numbersValue $numbersValue Price : $3.92
    println("numbersValue ${numbersValue.length}")


    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     * 3 tane cift tirnak kullanarak raw string(Multiline String) olusturulabilir.
     * Raw stringler ideye nasil yaziliyorsa oyle kullanilir. Hizalamada bozulma olmaz.
     * trimIndent() fonksiyonu ile bu Raw String'in kenar bosluklarini silebilirsiniz.
     * Bu silme islemini yaparken tum satirlardaki en soldaki karakteri baz alarak silme islemini saglar.
     * Alttaki ornek icin 3 satirdan da $ isaretinin solundaki bosluga kadarini siler.
     * Raw stringler icinde escape karakterler calismaz.
     */

    val rawPineTree = """
               *
     $        ***
             *****
    """.trimIndent()

    /**
     * String format() Fonksiyonu
     * Kotlin'de String.format() metodu,Java'nın String.format() metoduna çok benzer bir sekilde calisir.
     * Bu method, belirli bir String içinde yer tutucuları(placeholder) belirtilen değerlerle değiştirerek yeni bir String oluşturmamıza olanak tanır.
     **/
    /**Placeholders:
     *      %s : String için
     *      %d : Tam sayı (Integer) için
     *      %  : Float/Double için
     *      %n : Yeni bir satıra geçmek için
     */

    val yas = 25
    val mesaj = String.format("Yaşım:%d", yas)
    println(mesaj) // Yaşım 25 yazdırır.

    val boy = 1.730
    val boyMesaj = String.format("Boyum:%.2f metre", boy)
    println(boyMesaj) // Boyum 1.73 metre yazdırır, 2 ondalık basamakla
    /**Burada 1.73 döndürür. Sondaki 0'ı almaz Çünkü biz 2 ondalık basamak kısmını al dedik. 2f 2 ondalık basamakla olduğunu belirtir. Noktadan sonra ne kadar ifade alacağını belirtmiş olduk.*/

    val ad = "Samet"
    val adMesaj = String.format("Ad:%s Yas:%d Boy:%.2f", ad, yas, boy)
    println(adMesaj) // "Adım: Samet, Yaşım 25, Boyum, 1.73" yazdırır.

    val sayi = 1234567.79
    val usFormat = String.format(Locale.US, "Us Formatinda: %,.2f", sayi)
    println(usFormat)//US formatinda 1,234,567.79 seklinde yazilir.


    //Türkçe için Locale nesnesi, "tr" ISO 639 dil kodu ve "TR" ISO 3166 Ülke kodu ile oluşturulabilir
    val localeTR = of("tr", "TR") // Türkçe için Locale nesnesi oluşturuluyor -Locale Deprecated olmus of kullanılıyor.
    val trFormat = String.format(localeTR, "TR formatında: %,.2f", sayi)
    println(trFormat)

    // ingilizce de normalde 1,234,567.8954768 bu şekilde olduğu için yani yüzdelik kısımları
    // ayırmak için , ondalık kısımları ayırmak için . kullanılıyor. Buradki ilk , ifadesi sayıdaki , kısımlarını
    // temsil etmiş oluyor. YANİ BU FONKSYİONDA diyoruz ki ben bu formatta o kısımlara , koyacağım ama bunu
    // Türkçeye göre yap.
}
