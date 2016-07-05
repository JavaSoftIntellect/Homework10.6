import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("file.txt");
			BufferedReader input = new BufferedReader(file);
			FileWriter out = new FileWriter("output.txt");
			BufferedWriter writer = new BufferedWriter(out);
			while (input.ready()){
				String line = input.readLine().replaceAll("","");
				System.out.println(line);
				try{
					writer.write(line+"\n");
				}catch (IOException e) {
					System.out.println("Error while writing a file.");
					System.out.println(e.getMessage());
					System.exit(0);
				}
			}
			writer.flush();
			writer.close();
			}
		catch (IOException e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}

	}

}