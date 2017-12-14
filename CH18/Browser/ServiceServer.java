import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author morrli
 *
 */
public interface ServiceServer extends Remote {
	public Object[] getServicesList() throws RemoteException;
	Service getService(Object serviceKey) throws RemoteException;

}
