package classes

open class Animal (open val name: String = "", var feetCount: Int = 4){
    /**
     * Inheritance, bir sınıfın diğer bir sınıfın özelliklerini ve davranışlarını miras almasıdır.
     * Kotlin'de sınıflar varsayılan olarak final olduğundan, açıkça belirtilmediği sürece başka bir sınıftan kalıtım alamazlar.
     * Ancak, bir sınıfın kalıtım alabilmesi için open anahtar kelimesiyle işaretlenmesi gerekir.
     * */

    /** final veya hiçbirşey yazmassak direk class Animal olarak olursa miras alınamaz olur. miras alınabilir olarak yapmak için 'open' keyword'u eklemeliyiz. */

    /** open ve final'ın Kotlin için erişim düzenleyicisidir. bir class'ın önüne open keyword'u konuluyorsa bu class artık başka child class lar tarafından miras alınabilir oluyor.
     * eğer biz bir degiskenin önüne open keyword'unu verirsek bu durumda da o degisken child class'larda override edilebilir anlamına geliyor bu override işlemine polymorphism denir.
     *final class'ın miras alınabilirliğini engeller, degiskenler classlar default olarak final'dır default olarak miras alınamazlar.
     * */

    var origin: String = "Sivas"
    var tailShape: String = "oval"

    open fun makeASound() : String {
        return " "
    }

    fun attackToTheWolf() {

    }

    fun eat() {

    }

    fun walk() {

    }

    fun dance() {

    }
}

class Dog(name:String, feetCount:Int) : Animal(name,feetCount) {

    override fun makeASound() : String {
        return "hav hav"
    }
}

class Cat(override val name:String, feetCount: Int) : Animal(name,feetCount) {
    override fun makeASound() : String {
        return "miyav"
    }
}

fun main() {
    val animal = Animal()
    val dog = Dog("Sally",4)
    val cat = Cat("Lilly",4)

    println(dog.makeASound())
    println(cat.makeASound())

}

/** Override ederken yaptığımız şey özelliğini değiştirmek/yeni bir davranış kazandırmak
 * biz zaten sınıf oluştururken en küçük parçayı oluşturmaya çalışıyoruz ortak özellikleri base class ta tanımlıyoruz **/