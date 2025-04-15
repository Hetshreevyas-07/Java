package chapter5;

public class ch55 {
    //string is immutable
    // 2. StringBuffer (Mutable and Thread-Safe)
    // Can change content without creating a new object.
    
    // Safe to use in multi-threaded environments.
    
    // Slower than StringBuilder due to synchronization.
    
    // Example:
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");  // No new object
        System.out.println(sb);  // Output: Hello World
    // 3. StringBuilder (Mutable but Not Thread-Safe)
    // Same as StringBuffer but not synchronized, so it's faster.
    // Use it in single-threaded programs.
        StringBuilder s = new StringBuilder("Hello");
    s.append(" shree");
    System.out.println(s);  // Output: Hello shree

    }
}

// 🔹 Difference Between String, StringBuffer, and StringBuilder (Point-wise)
// 1. Mutability
// ✅ String is Immutable — once created, it cannot be changed.

// ✅ StringBuffer is Mutable — you can change the content.

// ✅ StringBuilder is Mutable — just like StringBuffer.

// 2. Thread-Safety
// ❌ String is Not Thread-Safe.

// ✅ StringBuffer is Thread-Safe (uses synchronization).

// ❌ StringBuilder is Not Thread-Safe.

// 3. Performance
// 🐢 String is Slow when many changes are made (due to new object creation).

// 🐌 StringBuffer is Slower than StringBuilder (because of synchronization).

// ⚡ StringBuilder is the Fastest (no synchronization overhead).

// 4. Use Case
// 📄 Use String when the string will not change (constant data).

// 🔐 Use StringBuffer when you need to modify strings in multi-threaded programs.

// 🚀 Use StringBuilder when you need fast string manipulation in single-threaded programs.

