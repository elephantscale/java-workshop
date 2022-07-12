# Benchmarks

## BENCH-01: Measure insert speed in collections

You may try collections like : Array, ArrayList, Hashmap, Set, Vector, LinkedList

Insert 1 million items.

- could be random integers
- or random strings
- or User instances

Measure the time for insert.  Which one is the fastest collection for insert?

Timing code in Java

```java
import java.text.NumberFormat;

long t1 = System.currentMillis();
// do your operation here
long t2 = System.currentMillis();

System.out.println ("Time took (ms): " +  NumberFormat.getInstance().format(t2-t1) );
```

## BENCH-02: Measure iterate time in collections

This one builds on `bench-01`

Once you built your collection, traverse the entire collection.  

Which one is the fastest?

## BENCH-03: Search performance

This one builds on `bench-01`

Once you built your collection, search for a specific item (e.g. integer 1000, or userName `user-1000`)

Which collection is fastest for searching?