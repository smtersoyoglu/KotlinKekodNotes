package basics

/**
 * Degiskene deger atamasi yapilirken,maksimum performans icin dogru degisken tipini kullanmak onemlidir.
 * Bunun icin degiskenlerin deger araliklarini kontrol edebiliriz.
 * Tip cikarimi (Type Inference) sirasinda eger sayi Int ifadeden buyuk degilse,tipi default olarak Int set edilir.
 * Tip cikarimi (Type Inference) sirasinda eger sayi Int ifadeden buyık ise,tipi default olarak Long set edilir.
 */

/**
 *   Type	Size (bits) 	 Min value	                             Max value
 *   Byte	 8	bit           -128    	                                127
 *   Short	 16	bit           -32768                                    32767
 *   Int	 32	bit           -2,147,483,648 (-2^31)	                2,147,483,647 (2^31 - 1)
 *   Long	 64	bit           -9,223,372,036,854,775,808 (-263)	        9,223,372,036,854,775,807 (263 - 1)
 */

/**
 * Type	        Size (bits)	          Significant bits	    Exponent bits	     Decimal digits
 * Float	        32	                    24	                8	                 6-7
 * Double	        64	                    53	                11	                15-16
 * */
fun main() {

    // Long       Degiskenler icin sayinin sonuna 'L' konularak deger atamasi yapilabir.
    // Float      Degiskenler icin 'F' veya 'f' harfi konularak deger atamasi yapilabilir.


    /**
     *  float kısmında f ve F varken, Long kısmında neden sadece L var ve küçük l kullanamıyoruz?
     *  Bunun cevabı bazı fontlarda l 1(bir)'e benzediği için kullanılmaz.
     **/
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1
    val floatNumber1 = 19.90F // Float
    val floatNumber2 = 13f    // Float
    val doubleNumber1 = 3.14
    val doubleNumber2 = 3.14e10

    val minIntValue: Int = Int.MIN_VALUE
    val maxIntValue: Int = Int.MAX_VALUE

    val minLongValue: Long = Long.MIN_VALUE
    val maxLongValue: Long = Long.MAX_VALUE

    val minFloatValue: Float = Float.MIN_VALUE
    val maxFloatValue: Float = Float.MAX_VALUE

    /**
     * bu şekilde kullanıcağımız veri tipinin min ve max değerlerinin ne olacağını öğrenebiliriz
     * ve özellikle challenglarda kullanıcağımız sayısal değere göre uygun aralığa denk geleni secip kullanabiliriz.
     * */
    println("minIntValue : $minIntValue")
    println("maxIntValue : $maxIntValue")
    println("minLongValue : " + minLongValue)
    println("maxLongValue : " + maxLongValue)
    println("minFloatValue : " + minFloatValue)
    println("maxFloatValue : " + maxFloatValue)


    /**
     *      Number degisken tanimi yapilirken underscore "_" kullanilabilir.
     * */

    val oneMillion = 1_000_000 // 1000000  -> okunabilirliği daha da kolaylaştırır bu durum '_'


    /* -------------------------------------------------------------------------------------------------------------------------*/
    /**
     *      Boxed : Degiskenin obje referansi olarak tutulmasidir.
     *      UnBoxed : Degiskenin primitive olarak tutulmasidir.
     *      === : operatoru degiskenlerin memory'deki referanslarını karsilastirilirken kullanilir.
     *      == :  operatoru degıskenlerin degerini karsilastirirken kullanilir.
     */

    //Eger biz bir primitive bir degiskeni null yapiyorsak,bu degisken artik primitive tip degil,buyuk class tiplerine donusur.

    // Byte araligi icin asagidaki gibi olur.Özel optimizasyonlar bizim ayni referans alanina isaret ettigimizi gosterir.
    // Yani,farkli degiskenler gibi gozukse de aslinda bunlar ayni degiskenlerdir.
    // Stack'de tutulur.

    val number: Int = 100 // primitive tip
    val boxedNumber: Int? = number // class tipi
    val anotherBoxedNumber: Int? = number
    println(boxedNumber === anotherBoxedNumber) // true


    //Fakat byte disinda bi araliga cikiyorsa,asagidakiler farkli memory alanlarina isaret ediyorlar demektir.
    val number2: Int = 10000
    val boxedNumber2: Int? = number2
    val anotherBoxedNumber2: Int? = number2
    println(boxedNumber2 === anotherBoxedNumber2) // false

    //Özetle - referans karşılaştırmasında byte değer aralığında olmayan değerler için false dönerken, byte değer aralığında ise true dönüyor.

    /**
     * Stack ve Heap denen 2 adet memory alanımız vardır.Memory dediğimiz şey temelde bu 2 yapıdan oluşur.
     * Biz bir primitive(unboxed) değişken oluşturduğumuz zaman,hem değişkenin kendisi hem de değeri için stackde yer ayrılır.
     * Bu ikisi toplamda bir Int kadar yer kaplar.Stack alanı,heap alanından daha hızlı çalışır.
     * Primitive tipler,hem değişkenin kendisini hem de içerdiği değeri aynı stack alanında,daha performanslı çalışan alanda tutarlar.

     * Eğer referans tipli bir değişkenle çalışıyorsak,o değişkenin ismi stackde tutulur,değeri heap'de tutulur.
     * Örneğin val age : Int? yapıp herhangi bir değer atarsak,age'in kendisi stackde tutulur içerdiği değer ise heapde tutulur.
     * Eğer bu değişkene null değerini verirsek,heapde kullandığı alan boşalır fakat stackde değişkenin ismi için yer kaplanmaya devam edilir.
     * Dolayısıyla,değişkeni nullamamız,değişken için memory'de herhangi bir alan tutulmuyor anlamına gelmez.
     * Değişkenin kendisi için bir alan tutulur fakat değeri için bir alan tutulmuyor anlamına gelir.
     * Sonrasında bir değer atarsak,heapde değişkenin değeri,stack'de ise değişkenin kendisi tutulmaya devam edilir.
     */

    /**------------------------------------------------------------------------------------------------------------------------------------------------- */


    var a = Ders1()
    //a.isMale = false  ---> burda değerini değiştirmemize izin vermez çünkü Ders1 class'ında set'ini private yaparak var bir değişkeni val yaptık
}

class Ders1 {
    var isMale: Boolean = true
        private set
}

