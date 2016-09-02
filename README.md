# selections
This repository contains instructions and questions for IEEECS, VIT 2nd year selections 2016.

[ If you are new to github, click here ](https://guides.github.com/activities/hello-world/)

## General instructions
1. Fork this repository.
2. Solve the questions in a language of your choice. Extra points if you derive the complexity of your algorithm in asymptotic notation. ( Big-O notation )
3. Commit and push your code. If you are not able to complete all the questions, submit a partial solution.
4. [ Submit a link to your forked repository here ]( http://ieeecsvit-recruitments.herokuapp.com )

## Rules
1. *any* programming language can be used. Even bash or powershell scripts are fine. Extra points for using a functional programming language.
2. Use only the standard library of said language. For example, in python, use only the the standard modules ( os, collections, math, sys etc. ). 
3. Plagiarism without proper citation will lead to disqualification.
4. If you do use someone's code, cite the source.

## Judging Criteria
1. *Correctness.* Does your code meet the specifications ?
2. *Code quality.* How well does your code adhere to your language's standards.
3. *Efficiency.* Is your solution the best way to solve the problem ?

## Questions

### Duplicate
In a list of numbers, find the only element that occurs once. All other elements are guaranteed to only occur twice.

Example
```
Input: 2 5 7 6 5 7 2
Output: 6
```

### Entropy

Given 2 numbers compute the bit difference between them. 

Bit difference of a pair (x, y) is the count of different bits at the same positions in binary representations of x and y. 
For example, bit difference for 2 and 7 is 2. Binary representation of 2 is 010 and 7 is 111 (first and last bits differ in two numbers).

Note: Extra points for finding a non brute force solution ( O(n) or O(logn) )

Example
```
Input: 2 7
Output: 2
```

###  getElementsByClassName

Read the given HTML file and and print contents of all tags that have a particular class.

Hint: There are multiple ways to do this ( Regular Expressions, XML parsing, character by character processing and so on )


Ex.
Input: index.html active
```
<!-- index.html -->
<!doctype html>
<html>

<body>
<button class="button active"> click me! </button>

<section>
<h2> Hello, World </h2>
<p class="active"> I am active. </p>
</section>

</body>
</html>
```
Output: 
```
click me!
I am active.
```


