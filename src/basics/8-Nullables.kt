package basics

fun main() {

    /**
     *  Null -> Değişkenin veya nesnenin bellekte bulunmaması olayıdır. Eğer bir değişken null ise Kotlin NullPointerException hatası fırlatır.
     *  Bu hatayı engellemek amacıyla Null Safety özelliğini kullanmıştır
     *  Değişkenlerin null olabilmesine izin vermek istiyorsak değişken tipini belirttirken sonra “?” işareti koyarız. (bir değişkenin null değer alabileceğini belirtmek için kullanırız.)
     *
     * */

    /**
    var a: String = "abc" // varsayılan olarak null olmayan anlamına gelir
    a = null // derleme hatası
     */

    var b: String? = "abc" // null olarak ayarlanabilir
    b = null // ok
    println(b)

    var number1: Int? = null
    var number2: Int? = null

    /**
     *  Eger bir degiskene tip verilmez ve direk null deger atamasi yapilirsa,IDE tip cikarimi yaparken
     *  o degiskenin degerini Nothing? olarak isaretler.Cunku hangi tipe karsilik geldigini bilemez.
     * */
    val number = null // Nothing? -> ici bomboş olan bir class


    /**
     *  Not null assertion : !! Operator
     *  Bu operatör null olabilen bir değişkenin null kontrolü yapılmadan çağrılmasını sağlar. Hatalı kullanımda NullPointerException hatası almamız olasıdır.
     *  nullable bir degiskenin null olmayacaginin garantisini verir.
     *
     *  Safe call : ?. Operator
     *  Bu operatör bir ifadenin null olup olmadığını kontrol eder ve null ise ifadeyi çağırmaz, null değilse normal şekilde calismaya devam eder.
     *
     *  Best Practice olarak debug modda calisirken kodlarimiza !! seklinde yazmamiz Kotlin Null Pointer Exception hatası almamızı saglar.
     *  bu sayede gozden kacan nullable degerleri bulabilmemizi saglar. Ancak canliya cikarken cok gerekli olmayan kisimlar icin(daha az önemli olan kısımlar için)
     *  ?. yı kullanmamız daha dogru olacaktir.
     * */

    //val nullableName: String? = null
    //nullableName!!.uppercase() // Çalışma zamanında
    //NullPointerException Hatası döndürür.

    var result: Int? = 0 // eğer 0 yerine null olsaydı NullPointerException hatası alıcaktık
    println(result!!.plus(324))

    number1 = readLine()!!.toInt()
    number2 = readLine()!!.toInt()

    // yukarıda readline()' ın null olmayacagini !! isaretleriyle soyledigimiz icin alt satirda tekrar nullable kontrolü yapmamıza gerek kalmıyor. (smart cast ozelligi)
    result = number1 + number2

    /** nullable kontrolünü bu şekilde yapma, kotlin de bunun icin ?. ve !! var bunları kullan  */
    if (number1 != null && number2 != null) {
        result = number1 + number2
    }

    /** bu şekilde daha kısa ve temiz bir kod yazabiliriz yukarıda ki if ile aynı kontrolü yapar. number1 ve number2 nin null kontrolünü yapıp null ise calıstırmaz  */
    result = number1?.plus(number2)


    /**
     *  Elvis operator: ?:
     *  Elvis operaörü atanmak istenen değer null olduğunda onun yerine default bir değer atmak için kullanılır.
     *
     *  val name = nullableName ?: "Guest"
     *  Elvis operatörü iki değer alır eğer ilk değer null değilse ilkini null ise de aldığı ikinci değeri geriye döndürür.(return)
     *
     * */


}