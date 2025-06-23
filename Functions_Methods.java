import java.util.Arrays;

public class Functions_Methods {

    // Java only has pass by value there is no pass by reference
    // considering like for primitive data types it is pass by value
    // for object or non-primitive type reference copy is passed/passing value of reference variable

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        // this change will be valid in this function scope only
    }

    static void changeName(String n) {
        n = "Meet";  // not changing object, but creating a new object
    }

    static void changeArray(int a[]) {
        a[0] = 10;  // if you make change to this object via reference variable, same object will be changed
    }

    static boolean pythagoreanTriplet(int a[]) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                for(int k = j+1; k < n; k++) {
                    int x = a[i] * a[i];
                    int y = a[j] * a[j];
                    int z = a[k] * a[k];
                    if(x == y + z || y == x + z || z == x + y) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static void primeNos(int a, int b) {
        boolean flag;
        for(int i = a; i <= b; i++) {
            flag = true;
            for(int j = 2; j <= i/2; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.print(i + " ");
            }
        }
    }

    // static int sumNatural(int n) {
    //     if(n == 1) {
    //         return 1;
    //     }
    //     return n + sumNatural(n-1);
    // }

    static int sumNatural(int n) {
        if(n % 2 == 0) {
            return (n/2) * (n+1);
        } else {
            return ((n+1)/2) * n;
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);    
        System.out.println(a + " " + b);

        String name = "Meet Raval";
        changeName(name);
        System.out.println(name);

        int arr[] = {1,2,3,4,5};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        changeArray(arr);
        System.out.println("\n" + Arrays.toString(arr));

        int k[] = {3, 1, 4, 6, 5};
        if(pythagoreanTriplet(k)) {
            System.out.println("Is pythagorean triplet");
        } else {
            System.out.println("Is not a pythagorean triplet");
        }

        primeNos(2, 100);

        System.out.println("\nSum of natural nos.: " + sumNatural(5));

    }
}


/* 
    In Java, arguments are always passed by value, not by reference. However, the behavior can sometimes appear as if it is passed by reference when dealing with objects, leading to confusion. Here's a detailed explanation:

    1. Primitive Data Types (e.g., int, float, char):
    When you pass a primitive type to a method, Java passes a copy of the value.
    Changes made to the parameter inside the method do not affect the original variable.

    public class Main {
    public static void main(String[] args) {
        int num = 10;
        modifyValue(num);
        System.out.println(num); // Output: 10
    }

    public static void modifyValue(int value) {
        value = 20; // This changes the local copy, not the original variable
    }
    }


    2. Object References:
    When you pass an object to a method, the value of the reference (memory address) is passed.
    Inside the method, you can modify the object's fields because the reference points to the same object.
    However, reassigning the reference inside the method does not affect the original reference.
    
    Example 1: Modifying Object Fields
    class Person {
    String name;
    }

    public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        modifyObject(person);
        System.out.println(person.name); // Output: Jane
    }

    public static void modifyObject(Person obj) {
        obj.name = "Jane"; // Modifies the object that the reference points to
    }
    }

    Example 2: Reassigning the Reference
    class Person {
    String name;
    }

    public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        reassignObject(person);
        System.out.println(person.name); // Output: John
    }

    public static void reassignObject(Person obj) {
        obj = new Person(); // This creates a new object, but doesn't affect the original reference
        obj.name = "Jane";
    }
    }

    If you want to simulate pass-by-reference behavior, you can use wrapper objects or return the modified value from the method.
    1. Use Wrapper Objects: Encapsulate the value in an object so changes affect the original object.
    class Wrapper {
    int value;
    }
    void modify(Wrapper w) { w.value = 20; }

    2. Return the Modified Value: Update the variable by returning the new value from the method.
    int modify(int val) { return val + 10; }
    num = modify(num);

 */