package questions;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LikertTest {

    /**
     * test if the code work when the answer is correct
     */
    @Test
    public void testLikertAnswerCorrect() {
        Likert likertQuestion = new Likert("How satisfied are you with the service?");

        String result = likertQuestion.answer("3");

        assertEquals("Correct", result);
    }

    /**
     * test if the code work when the answer is incorrect
     */
    @Test
    public void testLikertAnswerIncorrect() {

        Likert likertQuestion = new Likert("How satisfied are you with the service?");

        String result = likertQuestion.answer("6");

        assertEquals("Incorrect", result);
    }

    /**
     * test convert to text method
     */
    @Test
    public void testLikertQuestionText() {

        String questionText = "How satisfied are you with the service?";
        Likert likertQuestion = new Likert(questionText);

        String result = likertQuestion.getText();

        assertEquals(questionText, result);
    }
}
