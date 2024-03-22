package basics.functions

/**
 * Fonksiyon cagirilirken ismi ve parametreleri kullanilir.
 * Eger bir geri donusu varsa bir degiskene aktarilir.
 * : operatoru ve geri donuş degeri yazilir.
 * Geri donus degeri verilmeyen fonksiyonlar Unit tipini geri dondurur.
 */


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
 * Bir classin fonksiyonunu cagirirken ise nokta isaretini kullaniriz.
 * Math.pow(2.0,3.0)
 */

/**
 * Fonksiyonlarda default(name) argument ne demek ? ---------- önemli soru junior seviye
 *  default(name) argument
 *  Kotlin'de bir fonksiyon tanımlanırken, fonksiyon parametrelerine varsayılan değerler atanabilir. Bu, fonksiyon çağrılırken bu parametrelere bir değer belirtilmediğinde kullanılacak değeri belirler.
 * Örnek olarak:
 *
 */
fun greet(name: String = "World") {
    println("Hello, $name!")
    //Yukarıdaki örnekte, name parametresi varsayılan olarak "World" olarak ayarlanmıştır. Eğer fonksiyon çağrılırken bir isim belirtilmezse, "World" kullanılacaktır.
}

/**
* Fonksiyonlarda Function Overloading nedir Kotlin de nasıl yapılır ? ---------- önemli soru junior seviye
*  Function Overloading
*  Kotlin'de, aynı isme sahip farklı parametre listelerine sahip birden fazla fonksiyon tanımlanabilir.* Bu, fonksiyonların farklı durumlar için özelleştirilebilmesini sağlar.
* *  Function Overloading Örnek olarak:
*
*/
fun add(x: Int, y: Int): Int {
    return x + y
}

fun add(x: Double, y: Double): Double {
    return x + y
}
/**
 * Yukarıdaki örnekte, add fonksiyonu iki farklı sürümde tanımlanmıştır:
 * biri Int türünde parametreler alırken diğeri Double türünde parametreler alır.
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

fun main() {
    // default(name) argument ornegi
    greet("Alice") // Hello, Alice!
    greet()        // Hello, World
    // Function Overloading ornegi
    val resultInt = add(3, 5)        // resultInt = 8
    val resultDouble = add(3.5, 2.5) // resultDouble = 6.0
    println(resultInt)
    println(resultDouble)


    val toplam = topla(5, 3)
    println("Toplam: $toplam") // Output: Toplam: 8

    val carpim = carp(4)
    println("Çarpım: $carpim") // Output: Çarpım: 4 (1 ile çarpıldı)

    val kare = kareAl(6)
    println("Karesi: $kare") // Output: Karesi: 36


    val result = double(6)
    println("double Fonksiyon işlemi : $result")
}

fun double(x: Int): Int {
    return 2 * x
}