package questions;
public class MultipleChoice extends QuestionAbstract{
    private final String correctAnswer;
    private final String[] options;

    public MultipleChoice(String text, String correctAnswer,String[] options){
        super(text);
        if (options.length > 8 || options.length <3) {
            throw new IllegalArgumentException("A question must have at least 3 options, but no more than 8.");
        }
        this.correctAnswer = correctAnswer;
        this.options = options;
    }

    @Override
    public String answer(String answer) {
        if (answer.equals(correctAnswer)) {
            return "Correct";
        }
        return "Incorrect";
    }
}
