package questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Likert extends QuestionAbstract {
    private final ArrayList<String> validAnswer;

    public Likert (String text) {
        super(text);
        validAnswer = new ArrayList<>(Arrays.asList("1","2","3","4","5"));
    }
    @Override
    public String answer(String answer) {
        if(validAnswer.contains(answer)) {
            return "Correct";
        }
        return "Incorrect";
    }
}
