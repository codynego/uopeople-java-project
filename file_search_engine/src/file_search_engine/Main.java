package file_search_engine;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File file = new File("C:\\Users\\emone");
			if (file.isDirectory()) {
				for (int i = 0; i < file.list().length; i++) {
					System.out.println(file.list()[i]);
				}
			}
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("an error occured");
		}
		

	}

}
