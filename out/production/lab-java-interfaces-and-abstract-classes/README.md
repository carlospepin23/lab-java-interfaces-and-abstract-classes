![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB Java | Interfaces and Abstract Classes

## Introduction

We have just learned how to create and implement interfaces as well as how to create and extend abstract classes so now let's practice a bit.

<br>

## Requirements

1. Fork this repo.
2. Clone this repo.
3. Add your instructor and the class graders as collaborators to your repository. If you are unsure who your class graders are, ask your instructor or refer to the day 1 slide deck.
4. In the repository, create a Java project and add the code for the following prompts.

## Submission

Once you finish the assignment, submit a URL link to your repository or your pull request in the field below.

<br>

## Instructions

### BigDecimal Operations

1. Using the [BigDecimal documentation](https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html), create a method that accepts a `BigDecimal` and returns a `double` of the `BigDecimal` number rounded to the nearest hundredth. For example, `4.2545` should return `4.25`.
2. Using the [BigDecimal documentation](https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html), create a method that accepts a `BigDecimal`, reverses the sign (if the parameter is positive, the result should be negative and vice versa), rounds the number to the nearest tenth and returns the result. For example, `1.2345` should return `-1.2` and `-45.67` should return `45.7`.

<br>

### src.CarInventorySystem.Car Inventory System

1. Suppose you are building a car inventory system. All cars have a `vinNumber`, `make`, `model` and `mileage`. But no car is just a car. Each car is either a `src.CarInventorySystem.Sedan`, a `src.CarInventorySystem.UtilityVehicle` or a `src.CarInventorySystem.Truck`.
2. Create an abstract class named `Car` and define the following properties and behaviors:
   - `vinNumber`: a `String` representing the VIN number of the car
   - `make`: a `String` representing the make of the car
   - `model`: a `String` representing the model of the car
   - `mileage`: an `int` representing the mileage of the car
   - `getInfo()`: a method that returns a `String` containing all of the car's properties in a readable format
3. Create three classes that extend `Car`: `Sedan`, `UtilityVehicle` and `Truck`.
4. `UtilityVehicle` objects should have an additional `fourWheelDrive` property, a `boolean` that represents whether the vehicle has four-wheel drive.
5. `Truck` objects should have an additional `towingCapacity` property, a `double` that represents the towing capacity of the truck.

<br>

### Video Streaming Service

1. Suppose you are building a video streaming service. All videos are either TV series or movies.
2. Create an abstract class named `Video` and define the following properties and behaviors:
   - `title`: a `String` representing the title of the video
   - `duration`: an `int` representing the duration of the video in minutes
   - `getInfo()`: a method that returns a `String` containing all of the video's properties in a readable format
3. Create two classes that extend `Video`: `TvSeries` and `Movie`.
4. `TvSeries` objects should have an additional `episodes` property, an `int` representing the number of episodes in the series.
5. `Movie` objects should have an additional `rating` property, a `double` representing the rating of the movie.

<br>

### IntList Interface

1. Create an `IntList` interface with the following methods:
   - `add(int number)`: a method that adds a new number to the list
   - `get(int id)`: a method that retrieves an element by its ID
2. Create two implementations of `IntList`: `IntArrayList` and `IntVector`.
3. `IntArrayList` should store numbers in an array with a length of 10 by default. When the `add` method is called, you must first determine if the array is full. If it is, create a new array that is 50% larger, move all elements over to the new array and add the new element. (For example, an array of length 10 would be increased to 15.)
4. `IntVector` should store numbers in an array with a length of 20 by default. When the `add` method is called, you must first determine if the array is full. If it is, create a new array that is double the size of the current array, move all elements over to the new array and add the new element. (For example, an array of length 10 would be increased to 20.)
5. In your `README.md`, include an example of when `IntArrayList` would be more efficient and when `IntVector` would be more efficient.

<br>

## FAQs

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">I am stuck and don't know how to solve the problem or where to start. What should I do?</summary>

  <br> <!-- ✅ -->

  If you are stuck in your code and don't know how to solve the problem or where to start, you should take a step back and try to form a clear, straightforward question about the specific issue you are facing. The process you will go through while trying to define this question will help you narrow down the problem and come up with potential solutions.

  For example, are you facing a problem because you don't understand the concept or are you receiving an error message that you don't know how to fix? It is usually helpful to try to state the problem as clearly as possible, including any error messages you are receiving. This can help you communicate the issue to others and potentially get help from classmates or online resources.

  Once you have a clear understanding of the problem, you should be able to start working toward the solution.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">How do I create a Maven project in IntelliJ?</summary>

  <br> <!-- ✅ -->

  To create a Maven project in IntelliJ, you can follow these steps:

  1. Open IntelliJ IDEA and click the "Create New Project" button.
  2. In the "New Project" dialog, select "Maven" as the build system.
  3. Specify the name of the project.
  4. In the "Project Location" section, specify a location where you want to save your project.
  5. Select the "Create Git repository" checkbox in order to initialize the git repository upon creation of the project.
  6. Click the "Create" button to create the Maven project.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">How do I use "BigDecimal" in Java to handle precise decimal numbers?</summary>

  <br> <!-- ✅ -->

  `BigDecimal` is a class in Java that provides support for precise decimal numbers, allowing you to perform arithmetic operations with arbitrary precision.

  Here's how you can use `BigDecimal` in a Java program:

  ```java
  import java.math.BigDecimal;

  public class BigDecimalExample {
  public static void main(String[] args) {
    BigDecimal a = new BigDecimal("0.1");
    BigDecimal b = new BigDecimal("0.2");
    BigDecimal c = a.add(b);
    System.out.println("a + b = " + c);
  }
  }
  ```

  In this example, `BigDecimal` objects are created using the `new` keyword and a string representation of the decimal number. The `add` method is then used to perform arithmetic operations on the `BigDecimal` objects, providing precise results.

  It's important to note that when creating a `BigDecimal` object, it's recommended to use the string constructor instead of the `double` constructor. The `double` constructor is not recommended for creating `BigDecimal` objects because the `double` data type has limited precision and may produce unexpected results.

  In addition to the `add` method, `BigDecimal` also provides other arithmetic operations, such as `subtract`, `multiply` and `divide`, as well as methods for rounding and formatting the decimal number.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">How do I use "setScale()", "RoundingMode" and "negate()" in Java with "BigDecimal"?</summary>

  <br> <!-- ✅ -->

  `setScale()`, `RoundingMode` and `negate()` are methods in the `BigDecimal` class in Java that provide additional functionality when working with precise decimal numbers.

  `setScale()` is used to set the scale of a `BigDecimal` object, which determines the number of decimal places to keep. For example:

  ```java
  import java.math.BigDecimal;

  public class BigDecimalExample {
      public static void main(String[] args) {
          BigDecimal a = new BigDecimal("1.234567");
          BigDecimal b = a.setScale(4, BigDecimal.ROUND_HALF_UP);
          System.out.println("a: " + a);
          System.out.println("b: " + b);
      }
  }
  ```

  In this example, `setScale()` is used to set the scale of `a` to 4 decimal places and the result is stored in a new `BigDecimal` object, `b`. The `ROUND_HALF_UP` argument specifies the rounding mode to use when setting the scale.

  `RoundingMode` is an enumeration in Java that defines the different rounding modes that can be used with `BigDecimal`. For example:

  ```java
  import java.math.BigDecimal;
  import java.math.RoundingMode;

  public class BigDecimalExample {
      public static void main(String[] args) {
          BigDecimal a = new BigDecimal("1.234567");
          BigDecimal b = a.setScale(4, RoundingMode.HALF_UP);
          System.out.println("a: " + a);
          System.out.println("b: " + b);
      }
  }
  ```

  In this example, `RoundingMode.HALF_UP` is used as the rounding mode argument in the `setScale()` method.

  `negate()` is used to negate the value of a `BigDecimal` object, converting a positive value to a negative and vice versa. For example:

  ```java
  import java.math.BigDecimal;

  public class BigDecimalExample {
      public static void main(String[] args) {
          BigDecimal a = new BigDecimal("1.234567");
          BigDecimal b = a.negate();
          System.out.println("a: " + a);
          System.out.println("b: " + b);
      }
  }
  ```

  In this example, `negate()` is used to negate the value of `a` and store the result in a new `BigDecimal` object, `b`.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">What is an abstract class in Java and how is it used?</summary>

  <br> <!-- ✅ -->

  An abstract class in Java is a class that cannot be instantiated and is intended to be subclassed by other classes. Abstract classes can contain abstract methods, which are methods that are declared but do not have a body.

  An abstract class is used as a base class to provide a common interface and implementation to its subclasses. Subclasses of an abstract class must implement the abstract methods defined in the abstract class.

  Here is an example of an abstract class in Java:

  ```java
  abstract class Shape {
      int x, y;
      // abstract method that subclasses must implement
      abstract void draw();
  }

  class Circle extends Shape {
    @Override
      void draw() {
          System.out.println("Drawing a circle");
      }
  }

  class Square extends Shape {
    @Override
      void draw() {
          System.out.println("Drawing a square");
      }
  }
  ```

  In this example, the `Shape` class is an abstract class that contains an abstract method `draw()`. The `Circle` and `Square` classes are subclasses of `Shape` and implement the `draw()` method.

  When a subclass implements the abstract methods of its abstract class, it inherits the properties and methods of the abstract class, making it easier to implement common functionality in multiple classes.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">How do I implement an interface in Java?</summary>

  <br> <!-- ✅ -->

  In Java, an interface is a blueprint for classes that outlines the methods that a class must implement. To implement an interface, you need to create a class that implements the interface and provides an implementation for each of its methods.

  Here is an example of how to implement an interface in Java:

  ```java
  interface Shape {
      void draw();
  }

  class Circle implements Shape {
    @Override
      public void draw() {
          System.out.println("Drawing a circle");
      }
  }

  class Square implements Shape {
    @Override
      public void draw() {
          System.out.println("Drawing a square");
      }
  }
  ```

  In this example, the `Shape` interface defines a single method `draw()`. The `Circle` and `Square` classes implement the `Shape` interface by providing an implementation for the `draw()` method.

  When a class implements an interface, it must implement all the methods defined in the interface. If a class does not implement all the methods, it will not compile. Interfaces can be used to enforce a common set of methods in a group of classes, making it easier to write code that is interchangeable between different classes that implement the same interface.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">What is the purpose of "System.arraycopy()" in Java and how do we use it?</summary>

  <br> <!-- ✅ -->

  The `System.arraycopy()` method in Java is used to copy elements from one array to another. It is part of the `System` class and provides a faster alternative to the traditional for loop method of copying arrays. The method has the following signature:

  ```java
  public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
  ```

  Here's an example of how you can use `System.arraycopy()`:

  ```java
  int[] sourceArray = new int[] {1, 2, 3, 4, 5};
  int[] destinationArray = new int[5];
  System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);

  System.out.println(Arrays.toString(destinationArray));
  ```

  In this example, `System.arraycopy()` is used to copy the elements of `sourceArray` to `destinationArray`. The first argument `src` is the source array, the second argument `srcPos` is the starting position in the source array, the third argument `dest` is the destination array, the fourth argument `destPos` is the starting position in the destination array and the fifth argument `length` is the number of elements to be copied. The output of this example would be `[1, 2, 3, 4, 5]`.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">I am unable to push changes to my repository. What should I do?</summary>

  <br> <!-- ✅ -->

  If you are unable to push changes to your repository, here are a few steps that you can follow:

  1. Check your internet connection: Ensure that your internet connection is stable and working.
  1. Verify your repository URL: Make sure that you are using the correct repository URL to push your changes.
  2. Check Git credentials: Ensure that your Git credentials are up-to-date and correct. You can check your credentials using the following command:

  ```bash
  git config --list
  ```

  4. Update your local repository: Before pushing changes, make sure that your local repository is up-to-date with the remote repository. You can update your local repository using the following command:

  ```bash
  git fetch origin
  ```

  5. Check for conflicts: If there are any conflicts between your local repository and the remote repository, resolve them before pushing changes.
  6. Push changes: Once you have resolved any conflicts and updated your local repository, you can try pushing changes again using the following command:

  ```bash
  git push origin <branch_name>
  ```

</details>

