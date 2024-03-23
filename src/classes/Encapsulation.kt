package classes

class Encapsulation {
    /** bir class'ın üye olan herhangi birşeyini private olabildiğince tutup daha sonrasında hangi levelda bunu dışarıya açık olmasını kullanılmasını istiyorsak o seviyede bu arkadaşın bileşenlerini açmak
     *  Elinde bir değişken varsa bu değişkenleri ileriye dönük mutlaka private'ta tut
     *  bunların hangisine dışarıdan erişilmek isteniyorsa(erişilecekse neresine erişilecek değer atamak için mi okumak için mi) onları yaz (hangi seviyede açmak istiyorsak)
     **/

    /** neden private yaparız ->  Karmaşıklığı azaltmak için, tanımladığımız class dışında kullanılması gerekmiyorsa gereksiz karmaşıklık yaratmamak için **/

    private var name: String = "Samet"
    private var surName: String = "ERSOYOGLU"

    fun getFullName() : String {
        return "$name $surName"
    }

    /** Kotlin de Encapsulation yok gibi gözüküyor ne düşünüyorsun gibi sorulduğunda : vardır kotlin encapsulation'ı default olarka destekliyor. public olsalar bile arkaplanda field hep private yani arkaplanda private
    Kotlin de gercek field ların tamamı private olarak bulunuyor eğer biz local bir fonksiyon içerisinde local bir değişken oluşturmuyorsak, main fonksiyon içerisinde direk
    oluşturuldu değişkenler ya da bir fonksiyon içerisinde oluşturduğumuz değişkenler bu konunun dışında.
    ama class ların üye degiskenleri aslında onlar property onların arkaplanında ki backing field diye isimlendirilen gercek anlamda bildigimiz degiskenler field'lar her zaman private'dır istesek de degistiremeyiz.
    **/
}

/** **************************************************************/

/**
 * Encapsulation, bir sınıfın iç durumunun (state) doğrudan erişimini sınırlayan ve güvenliği sağlayan bir kavramdır.
 * Bunun için genellikle sınıf üyelerini (fields ve methods) private olarak işaretleriz ve erişim için public yöntemler (getters ve setters) sağlarız.
 * */

class Person {
    private var name: String = ""


    fun setName(newName : String) {
        name = newName
    }

    fun getName(): String {
        return name
    }

}

fun main() {
    val person = Person()
    person.setName("Samet")
    println("Name : ${person.getName()}")
}