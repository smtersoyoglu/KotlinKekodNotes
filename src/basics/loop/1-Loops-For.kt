package basics.loop


fun main() {
    /**
     *      3 farklı şekilde for tanımlayabiliriz
     *      value in list                           seklinde value değerlerini alabiliriz.
     *      index in list.indices                   seklinde index değelerini alabiliriz.
     *      (index, value) in list.withIndex()      seklinde index, value değelerini alabiliriz.
     * **/

    // :Int yerine Float yazamıyoruz cünkü otomatik casting edemiyor. Kotlin'de kapali tip donusumu yok.
    for (value: Int in 1 .. 10) {
        print("$value")
    }
                                    // 0,1,2,3 -> size = 4
    val countryCodeArray = arrayOf("tr", "az", "en", "fr")
    val alphabetList = arrayOf('A', 'B', 'C', 'D')

    for (country in countryCodeArray) {
        print("$country ")
    }

    for (alphabet in alphabetList) {
        print("$alphabet ")
    }


    // eger index'e ihtiyacımız varsa(index bilgisine ihtiyacımız varsa)

    for (index in countryCodeArray.indices) {
        print("\n$index . degeri : ${countryCodeArray[index]}")
    }

    // hem index degerine hem o index'deki value'ya ihtiyacımız varsa altta ki gösterim

    for ((index, value) in countryCodeArray.withIndex()) {
        print("\n$index . degeri : $value")
    } // data class'larda kullanılan  Destructuring declarations kullanımı.
    /**
     *  Destructuring declarations; bir data class'ın icerisinde ki value'ları key, value seklinde almaya yarıyor.
     *  Bir fonksiyonun geri donusunu, iki farklı degiskene atadigimiz durumuna  destructuring declaration denir. (index, value)
     */

    /* -----------------------------------------------------------------------------------------------------------------------------*/

    /**
     *      repeat(size) seklinde herhangi bir listeye ihtiyac duymadan tekrarlayan isler yapabiliriz.
     */

    repeat(10) { // it indeks degeridir.
        print("$it : Hello World ")
    }


    /* -----------------------------------------------------------------------------------------------------------------------------*/


    /**
     *      return kullanarak ilgili sart saglanirsa, donguden cikabiliriz. - cıkma
     *      continue kullanarak ilgili sart saglanirsa, donguye o degeri atlayarak devam edebiliriz. - atlama
     */

    for (value in 1..50) {
        if (value % 2 == 1) { // sart saglaninca continue'Ya girer ve tekrar döngüye girer. saglamazsa  assagida ki print'i calistirir.
            continue // alt kısmı calistirmadan gördügümüz satirdan döngünün bir sonraki döngüye gecmesini saglar.
        }
        print("$value ")
    }

    println()

    for (value in 1..50) {
        if (value % 2 == 1) { //sart saglaninca donguden direk cikar altta ki print'i de calistirmaz direk donguden cikar.
            break // kod ne zaman if blogunun icine girerse donguyu kirar ve dongunun bir sonraki kismi calismaz.
        }
        print("$value")
    }


    /* -----------------------------------------------------------------------------------------------------------------------------*/


    /**
     * ic ice for dongusu kullanıyorsak bir ustteki for'a degil de iki ustteki, uc ustteki for'a donmek istiyorsak,
     * label kullanabiliriz. Bunun icin labelname@ ifadesini ilgili for'un onune yazıp, return ya da continue yazan
     * yere ise @labelname seklinde yazmamiz yeterlidir.

     */

    for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue
            }

            print("continue1 : $value2 | ")
        }

    }

    println("örnek: normal")

    returnLabel@ for (value in 1..50) {
        for (value2 in 0..10) { // returnLabel kullanmasaydık buraya dönücekti ama biz returnLabel ile nereye dönmesini istiyorsak oraya
            // returnLabel ekleyerek oraya gitmesini sagliyabiliyoruz.
            if (value2 == 5) {
                continue@returnLabel
            }
            print("continue2: $value2 | ")
        }

    }

    println("örnek: returnLabel continue")

    // return icinde bulundugumuz fonksiyondan cikmamizi saglar.
    // return -> döngülerle alakali bir konu degil. icinde bulundugu fonksiyonun disina cik demek

    for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                break
            }
            print("break1 :$value2 | ")
        }

    }
    println("örnek: normal break")

    returnLabel@ for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                break@returnLabel
            }
            print("break2 :$value2 | ")
        }

    }
    println("örnek -> returnLabel break")


    // tek bir for döngülü durumda returnLabel kullanmamiza gerek yok. gereksiz olur.
}





























    /**     -- ilerde ki highorder function konusunu ile ilgili
     *   Eger bir Higher-order function inline ile beraber kullanılıyorsa,
     *   interface'li kullanıma göre daha performanslı calısır.
     *   ama inline olmayan bir Higher-order function interface'li calisaniyla aynı performansta is yapacaktir.
     * */



}

