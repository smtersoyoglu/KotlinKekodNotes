package basics.loop
/**
 * Ozellikle challenglarda degiskenleri tanimlarken,veri tiplerindeki araliklara uygun degiskenler tanimlamayliz.
 * Bu,bir mobil uygulama icin cok buyuk bir problem degil,
 * fakat daha buyuk veri tipleri ile calisacaksak o durumda memoryde kapladiklari alan bakimindan farkeder.
 *
 */
/* -------------------------------------------------------------------------------------------------------------------------*/
/**
 * Degiskene deger atamasi yapilirken,maksimum performans icin dogru degisken tipini kullanmak onemlidir.
 * Bunun icin degiskenlerin deger araliklarini kontrol edebiliriz.
 * Type Inference sirasinda eger sayi Int ifadeden buyuk degilse,tipi default olarak Int set edilir.
 * Type Inference sirasinda eger sayi Int ifadeden buyık ise,tipi default olarak Long set edilir.
 */

fun main() {

    // Değişken oluşturma
    // var, val
    // var -> bir değişkenin değerinin daha sonra değiştirilmesi durumu
    // val -> sabit değere sahip bir değişken kurma



    // Long       Degiskenler icin sayinin sonuna 'L' konularak deger atamasi yapilabir.
    // Float      Degiskenler icin 'F' veya 'f' harfi konularak deger atamasi yapilabilir.

    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1

    /* -------------------------------------------------------------------------------------------------------------------------*/
    /**
     * Boxed : Degiskenin obje referansi olarak tutulmasidir.
     * UnBoxed : Degiskenin primitive olarak tutulmasidir.
     * === : operatoru degiskenlerin referansini karsilastirilirken kullanilir.
     * == :  operatoru degıskenlerin degerini karsilastirirken kullanilir.
     */

    //Eger biz bir primitive bir degiskeni null yapiyorsak,bu degisken artik primitive tip degil,buyuk class tiplerine donusur.

    // Byte araligi icin asagidaki gibi olur.Özel optimizasyonlar bizim ayni referans alanina isaret ettigimizi gosterir.
    // Yani,farkli degiskenler gibi gozukse de aslinda bunlar ayni degiskenlerdir.
    // Stack'de tutulur.

    val number: Int = 100 // primitive tip
    val boxedNumber: Int? = number // class tipi
    val anotherBoxedNumber: Int? = number
    println(boxedNumber === anotherBoxedNumber) // true


    //Fakat byte disinda bi araliga cikiyorsa,asagidakiler farkli memory alanlarina isaret ediyorlar demektir.
    val number2: Int = 10000
    val boxedNumber2: Int? = number2
    val anotherBoxedNumber2: Int? = number2
    println(boxedNumber2 === anotherBoxedNumber2) // false

    /**
     * Stack ve Heap denen 2 adet memory alanımız vardır.Memory dediğimiz şey temelde bu 2 yapıdan oluşur.
     * Biz bir primitive(unboxed) değişken oluşturduğumuz zaman,hem değişkenin kendisi hem de değeri için stackde yer ayrılır.
     * Bu ikisi toplamda bir Int kadar yer kaplar.Stack alanı,heap alanından daha hızlı çalışır.
     * Primitive tipler,hem değişkenin kendisini hem de içerdiği değeri aynı stack alanında,daha performanslı çalışan alanda tutarlar.

     * Eğer referans tipli bir değişkenle çalışıyorsak,o değişkenin ismi stackde tutulur,değeri heap'de tutulur.
     * Örneğin val age : Int? yapıp herhangi bir değer atarsak,age'in kendisi stackde tutulur içerdiği değer ise heapde tutulur.
     * Eğer bu değişkene null değerini verirsek,heapde kullandığı alan boşalır fakat stackde değişkenin ismi için yer kaplanmaya devam edilir.
     * Dolayısıyla,değişkeni nullamamız,değişken için memory'de herhangi bir alan tutulmuyor anlamına gelmez.
     * Değişkenin kendisi için bir alan tutulur fakat değeri için bir alan tutulmuyor anlamına gelir.
     * Sonrasında bir değer atarsak,heapde değişkenin değeri,stack'de ise değişkenin kendisi tutulmaya devam edilir.
     */

    /**------------------------------------------------------------------------------------------------------------------------------------------------- */


    var a = Ders1()
    //a.isMale = false  ---> burda değerini değiştirmemize izin vermez çünkü Ders1 class'ında set'ini private yaparak var bir değişkeni val yaptık
}

class Ders1 {
    var isMale : Boolean = true
        private set
}