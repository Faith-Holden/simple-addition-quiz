package solution;

import resource_classes.AdditionQuestion;
import resource_classes.TextIO;

public class AdditionQuiz {

    public void giveQuiz(){
        AdditionQuestion[] quizQs = makeQuiz();
        int[] responses = administerQuiz(quizQs);
        gradeQuiz(quizQs, responses);
    }

    public AdditionQuestion[] makeQuiz(){
        AdditionQuestion[] quiz = new AdditionQuestion[10];
        for(int i= 0; i<quiz.length; i++){
            quiz[i] =new AdditionQuestion();
        }
        return quiz;
    }
    public int[] administerQuiz(AdditionQuestion[] quiz){
        System.out.println("Hello, I'm going to give you a short quiz to test your basic addition skills.");
        int counter = 0;
        int [] answerArray = new int[10];
        while (counter<10){
            System.out.println("Here is question #"+(counter+1));
            System.out.println(quiz[counter].getQuestion());
            System.out.println("Please type your answer.");
            int answer = TextIO.getlnInt();
            answerArray[counter] = answer;
            counter++;
        }
        return answerArray;
    }
    public void gradeQuiz(AdditionQuestion[] quiz, int[] responses){
        System.out.println("Ok. I've graded your quiz.");
        int quizScore = 0;
        int counter = 0;
        while (counter<10){
            System.out.println("Question #"+(counter+1)+ " was:");
            System.out.println(quiz[counter].getQuestion());
            System.out.print("Your response was "+ responses[counter] + ", which is ");
            if(responses[counter]==quiz[counter].getCorrectAnswer()){
                System.out.println("correct!");
                quizScore+=10;
            }else {
                System.out.println("incorrect.");
            }
            counter++;
        }
        System.out.println("Your total score was " + quizScore);
    }

}
