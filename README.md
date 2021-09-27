# CLI-Stackoverflow
A simple Stackoverflow command line build with java , Micronaut Framework, Picocli, and compiled to the native executable file with the GraalVM.

## Demo
```
java -jar build/libs/CLI-Stackoverflow-*-all.jar search --verbose -t java -q "Collections" 

Search command running...
-> 222|20 Printing Java Collections Nicely (toString Doesn&#39;t Return Pretty Output)
      https://stackoverflow.com/questions/395401/printing-java-collections-nicely-tostring-doesnt-return-pretty-output
-> 129|7 Hamcrest compare collections
      https://stackoverflow.com/questions/21624592/hamcrest-compare-collections
-> 120|7 Java Immutable Collections
      https://stackoverflow.com/questions/7713274/java-immutable-collections
-> 172|4 Big-O summary for Java Collections Framework implementations?
      https://stackoverflow.com/questions/559839/big-o-summary-for-java-collections-framework-implementations
-> 145|18 How to copy Java Collections list
      https://stackoverflow.com/questions/689370/how-to-copy-java-collections-list
-> 148|10 Why aren&#39;t Java Collections remove methods generic?
      https://stackoverflow.com/questions/104799/why-arent-java-collections-remove-methods-generic
-> 154|5 Java 8: performance of Streams vs Collections
      https://stackoverflow.com/questions/22658322/java-8-performance-of-streams-vs-collections
-> 137|12 What is the most efficient Java Collections library?
      https://stackoverflow.com/questions/629804/what-is-the-most-efficient-java-collections-library
-> 103|7 Google Guava isNullOrEmpty for collections
      https://stackoverflow.com/questions/6910002/google-guava-isnullorempty-for-collections
-> 114|9 Iterating over Java collections in Scala
      https://stackoverflow.com/questions/495741/iterating-over-java-collections-in-scala

Items size: 10 | Quota max: 300 | Quota remaining: 295 | Has more: true

```
