package br.com.gigio.fixadapter.publishers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import br.com.gigio.fixadapter.events.MessageEvent;
import br.com.gigio.fixadapter.interfaces.SessionPublisherInterface;

public class ApplicationEventAwarePublisher implements ApplicationEventPublisherAware, SessionPublisherInterface{

	private static final Log log = LogFactory.getLog(ApplicationEventAwarePublisher.class);
	
	private ApplicationEventPublisher eventPublisher;

	
	public void publish(String messageToPublish) {
		log.info("Publishing message: " + messageToPublish);
	    eventPublisher.publishEvent(new MessageEvent(this, messageToPublish));
		
	}

	public void setApplicationEventPublisher(
			ApplicationEventPublisher publisher) {
		this.eventPublisher = publisher;
	    log.info("Setting application event publisher: " + publisher);
		
	}

}
