import java.util.Random;

public class Magic8Ball {
	public static void main(String[] args){
		
		String[] s = {"It is certain", "It is decidedly so", "Without a doubt", "Yes definitely",
				     "You may rely on it","As I see it, yes", "Most likely", "outlook good", "Yes",
				      "Signs point to yes", "Reply hazy try again","Ask again later","Better not tell you now"
				      ,"Can not predict now", "Concentrate and ask again", "Don't count on it", "My reply is no",
				      "My sources say no", "My sources say no", "Outlook not so good", "Very doubtful"};

		Random ran = new Random();
		String s_ran = s[ran.nextInt(s.length)];
	
		System.out.println(s_ran);
		
		/*U ASKED: Will I win the lottery tomorrow?
				 
				MAGIC 8-BALL SAYS: Reply hazy, try again
				 
				Do you have another question for the Magic 8-Ball? (y/n
	*/}

}
