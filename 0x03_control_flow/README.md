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
