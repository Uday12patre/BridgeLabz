# Java Programming Notes

## 1. Java Compilation and Execution

When a Java program is compiled, a **`.class` file** is generated.

### `.class` File

* The `.class` file contains **Java bytecode**.
* Bytecode is **platform-independent**.
* The JVM reads and executes the bytecode.
* It is **not directly machine code**. The JVM/JIT converts or interprets bytecode for the underlying machine.

### Java Compilation

Traditional compilation:

```bash
javac Filename.java
```

This generates:

```text
Filename.class
```

Modern Java also supports **source-file mode**:

```bash
java Filename.java
```

Here, Java can compile and run the source file directly without you manually running `javac`.

---

# 2. Is Java a Compiler or Interpreter Language?

Java uses **both compilation and interpretation/JIT compilation**.

### Process

```text
Java Source Code
       ↓
     javac
       ↓
   Bytecode (.class)
       ↓
      JVM
       ↓
Interpreter + JIT Compiler
       ↓
Machine Code
```

Therefore, Java is commonly described as a language that uses:

* **Compiler** → Converts `.java` source code into bytecode.
* **Interpreter** → JVM can interpret bytecode.
* **JIT Compiler** → Compiles frequently executed bytecode into native machine code at runtime.

---

# 3. `print()` and `println()`

### `System.out.print()`

Prints the output on the **same line**.

```java
System.out.print("Hello ");
System.out.print("World");
```

Output:

```text
Hello World
```

### `System.out.println()`

Prints the output and moves the cursor to the **next line**.

```java
System.out.println("Hello");
System.out.println("World");
```

Output:

```text
Hello
World
```

---

# 4. Class and File Name

If a class is declared as `public`, the **file name must match the public class name**.

Example:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

The file must be:

```text
HelloWorld.java
```

### Important

It is **not necessary for every class to be public**.

For example:

```java
class HelloWorld {
}
```

can be stored in a file with a different name.

However, if the class is:

```java
public class HelloWorld
```

then the file **must** be:

```text
HelloWorld.java
```

---

# 5. `public static void main()`

The standard entry point of a Java application is:

```java
public static void main(String[] args)
```

Let's understand each keyword.

| Keyword         | Meaning                                                   |
| --------------- | --------------------------------------------------------- |
| `public`        | Accessible by the JVM from outside the class              |
| `static`        | Allows the method to be called without creating an object |
| `void`          | Method does not return a value                            |
| `main`          | Standard entry-point method name                          |
| `String[] args` | Stores command-line arguments                             |

### Example

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

---

# 6. Meaning of `static`

`static` means that a member belongs to the **class itself**, rather than to individual objects.

Example:

```java
class Student {
    static String school = "ABC School";
}
```

The static variable can be accessed using the class name:

```java
System.out.println(Student.school);
```

You do not need to create an object to access a static variable.

---

# 7. `void`

`void` is a **return type**.

It means that the method does not return any value.

Example:

```java
static void display() {
    System.out.println("Hello");
}
```

The method performs an operation but does not return a value.

---

# 8. `main` Method Error

If Java cannot find the proper `main()` method, you may get an error such as:

```text
Error: Main method not found in class HelloWorld
```

For example, this is incorrect:

```java
public static void main123(String[] args)
```

because the JVM specifically looks for a valid `main` method.

Correct:

```java
public static void main(String[] args)
```

---

# 9. JDK, JRE and JVM

## JDK — Java Development Kit

**JDK = Java Development Kit**

It is used to **develop Java applications**.

It contains tools such as:

* Java compiler (`javac`)
* Java launcher (`java`)
* Debugging and development tools
* JRE/JVM components

---

## JRE — Java Runtime Environment

**JRE = Java Runtime Environment**

It provides the environment required to **run Java applications**.

It includes:

* JVM
* Java libraries
* Supporting runtime files

> Note: In modern Java distributions, a separate JRE download is not always provided.

---

## JVM — Java Virtual Machine

**JVM = Java Virtual Machine**

The JVM is an **abstract machine** that provides a runtime environment for executing Java bytecode.

Main responsibilities include:

* Loading `.class` files
* Verifying bytecode
* Managing memory
* Executing bytecode
* Garbage collection
* Using the interpreter and JIT compiler

