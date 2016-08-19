package org.cy3javascript;

import org.cytoscape.service.util.AbstractCyActivator;
import org.osgi.framework.BundleContext;

public class CyActivator extends AbstractCyActivator {
	public CyActivator() {
		super();
	}

	public void start(BundleContext bc) {
		
		try {
			System.out.println("Running JSObject access now");
			
			WebViewSwing.launch();

		} catch (Throwable e){
			System.out.println("Could not start server!");
			e.printStackTrace();
		}
	}
}