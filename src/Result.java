import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Result {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter your name");
		BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
		String inputString=buffer.readLine();
		System.out.println("Enter marks in maths");
		String inputString1=buffer.readLine();
		int m1=Integer.parseInt(inputString1);
		System.out.println("Enter marks in english");
		String inputString2=buffer.readLine();
		int m2=Integer.parseInt(inputString2);
		System.out.println("Enter marks in hindi");
		String inputString3=buffer.readLine();
		int m3=Integer.parseInt(inputString3);
		System.out.println("Enter marks in science");
		String inputString4=buffer.readLine();
		int m4=Integer.parseInt(inputString4);
		System.out.println("Enter marks in social science");
		String inputString5=buffer.readLine();
		int m5=Integer.parseInt(inputString5);
		int c=0;
		float sum;
		sum=m1+m2+m3+m4+m5/5;
		if(sum<40)
			System.out.println("Poor");
		else if(sum>=40&&sum<=59)
			System.out.println("Average");
		else if(sum>=60&&sum<=79)
			System.out.println("good");
		else if(sum>=80&&sum<=89)
			System.out.println("very good");
		else if(sum>=90)
			System.out.println("Excellent");
	}

}
