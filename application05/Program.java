package application05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\user\\Documents\\testing";
		
		boolean success = new File(path + "\\out").mkdir();
		System.out.println("Diretory created successfully: " + success);

		try(BufferedReader br = new BufferedReader(new FileReader(path + "\\arquivo.csv.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\out\\summary.csv.txt"))){
			
			String line = br.readLine();
			
			while(line != null) {
				String[] arrOfStr = line.split(",");
				
				String sumName = arrOfStr[0];
				Double sumTotal = Double.parseDouble(arrOfStr[1]) * Double.parseDouble(arrOfStr[2]);
				
				bw.write(sumName + ", " + sumTotal);
				bw.newLine();
				
				line = br.readLine();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
