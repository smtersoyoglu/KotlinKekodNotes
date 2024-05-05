package basics.controlflow

fun main() {
    /**          ne zaman when tercih ederiz;
     *       if-else seklinde biz kod yazacaksak if-else kullaniriz.
     *       if-else if - else if - else if gibi devam eden bir kod yazacaksak when kullanmaliyiz.
     * */


    /**
     *      switch case'lerin yerine gelmistir.
     *      when(karsilastirilacak ifade)
     *          value -> {}
     *          value -> {}
     *          else  -> {}
     *      formatiyla kullanilir.
     *      yine {} arasina tek satir kod yazilacaksa bu durumda {}'leri kullanmayabiliriz.
     *      "tr", "az" gibi ayni kodu calistiracak case'ler varsa araya virgul koyarak kullanabiliriz.
     *      Bu 'veya' kullanimi yapmayi saglar. "tr veya az" gibi.
     * */
    val x = 3
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { print("x is neither 1 nor 2") }
    }

    var countryCode = readln()
    when (countryCode.lowercase()) {
        "tr", "az" -> println("Türk Vatandasi")
        // if(countryCode.lowercase() == "tr" || countryCode.lowercase() == "az") -> if kullanimi bu sekilde when ile daha az kod'la ayni isi yapıyoruz.
        "fr" -> println("France Vatandasi")
        // else if(countryCode.lowercase() == "fr"){println("France Vatandasi")} -> if'lerle yapmak isteseydik bu sekilde olurdu.
        "ru" -> println("Russian Vatandasi")
        "uk" -> println("United Kingdom Vatandasi")
    }


    // if kullaniminda countryCode.lowercase() 'i sürekli yazmaktansa when ile tek seferde kontrolleri yapabiliyoruz. daha temiz bir kullanım.
    if (countryCode.lowercase() == "tr" || countryCode.lowercase() == "az") {
        println("Türk Vatandasi")
    } else if (countryCode.lowercase() == "fr") {
        println("France vatandaşı.")
    } else if (countryCode.lowercase() == "ru") {
        println("Russian vatandaşı.")
    }

    /* ----------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     *      when'in yanına karsilastirma ifadesi eklemeden, bunu case'lerin yanına da ekleyebiliriz.
     *      Bunun artisi &&, ||, and, or, xor gibi ifadeleri de kullanabilmemizi saglar.
     *
     *      bu önerilmez if case, if else if yazmaktan bir farkı yok.
     *
     *      state kullanimi
     */

    when {
        // (countryCode.lowercase() == "tr").and(countryCode.lowercase() == "az") -> println("Türk Vatandasi")
        countryCode.lowercase() == "tr" || countryCode.lowercase() == "az" -> println("Türk Vatandasi")
        countryCode.lowercase() == "fr" -> println("France Vatandasi")
        countryCode.lowercase() == "ru" -> println("Russian Vatandasi")
    }


    /* ----------------------------------------------------------------------------------------------------------------------------------------------------*/

    // Expression kullanimi bir esittire deger olarak atadık, if-else 'de oldugu gibi when'lerde de state expression kullanimi vardır.

        countryCode  = when (countryCode.lowercase()) {
        "tr", "az" -> {
            println("Türk vatandaşı")
            "90"
        }

        "fr" -> {
            println("France vatandaşı")
            "80"
        }

        "ru" -> {
            println("Russian vatandaşı")
            "70"
        }

        else -> {
            "60"
        }
    }

    println("Your country code :$countryCode")


    /* ----------------------------------------------------------------------------------------------------------------------------------------------------*/



     // karsilastirilacak sey "deger" yerine "degisken" de olabilir.

    val trCode = "tr"
    val ruCode = "ru"
    val frCode = "fr"

    when (countryCode.lowercase()) {
        trCode, "az" -> println("TC  Vatandasi")
        frCode -> println("France Vatandasi")
        ruCode -> println("Russian Vatandasi")
    }


    /* ----------------------------------------------------------------------------------------------------------------------------------------------------*/


    // is !is ile bir class'in referansi olunup olunmadigi kontrolu yapılabilir.
    // ister if ister when icerisinde "is" keywordu verilen degiskenin hangi class'a ait olup olmadigini sorgulatir. (tip kontrolu)
    // miras almanın kullanıldıgı yerlerde is genellikle kullanılır.

    val phoneNumber = 5040147093

    when (phoneNumber) {
        is Long -> {
            println("Long value")
        }

        !is Long -> {
            println("Not Long value.")
        }
    }

    /* ----------------------------------------------------------------------------------------------------------------------------------------------------*/

    // range'leri "in", "!in" seklinde kontrolu yapılabilir. (icin de mi anlamı verir, kontrolü yapar.)
    val number = 3
    when(number) {
        in  0 ..10 -> println("Long value")
        in  11 ..20 -> {
            println("Long value")
        }
        !in  11 ..20 -> {
            println("Long value")
        }
    }

    // elvis operatoru kullanimi ----> ?: kısmı su sekil calısır bu degerin sol tarafında ki kod null degilse(null döndürmüyorsa) sol kısmı al.(calistir)
    // eger sol kısım null ise sag degeri al demektir.
    val message: String? = getMessage()
    val safeMessage: String = message ?: "Mesaj yok"
    println(safeMessage)
    // Bu kodda getMessage() fonksiyonu null bir değer döndürürse, safeMessage değişkenine “Mesaj yok” atanır.
    // Eğer message null değilse, safeMessage değişkenine message’ın değeri atanır.
    // Elvis operatörü, null kontrolünü kısa ve okunaklı bir şekilde yapmanızı sağlar.


}
fun getMessage(): String? {
    return null
}