package br.com.gigio.fixadapter.listeners;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;
import br.com.gigio.fixadapter.events.MessageEvent;

public class MessageEventListener implements ApplicationListener<MessageEvent>{
	
	private static final Log log = LogFactory.getLog(MessageEventListener.class);

	public void onApplicationEvent(MessageEvent event) {
		log.info("Received event: " + event.getMessage());
		
	}

}