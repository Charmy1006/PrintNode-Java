import java.io.IOException;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.printnode.api.APIClient;
import com.printnode.api.Auth;
import com.printnode.api.Printer;

public class GetChildAccountPrinters {
	public static void main(String[] args) throws IOException {

		Auth myAuth = new Auth();

		myAuth.setApiKey("a72aaa0f936cc20c3de18b78c7132235c84afeda");

		APIClient aClient = new APIClient(myAuth);
		
		// Get printer capabilities for a child account
		aClient.setChildAccountById(51375);
		
		Printer[] printersArray = aClient.getPrinterforChildAccount();
		
		System.out.println("Printers : " + printersArray);
		
		//Get single printer id
		
		aClient.setChildAccountById(51375);
		Printer[] printersArray1 =aClient.getPrinterCapabilities(291512);
		System.out.println(printersArray1);
		

	}

}
