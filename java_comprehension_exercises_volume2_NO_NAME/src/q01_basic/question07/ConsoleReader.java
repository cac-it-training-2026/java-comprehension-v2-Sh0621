package q01_basic.question07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConsoleReader {
	new BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public int inputNunmber() throws IOException,NumberFormatException{
		String input=br.readLine();
		return Integer.parseInt(input);
		
	}

}
