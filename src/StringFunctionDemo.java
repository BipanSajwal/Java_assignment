public class StringFunctionsDemo {
    public static void main(String[] args) {
        String name = "HelloWorld";

        String lowercase = name.toLowerCase();
        System.out.println("Lowercase: " + lowercase);

        String uppercase = name.toUpperCase();
        System.out.println("Uppercase: " + uppercase);

        String otherName = "HelloWorld";
        boolean isEqual = name.equals(otherName);
        System.out.println("Equals: " + isEqual);
        String anotherName = "helloworld";
        boolean isEqualIgnoreCase = name.equalsIgnoreCase(anotherName);
        System.out.println("Equals Ignore Case: " + isEqualIgnoreCase);

        char characterAtIndex = name.charAt(3);
        System.out.println("Character at index 3: " + characterAtIndex);

        int indexOfW = name.indexOf('W');
        System.out.println("Index of 'W': " + indexOfW);

        boolean containsWorld = name.contains("World");
        System.out.println("Contains 'World': " + containsWorld);

        int length = name.length();
        System.out.println("Length: " + length);
    }
}
