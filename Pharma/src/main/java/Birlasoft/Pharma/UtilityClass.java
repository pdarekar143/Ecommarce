package Birlasoft.Pharma;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass
{
 public static Object FetchProperty(String key) throws IOException 
 {
	 FileInputStream file=new FileInputStream("./Configure/Configure.properties");
	 Properties property=new Properties();
	 property.load(file);
	 return property.get(key);
 }
}

