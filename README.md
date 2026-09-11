# ☕ Java Developer Interview Practice

A structured collection of **Java Developer Interview Practice Questions** covering the fundamentals of **OOPs, Arrays, Linked Lists, Stacks, and Queues**.

This repository is designed for students and beginner Java developers preparing for **Java interviews, coding rounds, and technical discussions**.

> **Topics Covered:** OOPs • Arrays • Linked Lists • Stack • Queue

---

## 📚 Question Overview

| Part      | Topic       | Questions |
| --------- | ----------- | --------: |
| Part 1    | OOPs        |        30 |
| Part 2    | Array       |        15 |
| Part 3    | Linked List |        12 |
| Part 4    | Stack       |         6 |
| Part 5    | Queue       |         7 |
| **Total** |             |   **70+** |

> **Note:** The original question list is numbered up to **71** because question **31 is missing**. The actual list contains **70 questions**.

---

# PART 1 — OOPs

**30 Questions**

### Theory

1. What is OOPs? Explain its four pillars with real-life examples.
2. What is a class in Java? Create a simple `Student` class.
3. What is an object? How do you create an object in Java?
4. What is the difference between a class and an object?
5. What is a constructor? Why do we use constructors?
6. What is the difference between a constructor and a method?
7. What is a default constructor?
8. What is a parameterized constructor? Write an example.
9. What is the use of the `this` keyword?
10. What is the difference between instance variable, local variable and static variable?
11. What is encapsulation? Why is it important in Java?
12. How do you achieve encapsulation in Java?
13. Why are class variables commonly declared `private`?
14. What are getter and setter methods?
15. What is inheritance? Explain with a real-world example.
16. What is the use of the `extends` keyword?
17. Explain single-level, multilevel and hierarchical inheritance.
18. What is polymorphism?
19. What is compile-time polymorphism?
20. What is method overloading?
21. Write a Java program demonstrating method overloading.
22. Can we overload a method by changing only its return type? Explain.
23. What is method overriding? Write a Java program demonstrating it.
24. What is abstraction?
25. What is an abstract class?
26. Can we create an object of an abstract class? Why?
27. What is an interface? How is it different from an abstract class?

### Coding

28. **CODING:** Create a `Student` class with `name`, `rollNo`, `marks`, parameterized constructor and `displayStudent()` method.

29. **CODING:** Create a `BankAccount` class using encapsulation with:

* `accountNumber`
* `accountHolder`
* `balance`
* `deposit()`
* `withdraw()`
* `displayBalance()`

30. **CODING:** Create a parent class `Employee` and child classes `Developer` and `Tester`. Demonstrate inheritance and method overriding.

---

# PART 2 — ARRAY

**15 Questions**

### Theory

32. What is an array? Why is it called a linear data structure?
33. How do you declare and initialize an array in Java?
34. What is the index of the first element in an array?
35. What happens when you access an invalid array index?
36. What is the time complexity of accessing an element using its index?

### Coding

37. **CODING:** Find the largest element in an integer array.
38. **CODING:** Find the smallest element in an array.
39. **CODING:** Find the sum and average of all elements in an array.
40. **CODING:** Count the number of even and odd elements.
41. **CODING:** Reverse an array without using another array.
42. **CODING:** Find the second-largest element in an array.
43. **CODING:** Search for a given element using linear search.
44. **CODING:** Count how many times a particular number occurs in an array.
45. **CODING:** Find duplicate elements in an array.
46. **CODING:** Merge two integer arrays into a single array.

---

# PART 3 — LINKED LIST

**12 Questions**

### Theory

47. What is a Linked List?
48. What is a Node in a Linked List?
49. What is the difference between an Array and Linked List?
50. What is a Singly Linked List?
51. What is a Doubly Linked List?

### Coding

52. **CODING:** Create a `Node` class for a singly linked list and create:

```text
10 → 20 → 30 → 40
```

Display all elements.

53. **CODING:** Insert a new node at the beginning of a linked list.
54. **CODING:** Insert a new node at the end of a linked list.
55. **CODING:** Insert a node at a given position.
56. **CODING:** Delete the first node from a linked list.
57. **CODING:** Delete the last node from a linked list.
58. **CODING:** Reverse a singly linked list.

---

# PART 4 — STACK

**6 Questions**

### Theory

59. What is a Stack? Explain the **LIFO** principle with a real-life example.
60. Explain `push()`, `pop()`, `peek()` and `isEmpty()` operations.

### Coding

61. **CODING:** Implement a Stack using an array.
62. **CODING:** Implement a Stack using a Linked List.
63. **CODING:** Reverse an array using a Stack.
64. **CODING:** Check whether brackets are balanced using a Stack.

