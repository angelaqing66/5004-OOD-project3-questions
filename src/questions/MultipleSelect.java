package questions;

import java.util.Arrays;

public class MultipleSelect extends QuestionAbstract{
    private final String[] correctAnswer;
    private final String[] options;

    public MultipleSelect(String text, String[] correctAnswer,String[] options){
        super(text);
        if (options.length > 8 || options.length <3) {
            throw new IllegalArgumentException("A question must have at least 3 options, but no more than 8.");
        }
        this.correctAnswer = correctAnswer;
        this.options = options;
    }

    public String answer(String[] answer) {
        if (Arrays.equals(answer,correctAnswer)) {
            return "Correct";
        }
        return "Incorrect";
    }
}
