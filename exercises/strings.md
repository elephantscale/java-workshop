# Strings

https://github.com/elephantscale/learning-coding/blob/master/string.md

### STR-01: Tokenize a sentence into words

```java
String s1 = "I love Java";
```

The above sentence should be split into 3 words : `I,  love, Java`

How about if the sentence has multiple spaces 

```java
String s1 = "I        love Java";
```

Will your code work?

### Hints:

* Look at `String.split` function.
* Delimiter can be a regex `\\s`

### STR-02: Find the longest word in a sentence

If Input sentence is:

"Our Solar system has eight planets"

The answer is "planets"

Extend on this, if you have multiple words with max-length, print them all out

For example,

`one two three four five six seven`

print out : `three`  and `seven`

### STR-03: swap comma(,) and dots(.) in a string

```text
input : "10,300,321.900.8"
output: "10.300.321,900,8"
```

### STR-04 - Strip all non alpha-num characters from a string

```text
input : 'hello123!#.'
output : 'hello123'
```