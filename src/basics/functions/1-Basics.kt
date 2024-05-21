package basics.functions

/**
 *      fun keywordu ile fonksiyonlar baslar.
 *      fonksiyon ismi verilir.
 *      parametre parantezleri acilir ve parantezler girilir.
 *      : operatoru ve geri donus degeri yazilir.
 *      fonksiyon body'si acilir ve kapanir.
 *      Geri donus degeri verilmeyen fonksiyonlar Unit tipini geri dondurur.
 */

/**
 *  Fonksiyon cagirilirken ismi ve parametreleri kullanilir.
 *  Eger bir geri donusu varsa bir degiskene aktarilir.
 *   : operatoru ve geri donuş degeri yazilir.
 *  Bir fonksiyonun geri dönüş değeri yoksa Unit tipini geri dondurur.(geriye birsey dondurmuyor demektir.)
 */

fun main() {

    /**
     * Fonksiyon'lar Kotlin'de "First Class Citizen"dır. yani değişkenlere deger olarak atanabilir, başka fonksiyonlara
     * parametre olarak verilebilir ya da bir fonksiyonun geri dönüş degeri olabilir demektir. Yani
     * "First Class Citizen" olması için 3 aşaması var;
     * 1- Bir degiskene deger olarak verilecek
     * 2- Bir fonksiyona parametre olarak verilecek
     * 3- Bir fonksiyonun geri dönüs degeri olarak olarak verilebilecek
     * Bu yüzden Kotlin'de fonksiyonlara "First Class Citizen"dır deriz.
     */

    /**
     *  Bir classin fonksiyonunu cagirirken ise nokta isaretini kullaniriz.
     */
     Math.pow(2.0,3.0)

    /* -------------------------------------------------------------------------------------------------------------------------*/


    takeSquare(2)
    val squareValue = takeSquare(2)

    /**
     * Default degeri olan parametrelere sahip bir fonksiyon cagrilirken,default degeri olan parametrelere deger atamak
     * sart degildir.Default degeri olan bu parametreler opsiyonel parametrelerdir.
     * Default degeri olan parametrelere deger atanmadan fonksiyon cagirilacaksa, bu durumda parametre sirasi degisir.
     * Ide'ye hangi parametreye deger atadigimizi soylemek icin Named Arguments'leri kullanmamiz gerekir.
     * name argumentleri verdigimizde siralamanin bir onemi yoktur.
     *
     *  = ile fonksiyonlara default degerler verilebilir.(Default Argument)
     *
     * Fonksiyonlarda default(name) argument ne demek ? ---------- önemli soru junior seviye
     *  default(name) argument;
     *  Kotlin'de bir fonksiyon tanımlanırken, fonksiyon parametrelerine varsayılan değerler atanabilir.
     *  Bu, fonksiyon çağrılırken bu parametrelere bir değer belirtilmediğinde kullanılacak değeri belirler.
     *
     *  Tekrar tekrar ayni fonksiyonun farkli varyasyonlarini yazmak zorunda kalmayiz.
     *  - Kotlinde bir adet default deger alan fonksiyon olusturuyorsak,arka planda 2 adet fonksiyon olusur.
     *  Biri bu fonksiyonun bos hali,digeri ise parametre alan halidir.
     * Örnek olarak:
     */
    // default(name) argument ornegi
    greet("Alice") // Hello, Alice!
    greet()        // Hello, World

    reformatMessage("Message", true, 7, "tr")
    reformatMessage(message = "Message", size = 7, lang = "tr")
    reformatMessage("Message", true, 7)
    reformatMessage("Message", size = 7)

    reformatMessage("hello Kotlin", size= 7, lang = "tr") // size= ve lang= ile tanımladıklarımız name argument'dir.
    // default olarak tanımlananı atla ismini verdiklerimi yaz diyoruz.

    /* -------------------------------------------------------------------------------------------------------------------------*/

    /**
     *   Fonksiyonlarda Function Overloading nedir Kotlin de nasıl yapılır ? ---------- önemli soru junior seviye
     *  - Bir isimle yazılmış fonksiyonun(aynı isimle) parametre sayıları değiştirilerek ya da parametre tipleri değiştirilerek (parametre sayıları aynı olsa bile tipleri farklı olabilir.)
     *   ayni fonksiyon isminde birden fazla fonksiyon yazılması olayına denir.
     *
     *   -Kotlin'de name argument'leri kullanarak, default argument'leri kullanarak yaptığımız işlem fonksiyon overload'u sağlatıyor bize.
     *
     *  - Kotlin'de, aynı isme sahip farklı parametre listelerine sahip birden fazla fonksiyon tanımlanabilir.
     *    Bu, fonksiyonların farklı durumlar için özelleştirilebilmesini sağlar.
     */

    // Function Overloading ornegi
    val resultInt = add(3, 5)        // resultInt = 8
    val resultInt2  = add(3,5,7)
    val resultDouble = add(3.5, 2.5) // resultDouble = 6.0
    println(resultInt)
    println(resultInt2)
    println(resultDouble)


    /* -----------------------------------------------------------------------------------------------------------------------------------------------*/

    /** vararg
     *  Cok uzun sayida parametremiz olacaksa "variable number of arguments"- vararg tanimlanabilir.
     *  Bu sayede fonksiyon tek bir parametre aliyor gibi gozukurken,kendisine cok miktarda degisken atanabilir.
     *  Bu degiskenlere array'e erisir gibi erisebiliriz. " [index]" ya da .get(index) seklinde.
     *
     *  Vararg parametre sayisi belli olmayan durumlarda kullanilir. Parametre sayisi cok fazla oluyor diye kullanmamiz gereken bir durum degildir.
     *
     *      Önemli;
     *  vararg tek ya da son parametre olarak yazilirsa,Jvm'e hazirlanirken,javadaki "String.. " gibi ayni kod derlenir.
     *  Ancak vararg parametresi birden fazla tanimlanirken, ortada ya da basta yer alirsa,Jvm'e hazirlanirken Array'e donusturulur.
     *  Bu da performans farki olusturur demektir.
     *
     */
    // vararg kullanimina ornek. key = 3'den onceki parametreler vararg parametresine denk gelir.
    // key vararg'a dahil degil bu yuzden son girdigimiz parametrenin vararg'a karsilik gelmedigini soylememiz gerekiyor.(key = 3 dememiz lazım.)

    getUserInfo1("Samet", "Ersoyoglu", "Tokat", "Turkiye"," "," ", key = 3)

    // vararg parametresi olarak arrayOf kullanılmak istenirse,* operatoru (*arrayOf) eklenmelidir.(spread operatoru)
    // burda * kullanarak array'in vararg'a denk gelmesini isteriz.
    // Bu operator diger dillerde olan pointer kullanımı degildir.Kotlinde pointerlar yoktur.
    getUserInfo1(*arrayOf("Samet", "Ersoyoglu", "Tokat", "Turkiye"), key = 4)

    getUserInfo3(3, "Samet", "Ersoyoglu", "Tokat", "Turkiye","","")

    getUserInfo4(3,"Samet","Ersoyoglu","Tokat","Turkiye",true,3.14,"")



    /* -----------------------------------------------------------------------------------------------------------------------------------------------*/

    val toplam = topla(5, 3)
    println("Toplam: $toplam") // Output: Toplam: 8

    val carpim = carp(4)
    println("Çarpım: $carpim") // Output: Çarpım: 4 (1 ile çarpıldı)

    val kare = kareAl(6)
    println("Karesi: $kare") // Output: Karesi: 36


    val result = double(6)
    println("double Fonksiyon işlemi : $result")
}


