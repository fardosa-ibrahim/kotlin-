fun main(){
     Name()
    write(5,2)
    sentence("fardosa",22)
    var word=Word()
    println(word.lengh)

}
fun Name(){
    var name="codeHive"
    var change=name[4].toString()+name[5]+name[6]+name[7]
    println(change)
}
fun write(a:Int, b:Int){
    var number=a%b
    println(number)
}
fun sentence(p:String, z:Int){
    println("Hi my name is $p and i am $z pears old")
}
fun Word():String{
    var words="fardosa"
    return words
}
