package it.bnl.mon.a6.busin.diapason;

import java.util.Map;
import java.util.Properties;

import it.bnl.fwk.common.lognext.NxtLoggerFactory;
import it.bnl.fwk.common.lognext.logger.INxtLogger;
import it.bnl.fwk.jrfcore.core.module.IJRFCoreModuleBootstrap;

public class ApplicationModuleBootstrap implements IJRFCoreModuleBootstrap {
	
	private final static INxtLogger logger = NxtLoggerFactory.getLogger(ApplicationModuleBootstrap.class);

	@Override
	public void bootstrap(java.net.URL jrfCoreRootFolder, Map<String, Object> envObjectsToBind, Map<String, Properties> profileAndProperties) throws Exception {
		logger.info("executing bootstrap method of class {}", ApplicationModuleBootstrap.class.getName());
		
		/* Implement method id needed by application */	
	}

	@Override
	public void shutdown(java.net.URL jrfCoreRootFolder, Map<String, Properties> profileAndProperties) {
		logger.info("executing shutdown method of class {}", ApplicationModuleBootstrap.class.getName());
		
		/* Implement method id needed by application */
	}
}