/**
 *  argument sonda ya da tek basina tanimlanirsa vararg seklinde bu normal parametreler olarak java kodunda derlenir.
 *  ama basta ya da ortada tanimlanirsa yani vararg'dan sonra 1 parametre daha ekstradan gelecekse en azından bu
 *  array tipli olarak parametreye verilir bu da ufak ta olsa bir performans farkı yaratır.
 *  bu fark cok önemli degil, dert edilmicek bir fark.
 *
 *  özetle;
 *  vararg'ı sona yazarsak ya da tek parametre olarak geciyorsa, basta olmasina göre ufacikta olsa performans farki yaratiyor.
 *
 * */

fun getUserInfo1(vararg userInfo: String, key: Int) { // basta yazilim
    userInfo[3]
    userInfo.get(3)

    val array = IntArray(3)
}

fun getUserInfo2(vararg userInfo: String) { // tek basina yazilim
    userInfo[3]
    userInfo.get(3)
}

fun getUserInfo3(key: Int, vararg userInfo: String) { // sonda yazilim
    userInfo[3]
    userInfo.get(3)
    println(key)
}
fun getUserInfo4(vararg userInfo: Any) { // tek basina yazilim
    userInfo[3]
    userInfo.get(3)

}

/**
 * Ayni fonksiyon icerisinde,birden fazla vararg tanimi yapilmasina izin verilmez.
 * Asagidaki kod calismayacaktir.
 */

//fun getUserInfo5(vararg userInfo : String, vararg userInfo2:Int){ }


fun greet(name: String = "World") {
    println("Hello, $name!")
    //Yukarıdaki örnekte, name parametresi varsayılan olarak "World" olarak ayarlanmıştır. Eğer fonksiyon çağrılırken bir isim belirtilmezse, "World" kullanılacaktır.
}


fun add(x: Int, y: Int): Int {
    return x + y
}

fun add(x: Int, y: Int, z:Int) : Int {
    return x + y + z
}

fun add(x: Double, y: Double): Double {
    return x + y
}
/**
 * Yukarıdaki örnekte, add fonksiyonu ÜÇ  farklı sürümde tanımlanmıştır:
 * biri Int türünde parametreler alırken ve Int türünde parametre sayısı fazla diğeri Double türünde parametreler alır.
 * Böylece, hangi tür parametrelerle çağrılacağına göre ilgili fonksiyon otomatik olarak seçilir.
 *
 **/

// Basit bir toplama fonksiyonu
fun topla(a: Int, b: Int): Int {
    return a + b
}

// Parametre olarak varsayılan değerler atanmış bir fonksiyon
fun carp(a: Int, b: Int = 1): Int {
    return a * b
}

// Tek satırlık bir fonksiyon için kısaltılmış yazım (single-expression function)
fun kareAl(sayi: Int) = sayi * sayi



fun double(x: Int): Int {
    return 2 * x
}

fun takeSquare(number1: Int = 5, number2: Int = 3): Int {
    return 2 * number1
}

fun reformatMessage(message: String, isUpperCase: Boolean = false, size: Int, lang: String = "tr") {
    println("Message:$message, isUpperCase:$isUpperCase Size:$size, Lang:$lang")
}