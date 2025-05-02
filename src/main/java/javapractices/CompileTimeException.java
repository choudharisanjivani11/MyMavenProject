package javapractices;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
//import java.io.IOException;
import java.net.URL;

public class CompileTimeException {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, MalformedURLException {
		
		File file = new File("c:/test.text");
		
		FileInputStream fileinputstream = new FileInputStream(file);
		
		//fileinputstream.close();
		
		URL url=new URL("www.google.com");
		
		Class.forName("");
	

	}

}