---

## Relationship Between JDK, JRE and JVM

```text
JDK
│
├── Development Tools
│   └── javac
│
└── Runtime Components
    │
    └── JVM
        │
        └── Executes Java Bytecode
```

A simple way to remember:

> **JDK → Develop**
> **JRE → Run**
> **JVM → Execute**

---

# 10. Java's "Write Once, Run Anywhere"

The commonly used phrase is:

> **Write Once, Run Anywhere (WORA)**

Java source code is compiled into **platform-independent bytecode**.

The same bytecode can run on different operating systems as long as a compatible JVM is available.

```text
Java Code
   ↓
Bytecode
   ↓
 ┌───────────────┐
 ↓       ↓       ↓
Windows Linux   macOS
 JVM      JVM     JVM
```

---

# 11. Java Memory

Java memory is commonly discussed using areas such as **Heap** and **Stack**.

## Heap

The **heap** is mainly used for:

* Objects
* Instance variables
* Arrays

Example:

```java
Student s = new Student();
```

The `Student` object is created in heap memory.

---

## Stack

The **stack** is mainly used for:

* Method call information
* Local variables
* References used by methods
* Each thread has its own stack

Example:

```java
void display() {
    int x = 10;
}
```

The local variable `x` is associated with the method's stack frame.

> Note: Java memory management is more detailed than simply "heap and stack"; the JVM specification defines additional runtime data areas.

---

# 12. JAR Files

**JAR = Java ARchive**

A JAR file is a package used to store Java classes and other resources.

Extension:

```text
.jar
```

Example:

```text
myprogram.jar
```

A JAR can contain:

* `.class` files
* Images
* Configuration files
* Metadata
* Other resources

JAR files are commonly used to **distribute Java applications and libraries**.

---

# 13. JIT Compiler

**JIT = Just-In-Time Compiler**

The JIT compiler is part of the JVM's runtime execution system.

It improves performance by compiling frequently executed bytecode into **native machine code** during program execution.

### Simple Flow

```text
Bytecode
   ↓
JVM
   ↓
JIT Compiler
   ↓
Native Machine Code
   ↓
Faster Execution
```

---

# 14. Java Data Types

Java has **8 primitive data types**:

```text
byte
short
int
long
float
double
char
boolean
```

---

## 14.1 `byte`

| Property | Value           |
| -------- | --------------- |
| Size     | 1 byte (8 bits) |
| Range    | -128 to 127     |

Example:

```java
byte age = 20;
```

---

## 14.2 `short`

| Property | Value             |
| -------- | ----------------- |
| Size     | 2 bytes (16 bits) |
| Range    | -32,768 to 32,767 |

Example:

```java
short marks = 500;
```

---

## 14.3 `int`

| Property | Value                           |
| -------- | ------------------------------- |
| Size     | 4 bytes (32 bits)               |
| Range    | -2,147,483,648 to 2,147,483,647 |

Example:

```java
int population = 100000;
```

`int` is the commonly used integer data type in Java.

---

## 14.4 `long`

| Property | Value                                                   |
| -------- | ------------------------------------------------------- |
| Size     | 8 bytes (64 bits)                                       |
| Range    | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |

Example:

```java
long distance = 9000000000L;
```

The `L` suffix is used to indicate a `long` literal.

---

## 14.5 `float`

| Property          | Value                       |
| ----------------- | --------------------------- |
| Size              | 4 bytes (32 bits)           |
| Approximate range | ±1.4 × 10⁻⁴⁵ to ±3.4 × 10³⁸ |

Example:

```java
float price = 99.5f;
```

The `f` suffix is normally required for a floating-point literal assigned to `float`.

---

## 14.6 `double`

| Property          | Value                         |
| ----------------- | ----------------------------- |
| Size              | 8 bytes (64 bits)             |
| Approximate range | ±4.9 × 10⁻³²⁴ to ±1.8 × 10³⁰⁸ |

Example:

```java
double salary = 50000.50;
```

`double` provides more precision than `float`.

---

## 14.7 `char`

| Property      | Value             |
| ------------- | ----------------- |
| Size          | 2 bytes (16 bits) |
| Range         | 0 to 65,535       |
| Character set | Unicode           |

