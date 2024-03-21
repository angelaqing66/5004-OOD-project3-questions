package questions;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MultipleChoiceTest {

    /**
     * test if the code work when the answer is correct
     */
    @Test
    public void testMultipleChoiceAnswerCorrect() {
        MultipleChoice multipleChoiceQuestion = new MultipleChoice("What is the capital of France?", "2", new String[]{"1", "2", "3", "4"});

        String result = multipleChoiceQuestion.answer("2");

        assertEquals("Correct", result);
    }

    /**
     * test if the code work when the answer is incorrect
     */
    @Test
    public void testMultipleChoiceAnswerIncorrect() {
        MultipleChoice multipleChoiceQuestion = new MultipleChoice("What is the capital of France?", "2", new String[]{"1", "2", "3", "4"});

        String incorrectAnswer = "1";
        String result = multipleChoiceQuestion.answer(incorrectAnswer);

        assertEquals("Incorrect", result);
    }

    /**
     * test convert to text method
     */
    @Test
    public void testMultipleChoiceQuestionText() {
        String questionText = "What is the capital of France?";
        MultipleChoice multipleChoiceQuestion = new MultipleChoice(questionText, "2", new String[]{"1", "2", "3", "4"});

        String result = multipleChoiceQuestion.getText();

        assertEquals(questionText, result);
    }
}