---

# PART 5 — QUEUE

**7 Questions**

### Theory

65. What is a Queue? Explain the **FIFO** principle with a real-life example.
66. Explain `enqueue()`, `dequeue()`, `peek()` and `isEmpty()` operations.
67. What is the difference between a Stack and Queue?

### Coding

68. **CODING:** Implement a Queue using an array.
69. **CODING:** Implement a Queue using a Linked List.
70. **CODING:** Create a Customer Service Queue and serve customers using FIFO order.
71. **INTERVIEW CODING:** Implement a Queue and demonstrate:

```text
enqueue(10)
enqueue(20)
enqueue(30)
peek()
dequeue()
enqueue(40)
dequeue()
peek()
```

Show the Queue after every operation.

---

# 📝 Student Practice Guidelines

## 1. Theory Questions

For every theory question:

* Explain the concept in your **own words**.
* Give a **simple real-life or Java example**.
* Mention important keywords where applicable.
* Try to answer without memorizing the definition.

### Example

Instead of memorizing:

> Encapsulation is the process of wrapping data and methods into a single unit.

Try explaining it naturally:

> Encapsulation means keeping data and the methods that work on that data together inside a class and controlling access to the data using access modifiers like `private`.

---

## 2. Coding Questions

For every coding problem, follow this structure:

### Problem

Clearly understand what the problem is asking.

### Approach

Explain the logic before writing the code.

### Code

Write a clean and readable Java solution.

### Expected Output

Show what the program should print.

### Complexity

Always identify:

* **Time Complexity**
* **Space Complexity**

---

## 3. Explain Your Code Line by Line

After completing a coding problem, practice explaining your code as if you are sitting in an interview.

Be prepared to answer:

* Why did you create this variable?
* Why did you use this loop?
* Why did you initialize it this way?
* What happens if the input is empty?
* What happens if there is only one element?
* Can this solution be optimized?
* What is the time complexity?
* What is the space complexity?

---

# ⚠️ Edge Cases to Practice

For every coding problem, consider the following cases:

* Empty input
* One element
* Two elements
* Duplicate elements
* Negative numbers
* Zero
* Already sorted input
* Reverse-sorted input
* Very large input
* Invalid input where applicable

---

# 🎯 Interview Preparation Strategy

A good way to practice these questions is to follow this progression:

```text
Understand
    ↓
Explain
    ↓
Write Code
    ↓
Test
    ↓
Find Edge Cases
    ↓
Analyze Complexity
    ↓
Explain Code
    ↓
Practice Without Looking
```

---

# 📊 Recommended Practice Order

### Beginner

Start with:

1. OOPs fundamentals
2. Classes and Objects
3. Constructors
4. Encapsulation
5. Inheritance
6. Method Overloading
7. Method Overriding
8. Arrays
9. Linked List basics
10. Stack and Queue basics

### Intermediate

Then practice:

* Array reversal
* Second-largest element
* Duplicate elements
* Linked List insertion
* Linked List deletion
* Linked List reversal
* Stack implementation
* Queue implementation
* Balanced brackets

### Interview Level

Finally, practice solving the coding questions **without looking at previous solutions** and explain every solution verbally.

---

# 💻 Suggested Repository Structure

```text
java-developer-interview-practice/
│
├── README.md
│
├── OOPs/
│   ├── Q01_OOPs.java
│   ├── Q02_Class.java
│   ├── Q03_Object.java
│   ├── ...
│   └── Q30_InheritanceOverriding.java
│
├── Array/
│   ├── Q32_ArrayBasics.java
│   ├── Q37_LargestElement.java
│   ├── Q38_SmallestElement.java
│   ├── ...
│   └── Q46_MergeArrays.java
│
├── LinkedList/
│   ├── Q47_LinkedList.java
│   ├── Q52_CreateLinkedList.java
│   ├── Q53_InsertBeginning.java
│   ├── ...
│   └── Q58_ReverseLinkedList.java
│
├── Stack/
│   ├── Q59_StackBasics.java
│   ├── Q61_StackUsingArray.java
│   ├── Q62_StackUsingLinkedList.java
│   ├── Q63_ReverseArray.java
│   └── Q64_BalancedBrackets.java
│
└── Queue/
    ├── Q65_QueueBasics.java
    ├── Q68_QueueUsingArray.java
    ├── Q69_QueueUsingLinkedList.java
    ├── Q70_CustomerServiceQueue.java
    └── Q71_InterviewQueue.java
```

---

# 🚀 Goal

The goal of this repository is not just to **write Java code**, but to develop the ability to:

* Understand Java fundamentals
* Solve problems logically
* Write clea
