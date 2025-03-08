public class Conditionals {

    public static void main(String[] args) {
        Conditionals magic8ball = new Conditionals();
        magic8ball.PrintOptions();
    }

    // Variables:
    String question;
    int randomInt;

    // Constructor:
    public Conditionals() {

        // Choose a random question using an array
        String[] questions = {
                // BRUINS QUESTIONS
                "Did the Bruins really make an absolutely horrific mistake by trading Brad Marchand, even at 37?",
                "We cant justify trading away a player who has embodied their identity on the ice for so long, right?",
                "Don Sweeny and Cam neely cannot trade their fricking captain, no matter how good they think the move is, am I correct?",

                // REGULAR QUESTIONS
                "Should I take a nap?",
                "Will I get into the classes I want next year?",
                "Will I get enough sleep tonight?",
                "Should I read right now?",
                "Should I make dinner tonight?",
                "Should I do a sourdough inclusion loaf this weekend?"
        };


        // Select a random question from the array:
        int randomIndex = (int) (Math.random() * questions.length);
        question = questions[randomIndex];

        // Generate a random integer between 0 and 10:
        randomInt = (int) (Math.random() * 11);


    }

    // Method to print the response based on randomInt:
    public void PrintOptions() {
        System.out.println("You asked: " + question);
        System.out.print("Magic 8-Ball says: ");

        // If the question involves the Bruins or Don Sweeney and Cam Neely ALWAYS justify the horrific decision
        if (question.contains("Did the Bruins really make an absolutely horrific mistake by trading Brad Marchand, even at 37?") || question.contains("We cant justify trading away a player who has embodied their identity on the ice for so long, right?") || question.contains("Don Sweeny and Cam neely cannot trade their fricking captain, no matter how good they think the move is, am I correct?")){      //source:https://www.w3schools.com/js/js_comparisons.asp (also I know I don't have to put the entire question, but I did for my ease).
            System.out.println("Absolutely! Frick Don Sweeney and Cam Neely! They should be fired!");
        } else {
            // Regular random responses for other questions
            if (randomInt == 0) {
                System.out.println("Without a doubt.");
            } else if (randomInt == 1) {
                System.out.println("Better not tell you now.");
            } else if (randomInt == 2) {
                System.out.println("Very doubtful.");
            } else if (randomInt == 3) {
                System.out.println("As I see it, yes.");
            } else if (randomInt == 4) {
                System.out.println("Outlook not so good.");
            } else if (randomInt == 5) {
                System.out.println("Signs point to yes.");
            } else if (randomInt == 6) {
                System.out.println("Ask again later.");
            } else if (randomInt == 7) {
                System.out.println("Don't count on it.");
            } else if (randomInt == 8) {
                System.out.println("Absolutely!");
            } else {
                System.out.println("My sources say no.");
            }
        }
    }
}
