package basics

fun main() {
    /**
     *          16 bit yer kaplarlar.
     *
     *          Tek tirnaklar arasina harf,sayi,escape char ya da unicode yazarak kullanılır. (birden fazla karakterden olusan birsey veremeyiz)
     *
     *          Çift tırnak içerisine yazarsak String olur,Char olmaz.
     */

    val firstCharOfName: Char = 'S'
    //val firstCharOfName2: Char = "S" calismaz.
    //val firstCharOfName3: Char = 'Sa' calismaz - birden fazla karakter veremeyiz.
    val charNumber: Char = '7'      // sayı verdiğimiz zaman ASCII tablosunda ki karşılıgı olur
    //val chatNumber3: Char = '53'  //  hata sadece 1 karakter.
    val nullableChar: Char? =
        null  // char'ın orjinal hali java tarafinda ki kücük char'a denk geliyorken(optimizasyonla düz char degiskenlerine döner), nullable olan büyük Char sınıfına denk geliyor. Show Kotlin Bytecode ile baktıgımızda.
    //  Bu, Kotlin'in nullable türler için arkasında referans türü olarak nesne kullanma tercihini yansıtır.
    /**
     * Butun degiskenler null olabilir,burada da bu degiskeni null yapar isek arka planda class olarak tutulur.Referans tipli,boxed degiskene doner.
     * Nullable olmayanlar ise optimizasyonlarla duz char degiskenine doner.
     */

    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Number deger alan bir char degisken, Int'e cevrilirken, gercek sayisal degerini almaz.
     *      Alacagi deger ASCII tablosundaki o sayisal degerin karsiligi(decimal degeri) olacaktir.

     *      Eger bir sebepten ötürü,char icerisindeki sayinin gercek degerini gormek istiyorsak digitToInt() fonksiyonunu kullanabiliriz.
     */

    val convertedCharNumber =
        charNumber.toInt()    // eskiden toInt() ile ceviriliyordu deprecated olmuş (şuan için çalışıyor belli bir api'dan(versiyon) sonra çalışmıcak) ve yerine .code ile ceviriyoruz artık.
    val convertedCharNumber2 =
        charNumber.code      // bu şekilde cevirdigimiz zaman 7 sayisinin ASCII tablosunda ki karsigilini almis oluruz.
    val digitToInt =
        charNumber.digitToInt()        // char icerisindeki sayinin gercek degerini gormek istiyorsak digitToInt()

    println("charNumber : $charNumber")
    println("convertedCharNumber : $convertedCharNumber")
    println("convertedCharNumber2 : $convertedCharNumber2")
    println("digitToInt : $digitToInt")

    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     * Escape karakterlerini de tanimlamak icin kullanilir.
     */
    val exampleString = "Kotlin escape karakterleri ornekleri\n" +
            "\t \\t ile bir tab bosluk ekleyebilirsiniz\n" +
            "\t \\n ile yeni bir satira gecebilirsiniz\n" +
            "\t \\b ile bir backspace(geri al) islemi yapabilirsiniz\n" +
            "\t \\r ile satir basina donebilirsiniz.\n" +
            "\t \\' ile tek tirnak(') karakterini kullanabilirsiniz.\n" +
            "\t \\\" ile cift tirnak(\") karakterini kullanabilirsiniz.\n" +
            "\t \\\\ ile ters slash(\\) karakterini kullanabilirsiniz.\n" +
            "\t \\\$ ile dolar isaretini ($) kullanabilirsiniz."

    println(exampleString)

    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     * Unicode karakterlerini de tanimlamak icin kullanilabilir.
     * Eger backslashle basliyorsak,birden fazla karakter yazabiliyoruz.IDE,Bunun unicode tanimi oldugunu algilar.
     */
    val blackHeart = '\u2665'
    val heavyBlackHeart = '\u2764'


    println("First commit with :$blackHeart")
    println("First commit with :$heavyBlackHeart")

    val ANSI_RED = "\u001B[31m"
    // ANSI Renk sıfırlama kodu (Metni varsayılan rengine döndürür.)
    val ANSI_RESET = "\u001B[0m"

    println("First commit with $ANSI_RED$blackHeart$ANSI_RESET")

}