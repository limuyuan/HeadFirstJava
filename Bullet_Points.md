# Head First Java Bullet Points
### Chapter 1
- Statements end in a semicolon `;`
- Code blocks are defined by a pair of curly braces `{}`
- Declare an _int_ variable with a name and a type: `int x;`
- The **assignment** operator is _one_ equals sign `=`
- The **equals** operator uses _two_ equals signs `==`
- A _while_ loop runs everything within its block (defined by curly braces) as long as the _conditional test_ is **true**.
- If the conditional test is **false**, the _while_ loop code block won't run, and execution will move down to the code immediately _after_ the loop block.
- Put a `boolean` test inside parentheses:
<code>while <b>(x == 4)</b> {}</code>


### Chapter 2
- Object-oriented programming lets you extend a program without having to touch previously-tested, working code.
- All Java code is defined in a **class**.
- A class describes how to make an object of that class type. **A class is like a blueprint.**
- An object can take care of itself; you don't have to know or care _how_ the object does it.
- An object **knows** things and **does** things.
- Things an object knows about itself are called **instance variables**. They represent the _state_ of an object.
- Things an object does are called **methods**. They represent the _behavior_ of an object.
- When you create a class, you may also want to create a separate test class which you'll use to create objects of your new class type.
- A class can **inherit** instance variables and methods from a more abstract **superclass**.
- At runtime, a Java program is nothing more than objects 'talking' to other objects.


### Chapter 3
- Variables come in two flavors: primitive and reference.
- Variables must always be declared with a name and a type.
- A primitive variable value is the bits representing the value (5, 'a', true, 3.1416, etc.).
- A reference variable value is the bits representing a way to get an object on the heap.
- A reference variable is like a remote control. Using the dot operator (.) on a reference variable is like pressing a button on the remote control to access a method or instance variable.
- A reference variable has a value of `null` when it is not referencing any object.
- An array is always an object, even if the array is declared to hold primitives. There is no such thing as a primitive array, only an array that _holds_ primitives.


