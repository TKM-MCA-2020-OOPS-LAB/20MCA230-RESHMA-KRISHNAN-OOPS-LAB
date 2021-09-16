package CO6;
import java.io.*;
public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("D:\\MCA 2020\\SEM-II\\OOP_Lab\\CO6\\file1.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("D:\\MCA 2020\\SEM-II\\OOP_Lab\\CO6\\file2.txt", true);
			String s;
 
			while ((s = br.readLine()) != null) { // read a line
				fw.write(s); // write to output file
				fw.flush();
			}
			br.close();
			fw.close();
            
			System.out.println("FILE COPIED");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An error occurred. . ."+e);
		}

	}

}
