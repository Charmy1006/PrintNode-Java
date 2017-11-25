import java.io.IOException;
import java.util.Random;
import java.util.UUID;

import com.printnode.api.APIClient;
import com.printnode.api.Auth;
import com.printnode.api.CreateAccountJson;
import com.printnode.api.CreateAccountObject;

public class UpdateAccount {

	public static void main(String[] args) throws IOException {
		Auth myAuth = new Auth();

		myAuth.setApiKey("a72aaa0f936cc20c3de18b78c7132235c84afeda");

		APIClient aClient = new APIClient(myAuth);

		Random rad = new Random();

		UUID id = UUID.randomUUID();
		String randomEmail = id + "@gmail.com";
		CreateAccountJson accountInfo = new CreateAccountJson(null, null, randomEmail, "pwd@orderhive");
		
		aClient.setChildAccountById(232312);

		Boolean isUpdate = aClient.updateAccount(accountInfo);

		System.out.println("Account Obj Updates: " + isUpdate);

	}
}
