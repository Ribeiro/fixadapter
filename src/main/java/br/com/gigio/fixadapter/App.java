package br.com.gigio.fixadapter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.gigio.fixadapter.interfaces.SessionPublisherInterface;

public class App {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"META-INF/spring/*.xml");

//		SessionPublisherInterface bean = ctx.getBean("context-aware-publisher",
//				SessionPublisherInterface.class);
//
//		bean.publish("A session delete has been occurred ...");
//		bean.publish("A session update has been occurred ...");

		SessionPublisherInterface bean2 = ctx.getBean(
				"event-publisher-aware-publisher", SessionPublisherInterface.class);
		bean2.publish("Session delete event using event publisher...");

	}
}
