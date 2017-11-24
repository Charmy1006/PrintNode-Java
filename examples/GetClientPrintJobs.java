import java.io.IOException;

import com.google.gson.JsonArray;
import com.printnode.api.APIClient;
import com.printnode.api.Auth;

public class GetClientPrintJobs {

	public static void main(String[] args) throws IOException {
		//Firstly, we'll create a new Auth object.
		Auth myAuth = new Auth();

		//We're going to set our credentials for future use with Auth.setApiKey.
		myAuth.setApiKey("a72aaa0f936cc20c3de18b78c7132235c84afeda");
		
		APIClient aClient = new APIClient(myAuth);
		
		aClient.setChildAccountById(51375);
		
		JsonArray printjobs = aClient.getPrintJobsOfClientAccount();
	}
	

}
