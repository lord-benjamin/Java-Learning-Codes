public class string {
    public static void main(String[] args) {
        // String name = new String("Alex");
        String name = "Alex";
        System.out.println("Hello " + name);
        System.out.println("Length: " + name.length());  // length of the string
        System.out.println("Character at index 2: " + name.charAt(2)); // character at index 2
        System.out.println("Index of 'e': " + name.indexOf('e')); // index of character 'e'
        System.out.println("Substring from index 1 to 3: " + name.substring(1,4)); // substring from index 1 to 3
        System.out.println("Uppercase: " + name.toUpperCase()); // convert to uppercase
        System.out.println("Lowercase: " + name.toLowerCase()); // convert to lowercase
        System.out.println("Equals 'Alex': " + name.equals("Alex")); // check if name is equal to "Alex"
        System.out.println("Equals 'alex' (ignore case): " + name.equalsIgnoreCase("alex")); // check if name is equal to "alex" ignoring case
        System.out.println("Starts with 'Al': " + name.startsWith("Al")); // check if name starts with "Al"
        System.out.println("Ends with 'ex': " + name.endsWith("ex")); // check if name ends with "ex"
        System.out.println("Replace 'e' with 'a': " + name.replace('e', 'a')); // replace 'e' with 'a'
        System.out.println("Contains 'lex': " + name.contains("lex")); // check if name contains "lex"
        System.out.println("Is empty: " + name.isEmpty()); // check if name is empty
        System.out.println("Concat with ' Smith': " + name.concat(" Smith")); // concatenate with " Smith"

        // String mutability
        String original = "Hello";   // Strings are immutable
        String modified = original.concat(" World");
        System.out.println(original); // Output: Hello
        System.out.println(modified); // Output: Hello World

        // StringBuffer for mutable strings
        StringBuffer sb = new StringBuffer("Hello");  // Thread-safe mutable string
        System.out.println(sb.capacity()); // Output: 16+5 (default capacity : 16 (buffer))
        sb.append(" World");
        System.out.println(sb);
        String str = sb.toString(); // Convert StringBuffer to String
        System.out.println(str);

        // StringBuilder for mutable strings
        StringBuilder sbuilder = new StringBuilder("Hello"); // Non-thread-safe mutable string
        sbuilder.append(" World");
        System.out.println(sbuilder);
    }
}