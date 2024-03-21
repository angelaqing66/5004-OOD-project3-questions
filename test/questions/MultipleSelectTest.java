package questions;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MultipleSelectTest {

    /**
     * test if the code work when the answer is correct
     */
    @Test
    public void testMultipleSelectAnswerCorrect() {
        MultipleSelect multipleSelectQuestion = new MultipleSelect("Select the vowels:", new String[]{"a", "e"}, new String[]{"a", "b", "c", "d", "e"});

        String[] correctAnswer = {"a", "e"};
        String result = multipleSelectQuestion.answer(correctAnswer);

        assertEquals("Correct", result);
    }
    /**
     * test if the code work when the answer is incorrect
     */
    @Test
    public void testMultipleSelectAnswerIncorrect() {
        MultipleSelect multipleSelectQuestion = new MultipleSelect("Select the vowels:", new String[]{"a", "b"}, new String[]{"a", "b", "c", "d", "e"});

        String[] incorrectAnswer = {"a", "b","e"};
        String result = multipleSelectQuestion.answer(incorrectAnswer);

        assertEquals("Incorrect", result);
    }
    /**
     * test convert to text method
     */
    @Test
    public void testMultipleSelectQuestionText() {
        String questionText = "Select the vowels:";
        MultipleSelect multipleSelectQuestion = new MultipleSelect(questionText, new String[]{"a", "e", "i"}, new String[]{"a", "b", "c", "d", "e"});

        String result = multipleSelectQuestion.getText();

        assertEquals(questionText, result);
    }
}
