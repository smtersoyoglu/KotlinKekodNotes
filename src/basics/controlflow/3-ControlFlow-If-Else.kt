package basics.controlflow

import java.io.IOException

fun main() {

    /**
     *  if-else caselerinden sonra suslu parantez acilir ve kapanir.
     *  Ancak bu suslu parantezlerin arasına tek satir kod yazacaksak,suslu parantez kullanmak zorunda değiliz.
     *  (ama tavsiye edilen ve tercih edilen süslü parantezler icine almak)
     *  If-else caselerin state ve expression olmak uzere 2 adet kullanımı vardır.
     *  State kullanımı; sadece if-else kullanarak sartli durumlarimizi kodlamaktir.
     *  Expression kullanımı;  ise bir value'ya deger olarak esitligin karsi tarafina if-else kodlarini yazmaktir.
     *  Expression olarak yapılan kullanımda, if-else case'lerin icerisine yazilmis parantezlerin son satiri value olarak atanir.
     */

    print("Öğrenci misin ?")
    val answer = readln()

    // state Kullanımı
    // ignoreCase ile de büyük-küçük harf duyarliligini ihmal etmiş oluruz.
    // .contains -> bu degerin icerisinde evet kelimesi geciyor'mu, eger geciyorsa if calısır.
    if (answer.contains("Evet", ignoreCase = true)) {
        println("Öğrenci")
    } else {
        println("Öğrenci Değil")
    }


    if (answer.contains("Evet", ignoreCase = true)) println("Öğrenci") else println("Öğrenci Değil")
    // yukarıdaki gibi yazabilirim. ama doğru ve tercih edilen temiz kullanımı ilk başta'ki { }  kullanılarak ve icersine yazılan yazım seklidir.


    // expression kullanimi.  {} icerisinde ki son satir, deger olarak degiskene atanir. val result: String =
    // ( bir if case yazarken bir degiskene atıcak sekilde bir degiskenin degeri olacak sekilde bir if case yazıyorsak buna expression kullanimi denir.)
    // expression kullaniminde degiskenin tipini (ornekte String) belirtmezsekde ide hata vermez ama best practice olarak belirtmemiz daha temiz olucaktır.)
    val result: String = if (answer == "Evet") {
        "Öğrenci"
    } else {
        "Öğrenci Değil"
    }

    println(result)


    /* ----------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Kotlin'de if-else'lerin Expression kullanimindan oturu ternary operatoru yoktur.
     *      Ternary yerine asagidaki gibi bir kullanim yapabiliriz.
     */
    val isStudent = false
    val isStudent2 = if (isStudent) { "true" } else { "false" }
    // String name2 = isStudent ? "true" : "false" ternary operator -> Java'daki kullanımı bu sekilde kotlin de bunu yukarda ki gibi yapabiliriz.
    // Java'daki elvis operatoru kotlinde yukarda ki gibi kullanılıyor. Fakat bu kullanim tercih edilmeyen ve kotu,cirkin bir kullanımdır


    /* ----------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     *       2 farkli tipteki number degiskenler karsilastirilirken equals fonksiyonu once tiplerini karsilastirdigi icin
     *       eger tipler uyusmuyorsa, ide hata verecektir
     * */
//    if ( 10 == 10L) {     // Calismaz. iki tipi karsilastirirken once tipe bakıyor. calismasi icin ya Long'a ya da Int'e cevirmeliyiz.
//          ya 10.toLong() == 10L deriz ya da 10 == 10L.toInt() yaparız.
//    }
    if (10 == 10L.toInt()) {

    }

    /* ----------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**      if if if yazmak ile if else yazmanın farkı nedir? Mülakat'larda sorulabilir
     *  Birden fazla sartli durumumuz varsa bunlarin her birini asagidaki gibi ayri ayri if seklinde yazmak,
     *  if-else seklinde yazmaktan daha kotu bir performans almamiza yol acar. Zira if-else durumlarinda doğru case
     *  bulunursa,diger case'ler kontrol edilmez. Ancak asagidaki durumda dogru case bulunsa bile tum case'ler
     *  kontrol edilir.
     *
     *  if if if ->  dogru case bulunsa bile tüm case'ler kontrol edilir
     *  if-else  ->  doğru case bulunursa,diger case'ler kontrol edilmez
     */

    val grade = 50
    // 50 degerinin oldugu case'i bulsa bile diger if'leri de kontrol eder. ve kötü performansa yol acar if-else tercih edilir.
    if (grade <= 100) {
    }
    if (grade > 85) {
    }
    if (grade <= 70) {
    }
    if (grade >= 65) {
    }
    if (grade > 40) {
    }

    /* ----------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     *  Bazı durumlarda if else yazmaktansa, if case'ini yazıp return ya da throw gibi kodun devam etmesini bozacak
     *  ifadelerle kodu sonlandirabiliriz. Kod calisirken bu if case'ine girmezse devam eden kod blogu calisir ki
     *  bu da pratikte else case'i demek olur. Bu sekilde yazim kodu biraz daha temiz gosterecektir.
     */

    if (isStudent) {
        println("Student")
    } else {
        otherMethod()
    }
    // yukarda ki gibi yazmaktansa
    if (isStudent) {
        println("Student")
        throw IOException()
//        return
    }

    otherMethod()

}
private fun otherMethod() {}