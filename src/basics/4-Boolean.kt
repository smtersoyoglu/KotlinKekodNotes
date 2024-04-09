package basics

fun main() {

    /**
     *      8 bit kadar alan kaplarlar.
     *      true ya da false degeri atamasi icin kullanilir.Nullable versiyonlari null deger de alir.
     *      0 ya da 1 boolean olarak kullanilamaz.
     */

    val isStudent: Boolean = true
    val isTeacher: Boolean = false
    val isFirstStudentMale: Boolean? = null

    // val isStudent2: Boolean = 1  -> 0 ya da 1 boolean olarak kullanilamaz.
    // val isStudent2: Boolean = 0

    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     *        ||(or) , &&(and), !(not) gibi operatorler ile beraber kullanilir.
     **/

    if (isStudent && isTeacher) {
        println("Student and teacher")
    }
    if (isStudent and isTeacher) {
        println("Student and teacher  // && yerine and de kullanılabilir")
    }
    if (isStudent || isTeacher) {
        println("Student or teacher")
    }

    if (isStudent.or(isTeacher)) {
        println("Student or teacher // || yerine or da kullanılabilir")
    }

    if (isStudent or isTeacher) {
        println("Student or teacher // || yerine or da kullanılabilir")
    }

    if (isStudent.not()) {
        println("Not student")
    } // ogrenci degildir- degildir icin .not ve ! kullanabiliriz.
    if (!isTeacher) {
        println("Not teacher")
    }

    /**
     *  ||(or) -  karşılastırılan iki değerden en az birisi true ise sonuç true olur. Bu karşılaştırmada sonucun false olması için iki değerinde false olması gerekiyor.
     *  &&(and) -  karşılastırılan iki değer de true ise sonuç true olur. Eğer ifadelerden herhangi birisi false ise sonuc false olur.
     *  !(not) - Bu operatör ile degerimiz true ise false, false ise true yapar.
     *
     * */

    /*--------------------------------------------------------------------------------------------------------------------*/


    /**
     *  Boolean degerinin true olmasini kontrol ettirmek icin == true seklinde kontrole gerek yoktur.
     *  Zaten ifade true ise suslu parantezler icerisine gircektir.Nullable ise bunu yapmak zorunlu.
     */

    if (isStudent == true) {

    }
    if (isStudent) {

    }

    /* if (isFirstStudentMale){
        Bu sekilde kullanamayiz,cunku artik 3 adet ihtimalimiz var.Null olmasi,true olmasi ve false olmasi.
    }*/

    if (isFirstStudentMale == true) {
        // Bu sekilde kullanmaliyiz.
    }


    /*--------------------------------------------------------------------------------------------------------------------*/

    /**     Kotlin de ||(or) ve &&(and) operatorleri lazily calisma mekanizmasina sahiptir bu ne demek ?
     *      Kod daha hızlı ve performanslı calissin diye ide nin, dilin yaptıgı optimizasyon da
     *      sol tarafı kontrol edip ona göre true false olayına kısaca bakması.
     *      sag degerlerin kontrolüne girilmez.
     *

     *      ||(or) ve &&(and) operatorleri lazily calisma mekanizmasina sahiptir.Performans acisindan onemlidir.
     *      Eger || opearatorunun solu true ise sagdaki degere bakmaya gerek duymaz ve true olarak kabul eder.
     *      Eger && operatorunun solu false ise sagdaki degere bakmaya gerek duymaz ve false olarak kabul eder.
     */


}