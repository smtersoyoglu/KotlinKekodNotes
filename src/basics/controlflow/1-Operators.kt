package basics.controlflow

fun main() {

    var numberOne = 10
    var numberTwo = 5

    println("NumberOne: $numberOne")        // 10
    println("NumberOne: ${numberOne++}")    // 10      --> '++' yı sonuna koyarsak önce print et sonra topla.
    println("NumberOne: ${numberOne}")      // 11      --> yukarda arttırılan sayıyı burda yazdırıyoruz.
    println("NumberOne: ${++numberOne}")    // 12      --> print isleminden önce toplama islemini yap sonra yazdır(print) demek.

    // +, -, /, *, % operatorlerinin fonksiyon halleri de vardır. plus, minus, times, div, rem

    print(" ${numberOne + numberTwo} ")
    print(" ")
    println(numberOne.plus(numberTwo))

    print(" ${numberOne - numberTwo} ")
    print(" ")
    println(numberOne.minus(numberTwo))

    print(" ${numberOne * numberTwo} ")
    print(" ")
    println(numberOne.times(numberTwo))

    print(" ${numberOne / numberTwo} ")
    print(" ")
    println(numberOne.div(numberTwo))

    print(" ${numberOne % numberTwo} ") // mod alma islemi bölümünden kalan bilgisini verir.
    print(" ")
    println(numberOne.rem(numberTwo))

    /* ------------------------------------------------------------------------------------------------------------------------------------------ */

        /** Operatörlerle birlikte nullable ifadeleri nasıl kullanırız.*/
    // null deger var ve operatorler ile yapamk istersek if(grade == null) { return } yaparak (smart casting) null olsaydı burda return edecekti
    // null olmadıgına göre assagi da ki islemleri yap demeye yarıyor. altta'kilerin null oldugu durumları unutuyor.
    // grade?.let {} yapıp islemleri parantezler icerisine alırsak da hata almadan operator kullanabiliriz iceride.

    print("Final Notunuzu Giriniz: ")
    val grade  = readln().toInt()

    val charNote = if (grade == 100) {
        "$grade == AA"
    } else if ( grade <= 99 && grade >= 80) {
        "$grade == BB"
    } else if ( grade <= 79 && grade >= 50) {
        "$grade == CCC"
    } else if ( grade <= 49 && grade >= 20) {
        "$grade == DD"
    } else if (grade in 0..19) { // Ide'nin önerdigi
        "$grade == FF"
    } else {
        "$grade = Bulunamadı!!"
    }
    println("Char Note: $charNote")


    /* ------------------------------------------------------------------------------------------------------------------------------------------ */

    /**     + operatorü ile plus ayni islemi yaptıgını biliyoruz peki ne zaman + operatoru ve plus kullanılır, tüm operatorler icin gecerli
     *
     *      Karsılastirma yaptıgımız iki sayıdan biri veya ikisi nullable olursa operator halini kullanamayız. hata veirir.
     *      bunun yerine fonksiyon hallerini kullanmamız lazım.
     *      Cünkü; operator kullaniminda nullcheck yapmıyor bu yüzden operator fonksiyon hallerini kullanmayız. nullable durumunda.
     *      null'lık bir durum yoksa operator halini kullaniriz.
     * */

    // karsılastirma islemleri;
    // 65.compareTo(100) -> ilk kısım daha kücükse -1, kıyaslama yapıyoruz.
    // 100.compareTo(65) -> ise +1 ,        100.compareTo(100) -> 0 degerini alırız.
    println(grade.compareTo(100) == -1)
    println(grade.compareTo(100) == 1)
    println(grade.compareTo(100) == 0)
    println(grade.equals(100))
    println(!grade.equals(100))

    /**
     *  ==	   Eşit mi?	            compareTo	a.compareTo(b) == 0
     *  >	   Büyük mü?	        compareTo	a.compareTo(b) > 0
     *  <	   Küçük mü?	        compareTo	a.compareTo(b) < 0
     *  >=	   Büyük veya eşit mi?	compareTo	a.compareTo(b) >= 0
     *  <=	   Küçük veya eşit mi?	compareTo	a.compareTo(b) <= 0
     * */


    /* ------------------------------------------------------------------------------------------------------------------------------------------ */

    var a = 15
    var b = 5
    a += b // -> a = a + b
    println("a+=b: " + a) // 25
    a -= b
    println("a-=b: " + a) // 20
    a *= b
    println("a*=b: " + a) // 100
    a /= b
    println("a/=b: " + a) // 20
    a %= b
    println("a%=b: " + a) // 0

    /**
     *      Eğer ki yaptıgımız islemin icerisin de bir atama islemi varsa atama islemini String'in icerisine yazamayız.
     *       println("a+=b : ${a = a + b}") String içerisinde atama işlemleri yapamayız. -> "${a = a+b}" olmaz atama islemi var.
     * */

    /*
        a+=b     a.plusAssign(b)
        a-=b     a.minusAssign(b)
        a*=b     a.timesAssign(b)
        a/=b     a.divAssign(b)
        a%=b     a.remAssign(b)

     */

    /* ------------------------------------------------------------------------------------------------------------------------------------------ */

    var numbOne = 10
    var numbTwo = 5
    var flag = true

    println("+a :    ${+numbOne}")  // 10
    println("-b :    ${-numbTwo}")  // -5
    println("++a :   ${++numbOne}") // 11
    println("a++ :   ${numbOne++}") // 11
    println("a :     ${numbOne}")   // 12
    println("--b :   ${--numbTwo}") // 4
    println("!flag : ${!flag}")     // false
    println("!flag : ${flag.not()}") // false

    println(numbTwo + numbOne.unaryMinus()) // 4 + (-12) -> -8

    /**
     * +a unaryMinus()
     * -a unaryPlus()
     * ++a inc() a = a + 1
     * --a dec() a = a-1
     * !a not()
     */

}