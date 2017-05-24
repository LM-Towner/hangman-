package hangman;

public class Hangman {


    public static void main(String[] args) {
        Game game = new Game("Fun");
        Prompter prompter = new Prompter(game);
        prompter.displayProgress();
        boolean isHit = prompter.promptForGuess();
        if (isHit){
            System.out.println("You guessed a letter");
        }
        else{
            System.out.println("No letter this time");
        }
        prompter.displayProgress();
    }
    
}
