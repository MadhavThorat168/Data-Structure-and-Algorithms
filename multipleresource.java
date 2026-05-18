package resource;

import java.io.*;

public class multipleresource {

	public static void main(String[] args) {
		        try (
		            FileWriter fw = new FileWriter("demo.txt");
		            PrintWriter pw = new PrintWriter(fw)
		        ) {
		            pw.println("Hello Madhav!");
		            pw.println("This is Try-With-Resources example.");

		            System.out.println("Data written successfully!");

		        } catch (IOException e) {
		            System.out.println("Exception occurred: " + e.getMessage());
		        }
		    }
}
	
	

	   