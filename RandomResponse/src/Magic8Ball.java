import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
	public static void main(String[] args){
		
		String request, response;
		String[] s = {"It is certain", "It is decidedly so", "Without a doubt", "Yes definitely",
				     "You may rely on it","As I see it, yes", "Most likely", "outlook good", "Yes",
				      "Signs point to yes", "Reply hazy try again","Ask again later","Better not tell you now"
				      ,"Can not predict now", "Concentrate and ask again", "Don't count on it", "My reply is no",
				      "My sources say no", "My sources say no", "Outlook not so good", "Very doubtful"};

	do{
		Random ran = new Random();
		String s_ran = s[ran.nextInt(s.length)];
		System.out.println("Enter your request to the magic 8-Ball: ");
		Scanner Input= new Scanner(System.in);
		request= Input.next();
		System.out.println(s_ran);
		
		System.out.println("Do you have another question for the magic 8-Ball? Y/N");
		Scanner choice= new Scanner(System.in);
		response= choice.next();
		}
	while(response.equalsIgnoreCase("y"));
	
	}

}
