package basics

fun main() {


    /**
     * Implicit Type Conversion: Ortulu :  belirgin olmayan şekilde tip donusumu
     * Explicit Type Conversion: Acik : Belirgin tip donusumu
     */


    /** Kotlin de Kapalı tip donusumleri yoktur (implicit type conversion yoktur) */
    //val number : Int =  3L // Calismaz.


    /**
     * Tip donusumu icin kullanabilecegim fonksiyonlar
     * toByte(), toShort(), toInt(), toLong(), toDouble(), toFloat(), toChar(), toString(),
     * toUByte(), toUShort(), toUInt(), toULong(), toDuration(), toBigDecimal(), toBigInteger()
     */

    /**
     * Numbers, sayi degiskenlerimizin Deger araliklarini iyice incelemeliyiz. donusum yapmak için ,
     * Deger araligi kucuk olan tipler buyuk olan tiplere, sorunsuz, acik olarak(explicit) donusuturlebilirler.
     *
     * Ust tipten bir degiskenin degeri,  alt tipin deger araligindan pozitif yonde fazla buyuk , negatif yonde fazla kucuk
     * ise bu tip donusumu sirasinda yanlis deger atamalari yapilacaktir.
     *
     * asagidan yukarı cıkarken problem yok, yukarıdan assagi yaparken sorun olabilir dikkatli ol donusumlerde.
     * */

    val schoolNumber = 12.toByte()
    val convertedValue: Short = schoolNumber.toShort()

    println("schoolNumber : " + schoolNumber)
    println("convertedValue : " + convertedValue)


    val tcIdentityNumber = 12_320_526_544
    val convertedInt = tcIdentityNumber.toInt()

    println("convertedInt: " + convertedInt)

    val intValue: Int = 42
    val doubleValue: Double = intValue.toDouble() // Otomatik olarak Int değerini Double'a dönüştürür
    println(doubleValue) // Çıktı: 42.0

    /** Burada, toInt() ve toDouble() gibi işlevler kullanarak otomatik tür dönüşümünü gerçekleştiriyoruz. */


    val doubleValueTry: Double = 42.0
    val intValueTry: Int = doubleValueTry.toInt() // Açık olarak Double değerini Int'e dönüştürür
    println(intValueTry) // Çıktı: 42

    /** Burada, toInt() fonksiyonunu kullanarak Double değerini açıkça bir Int'e dönüştürüyoruz. */


    val IntNumber1 = 2_100_000_000
    val IntNumber2 = 2_100_000_000

    val resultNumber2 = IntNumber1 * IntNumber2
    println("sonuc : $resultNumber2")

    /**
    Yukaridaki ornege baktigimizde 2 adet Int sayisini carpma islemine soktugumuzda sonucun Long olmasini bekleriz.
    Fakat Ide boyle calismaz.2 adet Int sayiyi carptigimizde,IDE sonucun Int olmasini bekler ve tipini Int'e set eder.
    Ama sonuç Int deger araligini asdigi  icin print ettigimizde anlamsiz bir sonuc goruruz.
    Bunun icin islemlerimizde dikkatli olmaliyiz.toLong() diyerek sayimizi long'a cevirebiliriz.
     **/


    /**
     *      Kapali(implicit) tip donusumu olmasa bile, iki number tip arasında matematiksel islem yapilirsa, sonuc degeri
     *      cikan degerin tipinde olacaktir.
     * */
    val totalValue: Long = tcIdentityNumber + schoolNumber // Long + Byte = Long -> büyük degerin  veri tipi olur

    val longNumber = 1_000_000_000_000L
    val dividedNumber = 1_000_000_000_00L
    //val dividedNumber = 1_000_000_000_00 // Int
    val resultNumber = longNumber / dividedNumber // 10 -> cevabın veri tipi Long olur, büyük olanın tipinde olur

    /** resulNumber'ın tipinin ne olacagı, (carpma, bolme, cıkarma, toplama) burda ki islemin sonucunda degisken tipinin ne olacagı
     * yukarıda ki iki degisken tipinden hangisi buyukse o belirliyor. ( islemin sonucu degil ) */
    /**
    val longNumber = 2_100_000_000
    val dividedNumber = 2_100_000_000
    val resultNumber = longNumber * dividedNumber  ---> Int olur cünkü carpılan iki degerin tipi de Int eğer Int aralıgını gecerse anlamsız sonuc verir.

    deger araligi disinda ki bir seyi Int'a cevirmeye calisiyor ama ceviremiyor. iki tane buyuk sayiyi carpip tip donusumu yapmadan Int ise ve Int aralıgını geciyorsa anlamsız bir sonuc olur.
     **/

}