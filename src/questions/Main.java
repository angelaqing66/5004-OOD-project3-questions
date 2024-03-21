package questions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Question trueFalseQuestion1 = new TrueFalse("Is the sky blue?", "True");
        Question multipleChoiceQuestion1 = new MultipleChoice("Choose the correct option:", "1", new String[]{"1", "2", "3"});
        Question trueFalseQuestion2 = new TrueFalse("Is Java a programming language?", "True");
        Question likertQuestion = new Likert("Rate your satisfaction:");

        // Put the Question objects into an array
        Question[] questionnaire = {trueFalseQuestion1, multipleChoiceQuestion1, trueFalseQuestion2, likertQuestion};

        // Sort the array using Arrays.sort()
        Arrays.sort(questionnaire);

        // Print the sorted array
        for (Question question : questionnaire) {
            System.out.println(question.getText());
        }
    }
}