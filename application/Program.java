package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\user\\Documents\\in.txt");
		Scanner keyboard = null;
		try {
			keyboard = new Scanner(file);
			while(keyboard.hasNextLine()) {
				System.out.println(keyboard.nextLine());
			}
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if(keyboard != null) {
				keyboard.close();
			}
		}
	}
}
