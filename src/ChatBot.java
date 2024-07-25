import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        ChatBot bot = new ChatBot();
        bot.greetUser();
        String name = bot.askName();
        bot.repeatName(name);
        int age = bot.guessAge();
        bot.countToNumber();
        bot.testProgrammingKnowledge();
        bot.tellStory(name, age);
    }

    public void greetUser() {
        System.out.println("Hello! I am your friendly chatbot.");
    }

    public String askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        return scanner.nextLine();
    }

    public void repeatName(String name) {
        System.out.println("Nice to meet you, " + name + "!");
    }

    public int guessAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the remainder of your age when divided by 3: ");
        int remainder3 = scanner.nextInt();
        System.out.print("Enter the remainder of your age when divided by 5: ");
        int remainder5 = scanner.nextInt();
        System.out.print("Enter the remainder of your age when divided by 7: ");
        int remainder7 = scanner.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "!");
        return age;
    }

    public void countToNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number and I will count to it: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    public void testProgrammingKnowledge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
        System.out.println("1: int num;");
        System.out.println("2: num int;");
        System.out.println("3: float num;");
        System.out.println("4: String num;");

        boolean correct = false;
        while (!correct) {
            int answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("Correct!");
                    correct = true;
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Incorrect. Try again.");
                    break;
                default:
                    System.out.println("Please choose a number between 1 and 4.");
            }
        }
    }

    public void tellStory(String name, int age) {
        System.out.println("Here's a little story about you, " + name + ".");
        System.out.println("Once upon a time, there was a person named " + name + " who was " + age + " years old.");
        System.out.println(name + " loved learning about Java programming and enjoyed solving problems.");
        System.out.println("One day, " + name + " decided to build a chatbot to help others learn Java.");
        System.out.println("And that chatbot is talking to you right now! The end.");
    }
}
