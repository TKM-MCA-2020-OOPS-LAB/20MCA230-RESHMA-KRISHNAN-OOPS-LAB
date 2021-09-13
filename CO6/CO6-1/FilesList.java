package CO6;
import java.io.File;
import java.io.FilenameFilter;
public abstract class FilesList implements FilenameFilter {
	public static void main(String[] args) {
	File f = new File("D:\\MCA 2020\\SEM-II\\OOP_Lab\\CO6");
	String[] flist = f.list();
	System.out.println("LISTING OUT THE FILES:\n");
	for(String str : flist) {		
		System.out.println(str);	
	}
	System.out.println("\nSEARCHING FOR FILENAMES STARTING WITH 'p':\n");
	
	FilenameFilter filter = new FilenameFilter() {
		public boolean accept(File dir, String fname) {
			return fname.startsWith("p");
		}
	};
	
	String[] search = f.list(filter);
	if(search == null) {
		System.out.println("File does not exist. .  ");		
	}
	else {
		for(int i=0; i<search.length;i++) {
			String fn = search[i];
			System.out.println(fn);
		}
	 }
  }
}