### Chapter 4
- Classes define what an object knows and what an object does.
- Things an object knows are its **instance variables** (state).
- Things an object does are its **methods** (behavior).
- Methods can use instance variables so that objects of the same type can behave differently.
- A method can have parameters, which means you can pass one or more values into the method.
- The number and type of values you pass in must match the order and type of parameters declared by the method.
- Values passed in and out of methods can be implicitly promoted to a larger type or explicitly cast to a smaller type.
- The value you pass as an argument to a method can be a literal value (2,'c', etc.) or a variable of the declared parameter type (for example, _x_ where _x_ is an `int` variable). (There are other things you can pass as arguments, but we're not there yet.)
- A method _must_ declare a return type. A void return type means the method doesn't return anything.
- If a method declares a non-void return type, it _must_ return a value compatible with the declared return type.


### Chapter 5
- Your Java program should start with a high-level design.
- Typically you'll write three things when you create a new class:  
**_prepcode_**  
**_testcode_**  
**_real(Java) code_**

- Prepcode should describe _what_ to do, not _how_ to do it. Implementation comes later.
- Use the prepcode to help design the test code.
- Write test code _before_ you implement the methods.
- Choose _for_ loops over _while_ loops when you know how many times you want to repeat the loop code.
- Use the pre/post _increment_ operator to add 1 to a variable `(x++;)`
- Use the pre/post _decrement_ to subtract 1 from a variable `(x--;)`
- Use **Integer.parseInt()** to get the `int` value of a `String`.
- **Integer.parseInt()** works only if the `String` represents a digit("0","1","2", etc.)
- Use _break_ to leave a loop early (i.e. even if the `boolean` test condition is still `true`).


### Chapter 6
- **ArrayList** is a class in the Java API.
- To put something into an ArrayList, use **add()**.
- To remove something from an ArrayList use **remove()**.
- To find out where something is (and if it is) in an ArrayList, use **indexOf()**.
- To find out if an ArrayList is empty, use **isEmpty()**.
- To get the size (number of elements) in an ArrayList, use the **size() method**.
- To get the **length** (number of elements) in a regular old array, remember, you use the length **variable**.
- An ArrayList **resizes dynamically** to whatever size is needed. It grows when objects are added, and it **shrinks** when objects are removed.
- You declare the type of the array using a **type parameter**, which is a type name in angle brackets. Example: `ArrayList<Button>` means the ArrayList will be able to hold only objects of type `Button` (or subclasses of `Button` as you'll learn in the next couple of chapters.
- Although an ArrayList holds objects and not primitives, the complier will automatically "wrap" (and "unwrap" when you take it out) a primitive into an Object, and place that object in the ArrayList instead of the primitive. (More on this feature later in the book.)
- Classes are grouped into packages.
- A class has a full name, which is a combination of the package name and the class name. Class ArrayList is really `java.util.ArrayList`.
- To use a class in a package other than `java.lang`, you must tell Java the full name of the class.
- You use either an import statement at the top of your source code, or you can type the full name every place you use the class in your code.


### Chapter 7
- A subclass _extends_ a super class.
- A subclass inherits all _public_ instance variables and methods of the superclass, but does not inherit the _private_ instance variables and methods of the superclass.
- Inherited methods _can_ be overridden; instance variables _cannot_ be overridden (although they can be _redefined_ in the subclass, but that's not the same thing, and there's almost never a need to do it.)
- Use the IS-A test to verify that your inheritance hierarchy is valid. If X _extends_ Y, then X _IS-A_ Y must make sense.
- The IS-A relationship works in only one direction. A Hippo is an Animal, but not all Animals are Hippos.
- When a method is overridden in a subclass, and that method is invoked on an instance of the subclass, the overridden version of the method is called. (_The lowest one wins._)
- If class B extends A, and C extends B, class B IS-A class A, and class C IS-A class B, and class C also IS-A class A.

### Chapter 8
- When you don't want a class to be instantiated (in other words, you don't want anyone to make a new object of that class type) mark the class with the **abstract** keyword.
- An abstract class can have both abstract and non-abstract methods.
- If a class has even _one_ abstract method, the class must be marked abstract.
- An abstract method has no body, and the declaration ends with a semicolon (no curly braces).
- All abstract methods must be implemented in the first concrete subclass in the inheritance tree.
- Every class in Java is either a direct or indirect subclass of class **Object** (`java.lang.Object`).
- Methods can be declared with Object arguments and/or return types.
- You can call methods on an object _only_ if the methods are in the class (or interface) used as the _reference_ variable type, regardless of the actual _object_ type. So, a reference variable of type Object can be used only to call methods defined in class Object, regardless of the type of the object to which the reference refers.
- A reference variable of type Object can't be assigned to any other reference type without a _cast_. A cast can be used to assign a reference variable of one type to a reference variable of a subtype, but at runtime the cast will fail if the object on the heap is NOT of a type compatible with the cast. Example: `Dog d = (Dog) x.getObject(aDog);`
- All objects come out of an ArrayList<Object> as a type Object (meaning, they can be referenced only by an Object reference variable, unless you use a _cast_)
- Multiple inheritance is not allowed in Java, because of the problems associated with the "Deadly Diamond of Death". That means you can extend only one class (i.e. you can have only one immediate superclass).
- An interface is like a 100% pure abstract class. It defines _only_ abstract methods.
- Create an interface using the **interface** keyword instead of the word **class**.
- Implement an interface using the keyword **implements**. Example: `Dog implements Pet`
- Your class can implement multiple interfaces.
- A class that implements an interface _must_ implement all the methods of the interface, since ___all interface methods are implicitly public and abstract___.
- To invoke the superclass version of a method from a subclass that's overridden the method, use the **super** keyword. Example: <code><b>super</b>.runReport();</code>
- Java has two areas of memory we care about: the Stack and the Heap.
- Instance variables are variables declared inside a class but outside any method.
- Local variables are variables declared inside a method or method parameter.
- All local variables live on the stack, in the frame corresponding to the method where the variables are declared.
- Object reference variables work just like primitive variables--if the reference is declared as a local variable, it goes on the stack.
- All objects live in the heap, regardless of whether the reference is a local or instance variable.
- Instance variables live within the object they belong to, on the Heap.
- If the instance variable is a reference to an object, both the reference and the object it refers to are on the Heap.
- A constructor is the code that runs when you san **new** on a class type.
- A constructor must have the same name as the class, and must _not_ have a return type.
- You can use a constructor to initialize the state (i.e. the instance variables) of the object being constructed.
- If you don't put a constructor in your class, the compiler will put in a default constructor.
- The default constructor is always a no-arg constructor.
- If you put a constructor--any constructor--in your class, the compiler will not build the default constructor.
- If you want a no-arg constructor, and you've already put in a constructor with arguments, you'll have to build the no-arg constructor yourself.
- Always provide a no-arg constructor if you can, to make it easy for programmers to make a working object. Supply default values.
- Overloaded constructors means you have more than one constructor in your class.
- Overloaded constructors must have different argument lists.
- You cannot have two constructors with the same argument lists. An argument list includes the order and/or type of arguments.
- Instance variables are assigned a default value, even when you don't explicitly assign one. The default values are 0/0.0/false for primitives, and null for references.


### Chapter 10

- A **static method** should be called using the class name rather than an object reference variable:  
`Math.random()` VS. `myFoo.go()`
- A static method can be invoked without any instances of the method's class on the heap.
- A static method is good for a utility method that does not (and will never) depend on a particular instance variable value.
- A static method is not associated with a particular instance--only the class--so it cannot access any instance variable values of its class. It wouldn't know _which_ instance's values to use.
- A static method cannot access an non-static method, since non-static methods are usually associated with instance variable state.
- If you have a class with only static methods, and you do not want the class to be instantiated, you can mark the constructor private.
- A **static variable** is a variable shared by all members of a given class. There is only one copy of a static variable in a class, rather than one copy per each individual instance for instance variables.
- A static method can access a static variable.
- To make a constant in Java, mark a variable as both static and final.
- A final static variable must be assigned a value either at the time it is declared, or in a static initializer.

```java
static {
  Dog_CODE = 420;
}
```
- The naming convention for constants (final static variables) is to make the name all uppercase.
- A final variable value cannot be changed once it has been assigned.
- Assigning a value to a final _instance_ variable must be either at the time it is declared, or in the constructor.
- A final method cannot be overridden.
- A final class cannot be extended (subclassed).

##### Caveats & Gotchas

- If you're only going to use a static member a few times, we think you should avoid static imports, to help keep the code more readable.
- If you're going to use a static member a lot, (like doing lots of Math calculations), then it's probably OK to use the static import.
- Notice that you can use wildcards(.\*), in your static import declaration.
- A big issue with static imports is that it's not too hard to create naming conflicts. For example, if you have two different classes with an `add()` method, how will you and the compiler know which one to use?


### Chapter 11

- A method can throw an exception when something fails at runtime.
- An exception is always an object of type Exception. (Which, as you remember from the polymorphism chapters means the object is from a class that has Exception somewhere up its inheritance tree.)
- The compiler does NOT pay attention to exceptions that are of type **RuntimeException**. A RuntimeException does not have to be declared or wrapped in a try/catch (although you're free to do either or both of those things)
- All Exceptions the compiler cares about are called 'checked exceptions' which really means _compiler_-checked exceptions. Only RuntimeExceptions are excluded from compiler checking. All other exceptions must be acknowledged in your code, according to the rules.
- A method throws an exception with the keyword `throw`, followed by a new exception object:  
 ```java
 throw new NoCaffeineException();
 ```
- Methods that _might_ throw a checked exception ***must*** announce it with a `throws Exception` declaration.
- If your code calls a checked-exception-throwing method, it must reassure the compiler that precautions have been taken.
- If you're prepared to handle the exception, wrap the call in a try/catch, and put your exception handling/recovery code in the catch block.
- If you're not prepared to handle the exception, you can still make the compiler happy by officially 'ducking' the exception. We'll talk about ducking a little later in this chapter.


### Chapter 12

##### EVENTS

- To make a GUI, start with a window, usually a JFrame  
```java
JFrame frame = new JFrame();
```
- You can add widgets(buttons, text fields, etc.) to the JFrame using:  
```java
frame.getContentPane().add(button);
```
- Unlike most other components, the JFrame doesn't let you add to it directly, so you must add to the JFrame's content pane.
- To make the window(JFrame) display, you must give it a size and tell it be visible:  
```java
frame.setSize(300,300);
frame.setVisible(true);
```
- To know when the user clicks a button(or takes some other action on the user interface) you need to listen for a GUI event.
- To listen for an event, you must register your interest with an event source. An event source is the thing(button, checkbox, etc.) that 'fires' an event based on user interaction.
- The listener interface gives the event source a way to call you back, because the interface defines the method(s) the event source will call when an event happens.
- To register for events with a source, call the source's registration method. Registration methods always take the form of: ***add<EventType>Listener***. To register for a button's ActionEvents, for example, call:  
```java
button.addActionListener(this);
```
- Implement the listener interface by implementing all of the interface's event-handling methods. Put your event-handling code in the listener call-back method. For ActionEvents, the method is:  
```java
public void actionPerformed(ActionEvent event) {
    button.setText("you clicked!");
}
```
- The event object passed into the event-handler method carries information about the event, including the source of the event.

##### GRAPHICS

- You can draw 2D graphics directly on to a widget.
- You can draw a .gif or .jpeg directly on to a widget.
- To draw your own graphics(including a .gif or .jpeg), make a subclass of `JPanel` and override the `paintComponent()` method.
- The `paintComponent()` method is called by the GUI system. YOU NEVER CALL IT YOURSELF. The argument to `paintComponent()` is a `Graphics` object that gives you a surface to draw on, which will end up on the screen. You cannot construct that object yourself.
- Typical methods to call on a `Graphics` object(the `paintComponent` parameter) are:  
```java
graphics.setColor(Color.blue);
g.fillRect(20, 50, 100, 120);
```
- To draw a .jpg, construct an `Image` using:  
```java
Image image = new ImageIcon("catzilla.jpg").getImage();
```
and draw the image using:  
```java
g.drawImage(image, 3,4, this);
```
- The object referenced by the `Graphics` parameter to `paintComponent()` is actually an instance of the `Graphics2D` class. The `Graphics2D` class has a varity of methods including: `fill3DRect()`, `draw3DRect()`, `rotate()`, `scale()`, `shear()`, `transform()`
- To invoke the Graphics2D methods, you must cast the parameter from a `Graphics` object to a `Graphics2D` object:  
```java
Graphics2D g2d = (Graphics2D) g;
```


### Chapter 13

- Layout managers control the size and location of components nested within other components.
- When you add a component to another component(sometimes referred to as a _background_ component, but that's not a technical distinction), the added component is controlled by the layout manager of the _background_ component.
- A layout manager asks components for their preferred size, before making a decision about the layout. Depending on the layout manager's policies, it might respect all, some or none of the component's wishes.
- The BorderLayout manager lets you add a component to one of five regions. You must specify the region when you add the component, using the following syntax:
```java
add(BorderLayout.EAST, panel);
```
- With BorderLayout, components in the north and south get their preferred height, but not width. Components in the east and west get their preferred width, but not height. The component in the center gets whatever is left over(unless you use `pack()`).
- The `pack()` method is like shrink-wrap for the components; it uses the full preferred size of the center component, then determines the size of the frame using the center as a starting point, building the rest based on what's in the other regions.
- FlowLayout places components left to right, top to bottom, in the order they were added, wrapping to a new line of components only when the components won't fit horizontally.
- FlowLayout gives components their preferred size in both dimensions.
- BoxLayout lets you align components stacked vertically, even if they could fit side-by-side. Like FlowLayout, BoxLayout uses the preferred size of the component in both dimensions.
- BorderLayout is the default layout manager for a frame; FlowLayout is the default for a panel.
- If you want a panel to use something other than flow, you have to call `setLayout()` on the panel.


### Chapter 14
- You can save an object's state by serializing the object.
- To serialize an object, you need an `ObjectOutputStream` (from the `java.io` package)
- Streams are either connection streams or chain streams.
- Connection streams can represent a connection to a source or destination, typically a file, network socket connection, or the console.
- Chain streams cannot connect to a source or destination and must be chained to a connection(or other) stream.
- To serialize an object to a file, make a `FileOutputStream` and chain it into an `ObjectOutputStream`.
- To serialize an object, call `writeObject(theObject)` on the `ObjectOutputStream`. You do not need to call methods on the `FileOutputStream`.
- To be serialized, an object must implement the `Serializable` interface. If a superclass of the class implements `Serializable`, the subclass will automatically be serializable even if it does not specifically declare `implements Serializable`.
- When an object is serialized, its entire object graph is serialized. That means any objects referenced by the serialized object's instance variables are serialized, and any objects referenced by those objects... and so on.
- If any object in the graph is not serializable, an exception will be thrown at runtime, unless the instance variable referring to the object is skipped.
- Mark an instance variable with the `transient` keyword if you want serialization to skip that variable. The variable will be restored as null(for object references) or default values(for primitives).
- During deserialization, the class of all objects in the graph must be available to the JVM.
- You read objects in(using `readObject()`) in the order in which they were originally written.
- The return type of `readObject()` is type `Object`, so deserialized objects must be cast to their real type.
- Static variables are not serialized! It doesn't make sense to save a static variable value as part of a specific object's state, since all objects of that type share only a single value--the one in the class.
- To write a text file, start with a `FileWriter` connection stream.
- Chain the `FileWriter` to a `BufferedWriter` for efficiency.
- A `File` object represents a file at a particular path, but does not represent the actual contents of the file.
- With a `File` object you can create, traverse, and delete directories.
- Most streams that can use a `String` filename can use a `File` object as well, and a `File` object can be safer to use.
- To read a text file, start with a `FileReader` connection stream.
- Chain the `FileReader` to a `BufferedReader` for efficiency.
- To parse a text file, you need to be sure the file is written with some way to recognize the different elements. A common approach is to use some kind of character to separate the individual pieces.
- Use the `String split()` method to split a `String` up into individual tokens. A `String` with one separator will have two tokens, one on each side of the separator. _The separator doesn't count as a token._


### Chapter 15
- Client and server applications communicate over a `Socket` connection.
- A `Socket` represents a connection between two applications which may(or may not) be running on two different physical machines.
- A client must know the IP address(or domain name) and TCP port number of the server application.
- A TCP port is a 16-bit unsigned number assigned to a specific server application. TCP port numbers allow different clients to connect to the same machine but communicate with different applications running on that machine.
- The port numbers from 0 through 1023 are reserved for 'well-known services' including HTTP, FTP, SMTP, etc.
- A client connects to a server by making a Server socket  
```java
Socket s = new Socket("127.0.0.1", 4200);
```
- Once connected, a client can get input and output streams from the socket. These are low-level 'connection' streams.  
```java
sock.getInputStream();
```
- To read text data from the server, create a `BufferedReader`, chained to an `InputStreamReader`, which is chained to the input stream from the `Socket`.
- `InputStreamReader` is a 'bridge' stream that takes in bytes and converts them to text(character) data. It's used primarily to act as the middle chain between the high-level `BufferedReader` and the low-level `Socket` input stream.
- To write text data to the server, create a `PrintWriter` chained directly to the `Socket`'s output stream. Call the `print()` or `println()` methods to send `Strings` to the server.
- Servers use a `ServerSocket` that waits for client requests on a particular port number.
- When a `ServerSocket` gets a request, it 'accepts' the request by making a `Socket` connection with the client.
- A thread with a lower-case 't' is a separate thread of execution in Java.
- Every thread in Java has its own call stack.
- A `Thread` with a capital 'T' is the `java.lang.Thread` class. A `Thread` object represents a thread of execution.
- A `Thread` needs a job to do. A `Thread`'s job is an instance of something that `implements` the `Runnable` interface.
- The `Runnable` interface has just a single method, `run()`. This is the method that goes on the bottom of the new call stack. In other words, it is the first method to run in the new thread.
- To launch a new thread, you need a `Runnable` to pass to the `Thread`'s constructor.
- A thread is in the NEW state when you have instantiated a `Thread` object but have not yet called `start()`.
- When you start a thread(by calling the `Thread` object's `start()` method), a new stack is created, with the `Runnable`'s `run()` method on the bottom of the stack. The thread is now in the RUNNABLE state, waiting to be chosen to run.
- A thread is said to be RUNNING when the JVM's thread scheduler has selected it to be the currently-running thread. On a single-processor machine, there can be only one currently-running thread.
- Sometimes a thread can be moved from the RUNNING state to a BLOCKED(temporarily non-runnable) state. A thread might be blocked because it's waiting for data from a stream, or because it has gone to sleep, or because it is waiting for an object's lock.
- Thread scheduling is not guaranteed to work in any particular way, so you cannot be certain that threads will take turns nicely. You can help influence turn-taking by putting your threads to sleep periodically.
- The `static Thread.sleep()` method forces a thread to leave the running state for at least the duration passed to the sleep method. `Thread.sleep(200)` puts a thread to sleep for 200 milliseconds.
- The `sleep()` method throws a checked exception `InterruptedException`, so all calls to `sleep()` must be wrapped in a `try`/`catch`, or declared.
- You can use `sleep()` to help make sure all threads get a chance to run, although there's no guarantee that when a thread wakes up it'll go to the end of the runnable line. It might, for example, go right back to the front. In most cases, appropriately-timed `sleep()` calls are all you need to keep your threads switching nicely.
- You can have serious problems with threads if two or more threads have access to the same object on the heap.
- Two or more threads accessing the same object can lead to data corruption if one thread, for example, leaves the running state while still in the middle of manipulating an object's critical state.
- To make your objects thread-safe, decide which statements should be threated as one atomic process. In other words, decide which methods must run to completion before another thread enters the same method on the same object.
- Use the keyword `synchronized` to modify a method declaration, when you want to prevent two threads from entering that method.
- Every object has a single lock, with a single key for that lock. Most of the time we don't care about that lock; locks come in to play only when an object has `synchronized` methods.
- When a thread attempts to enter a synchronized method, the thread must get the key for the object(the object whose method the thread is trying to run). If the key is not available(because another thread already has it), the thread goes into a kind of waiting lounge, until the key becomes available.
- Even if an object has more than one `synchronized` method, there is still only one key. Once any thread has entered a `synchronized` method on that object, no thread can enter any other `synchronized` method on the same object. This restriction lets you protect your data by synchronizing any method that manipulates the data.


### Chapter 16

> Note: This chapter doesn't have Bullet Points. Weird. Collected by myself:

- The `Collections.sort()` method sorts a list of Strings alphabetically.
- With generics, you can create type-safe collections where more problems are caught at compile-time instead of runtime.
- Without generics, the complier would happily let you put a Pumpkin into an `ArrayList` that was supposed to hold only Cat objects.
- Think of "E" as a stand-in for "the type of element you want this collection to hold and return."(**E** is for **E** lement):
```java
public class ArrayList<E> extends AbstractList<E> implements List<E> ... {
  public boolean add(E o) { }
  // more code
}
```
- In generics, the keyword `extends` really means "is-a" and works for **BOTH** classes and interfaces.
- Invoking the one-argument `sort(List o)` method means the list element's `compareTo()` method determines the order. So the elements in the list **MUST** implement the `Comparable` interface.
- Invoking `sort(List o, Comparator c)` means the list element's `compareTo()` method will **NOT** be called, and the `Comparator`'s `compare()` method will be used instead. That means the elements in the list do **NOT** need to implement the `Comparable` interface.
- To use a `TreeSet`, one of these thinigs must be true: The elements in the list must be of a type that `implements Comparable` OR You use the `TreeSet`'s overloaded constructor that takes a `Comparator`.
- Each element in a `Map` is actually TWO objects--a key and a value. You can have duplicate _values_, but NOT duplicate _keys_.
- When you use a wildcard in your method argument, the compilier will **STOP** you from doing anything that could hurt the list referenced by the method parameter.

##### Java Object Law For `HashCode()` and `equals()`

> The API docs for class `Object` state the rules you **MUST** follow:

- If two objects are equal, they **MUST** have matching hashcodes.
- If two objects are equal, calling `equals()` on either object **MUST** return `true`. In other words, if `a.equals(b)` then `b.equals(a)`.
- If two objects have the same hashcode value ,they are **NOT** required to be equal. But if they're equal, they **MUST** have the same hashcode value.
- So, if you override `equals()`, you **MUST** override `hashCode()`.
- The default behavior of `hashCode()` is to generate a unique integer for each object on the heap. So if you don't override `hashCode()` in a class, no two objects of that type can **EVER** beconsidered equal.
- The default behavor of `equals()` is to do an `==` comparison. In other words, to test whether the two references refer to a single object on the heap. So if you don't override `equals()` in a class, no two objects can **EVER** be considered equal since references to two different objects will always contain a different bit pattern. `a.equals(b)` must also mean that `a.hashCode() == b.hashCode()`. But `a.hashCode() == b.hashCode()` does **NOT** have to mean `a.equals(b)`


### Chapter 17

- Organize your project so that your source code and class files are not in the same directory.
- A standard organization structure is to create a _project_ directory, and then put a _source_ directory and a _classes_ directory inside the project directory.
- Organizing your classes into packages prevent naming collisions with other classes, if you prepend your reverse domain name on to the front of a class name.
- To put a class in a package, put a package statement at the top of the source code file, before any import statements:
```java
package com.wickedlysmart;
```
- To be in a package, a class must be in a _directory structure that exactly matches the package structure_. For a class, `com.wickedlysmart.Foo`, the `Foo` class must be in a directory named _wickedlysmart_, which is in a directory named _com_.
- To make your compiled class land in the correct package directory structure under the _classes_ directory, use the `-d` compiler flag:
```sh
% cd source
% javac -d ../classes com/wickedlysmart/Foo.java
```
- To run your code, `cd` to the classes directory, and give the fully-qualified name of your class:
```sh
% cd classes
% java com.wickedlysmart.Foo
```
- You can bundle your class into JAR(Java ARchive) files. JAR is based on the pkzip format.
- You can make an executable JAR file by putting a manifest into the JAR that states with class has the `main()` method. To create a manifest file, make a text file with an entry like the following(for example):
`Main-Class: com.wickedlysmart.Foo`
- Be sure you hit the return key after typing the Main-Class line, or your manifest file may not work.
- To create a JAR file, type: `jar -cvfm manifest.txt MyJar.jar com`
- The entire package directory structure(and _only_ the directories matching the package) must be immediately inside the JAR file.
- To run an executable JAR file, type: `java -jar MyJar.jar`


### Chapter 18
- An object on one heap cannot get a normal Java reference to an object on a different heap(which means running on a different JVM)
- Java Remote Method Invocation(RMI) makes it _seem_ like you're calling a method on a remote object(i.e. an object in a different JVM), but you aren't
- When a client calls a method on a remote object, the client is really calling a method on a _proxy_ of the remote object. The proxy is called a 'stub'.
- A stub is a client helper object that takes care of the low-level networking details(sockets, streams, serialization, etc.) by packaging and sending method calls to the server.
- To build a remote service(in other words, an object that a remote client can ultimately call methods on), you must start with a remote interface.
- A remote interface must extend the `java.rmi.Remote` interface, and all methods must declare `RemoteException`.
- Your remote service implements your remote interface.
- Your remote service should extend `UnicastRemoteObject`(Technically there are other ways to create a remote object, but extending `UnicastRemoteObject` is the simplest).
- Your remote service class must have a constructor, and the constructor must declare a `RemoteException`(because the superclass constructor declares one).
- Your remote service must be instantiated, and the object registered with the RMI registry.
- To register a remote service, use the static `Naming.rebind("Service Name", serviceInstantce);`
- The RMI registry must be running on the same machine as the remote service, before you try to register a remote object with the RMI registry.
- The client looks up your remote service using the static `Naming.lookup("rmi://MyHostName/ServiceName");`
- Almost everything related to RMI can throw a `RemoteException`(checked by the compiler). This includes registering or looking up a service in the registry, and _all_ remote method calls from the client to the stub.
- Servlets are Java classes that run entirely on(and/or within) an HTTP(web) server.
- Servlets are useful for running code on the server as a result of client interaction with a web page. For example, if a client submits information in a web page form, the servlet can process the information, add it to a database, and send back a customized, confirmation response page.
- To compile a servlet, you need the servlet packages which are in the servlets.jar file. The servlet classes are not part of the Java standard libraries, so you need to download the servlets.jar from java.sun.com or get them from a servlet-capable web server. (Note: the Servlet library is included with the Java 2 Enterprise Edition(J2EE))
- To run a servlet, you must have a web server capable of running servlets, such as the Tomcat server from apache.org
- Your servlet must be placed in a location that's specific to your particular web server, so you'll need to find that out before you try to run your servlets. If you have a web site hosted by an ISP that supports servlets, the ISP will tell you which directory to place your servlets in.
- A typical servlet extends `HttpServlet` and overrides one or more servlet methods, such as `doGet()` or `doPost()`
- The web server starts the servlet and calls the appropriate method(`doGet()`, etc.) based on the client's request.
- The servlet can send back a response by getting a `PrintWriter` out put stream from the response parameter of the `doGet()` method.
- The servlet 'writes' out an HTML page, complete with tags.
