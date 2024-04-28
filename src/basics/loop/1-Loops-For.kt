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
        print("$it:Hello World ")
    }







































    /**     -- ilerde ki highorder function konusunu ile ilgili
     *   Eger bir Higher-order function inline ile beraber kullanılıyorsa,
     *   interface'li kullanıma göre daha performanslı calısır.
     *   ama inline olmayan bir Higher-order function interface'li calisaniyla aynı performansta is yapacaktir.
     * */



}

