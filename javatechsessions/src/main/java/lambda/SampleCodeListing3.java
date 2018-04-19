package lambda;

interface AuthServiceInterface
{
	boolean validateToken(String userName, String password);

}

class PlatformAuthService implements AuthServiceInterface
{

	@Override
	public boolean validateToken(String userName, String password) {
		//Do complicated Auth checks here :)
		
		return false;
	}
}

public class SampleCodeListing3
{
	static AuthServiceInterface authService = (userName,password) -> {
	
		if("admin".equalsIgnoreCase(userName) && "test".equalsIgnoreCase(password))
			return true;
		return false;
		
	};
	
	static AuthServiceInterface testAuthService = (userName,password) -> true;
	
	public static void main(String args[])
	{	
		String user = "admin1";
		String pwd = "test";
		
		if(authService.validateToken(user,pwd))
		{
			System.out.println("Admin User Authenticated successfully");
		}
		
		if(testAuthService.validateToken(user,pwd))
		{
			System.out.println("Anonymous access allowed");
		}		
		
	}

}

