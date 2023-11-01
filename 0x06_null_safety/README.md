# Null safety

In Kotlin, it's possible to have a null value. To help prevent issues with null values in your programs, Kotlin has null safety in place. Null safety detects potential problems with null values at compile time, rather than at run time.

Null safety is a combination of features that allow you to:

-   explicitly declare when null values are allowed in your program.

-   check for null values.

-   use safe calls to properties or functions that may contain null values.

-   declare actions to take if null values are detected.

## Nullable types

Kotlin supports nullable types which allows the possibility for the declared type to have null values. By default, a type is not allowed to accept `null` values. Nullable types are declared by explicitly adding `?` after the type declaration.

## Check for null values

You can check for the presence of `null` values within conditional expressions. In the following example, the `describeString()` function has an if statement that checks whether `maybeString` is not `null` and if its `length` is greater than zero:

## Use safe calls

To safely access properties of an object that might contain a `null` value, use the safe call operator `?.`. The safe call operator returns `null` if the object's property is `null`. This is useful if you want to avoid the presence of `null` values triggering errors in your code.

```
Safe calls can be chained so that if any property of an object contains a null value, then null is returned without an error being thrown. For example:

person.company?.address?.country

```

The safe call operator can also be used to safely call an extension or member function. In this case, a null check is performed before the function is called. If the check detects a null value, then the call is skipped and null is return

```
fun main() {
    var nullString: String? = null
    println(nullString?.uppercase())
    // null
}

```

## Use Elvis operator

You can provide a default value to return if a null value is detected by using the Elvis operator `?:`.

Write on the left-hand side of the Elvis operator what should be checked for a `null` value. Write on the right-hand side of the Elvis operator what should be returned if a `null` value is detected.