Example:

```java
char grade = 'A';
```

Java `char` uses UTF-16 code units.

---

## 14.8 `boolean`

A `boolean` can have only two logical values:

```text
true
false
```

Example:

```java
boolean isPassed = true;
```

> Important: Java specifies `boolean` as a logical type but does **not specify its storage size as exactly 1 bit**. Therefore, saying "boolean = 1 bit" is a common simplification, not a guaranteed JVM memory-size rule.

---

# 15. Primitive Data Types Summary

| Data Type |          Size | Range / Values                |
| --------- | ------------: | ----------------------------- |
| `byte`    |        1 byte | -128 to 127                   |
| `short`   |       2 bytes | -32,768 to 32,767             |
| `int`     |       4 bytes | -2³¹ to 2³¹ - 1               |
| `long`    |       8 bytes | -2⁶³ to 2⁶³ - 1               |
| `float`   |       4 bytes | Approx. ±1.4E-45 to ±3.4E38   |
| `double`  |       8 bytes | Approx. ±4.9E-324 to ±1.8E308 |
| `char`    |       2 bytes | 0 to 65,535                   |
| `boolean` | JVM-dependent | `true` / `false`              |

---

# 16. Variable Scope

There are three important categories of variables:

1. Static/Class variables
2. Instance variables
3. Local variables

---

## 16.1 Static / Class Variable

A static variable is declared using the `static` keyword.

It belongs to the **class**, not to individual objects.

Example:

```java
class VariableScope {
    static int var = 10;
}
```

It can be accessed directly using the class name:

```java
System.out.println("Direct Static: " + VariableScope.var);
```

### Key Point

All objects of the class share the same static variable.

---

## 16.2 Instance Variable

An instance variable is:

* Declared inside a class
* Declared outside methods, constructors, and blocks
* Associated with an object

Example:

```java
class VariableScope {
    int age = 20;
}
```

Create an object:

```java
VariableScope obj = new VariableScope();

System.out.println(obj.age);
```

Each object can have its own copy of the instance variable.

---

## 16.3 Local Variable

A local variable is declared inside:

* A method
* A constructor
* A block

Example:

```java
void display() {
    int x = 10;
    System.out.println(x);
}
```

The variable `x` is available only within its applicable scope.

---

# 17. Static vs Instance vs Local Variables

| Type     | Declared Where?          | Belongs To   | Access                |
| -------- | ------------------------ | ------------ | --------------------- |
| Static   | Class                    | Class        | `ClassName.variable`  |
| Instance | Class, outside methods   | Object       | `object.variable`     |
| Local    | Method/block/constructor | Method/block | Directly within scope |

### Example

```java
class VariableScope {

    static int staticVar = 10;

    int instanceVar = 20;

    void display() {
        int localVar = 30;

        System.out.println(staticVar);
        System.out.println(instanceVar);
        System.out.println(localVar);
    }
}
```

---

# 18. Creating an Object

To access instance variables and instance methods, create an object.

```java
VariableScope obj = new VariableScope();
```

Here:

* `VariableScope` → Class name
* `obj` → Reference variable
* `new` → Creates an object
* `VariableScope()` → Constructor call

Example:

```java
System.out.println(obj.instanceVar);
```

---

# 19. Scanner and `.next<Type>()`

Java provides the `Scanner` class for taking input from the user.

Example:

```java
import java.util.Scanner;

class InputExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int age = scan.nextInt();

        System.out.println("Age: " + age);

        scan.close();
    }
}
```

### Common Scanner Methods

| Method          | Input            |
| --------------- | ---------------- |
| `nextInt()`     | Integer          |
| `nextLong()`    | Long             |
| `nextShort()`   | Short            |
| `nextByte()`    | Byte             |
| `nextFloat()`   | Float            |
| `nextDouble()`  | Double           |
| `nextBoolean()` | Boolean          |
| `next()`        | One token/string |
| `nextLine()`    | Complete line    |

Example:

```java
int age = scan.nextInt();
double salary = scan.nextDouble();
String name = scan.next();
```

---

## Closing Scanner

```java
scan.close();
```

Closing the scanner is good practice when it is no longer needed.

