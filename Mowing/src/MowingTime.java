import java.util.Scanner;

public class MowingTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		double time,
		       length, width, area;
		int hour, minute;
		
		System.out.println("Enter the length and width");
		Scanner lengthInput = new Scanner(System.in);
		length = lengthInput.nextInt();
		Scanner widthInput = new Scanner(System.in);
		width = widthInput.nextInt();
		
		area=length*width;
		time=area/20;
		
		if(time>59)
		{
			hour=(int)(time/60);
			
			if(time%60==0)
				
			System.out.println("The time requires to finish mowing is:" + hour+ " hours");
			else
			{
				minute=(int)(time%60);
				
			    System.out.println("The time requires to finish mowing is:" + hour+ " hours "+ minute+" minutes");
		
			}
		}
			else
				
				System.out.println("The time required to mow your yard is:"+ time+" minutes");
			
		}
		
		
	}