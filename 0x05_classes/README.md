# Classes

Kotlin supports object-oriented programming with classes and objects. Objects are useful for storing data in your program. Classes allow you to declare a set of characteristics for an object. When you create objects from a class, you can save time and effort because you don't have to declare these characteristics every time.

> To declare a class, use the `class` keyword:

`class Customer `

## Properties

Characteristics of a class's object can be declared in properties. You can declare properties for a class:

-   Within parentheses () after the class name.

    ```
    class Contact(val id: Int, var email: String)
    ```

-   Within the class body defined by curly braces {}.

```
class Contact(val id: Int, var email: String) {
    val category: String = ""
}
```

## Create instance

To create an object from a class, you declare a class instance using a constructor.

By default, Kotlin automatically creates a constructor with the parameters declared in the class header.

For example:

```
class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "mary@gmail.com")
}
```

## Data classes

Kotlin has data classes which are particularly useful for storing data. Data classes have the same functionality as classes, but they come automatically with additional member functions. These member functions allow you to easily print the instance to readable output, compare instances of a class, copy instances, and more. As these functions are automatically available, you don't have to spend time writing the same boilerplate code for each of your classes.

-   To declare a data class, use the keyword data:

```
data class User(val name: String, val id: Int)
```

The most useful predefined member functions of data classes are:

| Function        | Description                                                                              |
| --------------- | ---------------------------------------------------------------------------------------- |
| .toString()     | Prints a readable string of the class instance and its properties.                       |
| .equals() or == | Compares instances of a class.                                                           |
| .copy()         | Creates a class instance by copying another, potentially with some different properties. |

## Copy instance

To create an exact copy of a data class instance, call the `.copy()` function on the instance.

To create a copy of a data class instance and change some properties, call the `.copy()` function on the instance and add replacement values for properties as function parameters.

_note_
Creating a copy of an instance is safer than modifying the original instance because any code that relies on the original instance isn't affected by the copy and what you do with it.
