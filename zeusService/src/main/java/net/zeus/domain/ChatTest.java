package net.zeus.domain;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ChatTest {

	private static List<QA> questionList = new ArrayList<>();

	private static List<String> rejectList = null;

	private static String[] rejectArray = new String[] { "a", "about", "above", "across", "after", "again", "against",
			"all", "almost", "alone", "along", "already", "also", "although", "always", "among", "an", "and",
			"another", "any", "anybody", "anyone", "anything", "anywhere", "are", "area", "areas", "around", "as",
			"ask", "asked", "asking", "asks", "at", "away", "b", "back", "backed", "backing", "backs", "be", "became",
			"because", "become", "becomes", "been", "before", "began", "behind", "being", "beings", "best", "better",
			"between", "big", "both", "but", "by", "c", "came", "can", "cannot", "case", "cases", "certain",
			"certainly", "clear", "clearly", "come", "could", "d", "did", "differ", "different", "differently", "do",
			"does", "done", "down", "down", "downed", "downing", "downs", "during", "e", "each", "early", "either",
			"end", "ended", "ending", "ends", "enough", "even", "evenly", "ever", "every", "everybody", "everyone",
			"everything", "everywhere", "f", "face", "faces", "fact", "facts", "far", "felt", "few", "find", "finds",
			"first", "for", "four", "from", "full", "fully", "further", "furthered", "furthering", "furthers", "g",
			"gave", "general", "generally", "get", "gets", "give", "given", "gives", "go", "going", "good", "goods",
			"got", "great", "greater", "greatest", "group", "grouped", "grouping", "groups", "h", "had", "has", "have",
			"having", "he", "her", "here", "herself", "high", "high", "high", "higher", "highest", "him", "himself",
			"his", "how", "however", "i", "if", "important", "in", "interest", "interested", "interesting",
			"interests", "into", "is", "it", "its", "itself", "j", "just", "k", "keep", "keeps", "kind", "knew",
			"know", "known", "knows", "l", "large", "largely", "last", "later", "latest", "least", "less", "let",
			"lets", "like", "likely", "long", "longer", "longest", "m", "made", "make", "making", "man", "many", "may",
			"me", "member", "members", "men", "might", "more", "most", "mostly", "mr", "mrs", "much", "must", "my",
			"myself", "n", "necessary", "need", "needed", "needing", "needs", "never", "new", "new", "newer", "newest",
			"next", "no", "nobody", "non", "noone", "not", "nothing", "now", "nowhere", "number", "numbers", "o", "of",
			"off", "often", "old", "older", "oldest", "on", "once", "one", "only",  "opened", "opening",
			"opens", "or", "order", "ordered", "ordering", "orders", "other", "others", "our", "out", "over", "p",
			"part", "parted", "parting", "parts", "per", "perhaps", "place", "places", "point", "pointed", "pointing",
			"points", "possible", "present", "presented", "presenting", "presents", "problem", "problems", "put",
			"puts", "q", "quite", "r", "rather", "really", "right", "right", "room", "rooms", "s", "said", "same",
			"saw", "say", "says", "second", "seconds", "see", "seem", "seemed", "seeming", "seems", "sees", "several",
			"shall", "she", "should", "show", "showed", "showing", "shows", "side", "sides", "since", "small",
			"smaller", "smallest", "so", "some", "somebody", "someone", "something", "somewhere", "state", "states",
			"still", "still", "such", "sure", "t", "take", "taken", "than", "that", "the", "their", "them", "then",
			"there", "therefore", "these", "they", "thing", "things", "think", "thinks", "this", "those", "though",
			"thought", "thoughts", "three", "through", "thus", "to", "today", "together", "too", "took", "toward",
			"turn", "turned", "turning", "turns", "two", "u", "under", "until", "up", "upon", "us", "use", "used",
			"uses", "v", "very", "w", "want", "wanted", "wanting", "wants", "was", "way", "ways", "we", "well",
			"wells", "went", "were", "what", "when", "where", "whether", "which", "while", "who", "whole", "whose",
			"why", "will", "with", "within", "without", "work", "worked", "working", "works", "would", "x", "y",
			"year", "years", "yet", "you", "young", "younger", "youngest", "your", "yours", "z" };

	static {
		questionList.add(new QA("hi", new Answer("Hi. Welcome to Chase Customer Service. How can I help you?")));
		questionList.add(new QA("hello", new Answer("Hi. Welcome to Chase Customer Service. How can I help you?")));
		questionList.add(new QA("hey", new Answer("Hi. Welcome to Chase Customer Service. How can I help you?")));
		questionList.add(new QA("account", new Answer("What do you want to know about the accounts?")));
		questionList.add(new QA("open account",
				new Answer("Ok, I am more than happy to help. What kind of account you want to open?")));
		questionList.add(new QA("open checkings account", new Answer("Please refer to http://www.chase.com/checkings" , "http://www.chase.com/checkings")));
		questionList.add(new QA("open savings account", new Answer("Please refer to http://www.chase.com/savings","http://www.chase.com/savings")));
		questionList.add(new QA("close account", new Answer("Sorry to hear about that. I will sure help you on this.")));

		
		 questionList.add(new QA("bonus" , new Answer("Now you can earn upto 350$, please visit www.chase.com/promotions to know more","www.chase.com/promotions")));
		 questionList.add(new QA("opening bonus" , new Answer("Now you can earn upto 350$, please visit www.chase.com/promotions to know more","www.chase.com/promotions")));
		 questionList.add(new QA("credit card" , new Answer("Please visit www.chase.com/creditcards to know about credit cards","www.chase.com/creditcards")));
		 questionList.add(new QA("fees account" , new Answer("Learn more on how to avoid fees, please visit www.chase.com/avoidfees to know more","www.chase.com/avoidfees")));
		 questionList.add(new QA("fee account" , new Answer("Learn more on how to avoid fees, please visit www.chase.com/avoidfees to know more","www.chase.com/avoidfees")));
		 questionList.add(new QA("account summary" , new Answer("You can obtain this information on Chase Online or by visiting nearby branch")));
		 questionList.add(new QA("tax statements" , new Answer("You can obtain this information on Chase Online or by visiting nearby branch")));
		 /*questionList.add(new QA("" , ""));
		 questionList.add(new QA("" , ""));*/
		 

		rejectList = new ArrayList<>(Arrays.asList(rejectArray));
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		boolean end = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Initializing Bot!!!");
		while (!end) {
			String question = scanner.nextLine();
			question = question.toLowerCase();
			if ("end".equalsIgnoreCase(question)) {
				end = true;
				System.out.println("Good bye!!!");
				continue;
			}
			System.out.println(getAnswers(question));
		}
	}

	public static Answer getAnswers(String question) {
		String defaultAns = "Sorry, I did not get that";
		Answer answer = new Answer(defaultAns);
		List<String> filteredQuestion = getFilteredQuestion(question);
		int maxScore = 0;
		QA maxQA = null;
		for (QA qa : questionList) {
			int score = qa.getScore(filteredQuestion);
			if (score > maxScore) {
				maxScore = score;
				maxQA = qa;
			}
		}
		if (maxQA != null) {
			answer = maxQA.getAnswer();
		}
		return answer;
	}

	private static List<String> getFilteredQuestion(String question) {
		List<String> filteredList = new ArrayList<String>();
		String[] q = question.split("\\s");
		for (String q1 : q) {
			q1 = q1.toLowerCase();
			q1 = q1.replaceAll("[-+.^?:,]","");
			if (!rejectList.contains(q1))
				filteredList.add(q1);
		}
		return filteredList;
	}

}
