package basics


fun main() {

    /**      Range ;
     *   Sonlu sayili liste olusturmaya yarar. bir aralık olusturmak icin kullaniriz.
     */

    /**
     *  Küçükten büyüğe liste oluşturmak için ;
     *  ".."   operatorunu yada "rangeTo()"  -> belirttiğimiz her iki elemanda dahil olur.
     *  "..<"  operatorunu yada "rangeUntil()" -> ilk eleman dahil son eleman dahil olmaz.
     *   fonksiyonunu kullanabiliriz.
     */

    val numbers = 1..100 // [1,100]
    val numbers2 = 1.rangeTo(100)
//  val numbers3 = 1 rangeTo 100 - kullanilmaz

    val numbersUntil = 1..<100 //[1,100) son kısmı dahil etmez. [1,99]
    val numbersUntil2 = 1.rangeUntil(100)  /// 1,2,3,4,...,99 // rangeTo son kısmı dahil etmez.
//    val numbersUntil3 = 1 rangeUntil 100 - kullanilmaz

    /**
     *  until fonksiyonunu kullanarak da range tanımlanabilir. Ancak bu durumda bitis degeri listeye dahil edilmez.
     */

    val gradeNumbers = 10.until(100)  // (10,100)
    val gradeNumbers2 = 10 until 100
    print("gradeNumbers")
    println()
    gradeNumbers.forEach { print(" $it") }

    /* ------------------------------------------------------------------------------------------------------------------*/

    /**
     * Char'lardan oluşan bir liste de tanimlanabilir. . Türkçe karakterleri içermez.
     *
     */

    val alphabet = 'A'..'Z'
    alphabet.forEach { print("$it")}

    /* ------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Buyukten kucuge .. operatorunu kullanarak liste olusturamayiz. Ide hata verecektir. -> val reversedNumbers = 100..1 bu calismaz.
     *      Büyükten kucuge bir range,liste olusturmak için "downTo()" fonksiyonunu kullanabiliriz. Infix kullanimi da vardir.
     */

    val reversedNumbers = 100.downTo(1)
    val reversedNumbers2 = 100 downTo 1
    println()
    reversedNumbers2.forEach { print("$it ") }

    /* ------------------------------------------------------------------------------------------------------------------*/

    /**
     *      step fonksiyonunu kullanarak liste olusturulurken  belli sayıda atlamalar yapabiliriz.
     */

    val steppedNumbers = 1..101 step 2 // 2-2 atlayarak, arttırarak gider
    val reversedSteppedNumbers = 100 downTo 1 step 2 // 100 den 1 e 2,2 azalarak gider
    print("stepedNumbers")
    println()
    steppedNumbers.forEach { print("$it ") }

    /* ------------------------------------------------------------------------------------------------------------------*/

    /**
     *      CharRange, IntRange ve LongRange isimlerinde özel range'ler vardır(bunlara özel class'lar var). Progression olarak adlandırılır.. Genelde IntRange kullaniriz.
     *      Diger tipler bulunmaz. -> örnegin; double ve float'ta noktadan sonra kaca kadar, nereye kadar gidecegi belli olmadigi icin bu gibi durumlardan dolayı yokturlar.
     *
     *      Bu durumda first, last, step, count gibi ek bilgiler alinabilir.
     *
     *      Iterable<N> interface'ini implement etmislerdir. O sebeple map filter gibi fonksiyonları kullanabilirler.
     */

    val numberList : IntRange = 10 until 90

    println("First:${numbers.first}")
    println("Last:${numbers.last}") // last bilgisi dönülürken step'e göre dönüs saglanabilir.
    println("Step:${numbers.step}")
    println("Count:${numbers.count()}")

    when(10) {
        in numberList -> {
            println("10 sayisi numberList icerisinde yer alir.")
        }
    }

    val countBiggenThan50 = numberList.count { it >50 }

    println(countBiggenThan50)

    println("numberList. average ${numberList.average()}") // ortalamasını alma
    println("numberList. reversed ${numberList.reversed()}") // tersine cevirme

    println((1..10).filter { it % 2 == 0 }) // filtreleme
}