fun main() {
    val shoppinglist = mutableListOf<String>() // das ist eine leer liste for einkaif

    println("Welcome to the Shopping List App!")
    println("Instructions:")
    println("1. Enter '1' to add an item.")
    println("2. Enter '2' to remove an item.")
    println("3. Enter '3' to view the list.")
    println("4. Enter '4' to exit the program.")


    while (true) { // in die schleife User kann bis die keine exit gewünscht beleiben
        println("\nMenu:")
        println("1. add item")
        println("2. remove item")
        println("3. view list")
        println("4. exit program")


        println("Please enter your choice: ")
        val choice = readln()?.toIntOrNull()
        when (choice) {
            1 -> {
                println("Enter the name of the Item: ")
                val item = readln()
                if (item != null) {
                    shoppinglist.add(item)
                    println("Item added successfully ! ")
                } else {
                    println("Invalid input. Please try again.")
                }
            }

            2 -> {
                println("Enter name of the Item to be removed  : ")
                val item = readln()
                if (item != null) {
                    if (shoppinglist.remove(item)) {
                        println("Item removed successfully ")
                    } else {
                        println("Item not found in")
                    }
                } else {
                    println("Invalid input. Please try again.")

                }
            }
            3 -> {
                println("view the list of items")
                for(item in shoppinglist) {
                    println("- $item")
                }

            }
            4-> {
                println("Tnx , goodbye")
                break // breack  a Loop
            }
            else -> println("Invalid choice. Please try again.")
        }

    }

}