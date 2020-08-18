package TY.Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchProperties {

	public static String getPropertiesValues() throws IOException {

		FileInputStream fis = new FileInputStream(
				"F:\\SELNIUM 2020 IDE\\ApiProject\\src\\test\\java\\TY_Utils\\globalProperties.properties");
		Properties pro = new Properties();
		pro.load(fis);

		String val = pro.getProperty("baseUri");
		return val;

	}

}
