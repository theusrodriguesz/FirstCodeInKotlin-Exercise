class Customer

class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer()
    
    val contact = Contact(1, "matheus@gmail.com")
		
        println(contact.id)
        	println ("Primeiro email cadastrado pelo usuario foi")
        	println(contact.email)
        contact.email = "florencio@gmail.com"
    	    println("Email cadastrado foi alterado para")
    	    println(contact.email)
}