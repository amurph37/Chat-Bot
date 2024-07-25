import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        ChatBot bot = new ChatBot();
        bot.greetUser(); // Call the method to greet the user
        String name = bot.askName(); // Call the method to ask the user's name and store the response
        bot.repeatName(name); // Call the method to repeat the user's name
        int age = bot.guessAge(); // Call the method to guess the user's age and store the result
        bot.countToNumber(); // Call the method to count to a number provided by the user
        bot.testProgrammingKnowledge(); // Call the method to test the user's programming knowledge
        bot.tellStory(name, age); // Call the method to tell a story about the user using their name and age
    }

    // Method to greet the user
    public void greetUser() {
        System.out.println("Hello! I am your friendly chatbot.");
    }

    // Method to ask for the user's name and return it
    public String askName() {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("What is your name? "); // Prompt the user for their name
        return scanner.nextLine(); // Read and return the user's name
    }

    // Method to repeat the user's name back to them
    public void repeatName(String name) {
        System.out.println("Nice to meet you, " + name + "!");
    }

    // Method to guess the user's age using remainders
    public int guessAge() {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        // Ask for the remainder when the user's age is divided by 3, 5, and 7
        System.out.print("Enter the remainder of your age when divided by 3: ");
        int remainder3 = scanner.nextInt();
        System.out.print("Enter the remainder of your age when divided by 5: ");
        int remainder5 = scanner.nextInt();
        System.out.print("Enter the remainder of your age when divided by 7: ");
        int remainder7 = scanner.nextInt();

        // Calculate the user's age using the remainders
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "!");
        return age; // Return the guessed age
    }

    // Method to count to a number provided by the user
    public void countToNumber() {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter a number and I will count to it: "); // Prompt the user for a number
        int number = scanner.nextInt(); // Read the number

        // Use a for loop to count from 1 to the user's number
        for (int i = 1; i <= number; i++) {
            System.out.println(i); // Print each number
        }
    }

    // Method to test the user's programming knowledge
    public void testProgrammingKnowledge() {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
        // Provide multiple-choice options
        System.out.println("1: int num;");
        System.out.println("2: num int;");
        System.out.println("3: float num;");
        System.out.println("4: String num;");

        boolean correct = false; // Initialize a boolean variable to track if the correct answer is given
        // Use a while loop to keep asking until the correct answer is given
        while (!correct) {
            int answer = scanner.nextInt(); // Read the user's answer
            switch (answer) { // Check the answer
                case 1:
                    System.out.println("Correct!"); // Correct answer
                    correct = true; // Set the boolean to true to exit the loop
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Incorrect. Try again."); // Incorrect answers
                    break;
                default:
                    System.out.println("Please choose a number between 1 and 4."); // Invalid input
            }
        }
    }

    // Method to tell a story about the user using their name and age
    public void tellStory(String name, int age) {
        System.out.println("Here's a little story about you, " + name + ".");
        System.out.println("Once upon a time, there was a person named " + name + " who was " + age + " years old.");
        System.out.println(name + " loved learning about Java programming and enjoyed solving problems.");
        System.out.println("One day, " + name + " decided to build a chatbot to help others learn Java.");
        System.out.println("And that chatbot is talking to you right now! The end.");
    }
}
