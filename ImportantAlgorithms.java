public class ImportantAlgorithms {
    
    /*
    
    Sliding Window Pattern

    When to Use: 
        Finding a (generally shortest or longest) subset of elements that satisfy a given condition
        Input is something like an array, string, or a linked list

    How it Works:
        Look at a smaller section of the list or string, called a window
        This window slides one step at a time until the entire list is scanned

    Ex: 
        Find the longest substring with k unique characters in a given string

    */

    /*
     
    Subset Pattern (Similar to BFS)

    When to Use:
        Finding all possible combinations of elements from a given set

    How it Works:
        Start with an empty set
        Explore how to add a new element to the existing subset and create a new one
        Repetitions may or may not be allowed depending on the problem
     
    Ex:
        Permutations
     

    /*
     
    Modified Binary Search Pattern

    When to Use:
        Data is sorted (if not, sort it), usually in ascending or descending order
        Repeated searches on the same dataset
        Large datasets
        With binary search trees, ordered maps/sets, etc.

    How it Works:
        Start in the middle, check if target value sits in the left or the right half
        Move the search window to overlap with where the target lies
        Divide the search space in half again and again, adapted for the given problem

    Modification:
        Need to understand what happens to the left/right halves under two conditions
        1. Array contains duplicates
        2. Target not present

    Ex:
        Search in Rotated Sorted Array

    */

    /*
     
    Top K Elements Pattern

    When to Use:
        Select k number of elements given a condition
        Usually operation done on a linear datastructure (array or list)
    
    How it Works:
        Use other search algorithms to search for elements given a condition
        Store the elements that satisfy the condition in a heap (most efficient)

    Ex:
        Kth largest element in the array
     
    */

    /*
    
    Binary Tree DFS Pattern

    When to Use:
        Working with a binary tree
        You care about depth given the condition

    How it Works:
        Start at the root node
        Generally apply DFS recursively to the left node until you reach a left node with no children
        Backtracks up the subtree and checks for the next deepest right node
        Checks the next deepest right node's chidlren, prioritizing the left child first
        Repeat until every node is reached

    Ex:
        Maximum depth of binary tree

    */

    /*

    Toplogical Sort

    When to Use:
        Arrange elements in a specific order when they have dependencies on eachother
        Usually used for Directed Acyclic Graphs (One way connection, No cycle/loop)

    How it Works:
        Use DFS to parse the graph at an unvisited node
        Visit all of the node's neighbors (nodes that depend on it)
        Push the current node onto a stack (ensures nodes with dependencies pushed after prerequisites)
        Repeat until all nodes are visited
        Reverse the stack or build a list in reverse order from elements

    Ex:
        Course Schedule

    */

    /*

    Binary Tree BFS Pattern

    When to Use:
        When working with binary trees
        You care about tree level orders or breadth over depth

    How it Works:
        Explore all the nodes at the same level before moving on to the next level
        Use a queue to store nodes, starting with the first node
        Remove a node from the queue and add its children to the queue
        Repeat until the queue is empty

    Ex: 
        Binary tree level order traversal

    */

    /*
    
    Two Pointer Pattern

    When to Use:
        Iterate through a sorted array 

    How it Works:
        Use two pointers positioned at different parts of the array
        Each pointer moves based on the given condition
        Pointers don't repeat eachother by design

    Modification:
        Pointers can be done in two ways
        1. First pointer moves normally, Second pointer moves faster (skips indexes) by some multiplier
        2. Pointers at each end that move sequentially based on closeness to the given condition

    Ex:
        Two sum
        Three sum

    */

}
