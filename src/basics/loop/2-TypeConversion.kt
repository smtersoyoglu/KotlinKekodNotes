package basics.loop

fun main() {


 /**
 Kotlinde  Explicit Type Conversion:Acik -> Belirgin tip donusumu vardır.
  */

 /**
  * Tip donusumu icin kullanabilecegim fonksiyonlar
  * toByte(),toShort(),toInt(),toDouble(),toFloat(),toChar(),toString(),
  * toUByte(),toUShort(),toUInt(),toDuration(),toBigDecimal(),toBigInteger()
  */

 /**
  * Deger araliklarini iyice incelemeliyiz.
  * Deger araligi kucuk olan tipler buyuk olan tiplere,sorunsuz,acik olarak(explicit) donusuturlebilirler.
  */

 val intValue: Int = 42
 val doubleValue: Double = intValue.toDouble() // Otomatik olarak Int değerini Double'a dönüştürür
 println(doubleValue) // Çıktı: 42.0

 /** Burada, toInt() ve toDouble() gibi işlevler kullanarak otomatik tür dönüşümünü gerçekleştiriyoruz. */


 val doubleValueTry: Double = 42.0
 val intValueTry: Int = doubleValueTry.toInt() // Açık olarak Double değerini Int'e dönüştürür
 println(intValueTry) // Çıktı: 42

 /** Burada, toInt() fonksiyonunu kullanarak Double değerini açıkça bir Int'e dönüştürüyoruz. */






 val IntNumber1 = 2_100_000_000
 val IntNumber2 = 2_100_000_000

 val resultNumber2 = IntNumber1 * IntNumber2
 println(resultNumber2)

// Yukaridaki ornege baktigimizde 2 adet Int sayisini carpma islemine soktugumuzda sonucun Long olmasini bekleriz.
//Fakat Ide boyle calismaz.2 adet Int sayiyi carptigimizde,IDE sonucun Int olmasini bekler ve tipini Int'e set eder.
//Ama sonuç Int deger araligini asdigi  icin print ettigimizde anlamsiz bir sonuc goruruz.
// Bunun icin islemlerimizde dikkatli olmaliyiz.ToLong() diyerek sayimizi longa cevirebiliriz.


}