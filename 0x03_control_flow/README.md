# Control Flow

Like other programming languages, Kotlin is capable of making decisions based on whether a piece of code is evaluated to be true. Such pieces of code are called conditional expressions. Kotlin is also able to create and iterate through loops.

## Conditional expressions

Kotlin provides if and when for checking conditional expressions.

```val d: Int
val check = true

if (check) {
    d = 1
} else {
    d = 2
}

println(d)
// 1
```

There is no ternary operator `condition ? then : else` in Kotlin. Instead, if can be used as an expression. When using if as an expression, there are no curly braces {}:

```
val a = 1
val b = 2

println(if (a > b) a else b) // Returns a value: 2
```

## When

Use when when you have a conditional expression with multiple branches. when can be used either as a statement or as an expression.

Here is an example of using when as a statement:

Place the conditional expression within parentheses () and the actions to take within curly braces {}.

Use -> in each branch to separate each condition from each action.

## Ranges

Before talking about loops, it's useful to know how to construct ranges for loops to iterate over.

### Number Ranges

The most common way to create a range in Kotlin is to use the `..` operator. For example, `1..4` is equivalent to `1, 2, 3, 4.`

To declare a range that doesn't include the end value, use the ..< operator. For example,
`1..<4` is equivalent to `1, 2, 3.`

To declare a range in reverse order, use downTo. For example, `4 downTo 1` is equivalent to `4, 3, 2, 1.`

To declare a range that increments in a step that isn't 1, use step and your desired increment value. For example,
`1..5 step 2` is equivalent to `1, 3, 5.`

### Char Ranges

You can also do the same with Char ranges:

-   `'a'..'d'` is equivalent to `'a', 'b', 'c', 'd'`

-   `'z' downTo 's'` step 2 is equivalent to `'z', 'x', 'v', 't'`
