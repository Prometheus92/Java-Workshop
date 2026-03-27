# JAVA NOTES
Java can be classified and defined into two
    1. Software Platform
    2. Programming Language

## Java as Software Platform
Java platform is a collection of sofrware components which allow development and execution of **Bytecode** based languages.
**Bytecode** is a binary code that java platform interpret(Code understood by the JVM).
The Java Platform has 4 parts:
    1. Compiler - Translate Source code to Bytecode
    2. Java Virtual Machine(JVM) - 
    3. Libraries - contain Java API
    4. Tools - Various Java Tools
As a platform is is divided into 4 parts:
1. Java Card - uded in smart cards and small memory devices
2. Java Micro Edition(ME) - Used in Personnel digital assistants, setup box and printer applications
3. Java Standard Edition(SE) - uded in development of desktop, communication and user interface based applications.
4. Java Enterprise Edition(EE) - used in development of web based, messaging, distributed and enterprise applications.

## Java as Programming Language
As a programming language it has the following attributes:

    - Statically typed - type of variable is known at compile time
    - Object oriented - Object centered programming
    - Concurrent - Support for multithreading programming
    - Reflective - Allows inspection of class, method, interface, fields


**Java Runtime Engine(JRE)** - is the minimum enviroment required for java program to run(execute). It is composed of

    1. Interpreter: translate binary java code
    2. Tools: provide various functionality(i.e. security, core services)
    3. Library: Java application programming interface

**Java Development Kit(JDE)** - is the minimum enviroment required for development of java applications.(It is similar/same as Java Standard Edition)

It is composed of:

    1. Compiler: Compile java code to bytecode
    2. Interpreter: Processes bytecode to native code(binary)
    3. Tools:
    4. Library: Reusable pre-defined Java API
**JDK is a Superset of JRE**

## Environment Variables
Environment variables are special windows OS variables that are Dynamic in nature(their value is changeable and updateable).
They contain values that can be used by programms.
They are used to indentify installation directory, location of temporary files, tools and profile settings.
Use the **'set'** command to see the complete list of all environment variables form command line.
### Common Environment variables
1. %appdata% - Location of application data folder for your user profile
2. %commonprogramfiles%: Location of Common files folder, within the main program files folder
3. %path% - Location of various tools.
4. %programfiles% - Location of where programs are installed
5. %temp% - Location of temporary files
6. %windir% - Location of windows system files.

These variables can be set in two ways:
     1. Command line:

        i. `set $variable_name$="value"` - Overwirte the variable with the specified value
        ii. `set $variable_name$=%$variable_name%;"value"` - append the value to the variable.
     2. Control panel = Navigate to **Edit system environments variables** and change the variables you want to change.

### The "PATH" variable
The **PATH** variable contain the location of tools.
For a Java developer it should atleast locate where the JDK is located.


### Java Compiler(Javac.exe)
Is used for compiling java programs. The compilation process generates Bytecode( which is Platform Indpendent(not for any specific OS)).

### Java Interpreter(Java.exe)|JVM|
It also called **Java Virtual Machine(JVM)**
Is used for executing(running) Java programs.(Interprete bytecode to native code understood by the machine)

### Steps to Run Java Programms
1. Compile: `javac $name.java` - creates `$name.class`file(aka the bytecode)
2. Interprete/execute/: `java $name` (**JIT**)- we don't need to specify the extension
**Just In Time Compilation(JIT)** - action performed by JVM where Bytecode is converted to Native code(Platform Dependant|for a specific OS).(Occurs on demand hence called just in time)
![JIT Compilation Diagram](./Assets/JIT_Compilation.png.png)
Because of the JIT the JVM is called **pseudo OS.JVM**
![Platform Independece of Java](./Assets/Java_Platform_Independence.png.png)

## Anatomy of Java Programs
### Main Method
It is an entry point which take a string array as an argument.(any data can be passed at the command line and will be captured as a string, hence to use other data type we must do type conversion)
It is the entry point in a program only when it is of valid signature(i.e. when it is ***public***) else it behaves like an ordinary method of the class.(**Overloading**)
**Overloading** - Mechanism where a class can have many methods with the same name but with different signature. 
 **3 Entry point signatures for main method:**
 1. public static void main(String[] args){...}
 2. public static void main(String args[]){...}
 3. public static void main(String ...a){...} - Allows any number of string arguments to main method.

Hence 
### Default Packages
**Package** - is a repository of reusabel, organized java code. (hence default packages aren't required to be imported)
Here are few Default packages:
1. `java.lang`: Contains
    - `System` class
    - `Printstream` class (i.e has the `out` public static object and `println` method)
    - 
2. -----------------------

Java can have multiple classes and when compiled it will produce many **.class** files.(i.e. Each class compiles to a specific class file and the '.class' file has the same name as the name of the class in the code)

A progrma can contain multiple classes and eacg class can only have one entry point.

## File and Class Names
Class can only have 2 of the access specifiers(class can't be declared as private or protected)
1. Public(i.e. `public class $name`)
2. Default(package level)(i.e. `class $name`)
**Rules for declaring Class**:
    - There can only be one public class per java file.
    - The public class name and java file name has to be the same(case sensetive)

## DataTypes in Java
**Variable** is a memory location in a process that store data.
**Statically typed** - Type of variabel must be known before compiling. So that JVM can allocate variabel memory based on the type.
### Types of Data Types
    - Primitive data types - default 
    - Reference/Object data types - derived from object class directly or indirectly
### Numeric Data Types

1. Integer Types: only holds whole numbers
2. Floating Types: can hold fractional numbers
    | Data type | Size(Bytes) | Sign |
    |-----------|-------------|------|
    |  `byte`   |  1   | Signed|
    |  `short`  |  2   | Signed|
    |  `int`    |  4   | Signed|
    |  `long`   |  8   | Signed| 
    |  `float`  |  4   | Signed|
    |  `Double` |  8   | Signed|

### Non Numeric Data Types
    | Data type | Size(Bytes) |
    |-----------|-------------|
    | `char` | 2 |
    | `boolean` | 1 |
**Literal** - Fixed or constant value stored in a variable. Can be used for all primitive data types
    1. For Integers in 3 ways:
        - Decimal : Starts with a number
        - Octal : Start with '0'
        - Hexadecimal : Start with `0x'

**Constant** - is a variable whose value once assigned cannot change.
 Declaration using `final` keyword.

 ## Escape Sequence
 They are used to provide alternative meaning to series of characters.
 Usually start with `\` (backlash)

 ## Immutable String
 **Immutability** - State of an object can not be changed after initialization(created).(i.e. We can't overwrite a new value to our object once it is created)
 - The memory location of the variable is going to changed if we change the value of the variable.
 - String is a immutable.
 - String is a reference type(i.e. it's not primitive).(If string is assigned a new value the JVM will create a new string on **heap memory**)

## String Builder Class
Used to Initialize and reintialize strings without creating new string in memory(i.e. the class is mutable)
    - Key Methods Include
        - **Append(arg)** == String + String
        - **Insert(arg)**
        - **Delete(arg)**
## Wrapper Classes
To Convert primitive datatypes into an object.