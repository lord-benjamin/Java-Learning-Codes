import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] userAnswers = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
        questions[1] = new Question(2, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Saturn", "Mars");
        questions[2] = new Question(3, "Who wrote 'To Kill a Mockingbird'?", "Harper Lee", "Mark Twain", "Ernest Hemingway", "F. Scott Fitzgerald", "Harper Lee");
        questions[3] = new Question(4, "What is the largest ocean on Earth?", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean", "Pacific Ocean");
        questions[4] = new Question(5, "Who painted the Mona Lisa?", "Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", "Claude Monet", "Leonardo da Vinci");
    }

    public void playQuiz() {
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + questions[i].getId() + ": " + questions[i].getQuestion());
            System.out.println("A. " + questions[i].getOpt1());
            System.out.println("B. " + questions[i].getOpt2());
            System.out.println("C. " + questions[i].getOpt3());
            System.out.println("D. " + questions[i].getOpt4());
            Scanner scanner = new Scanner(System.in);  // For taking
            System.out.print("Your answer: ");         // user
            userAnswers[i] = scanner.next();       // input
            if (userAnswers[i].equalsIgnoreCase(questions[i].getAnswer())) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! The correct answer is: " + questions[i].getAnswer());
            }
            System.out.println();
        }
    }
    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            if (userAnswers[i].equalsIgnoreCase(questions[i].getAnswer())) {
                score++;
            }
        }
        System.out.println("Your score: " + score + "/" + questions.length);
    }
}
