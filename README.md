# Java-DataStructures-Examples

## Disadvantages of Arrays
- Once an array is declared, it can't be expanded or shrinked

### 1. Linked List

- Expandable
- Collection of every element that is linked to each other.
- Each element is node. Each node contains its value and has address to next node
- First element (node) is head
- Last node's address part is null
- All nodes are stored in vaious locations unline arrays and hence it is expandable
- Adding and deleting nodes is made by pointing the references to following elements
- Example: Alt-Tab option in Windows, links next tabs

**Drawbacks:** 
- Slow when compared to array
- In order to access any node value, need to start with head and proceed for searching and adding overhead
- In array, accessed by index, fetch the value randomly and hence fast

### 2. Stack

- An Abstract Data Type (ADT) in Data Structures
- LIFO - Last In First Out
- Add element using Push
- Remove element from Pop
- Find elements using Peek
- Only one point of entry and remove of element - Top element
- Example: Stack of books

### 3. Queue

- First in First out (FIFO)
- Insertion - enQueue through rear element
- Deletion - deQueue through front element

### 4. Tree

- Just like trees, root, nodes, leaf node and edges are present
- Tree can have as many child nodes
- Includes height and depth
- Depth - number of nodes from root to current node - length of path
- Height of tree - one more than the depth of deepest node
- Special types of tree like Binary tree has only two nodes maximum.
- Strict Binary Tree - Each node has either two children or no children
- Full Binary Tree - All the leaf nodes on same level
- Complete Binary Tree - All leaf nodes are on last or last-1 level

### 5. Merge Sort

- Divide the input array recursively until only one element array are created i.e. left and right halves arrays combinations
- In each recursion, sort the elements in left and right halves respectively and merge both halves
- Continue the recursion until all the arrays are merged and elements are sorted

### 6. Bubble Sort

- Beginning of input list, pair of elements are picked and swap the elements in sorted order. Once sorted, proceeded to next pair. 
- If end of list is reached, then again proceed step 1
- Keep on swapping the pair of elements until no longer swap is required

### 7. Maps and HashMaps

- Map is a collection of key-value pairs
- Doesn't gaurentee sorting order of keys, values

### 8. Quick Sort

- Based on Divide-and-Conquer technique
- An element (either median or starting element) is chosen as pivot element
- Partition the array such that all the elements less than pivot element are sent to left side of pivot element
- All the elements greater than pivot are sent to right side of the pivot element

### 9. Binary Search

- Binary search performs searching on sorted array
- Searching starts with middle element of sorted array. If target element is less than middle element, then search in left side and continues there iteratively. 
- If target element is greater than middle element, then search occurs in right side and continues there iteratively.

### 10. Read/Write Text File

- BufferedWriter and BufferedReader classes are simplest classes for read/write of text file

### Comparable & Comparator

- To enable sorting of any class with customized logic, the class should implement Comparable Interface and override compareTo method. Inside compareTo method return positive integer for positive condition and negative for negative condition
- Comparator interface is another alternative for sorting of user defined class objects. Comparator interface logic should be defined and its object shall be passed to below call
```Java
Collections.sort(list, comparatorObj);
```

## Questions

**1. Why strings are immutable?**

String literals like below are stored in a shared String Pool. For example:

```Java
String name = "John";
String anotherName = "John";
```

Here both the string variables are just references to same string object "John" created in shared string pool. If the strings aren't immutable, then change in one variable will update other. Hence strings are made immutable. For security reasons.

Also strings immutability makes them thread-safe.

When string is created using new keyword, it would create brand new object and not in shared string pool.

```Java
String thirdName = new String("John");
```

**2. Difference between ArrayList and LinkedList?**
- Both are part of Collections framework
- Both implement List interface and supports same methods
- The difference is: how they are implemented behind the scenes
- While retrieval of element, LinkedList is slower as it goes through next, previous pointers. Whereas ArrayList is faster because it access directly just like an array
- While adding or removing elements, LinkedList is more efficient than ArrayList. In LinkedList, only the changed node is affected and remaining nodes are not. Whereas in ArrayList, Java has to create an entire new Array behind the scenes, copy the elements. 
- For retrieval intensive programs, ArrayList is prefered
- For programs more focused on adding/remove elements than retrieval, LinkedList is best bet and preferred

**3. Checked Exception vs Unchecked Exception**

- Checked Exceptions are basically compile time exceptions where compiler expects us to handle those exceptions. The program wouldn't run without handling such exceptions.
Example: FileNotFoundException (while reading file), InterruptedException, IOException (while writing file), SQLException (SQL Exception), MalformedURLException (URL)
- All checked exceptions are direct sub-classes for Exception class
- Unchecked Exceptions are run-time exceptions. Java compiler allows the program with possibility of runtime exceptions to execute but throws exception at runtime. Examples: NullPointerException, NumberFormatException, ClassCastException, IndexOutOfBoundsException
- All unchecked exceptions are direct sub-classes of RuntimeException, which inturn sub-class of Exception class
- Thowable interface implemented by two classes: Error and Exception
- Error is a kind of exceptional condition from which program cannot recover. Example: OutOfMemoryError, StackOverFlowError, etc

**4. Difference between Array and ArrayList**

- Array should have fixed size, whereas ArrayList do not have fixed size and can grow and shrink automatically
- Arrays can only hold primitive types, whereas ArrayList holds only type wrappers and objects
- In Arrays, length of array can be found by "length" field whereas in ArrayList, size of ArrayList() found by size() method   
- Printing Arrays returning some random text. Printing ArrayList shows decent display of items inside ArrayList

**5. == vs .equals()**

- Primitive variables actually refer to actual values. Type wrapper variables refers to memory location.
- While doing "==", Java is checking the underlying memory locations of those two objects.
- .equals() method actually checks the equality of contents inside both objects memory locations
- == best used for primitive types comparision
- .equals() for objects comparision
- It is preferred to write custom equals() method for a class for convinience like below
```Java
public boolean equals(Object obj) {
    // Custom logic to determine object equality
    return true; // or return false
}
```

**6. MultiThreading via Thread class via Runnable interface**
- Multithreading can be implemented by either extending Thread class or implementing Runnable interface
- In both cases, the class should override run() method and include the logic
- When the classes doesn't need to extend any other class, then extends approach is suitable
- Implementing Runnable interface gives flexibility to extend other classes
- Just calling run() method inside thread, doesn't initiate a seperate thread. Executes in main() thread
- start() method should be called in order to execute in seperate thread
- isAlive() method returns if the current thread is alive or not
- join() method stops the program until the current thread is completed


**7. Why array or any list indices starts with 0?**
When a array of, for example, size=5 is initialized, computer will allocate five consective empty memory cells to this array and computer stores the address for first memory cell. So when a program access array of index 3, computer will search at first memory cell plus 3 places to find the address.
