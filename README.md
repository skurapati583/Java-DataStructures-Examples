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
