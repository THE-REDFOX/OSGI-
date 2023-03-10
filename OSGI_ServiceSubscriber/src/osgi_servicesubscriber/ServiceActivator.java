package osgi_servicesubscriber;

import com.mtit.service.ServicePublish;
import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;



public class ServiceActivator implements BundleActivator {

	
	ServiceReference serviceReference;
	
	
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Start Subscriber service");
		serviceReference = context.getServiceReference(ServicePublish.class.getName());
		ServicePublish servicePublish = (ServicePublish)context.getService(serviceReference);
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Good bye");
		context.ungetService(serviceReference);
		
	}

}
