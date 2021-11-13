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

Drawbacks: 
- Slow when compared to array
- In order to access any node value, need to start with head and proceed for searching and adding overhead
- In array, accessed by index, fetch the value randomly and hence fast

### Implemenetation in Java

