import java.io.IOException;

import com.printnode.api.APIClient;
import com.printnode.api.Auth;

public class DeletingAnAccount {
	public static void main(String[] args) throws IOException {
				Auth myAuth = new Auth();

				myAuth.setApiKey("a72aaa0f936cc20c3de18b78c7132235c84afeda");
				
				APIClient aClient = new APIClient(myAuth);
				
				Boolean status= aClient.deleteAccount("54509");
				
				System.out.println("Status" + status);
				
				//aClient.
	}

}
