fun sayHello(){
    println("hello there!")
}


fun sayHello(name: String){
    println("hello $name")
}



fun main() {
    sayHello()
    sayHello("James")
}