package questions;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TrueFalseTest {
    @Test
    public void testTrueAnswer() {
        TrueFalse trueFalseQuestion = new TrueFalse("Is the sky blue?", "True");

        String result = trueFalseQuestion.answer("True");

        assertEquals("Correct", result);
    }

    @Test
    public void testFalseAnswer() {
        TrueFalse trueFalseQuestion = new TrueFalse("Is the sky blue?", "True");

        String result = trueFalseQuestion.answer("False");

        assertEquals("Incorrect", result);
    }

    @Test
    public void testQuestionText() {
        String questionText = "Is the sky blue?";
        TrueFalse trueFalseQuestion = new TrueFalse(questionText, "True");

        String result = trueFalseQuestion.getText();

        assertEquals(questionText, result);
    }
}
