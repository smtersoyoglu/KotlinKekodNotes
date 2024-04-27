package basics.controlflow


data class PairNumber( val numberOne: Int, val numberTwo: Int) {

    /**     Operator Overload islemi;
     *  +, -, *, /, % gibi yada diger operator func'lar hangisini kullanıyorsak onların asıl yaptıgı islemin dısında
     *  bir anlam yüklemeye Operator Overload denir.
     *  (Operator overloading kısaca bir operatorun belirlenmiş görevi dışında ona farklı bir görev atanmasının yapılmasıdır.)
     *
     *  sadece number'ları kullanabilecek ken number'lar yerine class refereansları da kullanabilmis oluyoruz.
     *  anlamını, anlam bütünlüğünü bozmamaya çalışmalıyız.
     *
     * */
    operator fun minus(pairNumber: PairNumber): PairNumber {
    // operator keyword'unu kaldırırsak .minus(fonksiyon) hallini hala kullanabiliriz ama operator halini kullanamayız.

        val localNumberOne = numberOne - pairNumber.numberOne
        val localNumberTwo = numberTwo - pairNumber.numberTwo

        val returnPairObject = PairNumber(localNumberOne, localNumberTwo)

        println("Sonuç = ${returnPairObject.numberOne}, ${returnPairObject.numberTwo}")



        return returnPairObject
    }


    operator fun plus(value: Int) {
        println("Toplama Sonuç:${numberOne + value}")
    } // Bu sekilde plus operatorunu ve fonksiyonunu ozelleştirip kullanabiliriz.

}

/**
 *      Code smell deniliyorsa tekrarlayan islemlere bak.
 *      alttaki ornegimizde cikarma islemleri(operator islemleri) ve print islemleri tekrar ediyor
 *      ve overload ederek 2 satır kod'la aynı islemi yapabiliriz.
 * */

fun main() {
    val a = 5
    val b = 8

    // operatorler arka planda eslenigi olan(corresponding) methodu cagirir.
    var result = a + b
    result = a.plus(b)

    val pairNumberOne = PairNumber(2, 4)
    val pairNumberTwo = PairNumber(-8, 11)

//    val resultOne = pairNumberOne.numberOne - pairNumberTwo.numberOne
//    println("resultOne = $resultOne ")

//    val resultTwo = pairNumberOne.numberTwo - pairNumberTwo.numberTwo
//    println("resultTwo = $resultTwo ")

    /**
     * Yukarida ki sekilde kodlamak  yerine, minus fonksiyonunu Operator Overload islemi yaparak  asagidaki gibi kullanabiliriz.
     * Operator Overload -> yapacagi isi degistirme
     */

    pairNumberOne - pairNumberTwo
    pairNumberOne.minus(pairNumberTwo)

    pairNumberOne.plus(5)
    pairNumberOne + 10

    /* pairNumberTwo.plus(pairNumberTwo)
      pairNumberTwo + (pairNumberTwo)*/


}