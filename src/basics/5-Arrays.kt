package basics

fun main() {
    /**
     *    Ayni türden ya da belirtilen türün alt türünden, sabit sayıda veri tutan bir veri kümesi yapısıdır.
     *    (belirli bir sayıda belirttiğimiz özel bir tipte ya da herhangi bir tipte veri tutan veri yapılarına Array'ler denir.)
     *    En sık kullanılan versiyonu Object-Type Arrayler'dir. Array sınıfı ile temsil edilirler.

     *    Array classindan miras alacak sekilde arrayler olusturuyorsak,bunlar referans tipli arraylar olur.
     *
     *    Eğer primitive tipleri Object-Type Array olarak kullanırsanız Boxed kullanım yapmış oluruz.
     *    Bu da performansa etki eder. Eğer sadece primitivlerden oluşan arrayler olusturacaksak,
     *    bu durumda Primitive Type Arrayler kullanmalıyız.
     *
     *    ByteArray(byte[]),ShorArray(short[]),IntArray(int[]),LongArray(long[]),DoubleArray(double[]),FloatArray(float[]),
     *    BooleanArray(boolean[]),CharArray(char[])
     *
     *          --Kotlin'de array oluşturmak için aşağıdaki yardımcı fonksiyonlar kullanılabilir.--
     *    arrayof(ayni tip degerler) seklinde tanimlanabilir.  ----> arrayOf(hepsi aynı tip)
     *    arrayOf<Any>(farkli tip degerler) seklinde tanimlanabilir. farklı tip değerler vereceksek kullanırız.  ---> Buradaki değerler Boxed olark mı yoksa UnBoxed
     *    arrayOfNulls<Type>(size) ise verilen boyut kadar null deger iceren bir dizi tanimlanabilir.
     *    emptyArray() bos array tanimlar.
     *
     *    bir array oluştururken genelde hep iş yerlerinde göreceğimiz şey arrayOf'un çok sık kullanıldığıdır.
     *    bu bize primitive tip değil class olan array'i verecek(object type array).
     *
     */

    /**
     * Genel olarak elimizde kümeleyebilecegimiz veri grupları varsa ve bunlari listelemek,goruntulemek istiyorsak,ya da üzerlerinde döngü döndürme,birşey arama gibi
     * durumlarda arrayleri kullanabiliriz.
     * Veri ekleme,veri çıkarma gibi işlemler yapacaksak,collectionsları kullanmamız daha uygundur.
     */

    //                   index =  0  1   2   3   4   5
    val studentNumbers = arrayOf(13, 45, 53, 17, 21, 10) // Sırası önemli degildir. // fonksiyon kullanımı
    val studentNames = arrayOf("Ahmet", "Buket", "Veli", "Derya")  // fonksiyon kullanımı
    val firstCharOfNames = arrayOf('A', 'B', 'V', 'D')  // fonksiyon kullanımı
    val mixedArray = arrayOf<Any>(13, "Ahmet", 'V', true)// Herhangi bir tipten veriyi array'in icerisine koyabiliyoruz.
    //<Any> tüm tiplerin üzerinde bulunan bir class, buradaki interfacedir.Arayüz ve interface aynı seydir.


    val arrayofNulls = arrayOfNulls<String>(4)//Tipini ve size'ini belirtmek zorundayiz.
    println(arrayofNulls.joinToString()) // null null null null diye çıktı verir.

    //Bombos bir array olusacaktir.Boyut vermedigimiz tek array emptyArray'dir.
    val emptyArray = emptyArray<String>() // "","","","" bunu yapmiyor,size'ı 0 olan bir array olusturur.
    var emptyArray2: Array<String> = emptyArray()

    //emptyArray'ler olusturuldukların da heap de bir deger kaplamazlar ellerinde deger yok, sadece stack'de degerleri var  heap de ama bir yer kaplamıyorlar.
//    emptyArray[5] = "Yeni Eleman "
//    bu array'in kaç değere sahip olacağını belirtmedik. bos bir Array oldugu icin
//    Herhangi bir indeksi olmaz  icin bu islemi yapamayiz. ekleme yapmak istedigimiz de ArrayIndexOutOfBoundsException hatasi aliriz.

  /*----------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * Array'ler sabit büyüklüktedir.
     * Array'lere ekleme veya çıkarma yapmak aynı Stringlerde oldugu gibi memory'de yeni bir Array olusturulmasina neden olur.
     * bir array'e yeni bir ekleme yapıyorsak,bu durumda mevcut durumdaki array'i referans etmeyi bırakır,onun yerine yeni bir array olusturur
     * ve onu referans alır. memory'de en son eklenmiş halini tutar.
     */

    var citiesArray = arrayOf("İstanbul", "Tokat", "Hatay")
    citiesArray += "Sivas"
    //Birden fazla ekleme yapmak icin,
    citiesArray += arrayOf("İzmir", "Konya") // her zaman ekleme yaptığımızda arkaplanda yeni bir array oluşturulur. altta acıklaması var).
    println(citiesArray.joinToString())
    //  Yukaridaki durumda,ilk basta arrayi olusturur,sonra biz Sivas'i ekledigimizde yeni bir array olusturup, memory'e yeni bir array olarak eklenir.
    //  yani ilk durum memory de kalmaya devam ediyor. yanına ikinci bir array olarak eklediğimiz 'sivas' ile beraber ikinci bir array oluşturuluyor(memory'de).
    //  bu durumda riversArray,eklenmis halini refere eder ve onunla değişmiş olur yeni eklenenle beraber son halini alır.

    citiesArray.forEach {
        print("$it, ")
    }
    /**
     *  soru ----> Array'ler mutable mıdır, immutable mıdır? index degerinin degisip degisemedigi soruluyor demek.
     *  1- önüne val koyarsak bu array'ler den bağımsız olarak bu array'in değerinin readOnly olmasına neden olur.
     *  2- Array'in önünde var,val olmasına bakmaksızın(ister var olsun ister val olsun)
     *  icinde ki her bir index'de ki value degisebildigi icin index'inde ki value'lara göre mutable'dır. (var olsa da degisir, val olsa da degisir.)
     *  3-Array'lere biz ekleme yaptıgımız da aslında yeniden bir atama islemi yapılır(memory karsılıgı olarak). var olan Array bırakılır yerine yeni bir Array eklenir.
     *  bu sebeple  biz var olan Array'i hic bir zaman aslında memory'de kullanamadıgımız icin (ekleme islemi sırasında) immutable'dır diyebiliriz.
     *
     *   // yukarda ki acıklamayı yapamıyorsan; en genel tabiri ile
     *  Array'lerde index value'larını  degistirebildigimizden dolayı 'mutable' deriz val olsalar bile. (bunu desek yeterli)
     *
     *      1-2-3'ün özet hali;
     *  ekleme yaptıgımızda Array'in kendisinin üzerine eklemiyoruz, Array'i bırakıyoruz yenisini oluşturup eklediğimiz icin aslında İmmutable ama veriler üzerinde degisiklik yapıyorsak mutable.
     * */

    /**----------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * Array<Type>(size){higher order function} seklinde de tanimlanabilir.
     * Bu durumda higher order function icerisinde son satira denk gelen degerler diziyi olusturur.
     * Higher order function,icerisi dizinin boyutu kadar index'i(it) bir arttirarak calisir.(0,1,2,3,...)
     * Eger biz arrayleri olusturma islemi sirasinda degerleri bir takim islemlere tutma amacimiz var ise,
     * bu durumda higher order'li sekilde kullanabiliriz.
     *
     */

    // 5 elemanli,tum elemanlari 3.14 olan bir dizi olusturur. 0 dan baslar index olarka 5 tane elemanlı array olur.
    val carNamesMini = Array<Double>(5) {
        // Array'in constructor kullanımı -- value'larımızı herhangi bir isleme tabi tutmak istiyorsak
        // birden fazla kod yazma alanına ihtiyac duyacaksak, bu durum da bu sekilde constructor'lı sekilde olusturuyoruz.
        //  pseudo Codes
        //  pseudo Codes
        //  pseudo Codes
        3.14 * it
    }
    println(carNamesMini.joinToString())


    // 10 elemanli,0-9 arasindaki index degerlerinin karesini alan bir dizi olustur.
    // Boyle bir kullanimi yapmasak daha iyi olur. KULLANMIYORUZ.
    val carNames = Array<Unit>(10) {
        //  {0,1,2,4,9,16,25,36,49,81}
        print((it * it).toString() )
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * ByteArray, ShortArray, IntArray, LongArray, DoubleArray, FloatArray gibi
     * ya da bunların Unsigned halleri primitive array tanımlamaları da yapılabilir.

     * Primitive-type array'i (dizileri) Object-type dizilere dönüştürmek için: .toTypedArray() fonksiyonunu, işlevini kullanabiliriz.
     * Bu işlev, bir dizi içindeki öğeleri bir Object türünde bir diziye dönüştürür.
     * val primitiveArray = intArrayOf(1, 2, 3) // Primitive-tipi dizi
     * val objectArray = primitiveArray.toTypedArray() // Object-tipi dizi

     * Object-type dizileri Primitive-type dizilere dönüştürmek için: Kotlin'in standart kütüphanesinde,
     * Object-type dizileri Primitive-type dizilere dönüştürmek için çeşitli yöntemler bulunur.
     * Örneğin, toBooleanArray(), toByteArray(), toCharArray() gibi yöntemler, bir Object-typed diziyi ilgili Primitive-typed bir diziye dönüştürür.

     * `toBooleanArray()`: Boolean primitive bir array'e dönüştürmek için kullanılır.
     * `toByteArray()`: Byte primitive bir array'e dönüştürmek için kullanılır.
     * `toCharArray()`: Char primitive bir array'e dönüştürmek için kullanılır.
     * `toDoubleArray()`: Double primitive bir array'e dönüştürmek için kullanılır.
     * `toFloatArray()`: Float primitive bir array'e dönüştürmek için kullanılır.
     * `toIntArray()`: Int primitive bir array'e dönüştürmek için kullanılır.
     * `toLongArray()`: Long primitive bir array'e dönüştürmek için kullanılır.
     * `toShortArray()`: Short primitive bir array'e dönüştürmek için kullanılır.
            Örnek;
     * val objectArray = arrayOf(1, 2, 3) // Object-tipi dizi
     * val primitiveArray = objectArray.toIntArray() // Primitive-tipi dizi


     * Bu tarz tanimlamalarda ilgili index degerine atama icin set(index,value) ya da [ index ] = value kullanilabilir.
     * Bu tarz tanimlamalarda ilgili index degerindeki degisken degerine get(index) ya da [ index ] seklinde ulasilabilir.
     */


    val firstCharOfCountries = CharArray(5)
    firstCharOfCountries[0] = 'S'
    firstCharOfCountries.set(1, 'A')
    firstCharOfCountries.set(3, 'E')

    println("firstCharOfCountries index 3 : " + firstCharOfCountries.get(3))
    println("firstCharOfCountries index 1 : " + firstCharOfCountries[1])


    val charSample: CharArray =
        arrayOf('S', 'A', 'M', 'E', 'T').toCharArray() // Bu sekilde primitive halini alabiliriz.
    println(charSample)

    /**         Primitive-type arrays tanımlama            */
    val booleanArray = BooleanArray(5)
    val byteArray = ByteArray(2)
    val charArray = CharArray(2)
    val doubleArray = DoubleArray(2)
    val floatArray = FloatArray(2)
    val intArray = IntArray(2)
    val longArray = LongArray(2)
    val shortArray = ShortArray(2)
    // yukarda ki gibi deger vermeden bos bir array olarak da olusturabiliriz ya da deger vererek de yapabiliriz
    val booleanArray1 = booleanArrayOf(true,true,false)
    val charArray1 = charArrayOf('s', 'a', 'm', 'e', 't')

    println("BooleanArray: ${booleanArray.joinToString()}")
    println("CharArray: ${charArray.joinToString()}")
    println("IntArray: ${intArray.joinToString()}")
    println("DoubleArray: ${doubleArray.joinToString()}")

    println("------------------------------------------------------------------------------")

    /**
     * val ile tanimlanmis bi array'in herhangi bir index'indeki degeri degistirebiliriz.
     * val indexdeki degerlerin degismesine karısmaz
     * Ancak ilgili diziyi baska bir dizi ile esitlememize izin verilmez.
     * Bunun icin tanimlamayi var ile degistirmemiz gerekir.
     *
     * Arrayler mutable'dir,icerisindeki index'lerdeki degerler degisebilir.
     */

    val awesomeArray = arrayOfNulls<String>(5)
    awesomeArray[2] = "samet"
    awesomeArray[2] = "SAMET"
    println(awesomeArray.joinToString())

//    awesomeArray = arrayOf("foo","boo","goo","doo","loo")   Bu sekilde calismaz. val tanımlı oldugu icin var olması lazım calisması icin.

    /**
     *  Array'in size'i disina (boyutu disina) cikiyorsak, IndexOutOfBound hatasi aliriz.
     */
    //awesomeArray[5] = "boyut disi, hata verir"
    println(awesomeArray.joinToString())

    /* ----------------------------------------------------------------------------------------------------------------------------------------------*/

    //2 boyutlu arrayler(diziler)
    val twoDArray = Array(2) { Array(2) { 0 } }
    println(twoDArray.contentDeepToString())
    // [[0, 0], [0, 0]]

    //3 boyutlu arrayler(diziler)
    val threeDArray = Array(3) { Array(3) { Array(3) { 0 } } }
    println(threeDArray.contentDeepToString())
    // [[0, 0, 0], [0, 0, 0], [0, 0, 0]],
    // [[0, 0, 0], [0, 0, 0], [0, 0, 0]],
    // [[0, 0, 0], [0, 0, 0], [0, 0, 0]],

    //Array'ler her zaman degisebilirdir(mutabledir).
    val simpleArray = arrayOf(1, 2, 3)
    simpleArray[0] = 10
    twoDArray[0][0] = 2

    println(simpleArray[0].toString()) // 10
    println(twoDArray[0][0].toString()) // 2


    //  Ayni zamanda array'ler üst class'larin yerine atanamazlar.(invariant) -  Atayamamak var ya da val olmasindan kaynaklanmaz.
    //  Herhangi bir array'in ust classindaki bir array'in yerine atanamamasi durumuna invariant denir. ( üst class'ın child class yerine kullanılamaması durumu.)
    val arrayOfString: Array<String> = arrayOf("V1", "V2")
//    val arrayOfAny : Array<Any> = arrayOfString Burasi calismaz.
    var arrayOfAny : Array<Any> = arrayOf("V1", "V2")


    /* ----------------------------------------------------------------------------------------------------------------------------------------------*/
    /** Array'ler ekleme ve silme gibi işlemler için kullanmamamız gereken yapılar.
     * ekleme silme gibi islemlerimiz olucaksa collection'ları kullanırız. daha performanslı yapılar.
     * ekleme silme olmucak sadece listeleme, göstermek, daha basit yapılar icin Array'ler kullanırız. */
    /* ----------------------------------------------------------------------------------------------------------------------------------------------*/


    /**
     * vararg kelimesi ile istedigimiz sayida parametreyi kabul edebiliriz.
     * Eger vararg'a denk gelecek sekilde bir array kullanmak istiyorsak,"spread" "*" operatoru kullaniriz.
     * Spread operatoru,verdiginiz array'in elemanlarinin her birini bir variable olacak sekilde parametre olarak paslar.
     */

    val lettersArray = arrayOf("c", "d")
    printAllStrings("a", "b", "c", "d", "e")
    println()
    printAllStrings("a", "b", *lettersArray)

    println()/*----------------------------------------------------------------------------------------------------------------------------------------------*/
    println("------------------------------------------------------------------------------")

    /**
     * Array'leri karşılaştırırken == operatorunu kullanamayiz.== operatoru o array'lerin referans objectlerini karşılaştırır.
     * contentEquals ya da contentDeepEquals kullanmamiz gerekir.
     */
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(1, 2, 3)

    println(array1 == array2) //Aslinda degiskenlerdeki === gibi dusunebiliriz.Memory'de tutuldugu yerler farkli oldugu icin false degeri aliriz.
    //Degerleri ayni olsa bile!!

    val array3 = array1
    val array4 = array1
    println(array3 == array4) // Fakat burda array3 ve array4 ayni yeri isaret eder,referanslari aynidir.Burda true degerini aliriz.


    println(array1.contentEquals(array2))//Tek boyutlu bir arrayimiz var ise icerideki degerleri karsilastirir.

    val array5 = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
    val array6 = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))

    println(array5.contentDeepEquals(array6)) // Cok boyutlu bir arrayimiz var ise icerideki degerleri karsilastirir.


    // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/ Array'lerde kullanabilecegimiz fonksiyonlarin listesi.

    val sumArray = arrayOf(1, 2, 3, 4)
    println(sumArray.sum())

    val shuffledArray = arrayOf(1, 2, 3, 4)
    shuffledArray.shuffle()
    println(shuffledArray.joinToString())

    println()/*----------------------------------------------------------------------------------------------------------------------------------------------*/
    println("------------------------------------------------------------------------------")



    /**
     * Array'leri List'e ve Set'e dönüştürebiliriz.
     */

    val sampleArray = arrayOf("a", "b", "c", "c")
    println(sampleArray.toSet())

    println(sampleArray.toList())

    /**
     * Map'lere de donusturebiliriz.Ancak bunun icin arrayin ozel olarak Pair<K,V> formunda olması lazim.
     */

    val cities = arrayOf("Istanbul" to 34, "Samsun" to 55, "Bursa" to 16)
    println(cities.toMap())
}

fun printAllStrings(vararg strings: String) {
    for (string in strings) {
        print(string)
    }
}