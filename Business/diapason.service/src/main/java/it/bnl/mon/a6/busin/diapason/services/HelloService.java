package it.bnl.mon.a6.busin.diapason.services;

import org.springframework.stereotype.Service;

import it.bnl.fwk.common.lognext.NxtLoggerFactory;
import it.bnl.fwk.common.lognext.logger.INxtLogger;

@Service
public class HelloService implements IHelloService {
	private final static INxtLogger logger = NxtLoggerFactory.getLogger(HelloService.class.getName());
	
	@Override
    public String getHello(String name) {
    	logger.debug("getHello start");
    	
    	//put here the service logic
			
		logger.debug("getHello end");

		return "Hello " + name;
    }
}
