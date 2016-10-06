package net.vbot.domain;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnswerUtil {
	
	private static List<QA> questionList = new ArrayList<>();
	
	private static List<String> rejectList = null;
	
	private static String[] rejectArray = new String[]{"i","you","is","are","were","in","then","if","it","how","why","who","when"};
	
	static{
		questionList.add(new QA("hi" , "Hi. Welcome to Chase Customer Service. How can I help you?"));
		questionList.add(new QA("hello" , "Hi. Welcome to Chase Customer Service. How can I help you?"));
		questionList.add(new QA("hey" , "Hi. Welcome to Chase Customer Service. How can I help you?"));
		questionList.add(new QA("account" , "What do you want to know about the accounts?"));
		questionList.add(new QA("open account" , "Ok, I am more than happy to help. What kind of account you want to open?"));
		questionList.add(new QA("open checkings account" , "Please refer to http://www.chase.com/checkings"));
		questionList.add(new QA("open savings account" , "Please refer to http://www.chase.com/savings"));
		questionList.add(new QA("close account" , "Sorry to hear about that. I will sure help you on this."));
		
		/*questionList.add(new QA("" , ""));
		questionList.add(new QA("" , ""));
		questionList.add(new QA("" , ""));
		questionList.add(new QA("" , ""));
		questionList.add(new QA("" , ""));
		questionList.add(new QA("" , ""));
		questionList.add(new QA("" , ""));
		questionList.add(new QA("" , ""));*/
		
		rejectList = new ArrayList<>(Arrays.asList(rejectArray));
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		boolean end = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Initializing Bot!!!");
		while(!end){
			String question = scanner.nextLine();
			question = question.toLowerCase();
			if("end".equalsIgnoreCase(question)){
				end = true;
				System.out.println("Good bye!!!");
				continue;
			}
			System.out.println(getAnswers(question));
		}
	}
	
	public static String getAnswers(String question){
		String answer = "Sorry, I did not get that";
		List<String> filteredQuestion = getFilteredQuestion(question);
		int maxScore = 0;
		QA maxQA = null;
		for(QA qa: questionList){
			int score = qa.getScore(filteredQuestion);
			if(score > maxScore){
				maxScore = score;
				maxQA = qa;
			}
		}
		if(maxQA != null){
			answer = maxQA.getAnswer();
		}
		return answer;
	}
	
	private static List<String> getFilteredQuestion(String question){
		List<String> filteredList = new ArrayList<String>();
		String[] q = question.split("\\s");
		for(String q1: q){
			q1 = q1.toLowerCase();
			if(!rejectList.contains(q1))
				filteredList.add(q1);
		}
		return filteredList;
	}

}
