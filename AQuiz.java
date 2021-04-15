package Practice;
import javax.swing.JOptionPane;
public class AQuiz {

        private int firstNumber;
        private int secondNumber;
        private int thirdNumber;
        private int userAnswer;
        private int questionNumber;
        private int score;
        private int numberOfCorrectAnswers;
        private int numberOfWrongAnswers;


        public void increaseScore(){
            score++;
            numberOfCorrectAnswers++;
        }

        public void decreaseScore(){
            score--;
            numberOfWrongAnswers++;
        }

        public void generateNumbers() {
            firstNumber = (int) (System.currentTimeMillis() % 10);
            secondNumber = (int)(System.currentTimeMillis()/5 % 10);
            thirdNumber = (int)(System.currentTimeMillis()/100 %10);

        }
        public void displayScore() {
            String message = String.format("Your Current Score is %d%n", score);
            JOptionPane.showMessageDialog(null, message);
        }
        public void displayQuiz() {
            questionNumber++;
            String message = String.format("%d. What is the value of %d + %d + %d?%n",questionNumber, firstNumber, secondNumber, thirdNumber);
            userAnswer = Integer.parseInt(JOptionPane.showInputDialog(message));
        }
        public void markQuiz() {
            int correctAnswer = firstNumber + secondNumber + thirdNumber;
            if (userAnswer == correctAnswer){
                increaseScore();
                JOptionPane.showMessageDialog(null, "Correct Answer");
                displayScore();
            }
            if (userAnswer != correctAnswer) {
                decreaseScore();
                JOptionPane.showMessageDialog(null, "Wrong Answer");
                displayScore();
            }
        }
        public void displayFinalMessage() {
            String message = String.format("Congrats, You got %d out of 10 Questions right %n You got %d questions wrong,%n You score is %d", numberOfCorrectAnswers, numberOfWrongAnswers, score);
            JOptionPane.showMessageDialog(null, message);
            System.exit(0);
        }
        public void generateQuiz() {
            generateNumbers();
            displayQuiz();
            markQuiz();
        }
        public void startAddtionQuiz() {
            generateQuiz();
            generateQuiz();
            generateQuiz();
            generateQuiz();
            generateQuiz();
            generateQuiz();
            generateQuiz();
            generateQuiz();
            generateQuiz();
            generateQuiz();

            displayFinalMessage();
        }
    }

