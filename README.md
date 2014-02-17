# MathProblemGenerator

the main classes are 

 - `Quizzer`, which maintains a list of `Problem`s, and generates new ones, and maintains a integer score
 - `Problem`, which holds an `Expression`, takes a proposed answer and returns a non-zero score if the answer is correct
 - `Expression`, which is a tree where non-leaf nodes are operators, and leaf nodes are operands

![Expression tree example](http://i.imgur.com/W4wo1DM.png)
