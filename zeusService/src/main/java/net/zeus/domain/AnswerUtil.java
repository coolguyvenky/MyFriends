package net.zeus.domain;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnswerUtil {
	
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
	questionList.add(new QA("hi", new Answer("Hi. Welcome to Chase Support. How can I help you today?")));
	questionList.add(new QA("hello", new Answer("Hello. Welcome to Chase Customer Support. How can I help you today?")));
	questionList.add(new QA("hey", new Answer("Hi. Welcome to Chase Customer Support. How can I help you today?")));
	questionList.add(new QA("new_user", new Answer("Hi. Welcome to Chase Support. How can I help you today?")));

	//questionList.add(new QA("account", new Answer("What do you want to know about the accounts?","https://www.chase.com/")));
	questionList.add(new QA("open account",
			new Answer("Ok, I am more than happy to help. What kind of account you want to open?","","Account Types","/images/account.png")));
	questionList.add(new QA("open checking account", new Answer("Please refer this link to know about checking " , "http://www.chase.com/checking","Checking Account","/images/CheckingAccount.png")));
	questionList.add(new QA("open savings account", new Answer("Please refer this link to know about savings ","http://www.chase.com/savings","Savings Account","/images/Savings-Accounts.png")));
	questionList.add(new QA("saving savings", new Answer("Please refer this link to know about savings ","http://www.chase.com/savings","Savings Account","/images/Savings-Accounts.png")));

	 questionList.add(new QA("bonus" , new Answer("Now you can earn upto 350$, please visit ","www.chase.com/promotions","Bonus","/images/bonus.png")));
	 
	 questionList.add(new QA("$100 100$" , new Answer("Now you can earn upto 350$, please visit ","www.chase.com/promotions","Bonus","/images/bonus.png")));

	 questionList.add(new QA("opening bonus" , new Answer("Now you can earn upto 350$, please visit ","www.chase.com/promotions","Bonus","/images/bonus.png")));
	 questionList.add(new QA("credit card" , new Answer("Please visit this link to know about credit cards","www.creditcards.chase.com/credit-cards/home","Credit Card", "/images/creditcards.png")));
	 questionList.add(new QA("fees" , new Answer("Learn more on how to avoid fees, please visit ","https://www.chase.com/online/services/understand-products-avoid-fees.htm")));

	 questionList.add(new QA("charge charges" , new Answer("Learn more on how to avoid fees, please visit ","https://www.chase.com/online/services/understand-products-avoid-fees.htm")));

	 questionList.add(new QA("fee" , new Answer("Learn more on how to avoid fees, please visit ","https://www.chase.com/online/services/understand-products-avoid-fees.htm")));
	 //*
	 questionList.add(new QA("account", new Answer("What do you want to know about the accounts?","https://www.chase.com/")));

	 questionList.add(new QA("account fee" , new Answer("Learn more on how to avoid fees, please visit ","https://www.chase.com/online/services/understand-products-avoid-fees.htm")));

	 questionList.add(new QA("account summary" , new Answer("You can obtain this information on Chase Online or by visiting nearby branch")));
	 
	 questionList.add(new QA("close account", new Answer("Sorry to hear about that. I will sure help you on this.", "https://www.chase.com/content/dam/chasecom/en/resources/documents/CH6477__Account__closing__form_2.pdf")));

	 questionList.add(new QA("tax statements" , new Answer("You can obtain this information on Chase Online or by visiting nearby branch")));
	 questionList.add(new QA("offer rewards reward account accounts checking checkings saving savings" , new Answer("Now you can earn upto 250$, please visit ","www.chase.com/checking/chase-coupon","Rewards","/images/rewards.png")));
	 questionList.add(new QA("wow" , new Answer("Thanks for the compliment","","Thank You","/images/smiley.png")));
	 questionList.add(new QA("quick" , new Answer("Quick pay is a nice feature.Please visit ", "https://www.chase.com/online/digital/quickpay.html")));
	 questionList.add(new QA("bill" , new Answer("Bill pay is Cool Feature.Please visit ", "https://www.chase.com/online/digital/online-bill-pay.html")));
	 questionList.add(new QA("shit fool fuck" , new Answer("Keep Calm and Don't Swear", "", "Don't Swear", "/images/sw1.png")));
	 questionList.add(new QA("atm" , new Answer("To Locate the nearest Chase Branch, Please visit ", "https://locator.chase.com/", "ATM", "/images/chase.png")));
	 questionList.add(new QA("branch" , new Answer("To Locate the nearest Chase Branch, Please visit ", "https://locator.chase.com/", "Branch", "/images/chase.png")));
	 questionList.add(new QA("location" , new Answer("To Locate the nearest Chase Branch, Please visit ", "https://locator.chase.com/", "Location", "/images/chase.png")));
	 questionList.add(new QA("rajaneesh venkat rakesh milan srinivas murthy" , new Answer("Hello Boss, Thanks for Creating Me...Lets Party tonight !!")));
	 questionList.add(new QA("bye" , new Answer("Good Bye...Have a Pleasant Evening !!")));
	 questionList.add(new QA("movie" , new Answer("Not a Movie Time...Lets wrap this Demo!!")));
	 questionList.add(new QA("thank" , new Answer("Always Pleasure Serving You")));


	 /*questionList.add(new QA("" , ""));
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
			//System.out.println(getAnswers(question));
		}
	}
	
	public static Answer getAnswers(ZeusDTO question) {
		
		String defaultAns = "Sorry, I did not get that";
		Answer answer = new Answer(defaultAns);
		List<String> filteredQuestion = getFilteredQuestion(question.getRequest());
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
		answer.setUserName(question.getUserName());
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
