package questions;

public class TrueFalse extends QuestionAbstract{
    private final String correctAnswer;
    public TrueFalse(String text, String correctAnswer) {
        super(text);
        this.correctAnswer = correctAnswer;
    }


    @Override
    public String answer(String answer) {
        if(answer.equals(correctAnswer)) {
            return "Correct";
        }
        return "Incorrect";
    }
}