> Note: Closing a `Scanner` connected to `System.in` also closes the underlying input stream, so avoid closing it early if the program still needs to read from standard input.

---

# 20. Wrapper Classes

Wrapper classes provide **object representations of primitive data types**.

| Primitive | Wrapper Class |
| --------- | ------------- |
| `byte`    | `Byte`        |
| `short`   | `Short`       |
| `int`     | `Integer`     |
| `long`    | `Long`        |
| `float`   | `Float`       |
| `double`  | `Double`      |
| `char`    | `Character`   |
| `boolean` | `Boolean`     |

### Example

Primitive:

```java
int x = 10;
```

Wrapper:

```java
Integer x = 10;
```

---

# 21. Autoboxing and Unboxing

## Autoboxing

Converting a primitive into its wrapper object automatically.

```java
int x = 10;

Integer obj = x;
```

Here:

```text
int → Integer
```

---

## Unboxing

Converting a wrapper object back into a primitive.

```java
Integer obj = 10;

int x = obj;
```

Here:

```text
Integer → int
```

---

# 22. Overflow and Underflow

Integer data types have a fixed range.

If a value goes beyond the maximum or minimum range, **overflow/underflow** can occur.

### Byte Example

```java
byte x = 127;
x++;
System.out.println(x);
```

Output:

```text
-128
```

This happens because `byte` uses 8-bit signed two's-complement representation.

### Important

The same concept applies to integral primitive types such as:

* `byte`
* `short`
* `int`
* `long`

For example:

```text
byte:
127 → -128

-128 → 127
```

This is **wraparound** due to fixed-width integer arithmetic.

---

# 23. Important Corrections to Remember

### ❌ Incorrect

> `.class` file is machine-readable code.

### ✅ Correct

> A `.class` file contains **Java bytecode**, which is executed by the JVM.

---

### ❌ Incorrect

> Java is only an interpreter language.

### ✅ Correct

> Java uses compilation to bytecode and JVM execution through interpretation and/or JIT compilation.

---

### ❌ Incorrect

> Class should always be public.

### ✅ Correct

> A class does not have to be public. However, a **public top-level class must have the same name as the Java file**.

---

### ❌ Incorrect

> `static` means calling method.

### ✅ Correct

> `static` means that a member belongs to the **class rather than an individual object**. A static method can be called without creating an object.

---

### ❌ Incorrect

> `boolean` size is always 1 bit.

### ✅ Correct

> Java defines `boolean` as a logical type with values `true` and `false`; its actual storage size is JVM-dependent.

---

# 24. Quick Revision

```text
.class
→ Contains Java bytecode

JDK
→ Java Development Kit
→ Used for development

JRE
→ Java Runtime Environment
→ Provides runtime environment

JVM
→ Java Virtual Machine
→ Executes Java bytecode

JIT
→ Just-In-Time Compiler
→ Compiles frequently executed bytecode into native code

print()
→ Prints on the same line

println()
→ Prints and moves to the next line

static
→ Belongs to the class

void
→ No return value

main()
→ Standard application entry point

Heap
→ Mainly objects and arrays

Stack
→ Method call frames and local variables

JAR
→ Java ARchive

byte
→ 1 byte
→ -128 to 127

short
→ 2 bytes
→ -32,768 to 32,767

int
→ 4 bytes

long
→ 8 bytes

float
→ 4 bytes

double
→ 8 bytes

char
→ 2 bytes
→ Unicode

boolean
→ true / false

Static variable
→ Shared by class

Instance variable
→ Belongs to object

Local variable
→ Limited to method/block/constructor

Wrapper Class
→ Object representation of primitive types

Overflow
→ Value exceeds maximum range

Underflow
→ Value goes below minimum range
```

# 25. Easy Memory Trick

### JDK → Develop

**JDK = Development**

### JRE → Run

**JRE = Runtime**

### JVM → Execute

**JVM = Virtual Machine that executes bytecode**

### Java Execution

```text
.java
  ↓
javac
  ↓
.class
  ↓
Bytecode
  ↓
JVM
  ↓
Interpreter / JIT
  ↓
Machine Code
  ↓
Output
```

> **Remember: Java's main advantage is not that the `.class` file is machine code, but that the bytecode is designed to run on any compatible JVM.**
