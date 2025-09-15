
import java.util.Queue;

public class DataStructures {
    
    /*

    Array

    When to Use:
        Fast and random access in needed
        Want to stor a fixed-size collection of data
        For interation and sorting of data
    
    Complexities:
        Time (Search/Insert/Delete) = O(n)
        Space = O(n)
    
    How it Works:
        Elements stored in contiguous memory
        Usually access elements by index

    Ex:
        int[] arr = new int[5];
        arr[0] = 10;
     
    */

    /*
    
    ArrayList (Dynamic Array)

    When to Use:
        Want to access elements by index, but need dynamic resizing
        Frequent access with some inserts and deletes
    
    Complexities
        Time (Search/Insert/Delete) = O(n)
        Space = O(n)
    
    How it Works:
        An array that double in size if capacity is exceeded

    Ex:
        import java.util.ArrayList;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5); 

    */

    /*
    
    Linked List/Doubly Linked List

    When to Use:
        Frequent insertions/deletions
        No random access needed
    
    Complexities:
        Time (Access/Search) = O(n)
        Time (Insert/Delete at Head) = O(1)
        Space = O(n)
    
    How it Works:
        Each node points to the next (and previous if doubly linked)
    
    Ex:
        class Node {
            int val;
            Node next;
            Node(int val) { this.val = val; }
        }

    */

    /*
    
    Stack

    When to Use:
        Last in, first out problems
        Balanced parenthesis, undo operations, DFS

    Complexities:
        Time (Push/Pop/Peek) = O(1)
        Time (Search) = O(n)
        Space = O(n)

    How it Works:
        Can be array or linked list based
        Push/pop from one end
    
    Ex:
        import java.util.Stack;
        Stack<Integer> stack = new Stack<>();
        stack.push(1);   // O(1)
        stack.pop();     // O(1)

    */

    /*

    Queue

    When to Use:
        First in, first out problems
        Scheduling, BFS

    Complexities:
        Time (Enqueue/Dequeue) = O(1)
        Time (Search) = O(n)
        Space = O(n)

    How it Works:
        Insert at the rear, remove at the front

    Ex:
        import java.util.LinkedList;
        import java.util.Queue;
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);  // O(1)
        q.poll();     // O(1)

    
    */


    /*

    Hash Set

    When to Use:
        The elements are unique (no repetitions)
        Fast memebership testing

    Complexities:
        Time (Insert/Search/Delete) = O(1) average
        Space = O(n)

    How it Works:
        Backed by a HashMap
        Only keys matter
    
    Ex:
        import java.util.HashSet;
        HashSet<Integer> set = new HashSet<>();
        set.add(1);   // O(1)
        set.contains(1); // O(1)

    */

    /*

    Hash Map (Hash Table)

    When to Use:
        Fast lookup by key
        For frequency counts and caching

    Complexities:
        Time (Insert/Lookup/Delete) = O(1) average, O(n) worst
        Space = O(n)

    How it Works:
        Hash functions maps a key to an index/value
        Handles collisions via chaining/open addressing

    Ex:
        import java.util.HashMap;
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 2);
        map.get("apple"); // O(1) average

    */

    /*
    
    Heap (Priority Queue)

    When to Use:
        When you need the min/max quickly and repeatedly
        Dijkstra's algorithm, scheduling

    Complexities:
        Time (Insert/Extract Min or Max) = O(log n)
        Time (Peek) = O(1)
        Space = O(n)

    How it Works:
        Complete binary tree stored in an array
        Parent is smaller or greater than its children

    Ex:
        import java.util.PriorityQueue;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.poll();  // removes smallest element

    */

    /*
    
    Tree (Binary Search Tree or BST)

    When to Use:
        Sorted data with fast lookup/insert/delete, especially when balanced

    Complexities:
        Time Balanced BST (Search/Insert/Delete) = O(log n)
        Time Unbalanced BST (Search/Insert/Delete) = O(n)
        Space = O(n)

    How it Works:
        Left subtree contains values less than the current node
        Right subtree contains values greater than the current node
        Rules apply to all nodes in the BST
        Balanced trees have subtrees of similar height
        Unbalanced trees have subtrees that difffer in height significantly

    Ex:
        class TreeNode {
            int val;
            TreeNode left, right;
            TreeNode(int val) { this.val = val; }
        }

    */

    /*
    
    Graph

    When to Use:
        Relationships/networks (social graphs, maps)
        Pathfinding and dependencies

    Complexities:
        Adjacency List:
            Time (BFS/DFS) = O(V+E)
            Space = O(V+E)
        Matrix:
            Time (Edge Lookup) = O(1)
            Space = O(V^2)
    
    How it Works:
        Nodes are vertices and they have edges defining a relationship
        Represented as an adjacency list or a matrix
    
    Ex:
        import java.util.*;
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));


    */
}
