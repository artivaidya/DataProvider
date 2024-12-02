package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readproprtyfile {

	public static void main(String[] args) throws IOException {
		FileReader fr =new FileReader("/Users/Ancha/eclipse-workspace/TestinfFramwork/src/test/resources/configFiles/congig.properties");
		Properties p= new Properties();
		p.load(fr);
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));
		
		
	}

}
