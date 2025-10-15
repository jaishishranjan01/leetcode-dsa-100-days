# Arrays

- *Definition*
- *Two Pointer Approach*
- *Others*
- *FQAs*
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

### Definition
*An array is an ordered group of elements of the same type.*  
In Java and C++, arrays are strongly typed and have a fixed size.  
Generally, arrays are static *(they can't be resized)*, but some programming languages support dynamic arrays.

> In Java, the `ArrayList` class provides a resizable implementation of the `List` interface, behaving like a dynamic array that grows and shrinks automatically as elements are added or removed.  
> Internally, `ArrayList` uses an array that increases its capacity by approximately **50%** when it exceeds its limit, ensuring **amortized constant-time insertion**.

> ```java
> ArrayList<?> arr = new ArrayList<>();
> ```
> Here, the internal array will not be created initially; it will only be created once an element is added.
>
> ```java
> arr.add(12);
> ```
> Now, an internal array will be created with an **initial default capacity of 10**.  

Once the **11th element** is added, a new array will be created by copying all existing elements and **increasing its capacity by 50%** (in above case, to 15).


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### Two Pointer Approach
