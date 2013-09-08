package br.com.gigio.fixadapter.publishers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import br.com.gigio.fixadapter.events.MessageEvent;
import br.com.gigio.fixadapter.interfaces.SessionPublisherInterface;

public class ApplicationContextAwarePublisher implements
		ApplicationContextAware, SessionPublisherInterface {

	private static final Log log = LogFactory
			.getLog(ApplicationContextAwarePublisher.class);

	private ApplicationContext ctx;

	public void publish(String messageToPublish) {
		log.info("Publishing message: " + messageToPublish);
	    ctx.publishEvent(new MessageEvent(this, messageToPublish));

	}

	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		this.ctx = ctx;
		log.info("vsetting application context: " + ctx);

	}
	
	

}
