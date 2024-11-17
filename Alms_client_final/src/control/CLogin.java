package control;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import constants.Cofiguration;
import remoteInterface.ILogin;
import valueObject.VLogin;
import valueObject.VResult;

public class CLogin extends CControl implements ILogin {

	private ILogin iLogin;
	private Registry registry;
	
	public CLogin() throws RemoteException, NotBoundException {
 		this.registry = LocateRegistry.getRegistry(Cofiguration.PORT_NUM);
		this.iLogin = (ILogin) this.registry.lookup(ILogin.OBJECT_NAME);
	}
	
	public void initialie() {
	}

	@Override
	public VResult login(VLogin vLogin) throws RemoteException {
		System.out.println("*Client: "+this.getClass().getSimpleName()+"login started");
        VResult response =  this.iLogin.login(vLogin);
		return response;
	}

	public void finish() {
		// TODO Auto-generated method stub
		
	}
}
