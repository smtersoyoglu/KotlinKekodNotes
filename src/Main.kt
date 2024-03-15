
fun main() {


    //Gökhan Öztürk - KeKod Kotlin dersleri code'ları


    val simpleArray = arrayOf(1, 2, 3)
    val anotherArray = arrayOf(1, 2, 3)
    println("== İle Yapılan Karşılaştırma: ${simpleArray == anotherArray}") // false
    println("contentEquals() İle Yapılan Karşılaştırma: ${simpleArray.contentEquals(anotherArray)}") // true

    println(simpleArray contentEquals anotherArray) // İnfix olarak kullanımı

    val array3 = arrayOf(1, 2, 3, 4)
    println("Before Modify array3: ${array3.joinToString()}")
    array3[2] = 10 // Array'deki 2. indesde bulunan değeri 10 ile değiştirdim.
    println("After Modify array3 ${array3.joinToString()}")

    // Çıktılar
    // Before Modify array3: 1, 2, 3, 4
    // After Modify array3: 1, 2, 10, 4

    fun printAllStrings(vararg strings: String) {
        for (string in strings) {
            print(string)
        }
    }

    val lettersArray = arrayOf("c", "d")
    printAllStrings("a", "b", *lettersArray)

    /**
    +a - unaryPlus() - Sayının işaretini temsil etmek için kullanılır. Yani burdaki işlemle sayıyı 1 ile çarpmış gibi oluyoruz.
    -a - unaryMinus() - Buradaki işlemle de sayıyı -1 değeri ile çarpmış gibi düşünebiliriz. Sayımız 4 ise -4 dediğimizde -4 ifadesini elde etmiş olduk. Ama sayımız -10 diyelim ve buna bu fonksiyonu uyguladığımızda --10 yapmış oluyoruz. İki - işaret çarpılırsa + olacağından sonuç 10 olacaktır.
    a++ : Bu ifade, önce mevcut değeri kullanır ve ardından değeri bir artırır. Yani, a'yı kullanır ve sonra a'yı bir artırır
    ++a: Bu ifade, önce değeri bir artırır ve ardından artırılmış değeri kullanır. Yani, a'yı bir artırır ve sonra artırılmış değeri kullanır.
    Bu kullanımın a-- ve --a kullanımları da vardır.
     */

    val sayi1 = 5
    val sayi2 = 4
    val sayi3 = -10

    println("Sonuç 1: ${+sayi1}")  // Sonuç 1: 5
    println("Sonuç 2: ${-sayi2}")  // Sonuç 2: -4
    println("Sonuç 3: ${-sayi3}")  // Sonuç 3: 10
    var numberOne = 10
    println("NumberOne: ${numberOne}")
    println("NumberOne: ${numberOne++}") // Önce mevcut değeri okur daha sonra artırma işlemini yapar.
    println("NumberOne: ${numberOne}")
    println("NumberOne: ${++numberOne}") // Önce değeri bir artırır daha sonra artıtılan değeri kullanılır.

    /* Sonuç
    NumberOne: 10
    NumberOne: 10
    NumberOne: 11
    NumberOne: 12
     */

    /**Ne Zaman Operatör Fonksiyonları (Örneğin: plus()) Kullanmalıyız, Ne Zaman Doğrudan Operatörleri (Örneğin: +) Kullanmalıyız?
    Eğer ilk çağırdığımız eleman nullable ise, ?. (safe call) operatörü kullanılarak null check işlemi gerçekleştirilebilir. Bu, eğer ilk eleman null ise, operatör fonksiyonunun(plus(),minus(),div()) çağrılmayacağı anlamına gelir ve sonuç olarak null döner.

    Diğer durumlarda, yani ilk eleman nullable değilse, direkt olarak operatör(+,-,/) kullanmak daha mantıklı bir tercih olacaktır. */


    val nullableNumber:Int? = 10
    val sayı2 = 3
    println(nullableNumber?.plus(sayı2))

    //println(nullableNumber + sayi2) // Bu şekilde yaptığımızda IDE bize bir null kontrolü gerçekleştirmen
    // gerekiyor diyor. `+` operatörleri nullable receiver olarak desteklenmiyor.

    // Eğer ben halen + operatörleri kullanacağım diyorsanız o zaman öncesinde bir null check yapmamız gerekiyor.

    if (nullableNumber != null) {
        println(nullableNumber + 1)
    }

    nullableNumber?.let {
        println(nullableNumber + 1)
    }






}