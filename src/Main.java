import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] choices = { "rock", "paper", "scissor" };

        int attempts = 10;
        int userScore = 0;
        int computerScore = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rock Paper Scissor game \uD83D\uDE0A");
        System.out.println("===============================");

        while (attempts > 0) {
            String computerChoice = listShuffler(choices);

            System.out.println("Attempts left: " + attempts);

            System.out.print("Enter your choice: ");
            String userChoice = scanner.nextLine();

            if (!userChoice.toLowerCase().equals("rock") && !userChoice.toLowerCase().equals("paper") && !userChoice.toLowerCase().equals("scissor")) {
                System.out.println("Invalid input!!");
                continue;
            }

            if (userChoice.toLowerCase().equals(computerChoice.toLowerCase())) {
                System.out.println("Your choice: " + userChoice + "  |  " + "Computer choice: " + computerChoice);
                System.out.println("Draw!!");

            } else if (userChoice.toLowerCase().equals("rock") && computerChoice.toLowerCase().equals("paper")) {
                System.out.println("Your choice: " + userChoice + "  |  " + "Computer choice: " + computerChoice);
                System.out.println("Computer won");
                computerScore++;

            } else if (userChoice.toLowerCase().equals("paper") && computerChoice.toLowerCase().equals("scissor")) {
                System.out.println("Your choice: " + userChoice + "  |  " + "Computer choice: " + computerChoice);
                System.out.println("Computer won");
                computerScore++;

            } else if (userChoice.toLowerCase().equals("scissor") && computerChoice.toLowerCase().equals("rock")) {
                System.out.println("Your choice: " + userChoice + "  |  " + "Computer choice: " + computerChoice);
                System.out.println("Computer won");
                computerScore++;

            } else {
                System.out.println("Your choice: " + userChoice + "  | " + "Computer choice: " + computerChoice);
                System.out.println("You won");
                userScore++;
            }
            System.out.println("*************");



            attempts--;

        }

        if (userScore > computerScore) {
            System.out.println("Your userScore: " + userScore);
            System.out.println("You won the game congratulations 🎇");
        }  else
            System.out.println("You lost the game 😢");

    }

    public static String listShuffler(String[] choices) {
        // Convert array to list
        List<String> choicesList = new ArrayList<>(Arrays.asList(choices));
        Collections.shuffle(choicesList);

        // Convert list back to array
        String[] randomizedChoices = choicesList.toArray(new String[choicesList.size()]);
        String RandomChoice = "";

        for (String choice : randomizedChoices) {
            RandomChoice = choice;
        }

        return RandomChoice;
    }
}