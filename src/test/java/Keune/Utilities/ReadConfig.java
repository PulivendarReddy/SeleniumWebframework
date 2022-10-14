package Keune.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig()
	{
		File src = new File("./Configurations/config.properties");
		try {
			FileInputStream fis =new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		}catch(Exception e) {
			System.out.println("Exception is"+e.getMessage());
		}
	}
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseUrl");
		return url;
	}
	
	
	public String getUsername()
	{
		String username=pro.getProperty("username");
		return username;
	}
	public String getPassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
	public String getchromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getedgepath()
	{
		String edgepath=pro.getProperty("edgepath");
		return edgepath;
	}
	public String getfirefoxpath()
	{
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	public String getHost()
	{
		String hostpath=pro.getProperty("Host");
		return hostpath;
	}


}
