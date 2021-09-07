# simple-addition-quiz

My solution for Chapter 5 Exercise 6 of “Introduction to Programming Using Java”.
Implementation note: At the time I originally did this exercise, I implemented it in a way that I would now consider
less than ideal. However, I am leaving it as-is to demonstrate my progression.
The current implementation could be made considerably better both in computation time and readability.
If I were to rewrite the class, I would make an AdditionQuestion [] instance variable that could be
accessed by the methods of the AdditionQuiz.java class.

Problem Description:
Exercise 4.8 asked you to write a program that administers a 10-question addition quiz.
Rewrite that program so that it uses the following class to represent addition questions:
public class AdditionQuestion {
private int a, b; // The numbers in the problem.
public AdditionQuestion() { // constructor
a = (int)(Math.random() * 50 + 1);
b = (int)(Math.random() * 50);
}
public String getQuestion() {
return "What is " + a + " + " + b + " ?";
}
public int getCorrectAnswer() {
return a + b;
}
}

Note: Relies on the TextIO.java, intQuestion.java, and AdditionQuestion.java classes provided by the textbook's author.
