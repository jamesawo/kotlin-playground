// Within parentheses () after the class name.
class ContactInClassHeader(var id: Int, var phoneNumber: String, var email: String)

// Within class body
class ContactInClassBody(var id: Int, var phoneNumber: String){
    var email: String = ""
    var category: String = ""
}


// class properties with default values
class ContactWithDefault(var id: Int, var phoneNumber: String, var email: String = "example@example.com"){
    var category: String = "Work"
}