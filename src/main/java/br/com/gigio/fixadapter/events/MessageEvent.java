package br.com.gigio.fixadapter.events;

import org.springframework.context.ApplicationEvent;

public class MessageEvent extends ApplicationEvent {
	private static final long serialVersionUID = 3335307618378025437L;

	private final String msg;

	public MessageEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}

}
