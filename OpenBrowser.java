

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;;
import java.net.URL;;
import java.io.File;

public class OpenBrowser {

public static void main(String[] args) {
	try 
	{
		if(args != null && args.length > 0)
		{
				
		File html = new File(args[0]);
		Desktop.getDesktop().browse(html.toURI());
		}
		else
	{
	 	System.out.println("Please pass file as params eg. openreport.jar \"reports/index.html\" ");	
	}
	} catch (Exception e) {
	        e.printStackTrace();
	    }

	}
}
