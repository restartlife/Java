package ivan.java.design.practice.chanofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class RequestHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(RequestHandler.class);

	private RequestHandler next;

	public RequestHandler(RequestHandler next) {
		this.next = next;
	}

	public void handleRequest(Request req) {
		if (next != null) {
			next.handleRequest(req);
		}
	}

	protected void printHandling(Request req) {
		LOGGER.info("{} handling request \"{}\"", this, req);
	}

	@Override
	public abstract String toString();

	public static void main(String[] args) {
	}
}
